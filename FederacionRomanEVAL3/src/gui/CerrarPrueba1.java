package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidades.Patrocinador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;



public class CerrarPrueba1 extends JFrame {

	private JPanel contentPane;
	private JTextField textidPrueba;
	private JTextField textNombre;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CerrarPrueba1 frame = new CerrarPrueba1();
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
	public CerrarPrueba1() {
		setTitle("Cerrar Prueba 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbl = new JLabel("idPrueba:");
		lbl.setBounds(10, 11, 46, 14);
		contentPane.add(lbl);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 36, 46, 14);
		contentPane.add(lblNombre);

		JLabel lblNewLabel = new JLabel("Fecha:");
		lblNewLabel.setBounds(10, 61, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Lugar:");
		lblNewLabel_1.setBounds(160, 61, 46, 14);
		contentPane.add(lblNewLabel_1);

		textidPrueba = new JTextField();
		textidPrueba.setEnabled(false);
		textidPrueba.setEditable(false);
		textidPrueba.setText("1");
		textidPrueba.setBounds(66, 8, 188, 20);
		contentPane.add(textidPrueba);
		textidPrueba.setColumns(10);

		textNombre = new JTextField();
		textNombre.setEnabled(false);
		textNombre.setText("Prueba1");
		textNombre.setEditable(false);
		textNombre.setBounds(66, 33, 188, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);

		JSpinner spinner_Fecha = new JSpinner();
		spinner_Fecha.setEnabled(false);
		spinner_Fecha.setBounds(66, 58, 84, 20);
		contentPane.add(spinner_Fecha);

		JLabel lblNewLabel_2 = new JLabel("Tipo de Prueba:");
		lblNewLabel_2.setBounds(20, 89, 76, 14);
		contentPane.add(lblNewLabel_2);

		JRadioButton rdbtnIndividual = new JRadioButton("Individual");
		rdbtnIndividual.setEnabled(false);
		rdbtnIndividual.setSelected(true);
		buttonGroup.add(rdbtnIndividual);
		rdbtnIndividual.setBounds(10, 110, 86, 23);
		contentPane.add(rdbtnIndividual);

		JRadioButton rdbtnPorEquipos = new JRadioButton("Por Equipos");
		rdbtnPorEquipos.setEnabled(false);
		buttonGroup.add(rdbtnPorEquipos);
		rdbtnPorEquipos.setBounds(98, 110, 84, 23);
		contentPane.add(rdbtnPorEquipos);

		JLabel lblPatrocinador = new JLabel("Patrocinador:");
		lblPatrocinador.setBounds(10, 153, 65, 14);
		contentPane.add(lblPatrocinador);

		JLabel lblPrimerPuesto = new JLabel("Primer puesto *:");
		lblPrimerPuesto.setBounds(10, 205, 86, 14);
		contentPane.add(lblPrimerPuesto);

		JLabel lblHoraPrimerPuesto = new JLabel("Hora:");
		lblHoraPrimerPuesto.setBounds(29, 230, 35, 14);
		contentPane.add(lblHoraPrimerPuesto);

		JSpinner spinnerHora = new JSpinner();
		spinnerHora.setBounds(66, 230, 30, 20);
		contentPane.add(spinnerHora);

		JLabel lblMinutosPrimerPuesto = new JLabel("Minutos:");
		lblMinutosPrimerPuesto.setBounds(98, 230, 35, 14);
		contentPane.add(lblMinutosPrimerPuesto);

		JSpinner spinnerMinutos = new JSpinner();
		spinnerMinutos.setBounds(136, 227, 30, 20);
		contentPane.add(spinnerMinutos);

		JLabel lblSegundosPrimerPuesto = new JLabel("Segundos:");
		lblSegundosPrimerPuesto.setBounds(176, 230, 30, 14);
		contentPane.add(lblSegundosPrimerPuesto);

		JSpinner spinnerSegundos = new JSpinner();
		spinnerSegundos.setBounds(207, 227, 30, 20);
		contentPane.add(spinnerSegundos);

		JLabel lblCentésimas = new JLabel("Centésimas:");
		lblCentésimas.setBounds(247, 230, 46, 14);
		contentPane.add(lblCentésimas);

		JSpinner spinnerCentésimasPrimerPuesto = new JSpinner();
		spinnerCentésimasPrimerPuesto.setBounds(295, 227, 30, 20);
		contentPane.add(spinnerCentésimasPrimerPuesto);

		JComboBox comboBoxPatrocinador = new JComboBox();
		comboBoxPatrocinador.setEnabled(false);
		comboBoxPatrocinador.setModel(new DefaultComboBoxModel(Patrocinador.values()));
		comboBoxPatrocinador.setBounds(85, 149, 169, 22);
		contentPane.add(comboBoxPatrocinador);

		JComboBox comboBoxLugar = new JComboBox();
		comboBoxLugar.setEnabled(false);
		comboBoxLugar.setBounds(195, 57, 130, 22);
		contentPane.add(comboBoxLugar);

		JLabel lblIdOroPrimerLugar = new JLabel("IdOro *:");
		lblIdOroPrimerLugar.setBounds(20, 266, 46, 14);
		contentPane.add(lblIdOroPrimerLugar);

		JLabel lblSegundoPuesto = new JLabel("Segundo puesto *:");
		lblSegundoPuesto.setBounds(10, 291, 102, 14);
		contentPane.add(lblSegundoPuesto);

		JLabel lblHoraSegundoPuesto = new JLabel("Hora:");
		lblHoraSegundoPuesto.setBounds(21, 316, 35, 14);
		contentPane.add(lblHoraSegundoPuesto);

		JSpinner spinner = new JSpinner();
		spinner.setBounds(66, 313, 30, 20);
		contentPane.add(spinner);

		JLabel lblMinutosSegundoLugar = new JLabel("Minutos:");
		lblMinutosSegundoLugar.setBounds(98, 316, 35, 14);
		contentPane.add(lblMinutosSegundoLugar);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(136, 313, 30, 20);
		contentPane.add(spinner_1);

		JLabel lblNewLabel_4 = new JLabel("Segundos");
		lblNewLabel_4.setBounds(173, 316, 35, 14);
		contentPane.add(lblNewLabel_4);

		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(207, 313, 30, 20);
		contentPane.add(spinner_2);

		JLabel lblNewLabel_5 = new JLabel("Centésimas");
		lblNewLabel_5.setBounds(247, 316, 46, 14);
		contentPane.add(lblNewLabel_5);

		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(295, 313, 30, 20);
		contentPane.add(spinner_3);

		JLabel lblNewLabel_6 = new JLabel("id Plata *:");
		lblNewLabel_6.setBounds(10, 351, 56, 14);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Tercer puesto *:");
		lblNewLabel_7.setBounds(10, 376, 86, 14);
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Hora:");
		lblNewLabel_8.setBounds(29, 403, 35, 14);
		contentPane.add(lblNewLabel_8);

		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(66, 400, 30, 20);
		contentPane.add(spinner_4);

		JLabel lblNewLabel_9 = new JLabel("Minutos:");
		lblNewLabel_9.setBounds(98, 403, 35, 14);
		contentPane.add(lblNewLabel_9);

		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(136, 400, 30, 20);
		contentPane.add(spinner_5);

		JLabel lblNewLabel_10 = new JLabel("Segundos:");
		lblNewLabel_10.setBounds(176, 403, 30, 14);
		contentPane.add(lblNewLabel_10);

		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(207, 400, 30, 20);
		contentPane.add(spinner_6);

		JLabel lblNewLabel_11 = new JLabel("Centésimas:");
		lblNewLabel_11.setBounds(247, 403, 46, 14);
		contentPane.add(lblNewLabel_11);

		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(295, 400, 30, 20);
		contentPane.add(spinner_7);

		JLabel lblIdBronce = new JLabel("id Bronce *:");
		lblIdBronce.setBounds(10, 428, 65, 14);
		contentPane.add(lblIdBronce);

		JLabel lblNewLabel_13 = new JLabel("Establecer como DEFINITIVO:");
		lblNewLabel_13.setBounds(10, 465, 151, 14);
		contentPane.add(lblNewLabel_13);

		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(157, 461, 35, 23);
		contentPane.add(chckbxNewCheckBox);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
			}
		});

		btnAceptar.setBounds(136, 493, 89, 23);
		contentPane.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(264, 493, 89, 23);
		contentPane.add(btnCancelar);

		JComboBox comboBoxPrimerPuesto = new JComboBox();
		comboBoxPrimerPuesto.setBounds(98, 201, 195, 22);
		contentPane.add(comboBoxPrimerPuesto);

		JComboBox comboBoxSegundoPuesto = new JComboBox();
		comboBoxSegundoPuesto.setBounds(103, 287, 190, 22);
		contentPane.add(comboBoxSegundoPuesto);

		JComboBox comboBoxTercerPuesto = new JComboBox();
		comboBoxTercerPuesto.setBounds(98, 368, 195, 22);
		contentPane.add(comboBoxTercerPuesto);

		JComboBox comboBoxIdOro = new JComboBox();
		comboBoxIdOro.setBounds(66, 261, 46, 22);
		contentPane.add(comboBoxIdOro);

		JComboBox comboBoxIdPlata = new JComboBox();
		comboBoxIdPlata.setBounds(66, 344, 46, 22);
		contentPane.add(comboBoxIdPlata);

		JComboBox comboBoxIdBroce = new JComboBox();
		comboBoxIdBroce.setBounds(66, 424, 46, 22);
		contentPane.add(comboBoxIdBroce);
	}
}
