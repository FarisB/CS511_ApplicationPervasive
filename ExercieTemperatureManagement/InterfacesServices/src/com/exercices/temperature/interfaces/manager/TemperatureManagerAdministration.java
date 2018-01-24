package com.exercices.temperature.interfaces.manager;

public interface TemperatureManagerAdministration {

	 public void temperatureIsTooHigh(String roomName);
	 
	 public void temperatureIsTooLow(String roomName);
	 
	 public Double getTemperatureMax(String room);
	 
	 public Double getTemperatureMin(String room);
	 
	 public void setTemperatureMax(String room, Double temperature);
	 
	 public void setTemperatureMin(String room, Double temperature);
	 
	 
}
