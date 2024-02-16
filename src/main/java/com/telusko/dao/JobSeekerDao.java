package com.telusko.dao;

import org.springframework.data.repository.CrudRepository;

import com.telusko.bo.JobSeekerInfo;

public interface JobSeekerDao extends CrudRepository<JobSeekerInfo, Integer> {

}
