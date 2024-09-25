package com.techsploit.info.QuizApp.controller;

import com.techsploit.info.QuizApp.response.ApiResponse;
import com.techsploit.info.QuizApp.service.QuizService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("create")
    ResponseEntity<String> createQuiz(@RequestParam String category,@RequestParam int numQ,@RequestParam String title){

        return quizService.createQuiz(category,numQ,title);
    }

    @GetMapping("get/{id}")
    ResponseEntity<ApiResponse> QuizQuestions(@PathVariable Integer id){

        return quizService.QuizQuestions(id);

    }
}
