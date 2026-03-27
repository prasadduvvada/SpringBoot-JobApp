package com.prasad.JobApp;

import com.prasad.JobApp.model.JobPost;
import com.prasad.JobApp.services.Jobservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Controller
public class controllers {

     @Autowired
     private Jobservice service;
    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addjob(){

        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleform(JobPost jobpost){
        service.addjob(jobpost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String alljobs(Model m){
        List<JobPost> job = service.getalljobs();
        m.addAttribute("jobPosts",job);
        service.loaddata();
        return "viewalljobs";
    }

}
