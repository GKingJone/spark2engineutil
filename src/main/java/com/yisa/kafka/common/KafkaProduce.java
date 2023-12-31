package com.yisa.kafka.common;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

/**
* @author liliwei
* @date  2016年9月28日 
* 
*/
public class KafkaProduce {
	
	public void sendMessage(String kafkaHostport,String topic,String message){
		
		Properties props = new Properties();
//		props.put("bootstrap.servers", "cdh1:9092");
		props.put("bootstrap.servers", kafkaHostport);
		props.put("acks", "all");
		props.put("retries", 0);
		props.put("batch.size", 16384);
		props.put("linger.ms", 1);
		props.put("buffer.memory", 33554432);
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		Producer<String, String> producer = new KafkaProducer<>(props);
		producer.send(new ProducerRecord<String, String>(topic, Integer.toString(0), message));
		producer.close();
		
	}
	
	
}
