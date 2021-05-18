package acessorio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputMarcas = JOptionPane.showInputDialog("Digite marcas de relógio (separando cada uma com vírgula)");
		String[] resultado = inputMarcas.split(",");
		HashSet<String> marcas = new HashSet<String>(Arrays.asList(resultado));

		System.out.println("Exibindo marcas cadastradas:\n");
		System.out.println(marcas + "\n");

		ArrayList<Relogio> relogios = new ArrayList<Relogio>();

		for (int i = 0; i <= 1; i++) {
			Relogio rel = new Relogio();
			rel.setTipo(JOptionPane.showInputDialog("Digite o tipo do relógio:"));
			rel.setCor(JOptionPane.showInputDialog("Digite a cor do relógio: "));
			rel.setFormato(JOptionPane.showInputDialog("Digite o formato do relógio: "));
			rel.setTamanho(JOptionPane.showInputDialog("Digite o tamanho do relógio: "));
			rel.setMaterial(JOptionPane.showInputDialog("Digite o material do relógio: "));
			rel.setMarca(JOptionPane.showInputDialog("Digite a marca do relógio: "));
			rel.setGenero(JOptionPane.showInputDialog("Digite o genero do relógio: "));
			relogios.add(rel);
		}

		for (int i = 0; i < relogios.size(); i++) {
			Relogio rel = relogios.get(i);
			
			System.out.println("Relógio nº " + (i + 1));
			System.out.println(rel);
		}

		// Associando os relógios com as marcas

		Map<String, ArrayList<Relogio>> relogioMarca = new HashMap<>();

		for (String marca : marcas) {
			ArrayList<Relogio> listaMarcas = new ArrayList<Relogio>();

			for (Relogio relogio : relogios) {
				if (relogio.getMarca().equals(marca)) {
					listaMarcas.add(relogio);
				}
			}

			relogioMarca.put(marca, listaMarcas);
		}

		System.out.println(relogioMarca);

	}
}
