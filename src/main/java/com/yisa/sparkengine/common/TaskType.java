package com.yisa.sparkengine.common;

/**
* @author liliwei
* @date  2016年9月28日 
* 
*/
public enum TaskType {
	
	/**
	 *   val Emp = "00"
  val FrequentlyCar = "01"
  val SearchCarByPic = "02"
  val SearchSimilarPlate = "03"
  val MultiPoint = "04"
  val CaseCar = "05"
   
	 * 
	 * 
	 */

	FrequentlyCar("01"), 
	SearchCarByPic("02"),
	SearchSimilarPlate("03"),
	MultiPoint("04"),
	CaseCar("05"),
	EndStation("06"),
	TogetherCar("07"),
	Nocturnal("09");
	
	
	
	
	private String type;

	// 构造方法  
	private TaskType(String type) {
		this.type = type;
	}



	@Override
	public String toString() {
		return this.type;
	}
	

	/**
	 * 
	 *  val Emp = "00"
	val FrequentlyCar = "01"
	val SearchCarByPic = "02"
	 */
}
