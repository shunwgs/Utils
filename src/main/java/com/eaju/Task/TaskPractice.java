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
	// */5 * * * * ? 五秒执行一次
	//@Scheduled(cron = "*/5 * * * * ? ")
	public void show(){
       System.out.println("hello");
	}
	
	public void print(){
	       System.out.println("hello");
		} 
	 
	 /**
	 * 心跳更新。启动时执行一次，之后每隔1分钟执行一次
	 */
	//@Scheduled(fixedRate = 1000*60*1)
	public void heartbeat() {
	    System.out.println("心跳更新... " + new Date());
	}
}
