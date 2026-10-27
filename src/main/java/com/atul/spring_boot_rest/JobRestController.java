package com.atul.spring_boot_rest;

import com.atul.spring_boot_rest.model.JobPost;
import com.atul.spring_boot_rest.service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class JobRestController{

    @Autowired
    private jobService ser;

    @GetMapping("jobPosts")
   // @ResponseBody  //Annotation to give json response without requiring any view file
    public List<JobPost> getAllJobs(){
     return ser.getAllJobs();
    }


    @GetMapping("jobPost/{id}")
    public JobPost getJob(@PathVariable int id){
        return ser.getJob(id);
    }

    @PostMapping("/jobPost")
    public JobPost addJob(@RequestBody JobPost jobpost) {
        ser.addJob(jobpost);
        return ser.getJob(jobpost.getPostId());
    }

    //To Update an existing jobPost
    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobpost){
        ser.updateJobPost(jobpost);
        return ser.getJob(jobpost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId){
        ser.deleteJob(postId);
        return "Job post deleted";
    }
}
