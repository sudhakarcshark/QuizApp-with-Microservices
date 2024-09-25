package com.techsploit.info.QuizApp.service;

import com.techsploit.info.QuizApp.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface QuizService {
    ResponseEntity<String> createQuiz(String category, int numQ, String title);

    ResponseEntity<ApiResponse> QuizQuestions(Integer id);
}
