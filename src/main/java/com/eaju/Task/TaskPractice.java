package com.eaju.Task;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskPractice {
     
	public static void main(String[] args) {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml"); 
		
	}
	// */5 * * * * ? ����ִ��һ��
	//@Scheduled(cron = "*/5 * * * * ? ")
	public void show(){
       System.out.println("hello");
	}
	
	public void print(){
	       System.out.println("hello");
		} 
	 
	 /**
	 * �������¡�����ʱִ��һ�Σ�֮��ÿ��1����ִ��һ��
	 */
	//@Scheduled(fixedRate = 1000*60*1)
	public void heartbeat() {
	    System.out.println("��������... " + new Date());
	}
}
