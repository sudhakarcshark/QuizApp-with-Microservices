package com.techsploit.info.QuizApp.service;

import com.techsploit.info.QuizApp.model.Questions;
import com.techsploit.info.QuizApp.request.QuestionRequest;
import com.techsploit.info.QuizApp.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface QuestionService {

    ResponseEntity<ApiResponse> addQuestions(QuestionRequest request);

    List<Questions> getAllQuestions();

    List<Questions> getByCatagory(String catagory);
}
