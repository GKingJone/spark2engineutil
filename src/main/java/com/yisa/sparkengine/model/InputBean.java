package com.yisa.sparkengine.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
* @author liliwei
* @date  2016年9月28日 
* 
*/
public class InputBean {
	
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
	private int differ;
	private int isRepair;
	private String[] carLevel;
	
	
	
	public InputBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InputBean(String startTime, String endTime, String[] locationId,
			String[] carModel, String carBrand, String[] carYear,
			String plateNumber, String carColor, String feature, int count,
			int differ, int isRepair) {
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
		this.differ = differ;
		this.isRepair = isRepair;
	}
	
	
	
	
	public String[] getCarLevel() {
		return carLevel;
	}
	public void setCarLevel(String[] carLevel) {
		this.carLevel = carLevel;
	}
	public InputBean(String startTime, String endTime, String[] locationId,
			String[] carModel, String carBrand, String[] carYear,
			String plateNumber, String carColor, String feature, int count,
			int differ, int isRepair, String[] carLevel) {
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
		this.differ = differ;
		this.isRepair = isRepair;
		this.carLevel = carLevel;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
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
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getDiffer() {
		return differ;
	}
	public void setDiffer(int differ) {
		this.differ = differ;
	}
	public int getIsRepair() {
		return isRepair;
	}
	public void setIsRepair(int isRepair) {
		this.isRepair = isRepair;
	}
	
	
	
	
	
}
