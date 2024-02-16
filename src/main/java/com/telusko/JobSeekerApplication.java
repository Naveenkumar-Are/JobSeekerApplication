package com.telusko;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.telusko.bo.JobSeekerInfo;
import com.telusko.service.JobSeekerImpl;






@SpringBootApplication
public class JobSeekerApplication {
	

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext context = SpringApplication.run(JobSeekerApplication.class, args);
		JobSeekerImpl service = context.getBean(JobSeekerImpl.class);
		
//		InputStream input=null;
//		FileReader reader=null;
//		byte image[]=null;
//		char textFile[]=null;
	//	
//		try 
//		{
//			 input=new FileInputStream("D:\\LOB\\naveen.JPG");
//			  image=new byte[input.available()];
//			  input.read(image);
//			
//			 File file=new File("D:\\LOB\\bio.txt");
//			 reader=new FileReader(file);
//			 textFile=new char[(int) file.length()];
//			 reader.read(textFile);
//			 
//		} 
	//	
//		catch (FileNotFoundException e) 
//		{
	//	
//			e.printStackTrace();
//		}
//		catch (Exception e) 
//		{
	//	
//			e.printStackTrace();
//		}
	//	
	//
	//	
	//	
//		JobSeeker job=new JobSeeker("naveen" , "Bengaluru", image, textFile);
	//	
//		String status=service.registerJobSeeker(job);
//		System.out.println(status);
	//	
	//	
	//	
//		try {
//			reader.close();
//			input.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Integer id=1;
		Optional<JobSeekerInfo> optional = service.getDetailsById(id);
		if(optional.isPresent())
		{
			JobSeekerInfo job = optional.get();
			System.out.println(job.getId()+ " : "+ job.getName() + " "+ job.getCity());
			OutputStream output=new FileOutputStream("naveen.JPG");
			output.write(job.getImage());
			output.flush();
			
			FileWriter writer=new FileWriter("Bio.txt");
			writer.write(job.getTextFile());
			writer.flush();
		}
		else
		{
			System.out.println("There is no record with the given id : "+ id);
		}
		
		
		context.close();
		}


}
