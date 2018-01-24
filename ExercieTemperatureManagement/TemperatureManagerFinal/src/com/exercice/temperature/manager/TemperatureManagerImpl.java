package com.exercice.temperature.manager;

import com.exercices.temperature.interfaces.manager.TemperatureManagerAdministration;

import com.exercice.temperature.interfaces.configuration.TemperatureConfiguration;

public class TemperatureManagerImpl implements TemperatureManagerAdministration {

	/** Field for configurationService dependency */
	private TemperatureConfiguration configurationService;

	private Double temperatureMaxKitchen;
	private Double temperatureMaxBathroom;
	private Double temperatureMaxBedroom;
	private Double temperatureMaxLivingroom;

	private Double temperatureMinKitchen;
	private Double temperatureMinBathroom;
	private Double temperatureMinBedroom;
	private Double temperatureMinLivingroom;

	/** Component Lifecycle Method */
	public void stop() {
		System.out.println("MANAGER is stopping...");
	}

	/** Component Lifecycle Method */
	public void start() {
		System.out.println("MANAGER is starting...");
	}

	@Override
	public void temperatureIsTooHigh(String roomName) {
		Double temperature = configurationService.getTargetedTemperature(roomName);
		temperature--;
		setTemperatureMax(roomName, temperature);
		configurationService.setTargetedTemperature(roomName, temperature);
	}

	@Override
	public void temperatureIsTooLow(String roomName) {
		Double temperature = configurationService.getTargetedTemperature(roomName);
		temperature++;
		setTemperatureMin(roomName, temperature);
		configurationService.setTargetedTemperature(roomName, temperature);
	}

	@Override
	public Double getTemperatureMax(String room) {
		if (room.equals("kitchen")) {
			return temperatureMaxKitchen;
		} else if (room.equals("livingroom")) {
			return temperatureMaxLivingroom;
		} else if (room.equals("bathroom")) {
			return temperatureMaxBathroom;
		} else if (room.equals("bedroom")) {
			return temperatureMaxBedroom;
		} else {
			return null;
		}
	}

	@Override
	public void setTemperatureMax(String room, Double temperature) {
		if (room.equals("kitchen")) {
			temperatureMaxKitchen = temperature;
		} else if (room.equals("livingroom")) {
			temperatureMaxLivingroom = temperature;
		} else if (room.equals("bathroom")) {
			temperatureMaxBathroom = temperature;
		} else if (room.equals("bedroom")) {
			temperatureMaxBedroom = temperature;
		} else {
			//No room
		}
	}

	@Override
	public Double getTemperatureMin(String room) {
		if (room.equals("kitchen")) {
			return temperatureMinKitchen;
		} else if (room.equals("livingroom")) {
			return temperatureMinLivingroom;
		} else if (room.equals("bathroom")) {
			return temperatureMinBathroom;
		} else if (room.equals("bedroom")) {
			return temperatureMinBedroom;
		} else {
			return null;
		}
	}

	@Override
	public void setTemperatureMin(String room, Double temperature) {
		System.out.println("setTemperatureMinKitchen AVANT : " + temperatureMinKitchen);
		if (room.equals("kitchen")) {
			temperatureMinKitchen = temperature;
		} else if (room.equals("livingroom")) {
			temperatureMinLivingroom = temperature;
		} else if (room.equals("bathroom")) {
			temperatureMinBathroom = temperature;
		} else if (room.equals("bedroom")) {
			temperatureMinBedroom = temperature;
		} else {
			//No room
		}
		System.out.println("setTemperatureMinKitchen APRES : " + temperatureMinKitchen);
	}

}
