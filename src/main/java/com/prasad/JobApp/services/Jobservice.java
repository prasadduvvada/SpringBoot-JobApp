package com.prasad.JobApp.services;


import com.prasad.JobApp.model.JobPost;
import com.prasad.JobApp.repositary.Jobrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Jobservice {
    @Autowired
    public Jobrepo repo;

    public void addjob(JobPost jobPost){
        repo.addjob(jobPost);
    }

    public List<JobPost> getalljobs(){
       return  repo.getalljobs();
    }

}
