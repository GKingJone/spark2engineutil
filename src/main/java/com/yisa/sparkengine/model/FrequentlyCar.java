package com.yisa.sparkengine.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
* @author liliwei
* @date  2016年9月28日 
* 
*/
public class FrequentlyCar {
	
	private String startTime;
	private String endTime;
	private String[] locationId;
	private String[] carModel;
	private String carBrand;
	private String[] carYear;
	private String plateNumber;
	private String carColor;
	private String feature;
	private int count = 2;
	public FrequentlyCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public FrequentlyCar(String startTime, String endTime, String[] locationId, String[] carModel, String carBrand,
			String[] carYear, String plateNumber, String carColor, String feature, int count) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.locationId = locationId;
		this.carModel = carModel;
		this.carBrand = carBrand;
		this.carYear = carYear;
		this.plateNumber = plateNumber;
		this.carColor = carColor;
		this.feature = feature;
		this.count = count;
	}



	public String getFeature() {
		return feature;
	}



	public void setFeature(String feature) {
		this.feature = feature;
	}



	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getStartTime() {
		return startTime;
	}
	/**
	 * time format:yyyyMMddHHmmss
	 * @param startTime
	 */
	public void setStartTime(String startTime) {
		SimpleDateFormat df = new  SimpleDateFormat("yyyyMMddHHmmss");
		try {
			df.parse(startTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	/**
	 * time format:yyyyMMddHHmmss
	 * @param endTime
	 */
	public void setEndTime(String endTime) {
		SimpleDateFormat df = new  SimpleDateFormat("yyyyMMddHHmmss");
		try {
			df.parse(endTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.endTime = endTime;
	}
	public String[] getLocationId() {
		return locationId;
	}
	public void setLocationId(String[] locationId) {
		this.locationId = locationId;
	}
	public String[] getCarModel() {
		return carModel;
	}
	public void setCarModel(String[] carModel) {
		this.carModel = carModel;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String[] getCarYear() {
		return carYear;
	}
	public void setCarYear(String[] carYear) {
		this.carYear = carYear;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
