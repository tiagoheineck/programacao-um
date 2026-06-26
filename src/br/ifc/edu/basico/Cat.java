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

	public void meow() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		var resource = getClass().getResource("/meow.wav");

		if (resource == null) {
			System.err.println("Erro: O arquivo 'meow.wav' não foi encontrado na raiz dos recursos!");
			return; // Cancela a execução para evitar o NullPointerException
		}

		try (var audioStream = AudioSystem.getAudioInputStream(resource)) {
			var clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();

			// Mantém a thread viva apenas o tempo necessário para o som tocar
			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public void fight() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		var resource = getClass().getResource("/fight.wav");

		if (resource == null) {
			System.err.println("Erro: O arquivo 'meow.wav' não foi encontrado na raiz dos recursos!");
			return; // Cancela a execução para evitar o NullPointerException
		}

		try (var audioStream = AudioSystem.getAudioInputStream(resource)) {
			var clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();

			// Mantém a thread viva apenas o tempo necessário para o som tocar
			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}
