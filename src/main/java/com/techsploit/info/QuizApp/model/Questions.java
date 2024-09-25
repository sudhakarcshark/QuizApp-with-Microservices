package com.techsploit.info.QuizApp.model;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
@Entity
@Table(name = "Questions")
public class Questions {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
