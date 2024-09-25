package com.techsploit.info.QuizApp.service.imple;

import com.techsploit.info.QuizApp.Mapper.MapperClass;
import com.techsploit.info.QuizApp.model.Questions;
import com.techsploit.info.QuizApp.model.Quiz;
import com.techsploit.info.QuizApp.repo.QuestionRepo;
import com.techsploit.info.QuizApp.repo.QuizRepo;
import com.techsploit.info.QuizApp.response.ApiResponse;
import com.techsploit.info.QuizApp.response.QuestionsForUser;
import com.techsploit.info.QuizApp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizServiceImple implements QuizService {

    @Autowired
    QuizRepo quizRepo;

    @Autowired
    QuestionRepo questionRepo;

    @Override
    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        List<Questions> questions = questionRepo.findRandomQuestionsByCategory(category,numQ);

        Quiz quiz = new Quiz();
       // quiz.setId(numQ);
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizRepo.save(quiz);

        return new ResponseEntity<>("SUCCESS", HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<ApiResponse> QuizQuestions(Integer id) {

      Optional<Quiz> quiz =  quizRepo.findById(id);
       List<Questions> questions =  quiz.get().getQuestions();
      List<QuestionsForUser> questionsForUser = questions.stream().map(quizquestions->MapperClass.ResponseToUser(quizquestions)).toList();

      return ResponseEntity.ok(
              ApiResponse.builder()
                      .errorCode(0)
                      .errorMessage("SUCCESS")
                      .data(questionsForUser)
                      .build()
      );

    }
}
