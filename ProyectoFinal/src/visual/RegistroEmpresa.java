package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class RegistroEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtRnc;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtPais;
	private JTextField txtProvincia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroEmpresa dialog = new RegistroEmpresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroEmpresa() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistroEmpresa.class.getResource("/imagenes/Logo.png")));
		setTitle("Registro de Empresa");
		setBounds(100, 100, 922, 374);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Informaci\u00F3n General", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBackground(Color.WHITE);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblRnc = new JLabel("RNC:");
			lblRnc.setBounds(12, 46, 56, 16);
			panel.add(lblRnc);
			
			txtRnc = new JTextField();
			txtRnc.setBounds(69, 46, 174, 22);
			panel.add(txtRnc);
			txtRnc.setColumns(10);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(12, 97, 56, 16);
			panel.add(lblNombre);
			
			txtNombre = new JTextField();
			txtNombre.setColumns(10);
			txtNombre.setBounds(69, 97, 174, 22);
			panel.add(txtNombre);
			
			JLabel lblTipoDeEmpresa = new JLabel("Tipo de Empresa:");
			lblTipoDeEmpresa.setBounds(283, 100, 102, 16);
			panel.add(lblTipoDeEmpresa);
			
			JComboBox cbxTipo = new JComboBox();
			cbxTipo.setBounds(393, 97, 174, 22);
			panel.add(cbxTipo);
			
			JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
			lblDireccion.setBounds(643, 150, 75, 16);
			panel.add(lblDireccion);
			
			txtDireccion = new JTextField();
			txtDireccion.setColumns(10);
			txtDireccion.setBounds(707, 147, 174, 22);
			panel.add(txtDireccion);
			
			JLabel lblPais = new JLabel("Pa\u00EDs:");
			lblPais.setBounds(14, 150, 75, 16);
			panel.add(lblPais);
			
			txtPais = new JTextField();
			txtPais.setColumns(10);
			txtPais.setBounds(69, 150, 174, 22);
			panel.add(txtPais);
			
			JLabel lblProvincia = new JLabel("Provincia:");
			lblProvincia.setBounds(329, 153, 56, 16);
			panel.add(lblProvincia);
			
			txtProvincia = new JTextField();
			txtProvincia.setColumns(10);
			txtProvincia.setBounds(393, 150, 174, 22);
			panel.add(txtProvincia);
			
			JPanel pnlContactos = new JPanel();
			pnlContactos.setBorder(new TitledBorder(null, "Informaci\u00F3n de Contacto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			pnlContactos.setBackground(Color.WHITE);
			pnlContactos.setBounds(3, 201, 888, 74);
			panel.add(pnlContactos);
			pnlContactos.setLayout(null);
			
			JLabel lblCorreo = new JLabel("Correo:");
			lblCorreo.setBounds(13, 30, 56, 16);
			pnlContactos.add(lblCorreo);
			
			txtCorreo = new JTextField();
			txtCorreo.setBounds(70, 29, 174, 22);
			pnlContactos.add(txtCorreo);
			txtCorreo.setColumns(10);
			
			JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
			lblTelefono.setBounds(330, 31, 56, 16);
			pnlContactos.add(lblTelefono);
			
			txtTelefono = new JTextField();
			txtTelefono.setBounds(392, 30, 174, 22);
			pnlContactos.add(txtTelefono);
			txtTelefono.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 255, 255));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.setFocusPainted(false);
				btnRegistrar.setFocusTraversalKeysEnabled(false);
				btnRegistrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnRegistrar.setActionCommand("OK");
				buttonPane.add(btnRegistrar);
				getRootPane().setDefaultButton(btnRegistrar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setFocusPainted(false);
				btnCancelar.setFocusTraversalKeysEnabled(false);
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
