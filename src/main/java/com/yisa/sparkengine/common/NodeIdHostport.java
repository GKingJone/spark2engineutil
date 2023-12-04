package com.yisa.sparkengine.common;

/**
* @author liliwei
* @date  2016年9月28日 
* 
*/
public enum NodeIdHostport {

	CDH1("cdh1:9092"),
	SiChuan("10.64.203.123:9092");
	private String hostport;

	// 构造方法  
	private NodeIdHostport(String hostport) {
		this.hostport = hostport;
	}



	@Override
	public String toString() {
		return this.hostport;
	}
	

	/**
	 * 
	 *  val Emp = "00"
	val FrequentlyCar = "01"
	val SearchCarByPic = "02"
	 */
}
