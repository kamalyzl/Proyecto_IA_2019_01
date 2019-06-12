package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

public class DlgPaciente extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblTelefono;
	private JLabel lblDni;
	private JTextField txtnom;
	private JTextField txtape;
	private static DefaultTableModel modelo;
	private JTextField txttel;
	private JTextField txtdni;
	private JScrollPane scrollPane;
	private JTable tblpac;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnListar;
	private JTextField txtcod;
	private JLabel lblCdigo;
	private JLabel lblelCdigoDe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgPaciente dialog = new DlgPaciente();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DlgPaciente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\paciente internado.png"));
		setTitle("Pacientes");
		setBounds(100, 100, 603, 338);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(0, 0, 580, 295);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNombre = new JLabel("Nombres:");
		lblNombre.setBounds(30, 34, 108, 14);
		panel.add(lblNombre);
		
		lblApellido = new JLabel("Apellidos:");
		lblApellido.setBounds(230, 34, 108, 14);
		panel.add(lblApellido);
		
		lblTelefono = new JLabel("Tel\u00E9fono:");
		lblTelefono.setBounds(30, 56, 108, 14);
		panel.add(lblTelefono);
		
		lblDni = new JLabel("D.I:");
		lblDni.setBounds(232, 56, 46, 14);
		panel.add(lblDni);
		
		txtnom = new JTextField();
		txtnom.setForeground(Color.WHITE);
		txtnom.setBackground(Color.LIGHT_GRAY);
		txtnom.setBounds(100, 34, 122, 20);
		panel.add(txtnom);
		txtnom.setColumns(10);
		
		txtape = new JTextField();
		txtape.setForeground(Color.WHITE);
		txtape.setBackground(Color.LIGHT_GRAY);
		txtape.setColumns(10);
		txtape.setBounds(297, 34, 122, 20);
		panel.add(txtape);
		
		
		
		txttel = new JTextField();
		txttel.setBackground(Color.LIGHT_GRAY);
		txttel.setForeground(Color.WHITE);
		txttel.setColumns(10);
		txttel.setBounds(100, 56, 122, 20);
		panel.add(txttel);
		
		txtdni = new JTextField();
		txtdni.setForeground(Color.WHITE);
		txtdni.setBackground(Color.LIGHT_GRAY);
		txtdni.setColumns(10);
		txtdni.setBounds(297, 56, 122, 20);
		panel.add(txtdni);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 105, 560, 172);
		panel.add(scrollPane);
		
		tblpac = new JTable();
		tblpac.setBackground(Color.LIGHT_GRAY);
		tblpac.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblpac.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblpac);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("C�digo:");
		modelo.addColumn("Nombres:");
		modelo.addColumn("Apellidos:");
		modelo.addColumn("D.I:");
		
		tblpac.setModel(modelo);
		
		
		btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBackground(Color.WHITE);
		btnAdicionar.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\ingresar.png"));
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAdicionar.setBounds(429, 34, 138, 40);
		
		panel.add(btnAdicionar);
		
		btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setBackground(new Color(176, 224, 230));
		btnConsultar.setBounds(200, 80, 118, 23);
		panel.add(btnConsultar);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBackground(new Color(176, 224, 230));
		btnModificar.setBounds(313, 80, 98, 23);
		panel.add(btnModificar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBackground(new Color(176, 224, 230));
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(409, 80, 93, 23);
		panel.add(btnEliminar);
		
		btnListar = new JButton("LISTAR");
		btnListar.setBackground(new Color(176, 224, 230));
		btnListar.setBounds(492, 80, 78, 23);
		panel.add(btnListar);
		
		txtcod = new JTextField();
		txtcod.setForeground(Color.WHITE);
		txtcod.setBackground(Color.RED);
		txtcod.setBounds(100, 10, 86, 20);
		panel.add(txtcod);
		txtcod.setColumns(10);
		
		lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCdigo.setBounds(30, 9, 57, 21);
		panel.add(lblCdigo);
		
		lblelCdigoDe = new JLabel("(*)El c\u00F3digo de paciente comienza con 'i' luego son n\u00FAmeros");
		lblelCdigoDe.setForeground(Color.RED);
		lblelCdigoDe.setBounds(230, 9, 340, 14);
		panel.add(lblelCdigoDe);

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
	}
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
	}
}
