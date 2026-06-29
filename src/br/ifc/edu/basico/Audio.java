package br.ifc.edu.basico;

public class Audio {
	
	public void reproduzirSom(String nomeArquivo) {
		try {
			var resource = getClass().getResource("/" + nomeArquivo);
			
			if (resource == null) {
				System.err.println("Erro: O arquivo '" + nomeArquivo + "' não foi encontrado na raiz dos recursos!");
				return; // Cancela a execução para evitar o NullPointerException
			}
			
			try (var audioStream = javax.sound.sampled.AudioSystem.getAudioInputStream(resource)) {
				var clip = javax.sound.sampled.AudioSystem.getClip();
				clip.open(audioStream);
				clip.start();
				
				// Mantém a thread viva apenas o tempo necessário para o som tocar
				Thread.sleep(clip.getMicrosecondLength() / 1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		} catch (javax.sound.sampled.UnsupportedAudioFileException | java.io.IOException | javax.sound.sampled.LineUnavailableException e) {
			e.printStackTrace();
		}
	}

}
