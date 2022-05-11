package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class NuevaPersona extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevaPersona frame = new NuevaPersona();
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
	public NuevaPersona() {
		setTitle("NuevaPersona");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre *:");
		lblNewLabel.setBounds(10, 11, 50, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(85, 8, 287, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		lblNewLabel.setBounds(10, 11, 65, 14);
		
		lblNewLabel_2 = new JLabel("Telefono :");
		lblNewLabel_2.setBounds(10, 200, 65, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(65, 197, 151, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Fecha Nacimiento *:");
		lblNewLabel_3.setBounds(226, 200, 108, 14);
		contentPane.add(lblNewLabel_3);
		
		JSpinner spinner = new JSpinner();
		LocalDate hoyMas1MesLD = LocalDate.now().plusMonths(1);
		java.util.Date hoyMas1Mes = new Date(hoyMas1MesLD.getYear() - 1900, hoyMas1MesLD.getMonthValue() - 1,
				hoyMas1MesLD.getDayOfMonth());
		spinner.setModel(new SpinnerDateModel(hoyMas1Mes, hoyMas1Mes, null, Calendar.DAY_OF_YEAR));
		spinner.setBounds(388, 153, 119, 20);
		spinner.setBounds(325, 197, 99, 20);
		contentPane.add(spinner);
		
		JRadioButton rbNIE = new JRadioButton("Nie");
		buttonGroup.add(rbNIE);
		rbNIE.setBounds(85, 108, 46, 23);
		contentPane.add(rbNIE);
		
		JRadioButton rbNif = new JRadioButton("Nif");
		buttonGroup.add(rbNif);
		rbNif.setBounds(148, 108, 39, 23);
		contentPane.add(rbNif);
		
		lblNewLabel_1 = new JLabel("Seleccione la opcion e  introduzca  el valor");
		lblNewLabel_1.setBounds(10, 70, 206, 42);
		contentPane.add(lblNewLabel_1);
	}
}
