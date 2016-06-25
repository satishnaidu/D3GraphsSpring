package com.sample.dto;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphDto {

	private String chartName;
	private Date currentDate;

	private Map<String, Double> chartData = new HashMap<String, Double>();

	public String getChartName() {
		return chartName;
	}

	public void setChartName(String chartName) {
		this.chartName = chartName;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	public Map<String, Double> getChartData() {
		return chartData;
	}

	public void setChartData(Map<String, Double> chartData) {
		this.chartData = chartData;
	}

}
