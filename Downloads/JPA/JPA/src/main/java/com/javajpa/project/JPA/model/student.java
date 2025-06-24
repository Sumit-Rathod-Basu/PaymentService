package com.javajpa.project.JPA.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Student_info")
public class student
 {

    @Id
    @GeneratedValue(
      strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String name;
    @Column(
      name ="email_address",nullable = false
    )
    private String email;
    private String marks;
  // Getters and Setters
}
