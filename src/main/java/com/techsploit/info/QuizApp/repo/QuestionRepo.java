package com.techsploit.info.QuizApp.repo;

import com.techsploit.info.QuizApp.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Questions,Integer> {


    List<Questions> findByCatagory(String catagory);


    @Query(value = "SELECT * FROM questions Where catagory = :category ORDER BY RAND() LIMIT :numQ;",nativeQuery = true)
    List<Questions> findRandomQuestionsByCategory(String category, int numQ);
}
