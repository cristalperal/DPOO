package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import logico.BolsaTrabajo;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;

public class RegistroPostulacion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtIdentificador;
	private JTextField txtFecha;
	private JRadioButton rdbtNoVehiculo;
	private JRadioButton rdbtSiMudarse;
	private JRadioButton rdbtNoMudarse;
	private JRadioButton rdbtSiVehiculo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroPostulacion dialog = new RegistroPostulacion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroPostulacion() {
		
		/*Tomar la fecha de la pc y formatearla */
		LocalDate fechaActual = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = fechaActual.format(formatter);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistroPostulacion.class.getResource("/imagenes/Logo.png")));
		setTitle("Registrar Postulaci\u00F3n");
		setBounds(100, 100, 992, 547);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 51, 102));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Candidato", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBackground(new Color(255, 255, 255));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "Informaci\u00F3n Postulaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setLayout(null);
			panel_1.setBackground(Color.WHITE);
			panel_1.setBounds(9, 191, 949, 249);
			panel.add(panel_1);
			
			JLabel label = new JLabel("Jornada:");
			label.setBounds(15, 80, 63, 20);
			panel_1.add(label);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Tiempo completo", "Tiempo parcial"}));
			comboBox.setBackground(Color.WHITE);
			comboBox.setBounds(81, 77, 174, 26);
			panel_1.add(comboBox);
			
			JLabel label_1 = new JLabel("Modalidad:");
			label_1.setBounds(294, 80, 63, 20);
			panel_1.add(label_1);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Presencial", "Remoto ", "H\u00EDbrido"}));
			comboBox_1.setBackground(Color.WHITE);
			comboBox_1.setBounds(363, 77, 174, 26);
			panel_1.add(comboBox_1);
			
			JLabel label_3 = new JLabel("\u00BFVeh\u00EDculo Propio?");
			label_3.setBounds(15, 117, 117, 20);
			panel_1.add(label_3);
			
			rdbtSiVehiculo = new JRadioButton("Si");
			rdbtSiVehiculo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					rdbtSiVehiculo.setSelected(true);
					rdbtNoVehiculo.setSelected(false);
				}
			});
			rdbtSiVehiculo.setBackground(Color.WHITE);
			rdbtSiVehiculo.setBounds(128, 112, 45, 29);
			panel_1.add(rdbtSiVehiculo);
			
			rdbtNoVehiculo = new JRadioButton("No");
			rdbtNoVehiculo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					rdbtSiVehiculo.setSelected(false);
					rdbtNoVehiculo.setSelected(true);
				}
			});
			rdbtNoVehiculo.setSelected(true);
			rdbtNoVehiculo.setBackground(Color.WHITE);
			rdbtNoVehiculo.setBounds(174, 113, 54, 29);
			panel_1.add(rdbtNoVehiculo);
			
			JLabel label_4 = new JLabel("\u00BFPuede Mudarse?");
			label_4.setBounds(15, 154, 117, 20);
			panel_1.add(label_4);
			
			rdbtSiMudarse = new JRadioButton("Si");
			rdbtSiMudarse.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					rdbtSiMudarse.setSelected(true);
					rdbtNoMudarse.setSelected(false);
				}
			});
			rdbtSiMudarse.setBackground(Color.WHITE);
			rdbtSiMudarse.setBounds(128, 149, 45, 29);
			panel_1.add(rdbtSiMudarse);
			
			rdbtNoMudarse = new JRadioButton("No");
			rdbtNoMudarse.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					rdbtSiMudarse.setSelected(false);
					rdbtNoMudarse.setSelected(true);
				}
			});
			rdbtNoMudarse.setSelected(true);
			rdbtNoMudarse.setBackground(Color.WHITE);
			rdbtNoMudarse.setBounds(174, 150, 54, 29);
			panel_1.add(rdbtNoMudarse);
			
			JLabel label_5 = new JLabel("Salario Esperado: $RD");
			label_5.setBounds(15, 197, 133, 20);
			panel_1.add(label_5);
			
			JSpinner spinner = new JSpinner();
			spinner.setModel(new SpinnerNumberModel(new Integer(10000), new Integer(10000), null, new Integer(1)));
			spinner.setBounds(149, 195, 96, 22);
			panel_1.add(spinner);
			
			JLabel label_6 = new JLabel("A\u00F1os Esperiencia:");
			label_6.setBounds(565, 80, 133, 20);
			panel_1.add(label_6);
			
			JSpinner spinner_1 = new JSpinner();
			spinner_1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinner_1.setBounds(675, 82, 96, 20);
			panel_1.add(spinner_1);
			
			JLabel lblIdentificador = new JLabel("Identificador:");
			lblIdentificador.setBounds(15, 41, 126, 20);
			panel_1.add(lblIdentificador);
			
			txtIdentificador = new JTextField();
			txtIdentificador.setForeground(new Color(0, 0, 0));
			txtIdentificador.setEditable(false);
			txtIdentificador.setBounds(109, 38, 146, 26);
			panel_1.add(txtIdentificador);
			txtIdentificador.setColumns(10);
			txtIdentificador.setText("POS-" + (BolsaTrabajo.generadorCodPostulacion+1));
			
			JLabel lblFecha = new JLabel("Fecha:");
			lblFecha.setBounds(754, 22, 45, 20);
			panel_1.add(lblFecha);
			
			txtFecha = new JTextField();
			txtFecha.setEditable(false);
			txtFecha.setColumns(10);
			txtFecha.setBounds(803, 16, 131, 26);
			panel_1.add(txtFecha);
			txtFecha.setText(fecha);// la fecha actual de la pc
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(new Color(255, 255, 255));
			panel_2.setBounds(9, 27, 949, 162);
			panel.add(panel_2);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.setBackground(new Color(255, 255, 255));
				btnRegistrar.setIcon(new ImageIcon(RegistroPostulacion.class.getResource("/imagenes/icons8-save-20.png")));
				btnRegistrar.setActionCommand("OK");
				buttonPane.add(btnRegistrar);
				getRootPane().setDefaultButton(btnRegistrar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setBackground(new Color(255, 255, 255));
				btnCancelar.setIcon(new ImageIcon(RegistroPostulacion.class.getResource("/imagenes/icons8-cancel-15.png")));
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
}
