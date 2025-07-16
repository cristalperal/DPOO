package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class RegistroCandidato extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtPais;
	private JTextField txtProvincia;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtCorreo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroCandidato dialog = new RegistroCandidato();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroCandidato() {
		setTitle("Registrar Candidato");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistroCandidato.class.getResource("/imagenes/Logo.png")));
		setBounds(100, 100, 1120, 722);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 51, 102));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel pnlGeneral = new JPanel();
			pnlGeneral.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			pnlGeneral.setBackground(new Color(255, 255, 255));
			contentPanel.add(pnlGeneral, BorderLayout.CENTER);
			pnlGeneral.setLayout(null);
			{
				JPanel pnlTipoCandidato = new JPanel();
				pnlTipoCandidato.setLayout(null);
				pnlTipoCandidato.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Elegir tipo de candidato", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				pnlTipoCandidato.setBackground(new Color(255, 255, 255));
				pnlTipoCandidato.setBounds(4, 19, 1083, 51);
				pnlGeneral.add(pnlTipoCandidato);
				{
					JRadioButton rdbtnUniversitario = new JRadioButton("Universitario");
					rdbtnUniversitario.setSelected(true);
					rdbtnUniversitario.setBackground(new Color(255, 255, 255));
					rdbtnUniversitario.setBounds(55, 18, 121, 23);
					pnlTipoCandidato.add(rdbtnUniversitario);
				}
				{
					JRadioButton rdbtnTcnicoSuperior = new JRadioButton("T\u00E9cnico Superior");
					rdbtnTcnicoSuperior.setBackground(new Color(255, 255, 255));
					rdbtnTcnicoSuperior.setBounds(200, 18, 156, 23);
					pnlTipoCandidato.add(rdbtnTcnicoSuperior);
				}
				{
					JRadioButton rdbtnObrero = new JRadioButton("Obrero");
					rdbtnObrero.setBackground(new Color(255, 255, 255));
					rdbtnObrero.setBounds(374, 17, 76, 23);
					pnlTipoCandidato.add(rdbtnObrero);
				}
			}
			{
				JPanel pnlInformacionGeneral = new JPanel();
				pnlInformacionGeneral.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n General", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				pnlInformacionGeneral.setBackground(new Color(255, 255, 255));
				pnlInformacionGeneral.setBounds(4, 86, 1083, 185);
				pnlGeneral.add(pnlInformacionGeneral);
				pnlInformacionGeneral.setLayout(null);
				{
					JLabel lblCedula = new JLabel("C\u00E9dula:");
					lblCedula.setBounds(21, 34, 54, 20);
					pnlInformacionGeneral.add(lblCedula);
				}
				{
					txtCedula = new JTextField();
					txtCedula.setColumns(10);
					txtCedula.setBounds(86, 34, 174, 22);
					pnlInformacionGeneral.add(txtCedula);
				}
				{
					JLabel lblNombre = new JLabel("Nombre:");
					lblNombre.setBounds(21, 70, 63, 20);
					pnlInformacionGeneral.add(lblNombre);
				}
				{
					txtNombre = new JTextField();
					txtNombre.setColumns(10);
					txtNombre.setBounds(86, 70, 174, 22);
					pnlInformacionGeneral.add(txtNombre);
				}
				{
					JLabel lblApellido = new JLabel("Apellido:");
					lblApellido.setBounds(294, 70, 63, 20);
					pnlInformacionGeneral.add(lblApellido);
				}
				{
					txtApellido = new JTextField();
					txtApellido.setColumns(10);
					txtApellido.setBounds(359, 70, 174, 22);
					pnlInformacionGeneral.add(txtApellido);
				}
				{
					JLabel lblGnero = new JLabel("G\u00E9nero:");
					lblGnero.setBounds(584, 68, 63, 20);
					pnlInformacionGeneral.add(lblGnero);
				}
				{
					JLabel lblPas = new JLabel("Pa\u00EDs:");
					lblPas.setBounds(21, 115, 63, 20);
					pnlInformacionGeneral.add(lblPas);
				}
				{
					txtPais = new JTextField();
					txtPais.setColumns(10);
					txtPais.setBounds(86, 115, 174, 22);
					pnlInformacionGeneral.add(txtPais);
				}
				{
					JLabel lblProvincia = new JLabel("Provincia:");
					lblProvincia.setBounds(294, 115, 63, 20);
					pnlInformacionGeneral.add(lblProvincia);
				}
				{
					txtProvincia = new JTextField();
					txtProvincia.setColumns(10);
					txtProvincia.setBounds(359, 115, 174, 22);
					pnlInformacionGeneral.add(txtProvincia);
				}
				{
					JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
					lblDireccion.setBounds(584, 113, 63, 20);
					pnlInformacionGeneral.add(lblDireccion);
				}
				{
					txtDireccion = new JTextField();
					txtDireccion.setColumns(10);
					txtDireccion.setBounds(649, 113, 174, 22);
					pnlInformacionGeneral.add(txtDireccion);
				}
				
				JComboBox comboBox = new JComboBox();
				comboBox.setBackground(new Color(255, 255, 255));
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Masculino", "Femenino"}));
				comboBox.setBounds(649, 67, 174, 26);
				pnlInformacionGeneral.add(comboBox);
			}
			{
				JPanel pnlInformacionContacto = new JPanel();
				pnlInformacionContacto.setBorder(new TitledBorder(null, "Informaci\u00F3n Contacto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				pnlInformacionContacto.setBackground(new Color(255, 255, 255));
				pnlInformacionContacto.setBounds(4, 283, 1083, 92);
				pnlGeneral.add(pnlInformacionContacto);
				pnlInformacionContacto.setLayout(null);
				{
					JLabel lblTelefono = new JLabel("Tel\u00E9fono: ");
					lblTelefono.setBounds(15, 41, 63, 20);
					pnlInformacionContacto.add(lblTelefono);
				}
				{
					txtTelefono = new JTextField();
					txtTelefono.setBounds(86, 41, 174, 22);
					pnlInformacionContacto.add(txtTelefono);
					txtTelefono.setColumns(10);
				}
				{
					JLabel lblCorreo = new JLabel("Correo:");
					lblCorreo.setBounds(294, 41, 63, 20);
					pnlInformacionContacto.add(lblCorreo);
				}
				{
					txtCorreo = new JTextField();
					txtCorreo.setBounds(359, 41, 174, 22);
					pnlInformacionContacto.add(txtCorreo);
					txtCorreo.setColumns(10);
				}
			}
			
			JPanel pnlPostulacion = new JPanel();
			pnlPostulacion.setLayout(null);
			pnlPostulacion.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Postulaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			pnlPostulacion.setBackground(Color.WHITE);
			pnlPostulacion.setBounds(4, 391, 1083, 242);
			pnlGeneral.add(pnlPostulacion);
			
			JLabel lblJornada = new JLabel("Jornada:");
			lblJornada.setBounds(15, 40, 63, 20);
			pnlPostulacion.add(lblJornada);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Tiempo Completo", "Tiempo Parcial"}));
			comboBox.setBackground(Color.WHITE);
			comboBox.setBounds(81, 37, 174, 26);
			pnlPostulacion.add(comboBox);
			
			JLabel lblModalidad = new JLabel("Modalidad:");
			lblModalidad.setBounds(294, 40, 63, 20);
			pnlPostulacion.add(lblModalidad);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Presencial", "Remoto", "H\u00EDbrido"}));
			comboBox_1.setBackground(Color.WHITE);
			comboBox_1.setBounds(363, 37, 174, 26);
			pnlPostulacion.add(comboBox_1);
			
			JLabel lblAreaDeseada = new JLabel("\u00C1rea Deseada:");
			lblAreaDeseada.setBounds(586, 41, 108, 20);
			pnlPostulacion.add(lblAreaDeseada);
			
			JComboBox comboBox_2 = new JComboBox();
			comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Administraci\u00F3n", "Contabilidad", "Recursos Humanos", "Tecnolog\u00EDa", "Dise\u00F1o", "Ingenier\u00EDa", "Ventas", "Marketing", "Atenci\u00F3n", "Educaci\u00F3n", "Salud", "Psicolog\u00EDa", "Log\u00EDstica", "Producci\u00F3n", "Construcci\u00F3n", "Servicios", "Gastronom\u00EDa", "Seguridad", "Legal", "Investigaci\u00F3n", "Arte", "Turismo", "Transporte", "Telecomunicaciones", "Agropecuaria"}));
			comboBox_2.setMaximumRowCount(20);
			comboBox_2.setBackground(Color.WHITE);
			comboBox_2.setBounds(684, 39, 174, 26);
			pnlPostulacion.add(comboBox_2);
			
			JLabel lblVehiculoPropio = new JLabel("Veh\u00EDculo Propio?");
			lblVehiculoPropio.setBounds(15, 95, 117, 20);
			pnlPostulacion.add(lblVehiculoPropio);
			{
				JRadioButton radioButton = new JRadioButton("Si");
				radioButton.setBackground(new Color(255, 255, 255));
				radioButton.setBounds(116, 90, 45, 29);
				pnlPostulacion.add(radioButton);
			}
			{
				JRadioButton radioButton = new JRadioButton("No");
				radioButton.setBackground(new Color(255, 255, 255));
				radioButton.setSelected(true);
				radioButton.setBounds(156, 91, 54, 29);
				pnlPostulacion.add(radioButton);
			}
			{
				JLabel lblPuedeMudarse = new JLabel("Puede Mudarse?");
				lblPuedeMudarse.setBounds(15, 132, 117, 20);
				pnlPostulacion.add(lblPuedeMudarse);
			}
			{
				JRadioButton radioButton = new JRadioButton("Si");
				radioButton.setBackground(Color.WHITE);
				radioButton.setBounds(116, 127, 45, 29);
				pnlPostulacion.add(radioButton);
			}
			{
				JRadioButton radioButton = new JRadioButton("No");
				radioButton.setSelected(true);
				radioButton.setBackground(Color.WHITE);
				radioButton.setBounds(156, 128, 54, 29);
				pnlPostulacion.add(radioButton);
			}
			{
				JLabel lblSalarioEsperado = new JLabel("Salario Esperado: $RD");
				lblSalarioEsperado.setBounds(15, 174, 133, 20);
				pnlPostulacion.add(lblSalarioEsperado);
			}
			
			JSpinner spinner = new JSpinner();
			spinner.setModel(new SpinnerNumberModel(new Float(5000), new Float(0), null, new Float(1)));
			spinner.setBounds(147, 173, 96, 26);
			pnlPostulacion.add(spinner);
			
			JLabel lblAosEsperiencia = new JLabel("A\u00F1os Esperiencia:");
			lblAosEsperiencia.setBounds(274, 171, 133, 20);
			pnlPostulacion.add(lblAosEsperiencia);
			
			JSpinner spinner_1 = new JSpinner();
			spinner_1.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinner_1.setBounds(384, 171, 96, 26);
			pnlPostulacion.add(spinner_1);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.setBackground(new Color(255, 255, 255));
				btnRegistrar.setIcon(new ImageIcon(RegistroCandidato.class.getResource("/imagenes/icons8-save-20.png")));
				btnRegistrar.setActionCommand("OK");
				buttonPane.add(btnRegistrar);
				getRootPane().setDefaultButton(btnRegistrar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						dispose();
					}
				});
				btnCancelar.setBackground(new Color(255, 255, 255));
				btnCancelar.setIcon(new ImageIcon(RegistroCandidato.class.getResource("/imagenes/icons8-cancel-15.png")));
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
}
