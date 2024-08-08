package edu.caio.exercicios.EXE21;

public class TrafficLight {
	protected String color;
	protected double duration;
	
	
	
	
	public TrafficLight(String color, double duration) {
		this.color = color;
		this.duration = duration;
	}
	public String getColor() {
		return color;
	}
	public double getDuration() {
		return duration;
	}
	
	public void changeColor(String cor) {
		this.color = cor;
	}
	
	public boolean isGreen() {
		String color2 = color.toUpperCase();
		return color2.equals("GREEN");
	}
	
	public boolean isRed() {
		
		return color.toUpperCase().equals("RED");
	}
	
	public boolean isYellow() {
		String color1 = color.toUpperCase();
		return color1.equals("YELLOW");
	}
}
