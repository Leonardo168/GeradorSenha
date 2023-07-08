package pacote;

import java.util.Random;
import javax.swing.JOptionPane;


/**
 * @author Leonardo Gomes da Silva
 */

public class Gerador {

	public static void main(String[] args) {
		int tamanho;
		String maiúsculo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String minúsculo = "abcdefghijklmnopqrstuvwxyz";
		String números = "0123456789";
		String especiais = "!@#$%¨&*()-_=+/*[]{}<>.,";
		String senha = maiúsculo+minúsculo+números+especiais;

		int menu;
		do {
			tamanho = Integer.parseInt(JOptionPane.showInputDialog("Tamanho da senha: "));
			char[] Senha = new char[tamanho];
			Random r = new Random();
			
			for (int i=0; i<tamanho; i++) {
				Senha[i] = senha.charAt(r.nextInt(senha.length()));
			}
			System.out.println(Senha);
			menu = JOptionPane.showConfirmDialog(null, "Senha gerada: " + new String(Senha) + "\n\nGerar nova senha?", "teste", JOptionPane.YES_NO_OPTION);
		}while(menu!=1);

	}

}
