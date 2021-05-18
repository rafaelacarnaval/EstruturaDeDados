package acessorio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import java.awt.Color;

public class View extends JFrame {

	private JPanel contentPane;
	private JTextField marcas_field;
	private JTextField tipo_field;
	private JTextField cor_field;
	private JTextField formato_field;
	private JTextField tamanho_field;
	private JTextField material_field;
	private JTextField marca_field;
	private JTextField genero_field;

	private int x = 45;
	private int y = 35;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel section_marcas = new JPanel();
		section_marcas.setBounds(45, 51, 474, 51);
		contentPane.add(section_marcas);
		section_marcas.setLayout(null);

		JLabel lblNewLabel = new JLabel("Digite as marcas:");
		lblNewLabel.setBounds(0, 0, 109, 20);
		section_marcas.add(lblNewLabel);
		lblNewLabel.setToolTipText("Ex: Apple,Samsung,Casio");

		marcas_field = new JTextField();
		marcas_field.setBounds(119, 1, 323, 19);
		section_marcas.add(marcas_field);
		marcas_field.setColumns(10);

		JButton btnAddMarcas = new JButton("Adicionar");
		btnAddMarcas.setBounds(207, 30, 109, 21);
		section_marcas.add(btnAddMarcas);

		JPanel section_relogio = new JPanel();
		section_relogio.setBounds(45, 122, 474, 168);
		contentPane.add(section_relogio);
		section_relogio.setLayout(null);
		section_relogio.setVisible(false);

		JLabel lblNewLabel_2 = new JLabel("Tipo:");
		lblNewLabel_2.setBounds(10, 10, 85, 13);
		section_relogio.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Cor:");
		lblNewLabel_3.setBounds(10, 33, 85, 13);
		section_relogio.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Formato:");
		lblNewLabel_4.setBounds(10, 56, 85, 13);
		section_relogio.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Tamanho:");
		lblNewLabel_5.setBounds(10, 77, 85, 13);
		section_relogio.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Material:");
		lblNewLabel_6.setBounds(10, 100, 85, 13);
		section_relogio.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Marca:");
		lblNewLabel_7.setBounds(10, 122, 85, 13);
		section_relogio.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Genero:");
		lblNewLabel_8.setBounds(10, 145, 85, 13);
		section_relogio.add(lblNewLabel_8);

		tipo_field = new JTextField();
		tipo_field.setBounds(133, 7, 96, 19);
		section_relogio.add(tipo_field);
		tipo_field.setColumns(10);

		cor_field = new JTextField();
		cor_field.setBounds(133, 30, 96, 19);
		section_relogio.add(cor_field);
		cor_field.setColumns(10);

		formato_field = new JTextField();
		formato_field.setBounds(133, 53, 96, 19);
		section_relogio.add(formato_field);
		formato_field.setColumns(10);

		tamanho_field = new JTextField();
		tamanho_field.setBounds(133, 74, 96, 19);
		section_relogio.add(tamanho_field);
		tamanho_field.setColumns(10);

		material_field = new JTextField();
		material_field.setBounds(133, 97, 96, 19);
		section_relogio.add(material_field);
		material_field.setColumns(10);

		marca_field = new JTextField();
		marca_field.setBounds(133, 119, 96, 19);
		section_relogio.add(marca_field);
		marca_field.setColumns(10);

		genero_field = new JTextField();
		genero_field.setBounds(133, 142, 96, 19);
		section_relogio.add(genero_field);
		genero_field.setColumns(10);

		JButton btnAddRelogio = new JButton("Adicionar");
		btnAddRelogio.setBounds(327, 73, 113, 21);
		section_relogio.add(btnAddRelogio);

		JButton btnShowMap = new JButton("Mostrar Rel\u00F3gios");
		btnShowMap.setBounds(225, 312, 180, 21);
		contentPane.add(btnShowMap);

		JLayeredPane section_resultado = new JLayeredPane();
		section_resultado.setBounds(0, 0, 576, 343);
		contentPane.add(section_resultado);

		JLabel lblNewLabel_1 = new JLabel("Cadastro de Rel\u00F3gios");
		lblNewLabel_1.setBounds(219, 10, 181, 20);
		section_resultado.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(247, 312, 140, 21);
		
		btnShowMap.setVisible(false);
		btnVoltar.setVisible(false);

		// Actions

		HashSet<String> marcas = new HashSet<String>();

		btnAddMarcas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String inputMarcas = marcas_field.getText();
				String[] resultado = inputMarcas.split(",");
				marcas.addAll(Arrays.asList(resultado));

				System.out.println("Exibindo marcas cadastradas:\n");
				System.out.println(marcas + "\n");

				if (marcas.isEmpty() == false) {
					section_marcas.setVisible(false);
					section_relogio.setVisible(true);
				}
			}
		});

		// Adicionando os relógios

		ArrayList<Relogio> relogios = new ArrayList<Relogio>();

		btnAddRelogio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Relogio rel = new Relogio();
				rel.setTipo(tipo_field.getText());
				rel.setCor(cor_field.getText());
				rel.setFormato(formato_field.getText());
				rel.setTamanho(tamanho_field.getText());
				rel.setMaterial(material_field.getText());
				rel.setMarca(marca_field.getText());
				rel.setGenero(genero_field.getText());
				relogios.add(rel);

				if (relogios.isEmpty() == false) {
					btnShowMap.setVisible(true);
				}

				System.out.println(relogios);

				// Limpando campos
				tipo_field.setText("");
				cor_field.setText("");
				formato_field.setText("");
				tamanho_field.setText("");
				material_field.setText("");
				marca_field.setText("");
				genero_field.setText("");
			}
		});

		btnShowMap.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				section_resultado.setVisible(true);
				section_relogio.setVisible(false);
				
				section_resultado.removeAll();
				section_resultado.add(btnVoltar);
				
				x = 45;
				y = 35;

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

				relogioMarca.forEach((marca, relogios) -> {
					JLabel labelMarca = new JLabel("");
					labelMarca.setBounds(x, y, 500, 20);
					labelMarca.setFont(new Font("Tahoma", Font.BOLD, 14));
					labelMarca.setText(marca);
					section_resultado.add(labelMarca);
					y = y + 25;

					for (Relogio r : relogios) {
						JLabel labelTipo = new JLabel(r.toString());
						labelTipo.setBounds(x, y, 500, 20);
						section_resultado.add(labelTipo);
						y = y + 20;
					}
					y = y + 25;
				});

				section_resultado.validate();
				section_resultado.repaint();
				btnShowMap.setVisible(false);
				btnVoltar.setVisible(true);

			}

		});
		btnVoltar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				section_resultado.setVisible(false);
				section_marcas.setVisible(true);
				marcas.clear();
				marcas_field.setText("");
				relogios.clear();
				
			}
		});		
		
	}
}
