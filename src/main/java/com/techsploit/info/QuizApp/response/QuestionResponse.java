package com.techsploit.info.QuizApp.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class QuestionResponse {

    private Integer id;
    private String catagory;
    private String difficultyLevel;
    private String rightAnswer;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
}
