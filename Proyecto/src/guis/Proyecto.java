package guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arreglo.ArregloCama;

import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

public class Proyecto extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenu mnPago;
	private JMenu mnReporte;
	private JMenu mnRegistro;
	private JMenuItem mntmConPag;
	private JMenuItem mntmConPen;
	private JMenuItem mntmIntPen;
	private JMenuItem mntmIntPag;
	private JMenuItem mntmCon;
	private JMenuItem mntmInt;
	private JMenuItem mntmConsul;
	private JMenuItem mntmInter;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	
	public static ArregloCama ac=new ArregloCama();
	private JMenu mnMantenimiento;
	private JMenuItem mntmCama;
	private JMenuItem mntmPaciente;
	private JMenuItem mntmMedicina;
	private JMenu mnIntegrantes;
	private JMenuItem mntmBrianVeliz;
	private JMenuItem mntmKamalyZapana;
	private JMenuItem mntmKamalyZapana_1;
	private JMenuItem menuItem_1;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto frame = new Proyecto();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Proyecto() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Proyecto.class.getResource("/img/TriCell.jpg")));
		setTitle("Proyecto de atenci\u00F3n al cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.setBackground(Color.LIGHT_GRAY);
		mntmSalir.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\logout.jpg"));
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmCama = new JMenuItem("Cama");
		mntmCama.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\agregarcama.jpg"));
		mntmCama.addActionListener(this);
		mnMantenimiento.add(mntmCama);
		
		mntmPaciente = new JMenuItem("Paciente");
		mntmPaciente.addActionListener(this);
		mntmPaciente.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\paciente.png"));
		mnMantenimiento.add(mntmPaciente);
		
		mntmMedicina = new JMenuItem("Medicina");
		mntmMedicina.addActionListener(this);
		mntmMedicina.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\medicina.jpg"));
		mnMantenimiento.add(mntmMedicina);
		
		mnRegistro = new JMenu("Registro");
		menuBar.add(mnRegistro);
		
		mntmConsul = new JMenuItem("Consultas");
		mntmConsul.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\consulta.png"));
		mntmConsul.addActionListener(this);
		mnRegistro.add(mntmConsul);
		
		mntmInter = new JMenuItem("Internamientos");
		mntmInter.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\hospital_int.jpg"));
		mntmInter.addActionListener(this);
		mnRegistro.add(mntmInter);
		
		mnPago = new JMenu("Pago");
		menuBar.add(mnPago);
		
		mntmCon = new JMenuItem("Consultas");
		mntmCon.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\consulta.png"));
		mntmCon.addActionListener(this);
		mnPago.add(mntmCon);
		
		mntmInt = new JMenuItem("Internamientos");
		mntmInt.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\hospital_int.jpg"));
		mntmInt.addActionListener(this);
		mnPago.add(mntmInt);
		
		mnReporte = new JMenu("Reporte");
		menuBar.add(mnReporte);
		
		mntmConPen = new JMenuItem("Consultas-Pendientes");
		mntmConPen.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\consulta.png"));
		mntmConPen.addActionListener(this);
		mnReporte.add(mntmConPen);
		
		mntmConPag = new JMenuItem("Consultas-Pagadas");
		mntmConPag.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\consulta.png"));
		mntmConPag.addActionListener(this);
		mnReporte.add(mntmConPag);
		
		mntmIntPen = new JMenuItem("Internamientos-Pendientes");
		mntmIntPen.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\hospital.jpg"));
		mntmIntPen.addActionListener(this);
		mnReporte.add(mntmIntPen);
		
		mntmIntPag = new JMenuItem("Internamientos-Pagados");
		mntmIntPag.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\hospital_pag.jpg"));
		mntmIntPag.addActionListener(this);
		mnReporte.add(mntmIntPag);
		
		mnIntegrantes = new JMenu("Integrantes:");
		menuBar.add(mnIntegrantes);
		
		menuItem_1 = new JMenuItem("Brian Veliz");
		menuItem_1.addActionListener(this);
		menuItem_1.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\hombre.jpg"));
		mnIntegrantes.add(menuItem_1);
		
		mntmKamalyZapana_1 = new JMenuItem("Kamaly Zapana");
		mntmKamalyZapana_1.addActionListener(this);
		mntmKamalyZapana_1.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\mujer.jpg"));
		mntmKamalyZapana_1.setSelectedIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\mujer.jpg"));
		mnIntegrantes.add(mntmKamalyZapana_1);
		
		mntmBrianVeliz = new JMenuItem("Jorge Quispe");
		mntmBrianVeliz.addActionListener(this);
		mntmBrianVeliz.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\hombre-de-negocios.jpg"));
		mnIntegrantes.add(mntmBrianVeliz);
		
		mntmKamalyZapana = new JMenuItem("Fernando Padilla");
		mntmKamalyZapana.addActionListener(this);
		mntmKamalyZapana.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\estudiante.jpg"));
		mnIntegrantes.add(mntmKamalyZapana);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\instagram.png"));
		label_3.setBounds(603, 299, 40, 40);
		contentPane.add(label_3);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\gorjeo.jpg"));
		label_2.setBounds(553, 299, 40, 40);
		contentPane.add(label_2);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\fb.png"));
		label_1.setBounds(503, 299, 40, 40);
		contentPane.add(label_1);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\clinica-bautista.jpg"));
		label.setBounds(0, 0, 654, 350);
		contentPane.add(label);
	}


	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmMedicina) {
			actionPerformedMntmMedicina(arg0);
		}
		if (arg0.getSource() == mntmPaciente) {
			actionPerformedMntmPaciente(arg0);
		}
		if (arg0.getSource() == mntmKamalyZapana) {
			actionPerformedMntmKamalyZapana(arg0);
		}
		if (arg0.getSource() == mntmBrianVeliz) {
			actionPerformedMntmBrianVeliz(arg0);
		}
		if (arg0.getSource() == mntmKamalyZapana_1) {
			actionPerformedMntmKamalyZapana_1(arg0);
		}
		if (arg0.getSource() == menuItem_1) {
			actionPerformedMenuItem_1(arg0);
		}
		if (arg0.getSource() == mntmCama) {
			actionPerformedMntmCama(arg0);
		}
		if (arg0.getSource() == mntmIntPag) {
			actionPerformedMntmIntPag(arg0);
		}
		if (arg0.getSource() == mntmIntPen) {
			actionPerformedMntmIntPen(arg0);
		}
		if (arg0.getSource() == mntmConPag) {
			actionPerformedMntmConPag(arg0);
		}
		if (arg0.getSource() == mntmConPen) {
			actionPerformedMntmConPen(arg0);
		}
		if (arg0.getSource() == mntmInt) {
			actionPerformedMntmInt(arg0);
		}
		if (arg0.getSource() == mntmCon) {
			actionPerformedMntmCon(arg0);
		}
		if (arg0.getSource() == mntmInter) {
			actionPerformedMntmInter(arg0);
		}
		if (arg0.getSource() == mntmConsul) {
			actionPerformedMntmConsul(arg0);
		}
		if (arg0.getSource() == mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
		System.exit(0);
	}
	protected void actionPerformedMntmConsul(ActionEvent arg0) {
			DlgRConsultas dRC = new DlgRConsultas();
			dRC.setLocationRelativeTo(this);
			dRC.setVisible(true);
			
	}
	protected void actionPerformedMntmInter(ActionEvent arg0) {
			DlgRInternamientos dRI = new DlgRInternamientos();
			dRI.setLocationRelativeTo(this);
			dRI.setVisible(true);
			
	}
	protected void actionPerformedMntmCon(ActionEvent arg0) {
		DlgPConsultas dPC = new DlgPConsultas();
			dPC.setLocationRelativeTo(this);
			dPC.setVisible(true);
		
	}
	protected void actionPerformedMntmInt(ActionEvent arg0) {
		DlgPInternamientos dPI = new DlgPInternamientos();
			dPI.setLocationRelativeTo(this);
			dPI.setVisible(true);
			}
	
	protected void actionPerformedMntmConPen(ActionEvent arg0) {
		DlgRepConsultasPendientes dCP = new DlgRepConsultasPendientes();
			dCP.setLocationRelativeTo(this);
			dCP.setVisible(true);
			
	}
	protected void actionPerformedMntmConPag(ActionEvent arg0) {
		DlgRepConsultasPagadas dCP = new DlgRepConsultasPagadas();
			dCP.setLocationRelativeTo(this);
			dCP.setVisible(true);
			
	}
	protected void actionPerformedMntmIntPen(ActionEvent arg0) {
		DlgRepInternamientosPendientes dIP = new DlgRepInternamientosPendientes();
		dIP.setLocationRelativeTo(this);
		dIP.setVisible(true);
	
	}
	protected void actionPerformedMntmIntPag(ActionEvent arg0) {
		DlgRepInternamientosPagados dIP = new DlgRepInternamientosPagados();
		dIP.setLocationRelativeTo(this);
		dIP.setVisible(true);
	
	}
	protected void actionPerformedMntmCama(ActionEvent arg0) {
		DlgCama dac = new DlgCama();
		dac.setLocationRelativeTo(this);
		dac.setVisible(true);
	}
	protected void actionPerformedMenuItem_1(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null,"\n*********************************"
				+ "\n Estudiante de la carrera:"
				+ "\n Computaci�n y Sistemas en cibertec."
				+ "\n Encargado: �rea de dise�o para 'Clinica Bautista'."
				+ "\n Email: brian.veliz@outlook.com"
				+ "\n Celular: 943472892."
				+ "\n*********************************");
		
	}
	protected void actionPerformedMntmKamalyZapana_1(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null,"\n*********************************"
				+ "\n Estudiante de la carrera:"
				+ "\n Computaci�n y Sistemas en cibertec."
				+ "\n Encargado: �rea de desarrollo y programaci�n para la 'Clinica Bautista'."
				+ "\n Email: kamaly.kazal@gmail.com"
				+ "\n Celular: 930184997."
				+ "\n*********************************");
	}
	protected void actionPerformedMntmBrianVeliz(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null,"\n*********************************"
				+ "\n Estudiante de la carrera:"
				+ "\n Computaci�n y Sistemas en cibertec."
				+ "\n Encargado: �rea de coordinaci�n y proyectos para la 'Clinica Bautista'."
				+ "\n Email: i201716940@cibertec.edu.pe"
				+ "\n Celular: 912903879."
				+ "\n*********************************");
	}
	protected void actionPerformedMntmKamalyZapana(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null,"\n*********************************"
				+ "\n Estudiante de la carrera:"
				+ "\n Computaci�n y Sistemas en cibertec."
				+ "\n Encargado: �rea de coordinaci�n y estructura del proyecto para la 'Clinica Bautista'."
				+ "\n Email: wariurtest@gmail.com"
				+ "\n Celular: 980416334."
				+ "\n*********************************");
		
	}
	protected void actionPerformedMntmPaciente(ActionEvent arg0) {
		DlgPaciente dpac = new DlgPaciente();
		dpac.setLocationRelativeTo(this);
		dpac.setVisible(true);

		
	}
	protected void actionPerformedMntmMedicina(ActionEvent arg0) {
		DlgMed dmed = new DlgMed();
		dmed.setLocationRelativeTo(this);
		dmed.setVisible(true);

	}
	}