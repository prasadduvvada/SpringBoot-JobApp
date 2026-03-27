package com.prasad.JobApp.repositary;


import com.prasad.JobApp.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Jobrepo extends JpaRepository<JobPost, Integer>{
}
