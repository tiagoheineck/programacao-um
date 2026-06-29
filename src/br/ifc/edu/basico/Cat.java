package br.ifc.edu.basico;

import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Cat {

	public String name;
	public String gender;
	public int age;
	public double weight;
	public String color;

	public void breathe() {
		System.out.println("The cat is breathing.");
	}

	public void eat(String food) {
		System.out.println("The cat is eating." + food);
	}

	public void run(String destination) {
		System.out.println("The cat is running to " + destination);
	}

	public void sleep(int hours) {
		System.out.println("The cat is sleeping for " + hours + " hours.");
	}

	public void meow()  {
		var audio = new Audio();
		audio.reproduzirSom("meow.wav");
	}

	public void fight() {
		Audio audio = new Audio();
		audio.reproduzirSom("fight.wav");
	}

}
