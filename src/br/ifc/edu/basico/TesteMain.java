package br.ifc.edu.basico;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class TesteMain {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		Cat cat = new Cat();
		cat.meow();
		cat.fight();
	}

}
