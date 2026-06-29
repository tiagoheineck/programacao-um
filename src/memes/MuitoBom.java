package memes;

import br.ifc.edu.basico.Audio;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MuitoBom {

	public static void main(String[] args) {
		// Tenta deixar a janela com o visual moderno do sistema operacional
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // Se falhar, usa o padrão do Java
        }

        // Texto formatado usando HTML para aplicar as cores do meme
        String mensagemHtml = "<html>"
                + "<h2 style='font-family: Arial; margin-bottom: 5px;'>Muito bom</h2>"
                + "<span style='font-size: 24px; color: #FFD700;'>★</span>" // Estrela Dourada
                + "<span style='font-size: 24px; color: #808080;'>★★★★</span>" // 4 Estelas Cinzas
                + "</html>";
        
        Audio audio = new Audio();
        audio.reproduzirSom("fail.wav");

        // Exibe a caixinha de diálogo (janelinha)
        JOptionPane.showMessageDialog(
                null,             // Componente pai (null para centralizar na tela)
                mensagemHtml,     // A mensagem com o HTML estruturado
                "Feedback",       // Título da janela
                JOptionPane.PLAIN_MESSAGE // Tipo de mensagem (sem ícones de erro/aviso de fábrica)
        );
	}

}
