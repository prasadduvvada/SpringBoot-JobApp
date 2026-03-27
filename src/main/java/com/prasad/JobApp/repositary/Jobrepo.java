package com.prasad.JobApp.repositary;


import com.prasad.JobApp.model.JobPost;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface Jobrepo extends JpaRepository<JobPost, Integer>{
}
