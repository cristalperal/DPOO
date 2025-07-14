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
		setTitle("<Nombre empresa>");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/imagenes/Logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 785);
		dimension = super.getToolkit().getScreenSize(); 
		super.setSize(dimension.width-100, dimension.height-100);
		setResizable(false);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlMenu = new JPanel();
		pnlMenu.setBackground(Color.WHITE);
		pnlMenu.setBounds(0, 0, 496, 945);
		pnlMenu.setOpaque(true); 
		contentPane.add(pnlMenu);
		pnlMenu.setLayout(null);
		
		JLabel lblDerechos = new JLabel("\u00A9 2025 Nombre. Todos los derechos reservados.");
		lblDerechos.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblDerechos.setBounds(97, 901, 311, 16);
		pnlMenu.add(lblDerechos);
		
		JLabel imgFondo = new JLabel("");
		imgFondo.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/Fondo.png")));
		imgFondo.setBounds(0, 0, 1814, 945);
		contentPane.add(imgFondo);
	}
}
