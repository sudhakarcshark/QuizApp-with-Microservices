package com.techsploit.info.QuizApp.Mapper;

import com.techsploit.info.QuizApp.model.Questions;
import com.techsploit.info.QuizApp.request.QuestionRequest;
import com.techsploit.info.QuizApp.response.QuestionResponse;
import com.techsploit.info.QuizApp.response.QuestionsForUser;
import lombok.Data;

@Data
public class MapperClass {

    public static Questions RequestToModel(QuestionRequest request){

        return Questions.builder()
                .catagory(request.getCatagory())
                .difficultyLevel(request.getDifficultyLevel())
                .option1(request.getOption1())
                .option2(request.getOption2())
                .option3(request.getOption3())
                .option4(request.getOption4())
                .questionTitle(request.getQuestionTitle())
                .rightAnswer(request.getRightAnswer())
                .build();

    }

    public static QuestionResponse ResponseToModel(Questions questions){

        return QuestionResponse.builder()
                .id(questions.getId())
                .catagory(questions.getCatagory())
                .option1(questions.getOption1())
                .option2(questions.getOption2())
                .option3(questions.getOption3())
                .option4(questions.getOption4())
                .difficultyLevel(questions.getDifficultyLevel())
                .questionTitle(questions.getQuestionTitle())
                .rightAnswer(questions.getRightAnswer())
                .build();

    }

    public static QuestionsForUser ResponseToUser(Questions quiz){

        return QuestionsForUser.builder()
                .id(quiz.getId())
                .questionTitle(quiz.getQuestionTitle())
                .option1(quiz.getOption1())
                .option2(quiz.getOption2())
                .option3(quiz.getOption3())
                .option4(quiz.getOption4())
                .build();

    }
}
