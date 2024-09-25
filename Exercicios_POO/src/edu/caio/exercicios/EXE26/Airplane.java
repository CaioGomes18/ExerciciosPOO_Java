package edu.caio.exercicios.EXE26;

import java.time.LocalTime;

public class Airplane {
	
	
	private String numeroDoVoo;
	private String destino;
	private LocalTime horarioDeDecolagem;
	private int atraso;
	
	
	
	public Airplane(String numeoroDoVoo, String destino, LocalTime horarioDeDecolagem) {
		this.numeroDoVoo = numeoroDoVoo;
		this.destino = destino;
		this.horarioDeDecolagem = horarioDeDecolagem;
		this.atraso = 0;
	}

	public String getNumeroDoVoo() {
		return numeroDoVoo;
	}

	public void setNumeroDoVoo(String numeroDoVoo) {
		this.numeroDoVoo = numeroDoVoo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalTime getHorarioDeDecolagem() {
		return horarioDeDecolagem;
	}

	public void setHorarioDeDecolagem(LocalTime horarioDeDecolagem) {
		this.horarioDeDecolagem = horarioDeDecolagem;
	}

	public int getAtraso() {
		return atraso;
	}

	public void setAtraso(int atraso) {
		this.atraso = atraso;
	}
	
	public void delay(int minutes) {
		this.atraso = minutes;
		
		this.horarioDeDecolagem = this.horarioDeDecolagem.plusMinutes(minutes);
	}
	
	public void checkStatus() {
		if(this.atraso == 0) {
			System.out.println("Flight " + numeroDoVoo + " is on time.");
		}
		else {
			System.out.println("Flight " + numeroDoVoo + "is delayed by " + atraso + "minutes");
		}
	}
	
	
	
	
	
}
