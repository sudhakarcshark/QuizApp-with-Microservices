package com.techsploit.info.QuizApp.service.imple;

import com.techsploit.info.QuizApp.Mapper.MapperClass;
import com.techsploit.info.QuizApp.model.Questions;
import com.techsploit.info.QuizApp.repo.QuestionRepo;
import com.techsploit.info.QuizApp.request.QuestionRequest;
import com.techsploit.info.QuizApp.response.ApiResponse;
import com.techsploit.info.QuizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImple implements QuestionService {

    @Autowired
    QuestionRepo questionRepo;


    @Override
    public ResponseEntity<ApiResponse> addQuestions(QuestionRequest request) {
    Questions questions  =  questionRepo.save(MapperClass.RequestToModel(request));
    return ResponseEntity.ok(
            ApiResponse.builder()
                    .errorCode(0)
                    .errorMessage("SAVED SUCCESSFULLY")
                    .data(MapperClass.ResponseToModel(questions))
                    .build()
    );
    
    }

    @Override
    public List<Questions> getAllQuestions() {
        return questionRepo.findAll();
    }

    @Override
    public List<Questions> getByCatagory(String catagory) {
       return questionRepo.findByCatagory(catagory);
    }
}
