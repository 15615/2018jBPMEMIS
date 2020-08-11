package com.bwlk.utils;

import org.jbpm.api.model.OpenExecution;
import org.jbpm.api.task.Assignable;
import org.jbpm.api.task.AssignmentHandler;

public class MyApplicationHandler implements AssignmentHandler{

	public void assign(Assignable assignable, OpenExecution execution) throws Exception {
		// 
		String application = execution.getVariable("application").toString();//execution的上下文
		assignable.setAssignee(application); 
	}
	
	

}
