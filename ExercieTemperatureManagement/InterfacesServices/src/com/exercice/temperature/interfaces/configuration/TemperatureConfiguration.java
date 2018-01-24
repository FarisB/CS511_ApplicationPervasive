package com.exercice.temperature.interfaces.configuration;

public interface TemperatureConfiguration {
	
	public void setTargetedTemperature(String targetedRoom, Double temperature);
	
	public Double getTargetedTemperature(String room);

}
