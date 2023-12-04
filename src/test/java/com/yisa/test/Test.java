package com.yisa.test;

import com.google.gson.Gson;
import com.yisa.sparkengine.common.TaskType;
import com.yisa.sparkengine.console.SparkEngineRequest;
import com.yisa.sparkengine.model.FrequentlyCar;

/**
* @author liliwei
* @date  2016年9月28日 
* 
*/
public class Test {
	public static void test1(){
		System.out.println(TaskType.FrequentlyCar);
		System.out.println(TaskType.SearchCarByPic);
		
	}
	
	public static void test2(){
	
		
		FrequentlyCar frequentlyCar = new FrequentlyCar();
		frequentlyCar.setStartTime("20160924000000");
		frequentlyCar.setEndTime("20160927000000");
		frequentlyCar.setCount(2);
		Gson gson = new Gson();
		String job_message=gson.toJson(frequentlyCar);
		
		SparkEngineRequest sparkEngineRequest = new SparkEngineRequest();
		sparkEngineRequest.sentRequest("cdh1:9092","SparkEngine",TaskType.FrequentlyCar, "job_id",job_message);
		
	}
	public static void main(String[] args) {
		test2();
	}

}
