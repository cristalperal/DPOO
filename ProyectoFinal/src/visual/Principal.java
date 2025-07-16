package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Principal extends JFrame {

	private JPanel contentPane;
	private Dimension dimension;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("JoseandoAndo");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/imagenes/Logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 785);
		dimension = super.getToolkit().getScreenSize(); 
		super.setSize(dimension.width-100, dimension.height-100);
		//setResizable(false);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlMenu = new JPanel();
		pnlMenu.setBackground(Color.WHITE);
		pnlMenu.setBounds(0, 0, 508, 1055);
		pnlMenu.setOpaque(true); 
		contentPane.add(pnlMenu);
		pnlMenu.setLayout(null);
		
		JLabel lblDerechos = new JLabel("\u00A9 2025 JoseandoAndo. Todos los derechos reservados.");
		lblDerechos.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblDerechos.setBounds(73, 901, 339, 16);
		pnlMenu.add(lblDerechos);
		
		JLabel imgLogoPrincipal = new JLabel("");
		imgLogoPrincipal.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/logoConNombre.png")));
		imgLogoPrincipal.setBounds(42, 60, 439, 177);
		pnlMenu.add(imgLogoPrincipal);
		
		JLabel lblEslogan = new JLabel("Tu conexi\u00F3n con oportunidades reales");
		lblEslogan.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEslogan.setBounds(185, 150, 269, 20);
		pnlMenu.add(lblEslogan);
		
		JPanel pnlSolicitarEmpleo = new JPanel();
		pnlSolicitarEmpleo.setForeground(new Color(255, 255, 255));
		pnlSolicitarEmpleo.setLayout(null);
		pnlSolicitarEmpleo.setBackground(new Color(0, 51, 102));
		pnlSolicitarEmpleo.setBounds(95, 361, 316, 74);
		pnlMenu.add(pnlSolicitarEmpleo);
		
		JLabel lblSolicitarEmpleo = new JLabel("Solicitar Empleo");
		lblSolicitarEmpleo.setFont(new Font("Cambria", Font.PLAIN, 19));
		lblSolicitarEmpleo.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/icons8-job-seeker-30.png")));
		lblSolicitarEmpleo.setForeground(new Color(255, 255, 255));
		lblSolicitarEmpleo.setBounds(77, 16, 203, 42);
		pnlSolicitarEmpleo.add(lblSolicitarEmpleo);
		
		JPanel pnlAdministrarEmpresa = new JPanel();
		pnlAdministrarEmpresa.setLayout(null);
		pnlAdministrarEmpresa.setBackground(new Color(0, 51, 102));
		pnlAdministrarEmpresa.setBounds(95, 491, 316, 74);
		pnlMenu.add(pnlAdministrarEmpresa);
		
		JLabel lblAdministrarEmpresas = new JLabel("Administrar Empresas");
		lblAdministrarEmpresas.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/icons8-business-building-30.png")));
		lblAdministrarEmpresas.setForeground(Color.WHITE);
		lblAdministrarEmpresas.setFont(new Font("Cambria", Font.PLAIN, 19));
		lblAdministrarEmpresas.setBounds(44, 16, 235, 42);
		pnlAdministrarEmpresa.add(lblAdministrarEmpresas);
		
		JPanel pnlEmpresasRegistradas = new JPanel();
		pnlEmpresasRegistradas.setLayout(null);
		pnlEmpresasRegistradas.setForeground(Color.WHITE);
		pnlEmpresasRegistradas.setBackground(new Color(255, 255, 255));
		pnlEmpresasRegistradas.setBounds(680, 370, 316, 60);
		contentPane.add(pnlEmpresasRegistradas);
		
		JLabel lblEmpresasRegistradas = new JLabel("Empresas Registradas");
		lblEmpresasRegistradas.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/icons8-multinational-company-35.png")));
		lblEmpresasRegistradas.setForeground(new Color(0, 51, 102));
		lblEmpresasRegistradas.setFont(new Font("Cambria", Font.PLAIN, 19));
		lblEmpresasRegistradas.setBounds(46, 10, 241, 42);
		pnlEmpresasRegistradas.add(lblEmpresasRegistradas);
		
		JPanel pnlCandidatosActivos = new JPanel();
		pnlCandidatosActivos.setLayout(null);
		pnlCandidatosActivos.setForeground(Color.WHITE);
		pnlCandidatosActivos.setBackground(new Color(255, 255, 255));
		pnlCandidatosActivos.setBounds(1115, 370, 316, 60);
		contentPane.add(pnlCandidatosActivos);
		
		JLabel lblCandidatosActivos = new JLabel("Candidatos Activos");
		lblCandidatosActivos.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/icons8-business-building-30 (1).png")));
		lblCandidatosActivos.setForeground(new Color(0, 51, 102));
		lblCandidatosActivos.setFont(new Font("Cambria", Font.PLAIN, 19));
		lblCandidatosActivos.setBounds(77, 12, 203, 42);
		pnlCandidatosActivos.add(lblCandidatosActivos);
		
		JLabel lblCantEmpresas = new JLabel("0000");
		lblCantEmpresas.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCantEmpresas.setForeground(new Color(255, 255, 255));
		lblCantEmpresas.setBounds(807, 446, 64, 20);
		contentPane.add(lblCantEmpresas);
		
		JLabel lblCantCandidatos = new JLabel("0000");
		lblCantCandidatos.setForeground(Color.WHITE);
		lblCantCandidatos.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCantCandidatos.setBounds(1247, 446, 79, 20);
		contentPane.add(lblCantCandidatos);
		
		JLabel imgFondo = new JLabel("");
		imgFondo.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/Fondo.png")));
		imgFondo.setBounds(0, 0, 1814, 1047);
		contentPane.add(imgFondo);
	}
}
