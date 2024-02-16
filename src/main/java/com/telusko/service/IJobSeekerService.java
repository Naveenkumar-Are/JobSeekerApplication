package com.telusko.service;

import java.util.Optional;

import com.telusko.bo.JobSeekerInfo;

public interface IJobSeekerService {
	
	public String registerJobSeeker(JobSeekerInfo jobSeeker);
	public Optional<JobSeekerInfo> getDetailsById(int id);

}
