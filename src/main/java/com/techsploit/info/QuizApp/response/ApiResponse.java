package com.techsploit.info.QuizApp.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class ApiResponse {
    private int errorCode;
    private String errorMessage;
    private Object data;
}
