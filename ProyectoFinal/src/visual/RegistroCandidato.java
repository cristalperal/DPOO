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
import javax.swing.JCheckBox;

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
	private JTextField txtCarreraCursada;
	private JTextField txtAreaCursada;
	private JLabel lblCarreraCursada;
	private JLabel lblreaCursada;
	private JCheckBox chckbxElectricidad;
	private JCheckBox chckbxPlomeria;
	private JCheckBox chckbxConstruccin;
	private JCheckBox chckbxLimpieza;
	private JCheckBox chckbxConstruccion;
	private JCheckBox chckbxEbanisteria;
	private JCheckBox chckbxMecanica;
	private JCheckBox chckbxJardineria;
	private JCheckBox chckbxMantenimiento;
	private JRadioButton rdbtnTcnicoSuperior;
	private JRadioButton rdbtnObrero;
	private JPanel pnlInformacionGeneral;
	private JPanel pnlInformacionContacto;
	private JPanel panelUniversitario;
	private JPanel panelTecnico;
	private JPanel panelObrero;
	private JRadioButton rdbtnUniversitario;

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
		setBounds(100, 100, 908, 838);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 51, 102));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel pnlGeneral = new JPanel();
			pnlGeneral.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Registro de candidato", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
			pnlGeneral.setBackground(new Color(255, 255, 255));
			contentPanel.add(pnlGeneral, BorderLayout.CENTER);
			pnlGeneral.setLayout(null);
			{
				JPanel pnlTipoCandidato = new JPanel();
				pnlTipoCandidato.setLayout(null);
				pnlTipoCandidato.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Elegir nivel educativo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				pnlTipoCandidato.setBackground(new Color(255, 255, 255));
				pnlTipoCandidato.setBounds(6, 32, 868, 51);
				pnlGeneral.add(pnlTipoCandidato);
				{
					rdbtnUniversitario = new JRadioButton("Universitario");
					rdbtnUniversitario.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						rdbtnUniversitario.setSelected(true);
						rdbtnTcnicoSuperior.setSelected(false);	
				     	rdbtnObrero.setSelected(false);	     	
				     	panelUniversitario.setVisible(true);
				     	panelTecnico.setVisible(false);
				     	panelObrero.setVisible(false);
				     	
				     	
							
						}
					});
					rdbtnUniversitario.setSelected(true);
					rdbtnUniversitario.setBackground(new Color(255, 255, 255));
					rdbtnUniversitario.setBounds(55, 18, 121, 23);
					pnlTipoCandidato.add(rdbtnUniversitario);
				}
				{
					rdbtnTcnicoSuperior = new JRadioButton("T\u00E9cnico Superior");
					rdbtnTcnicoSuperior.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							rdbtnUniversitario.setSelected(false);
							rdbtnTcnicoSuperior.setSelected(true);	
					     	rdbtnObrero.setSelected(false);
					     	panelUniversitario.setVisible(false);
					     	panelTecnico.setVisible(true);
					     	panelObrero.setVisible(false);
						}
					});
					rdbtnTcnicoSuperior.setBackground(new Color(255, 255, 255));
					rdbtnTcnicoSuperior.setBounds(200, 18, 156, 23);
					pnlTipoCandidato.add(rdbtnTcnicoSuperior);
				}
				{
					rdbtnObrero = new JRadioButton("Obrero");
					rdbtnObrero.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							rdbtnUniversitario.setSelected(false);
							rdbtnTcnicoSuperior.setSelected(false);	
					     	rdbtnObrero.setSelected(true);				     	
					     	panelUniversitario.setVisible(false);
					     	panelTecnico.setVisible(false);
					     	panelObrero.setVisible(true);
						}
					});
					rdbtnObrero.setBackground(new Color(255, 255, 255));
					rdbtnObrero.setBounds(374, 17, 76, 23);
					pnlTipoCandidato.add(rdbtnObrero);
				}
			}
			{
				pnlInformacionGeneral = new JPanel();
				pnlInformacionGeneral.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n General", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				pnlInformacionGeneral.setBackground(new Color(255, 255, 255));
				pnlInformacionGeneral.setBounds(6, 99, 868, 185);
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
				pnlInformacionContacto = new JPanel();
				pnlInformacionContacto.setBorder(new TitledBorder(null, "Informaci\u00F3n Contacto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				pnlInformacionContacto.setBackground(new Color(255, 255, 255));
				pnlInformacionContacto.setBounds(6, 296, 868, 92);
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
			{
				panelUniversitario = new JPanel();
				panelUniversitario.setLayout(null);
				panelUniversitario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Profesional", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panelUniversitario.setBackground(Color.WHITE);
				panelUniversitario.setBounds(6, 392, 868, 105);
				pnlGeneral.add(panelUniversitario);
				{
					lblCarreraCursada = new JLabel("Carrera Cursada:");
					lblCarreraCursada.setBounds(15, 41, 120, 20);
					panelUniversitario.add(lblCarreraCursada);
				}
				{
					txtCarreraCursada = new JTextField();
					txtCarreraCursada.setColumns(10);
					txtCarreraCursada.setBounds(127, 40, 174, 22);
					panelUniversitario.add(txtCarreraCursada);
				}
			}
			{
				panelObrero = new JPanel();
				panelObrero.setLayout(null);
				panelObrero.setVisible(false);
				panelObrero.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Profesional", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panelObrero.setBackground(Color.WHITE);
				panelObrero.setBounds(6, 598, 868, 123);
				pnlGeneral.add(panelObrero);
				{
					JLabel lblNewLabel = new JLabel("Seleccione sus habilidades");
					lblNewLabel.setBounds(9, 19, 211, 20);
					panelObrero.add(lblNewLabel);
				}
				
				chckbxElectricidad = new JCheckBox("Electricidad");
				chckbxElectricidad.setBackground(new Color(255, 255, 255));
				chckbxElectricidad.setBounds(10, 46, 119, 29);
				panelObrero.add(chckbxElectricidad);
				
				chckbxPlomeria = new JCheckBox("Plomer\u00EDa");
				chckbxPlomeria.setBackground(Color.WHITE);
				chckbxPlomeria.setBounds(135, 46, 101, 29);
				panelObrero.add(chckbxPlomeria);
				
				chckbxConstruccin = new JCheckBox("Construcci\u00F3n");
				chckbxConstruccin.setBackground(Color.WHITE);
				chckbxConstruccin.setBounds(244, 46, 123, 29);
				panelObrero.add(chckbxConstruccin);
				
				chckbxLimpieza = new JCheckBox("Limpieza");
				chckbxLimpieza.setBackground(Color.WHITE);
				chckbxLimpieza.setBounds(374, 46, 101, 29);
				panelObrero.add(chckbxLimpieza);
				
				chckbxConstruccion = new JCheckBox("Construcci\u00F3n");
				chckbxConstruccion.setBackground(Color.WHITE);
				chckbxConstruccion.setBounds(474, 46, 123, 29);
				panelObrero.add(chckbxConstruccion);
				{
					chckbxEbanisteria = new JCheckBox("Ebanister\u00EDa");
					chckbxEbanisteria.setBackground(Color.WHITE);
					chckbxEbanisteria.setBounds(600, 46, 123, 29);
					panelObrero.add(chckbxEbanisteria);
				}
				{
					chckbxMecanica = new JCheckBox("Mec\u00E1nica");
					chckbxMecanica.setBackground(Color.WHITE);
					chckbxMecanica.setBounds(9, 83, 101, 29);
					panelObrero.add(chckbxMecanica);
				}
				{
					chckbxJardineria = new JCheckBox("Jardiner\u00EDa");
					chckbxJardineria.setBackground(Color.WHITE);
					chckbxJardineria.setBounds(135, 83, 101, 29);
					panelObrero.add(chckbxJardineria);
				}
				{
					chckbxMantenimiento = new JCheckBox("Mantenimiento");
					chckbxMantenimiento.setBackground(Color.WHITE);
					chckbxMantenimiento.setBounds(244, 83, 119, 29);
					panelObrero.add(chckbxMantenimiento);
				}
			}
			{
				panelTecnico = new JPanel();
				panelTecnico.setBounds(6, 495, 868, 98);
				pnlGeneral.add(panelTecnico);
				panelTecnico.setLayout(null);
				panelTecnico.setVisible(false);
				panelTecnico.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Profesional", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panelTecnico.setBackground(Color.WHITE);
				{
					lblreaCursada = new JLabel("\u00C1rea Cursada:");
					lblreaCursada.setBounds(15, 41, 109, 20);
					panelTecnico.add(lblreaCursada);
				}
				{
					txtAreaCursada = new JTextField();
					txtAreaCursada.setColumns(10);
					txtAreaCursada.setBounds(107, 40, 174, 22);
					panelTecnico.add(txtAreaCursada);
				}
			}
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
