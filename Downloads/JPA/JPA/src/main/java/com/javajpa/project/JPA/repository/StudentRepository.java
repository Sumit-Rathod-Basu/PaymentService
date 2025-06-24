
package com.javajpa.project.JPA.repository;
import com.javajpa.project.JPA.model.student;  //

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<student,Long>
{
                             
}