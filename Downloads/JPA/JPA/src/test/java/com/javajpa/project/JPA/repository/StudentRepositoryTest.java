package com.javajpa.project.JPA.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.javajpa.project.JPA.model.student;
@SpringBootTest
public class StudentRepositoryTest 
{
    @Autowired
    private StudentRepository st;

    @Test
    public void setData()
    {
           student stt=student.builder()
                .email("s@gimail.com")
                 .name("sumit")
                 .marks("99")
                  .build();
             st.save(stt);    
                  
    }
}
