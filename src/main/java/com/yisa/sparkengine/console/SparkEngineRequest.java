package com.yisa.sparkengine.console;

import com.google.gson.Gson;
import com.yisa.kafka.common.KafkaProduce;
import com.yisa.sparkengine.common.TaskType;
import com.yisa.sparkengine.model.FrequentlyCar;
import com.yisa.sparkengine.model.InputBean;

/**
* @author liliwei
* @date  2016年9月28日 
* 
*/
public class SparkEngineRequest {
	/**
	 * 
	 * @param kafkaHostport 
	 * Kafka地址，需注明端口号，建议使用枚举类NodeIdHostport
	 * @param taskType
	 * 请求任务类型，使用枚举类TaskType
	 * @param job_id
	 * 任务id，建议使用uuid
	 * @param job_message
	 * 请求具体内容：
		建议使用Model类转换为Json传入，如
		频繁过车任务使用FrequentlyCar类转换为JSON
	 * by liliwei 2016年9月28日
	 */
	public void sentRequest(String kafkaHostport, String topic ,TaskType taskType, String job_id, String job_message) {
		KafkaProduce kafkaProduce = new KafkaProduce();
		Gson gson = new Gson();
		switch (taskType) {
		case FrequentlyCar:
			System.out.println("FrequentlyCar");
//			gson.fromJson(job_message, FrequentlyCar.class);
			break;  
		case SearchCarByPic:
			System.out.println("SearchCarByPic");
			break;  
		case SearchSimilarPlate:
			System.out.println("SearchSimilarPlate");
//			gson.fromJson(job_message, InputBean.class);
			break;  
		case MultiPoint:
			System.out.println("MultiPoint");
//			gson.fromJson(job_message, InputBean.class);
			break;  
		case CaseCar:
			System.out.println("CaseCar");
//			gson.fromJson(job_message, InputBean.class);
			break;  
		case EndStation:
			System.out.println("EndStation");
//			gson.fromJson(job_message, InputBean.class);
			break;  
		default:
			break;
		}

		kafkaProduce.sendMessage(kafkaHostport, topic, taskType + "|" + job_id + "|" + job_message);
	}

}
