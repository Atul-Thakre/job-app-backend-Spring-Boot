package com.atul.spring_boot_rest.repo;

import com.atul.spring_boot_rest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(

            new JobPost(
                    1,
                    "Java Developer",
                    "Must have good knowledge of Java and Spring Boot.",
                    2,
                    Arrays.asList("Java", "Spring Boot", "Hibernate", "SQL", "Git")
            ),

            new JobPost(
                    2,
                    "Python Developer",
                    "Must have experience developing applications using Python.",
                    2,
                    Arrays.asList("Python", "Django", "Flask", "REST API", "MySQL")
            ),

            new JobPost(
                    3,
                    ".NET Developer",
                    "Must have good knowledge of .NET and C# development.",
                    3,
                    Arrays.asList("C#", ".NET Core", "ASP.NET", "Web API", "SQL Server")
            ),

            new JobPost(
                    4,
                    "Azure Developer",
                    "Must have experience developing and deploying applications on Azure.",
                    3,
                    Arrays.asList("Azure", "Azure Functions", "Azure DevOps", "App Service", "Docker")
            ),

            new JobPost(
                    5,
                    "AWS Developer",
                    "Must have good knowledge of AWS cloud services.",
                    2,
                    Arrays.asList("AWS", "EC2", "S3", "Lambda", "RDS")
            ),

            new JobPost(
                    6,
                    "C++ Developer",
                    "Must have strong knowledge of C++ and object-oriented programming.",
                    2,
                    Arrays.asList("C++", "OOP", "STL", "Data Structures", "Algorithms")
            ),

            new JobPost(
                    7,
                    "Angular Developer",
                    "Must have experience building modern web applications using Angular.",
                    2,
                    Arrays.asList("Angular", "TypeScript", "JavaScript", "HTML", "CSS")
            ),

            new JobPost(
                    8,
                    "React Developer",
                    "Must have experience developing responsive applications using React.",
                    2,
                    Arrays.asList("React", "JavaScript", "TypeScript", "Redux", "HTML", "CSS")
            ),

            new JobPost(
                    9,
                    "Node.js Developer",
                    "Must have experience developing backend applications using Node.js.",
                    2,
                    Arrays.asList("Node.js", "Express.js", "MongoDB", "REST API", "JavaScript")
            ),

            new JobPost(
                    10,
                    "DevOps Engineer",
                    "Must have experience with CI/CD and containerized applications.",
                    3,
                    Arrays.asList("Docker", "Kubernetes", "Jenkins", "Git", "CI/CD", "Linux")
            ),

            new JobPost(
                    11,
                    "Full Stack Developer",
                    "Must have experience working on both frontend and backend technologies.",
                    3,
                    Arrays.asList("Java", "Spring Boot", "Angular", "SQL", "REST API", "Git")
            )
    ));
    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }

    public JobPost getJob(int id){
       //iterate arraylist and find the id
        for(JobPost job:jobs)
        {
            if (job.getPostId()==id){
             return job;
            }
        }
        return null;
    }

    public void updateJobPost(JobPost jobPost){
        for (JobPost job:jobs){
            if(job.getPostId()==jobPost.getPostId()){
                job.setPostDesc(jobPost.getPostDesc());
                job.setPostProfile(jobPost.getPostProfile());
                job.setPostTechStack(jobPost.getPostTechStack());
                job.setReqExperience(jobPost.getReqExperience());
            }
        }
    }

    public void deleteJob(int postId){
        for (JobPost job:jobs){
            if(job.getPostId()==postId){
                jobs.remove(job);   //remove that object
            }
        }
    }
}
