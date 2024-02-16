package com.telusko.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.bo.JobSeekerInfo;
import com.telusko.dao.JobSeekerDao;

@Service
public class JobSeekerImpl implements IJobSeekerService {
	
	@Autowired
	private JobSeekerDao jobSeekerRepo;

	@Override
	public String registerJobSeeker(JobSeekerInfo jobSeeker) {
		// TODO Auto-generated method stub
		Integer id=jobSeekerRepo.save(jobSeeker).getId();
		return "Info saved with id "+ id;
	}

	@Override
	public Optional<JobSeekerInfo> getDetailsById(int id) {
		// TODO Auto-generated method stub
		Optional<JobSeekerInfo> optional = jobSeekerRepo.findById(id);
		return optional;
	}

}
