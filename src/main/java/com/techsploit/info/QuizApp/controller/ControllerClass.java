package com.techsploit.info.QuizApp.controller;

import com.techsploit.info.QuizApp.model.Questions;
import com.techsploit.info.QuizApp.request.QuestionRequest;
import com.techsploit.info.QuizApp.response.ApiResponse;
import com.techsploit.info.QuizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Questions")
public class ControllerClass {

    @Autowired
    QuestionService questionService;

    @PostMapping("/AddQuestions")
    ResponseEntity<ApiResponse> addQuestions(@RequestBody QuestionRequest request){

        return questionService.addQuestions(request);

    }

    @GetMapping("/AllQuestions")
    List<Questions> getAllQuestions(){

        return questionService.getAllQuestions();
    }

    @GetMapping("/catagory/{catagory}")
    List<Questions> getByCatagory(@PathVariable String catagory){

        return questionService.getByCatagory(catagory);

    }
}
