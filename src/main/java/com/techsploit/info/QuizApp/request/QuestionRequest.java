package com.techsploit.info.QuizApp.request;

import lombok.Data;

@Data
public class QuestionRequest {

    private String catagory;
    private String difficultyLevel;
    private String rightAnswer;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
}
