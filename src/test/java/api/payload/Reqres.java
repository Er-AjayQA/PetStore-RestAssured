package api.payload;

import com.github.javafaker.Job;
import com.github.javafaker.Name;

public class Reqres {
	
	String emailId;
	String password;
	Name name;
	Job job;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name2) {
		this.name = name2;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job2) {
		this.job = job2;
	}
	
	
	

}
