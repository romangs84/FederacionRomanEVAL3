package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidades.Atleta;
import entidades.DatosPersona;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class NuevoAtleta extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textTeléfono;
	private JTextField textFieldAltura;
	private JTextField textFieldPeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoAtleta frame = new NuevoAtleta();
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
	public NuevoAtleta() {
		setTitle("NuevoAtleta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre *:");
		lblNombre.setBounds(10, 11, 50, 14);
		contentPane.add(lblNombre);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(70, 8, 195, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Seleccione la \r\nopcion e \r\nintroduzca el valor");
		lblNewLabel_1.setBounds(10, 36, 212, 36);
		contentPane.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setBounds(70, 109, 129, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JRadioButton rbNie = new JRadioButton("Nie");
		buttonGroup.add(rbNie);
		rbNie.setBounds(92, 79, 50, 23);
		contentPane.add(rbNie);

		JRadioButton rbNif = new JRadioButton("Nif");
		buttonGroup.add(rbNif);
		rbNif.setBounds(144, 79, 50, 23);
		contentPane.add(rbNif);

		JLabel lblTeléfono = new JLabel("Teléfono :");
		lblTeléfono.setBounds(10, 152, 50, 23);
		contentPane.add(lblTeléfono);

		textTeléfono = new JTextField();
		textTeléfono.setBounds(75, 153, 195, 20);
		contentPane.add(textTeléfono);
		textTeléfono.setColumns(10);

		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento :");
		lblFechaNacimiento.setBounds(287, 156, 91, 14);
		contentPane.add(lblFechaNacimiento);

		JSpinner spinnerFechaNacimiento = new JSpinner();
		LocalDate hoyMas1MesLD = LocalDate.now().plusMonths(1);
		java.util.Date hoyMas1Mes = new Date(hoyMas1MesLD.getYear() - 1900, hoyMas1MesLD.getMonthValue() - 1,
				hoyMas1MesLD.getDayOfMonth());
		spinnerFechaNacimiento.setModel(new SpinnerDateModel(hoyMas1Mes, hoyMas1Mes, null, Calendar.DAY_OF_YEAR));
		spinnerFechaNacimiento.setBounds(388, 153, 119, 20);
		contentPane.add(spinnerFechaNacimiento);

		JLabel lblAltura = new JLabel("Altura *:");
		lblAltura.setBounds(10, 213, 46, 14);
		contentPane.add(lblAltura);

		JLabel lblPeso = new JLabel("Peso *:");
		lblPeso.setBounds(10, 238, 46, 14);
		contentPane.add(lblPeso);

		textFieldAltura = new JTextField();
		textFieldAltura.setBounds(56, 210, 86, 20);
		contentPane.add(textFieldAltura);
		textFieldAltura.setColumns(10);

		textFieldPeso = new JTextField();
		textFieldPeso.setBounds(56, 238, 86, 20);
		contentPane.add(textFieldPeso);
		textFieldPeso.setColumns(10);

		JLabel lblAltura1 = new JLabel("m.(en formato xx.xx)");
		lblAltura1.setBounds(153, 213, 129, 14);
		contentPane.add(lblAltura1);

		JLabel lblPeso1 = new JLabel("Kg.(en formato xx.xx)");
		lblPeso1.setBounds(153, 238, 108, 14);
		contentPane.add(lblPeso1);

		JLabel lblEquipo = new JLabel("Equipo :");
		lblEquipo.setBounds(10, 282, 46, 14);
		contentPane.add(lblEquipo);

		JComboBox comboBoxEquipo = new JComboBox();
		comboBoxEquipo.setBounds(56, 278, 209, 22);
		contentPane.add(comboBoxEquipo);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}

		});

		btnAceptar.setBounds(276, 319, 89, 23);
		contentPane.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(385, 319, 89, 23);
		contentPane.add(btnCancelar);

	}
}
