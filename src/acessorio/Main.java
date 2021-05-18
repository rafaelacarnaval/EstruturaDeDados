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

		String inputMarcas = JOptionPane.showInputDialog("Digite marcas de rel�gio (separando cada uma com v�rgula)");
		String[] resultado = inputMarcas.split(",");
		HashSet<String> marcas = new HashSet<String>(Arrays.asList(resultado));

		System.out.println("Exibindo marcas cadastradas:\n");
		System.out.println(marcas + "\n");

		ArrayList<Relogio> relogios = new ArrayList<Relogio>();

		for (int i = 0; i <= 1; i++) {
			Relogio rel = new Relogio();
			rel.setTipo(JOptionPane.showInputDialog("Digite o tipo do rel�gio:"));
			rel.setCor(JOptionPane.showInputDialog("Digite a cor do rel�gio: "));
			rel.setFormato(JOptionPane.showInputDialog("Digite o formato do rel�gio: "));
			rel.setTamanho(JOptionPane.showInputDialog("Digite o tamanho do rel�gio: "));
			rel.setMaterial(JOptionPane.showInputDialog("Digite o material do rel�gio: "));
			rel.setMarca(JOptionPane.showInputDialog("Digite a marca do rel�gio: "));
			rel.setGenero(JOptionPane.showInputDialog("Digite o genero do rel�gio: "));
			relogios.add(rel);
		}

		for (int i = 0; i < relogios.size(); i++) {
			Relogio rel = relogios.get(i);
			
			System.out.println("Rel�gio n� " + (i + 1));
			System.out.println(rel);
		}

		// Associando os rel�gios com as marcas

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
