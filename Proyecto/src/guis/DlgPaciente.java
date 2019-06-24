package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import Arreglo.ArregloPaciente;
import clase.Paciente;
import libreria.Alerta;

import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class DlgPaciente extends JDialog implements ActionListener, MouseListener {
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
	private JTextField textField;
	private JLabel label;
	private JButton btnBuscar;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
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
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(DlgPaciente.class.getResource("/img/paciente internado.png")));
		setTitle("Pacientes");
		setBounds(100, 100, 720, 676);
		getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "", TitledBorder.LEFT, TitledBorder.TOP,
				null, new Color(0, 0, 0)));
		panel.setBounds(0, 0, 702, 629);
		getContentPane().add(panel);
		panel.setLayout(null);

		label = new JLabel("");
		label.setIcon(new ImageIcon(DlgPaciente.class.getResource("/img/medicos.png")));
		label.setBounds(568, 151, 122, 78);
		panel.add(label);

		lblNombre = new JLabel("Nombres:");
		lblNombre.setBounds(10, 126, 108, 14);
		panel.add(lblNombre);

		lblApellido = new JLabel("Apellidos:");
		lblApellido.setBounds(10, 151, 108, 14);
		panel.add(lblApellido);

		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 176, 60, 14);
		panel.add(lblTelefono);

		lblDni = new JLabel("D.I:");
		lblDni.setBounds(10, 201, 46, 14);
		panel.add(lblDni);

		txtnom = new JTextField();
		txtnom.setForeground(Color.BLACK);
		txtnom.setBackground(Color.WHITE);
		txtnom.setBounds(77, 123, 122, 20);
		panel.add(txtnom);
		txtnom.setColumns(10);

		txtape = new JTextField();
		txtape.setForeground(Color.BLACK);
		txtape.setBackground(Color.WHITE);
		txtape.setColumns(10);
		txtape.setBounds(77, 148, 122, 20);
		panel.add(txtape);

		txttel = new JTextField();
		txttel.setBackground(Color.WHITE);
		txttel.setForeground(Color.BLACK);
		txttel.setColumns(10);
		txttel.setBounds(77, 173, 122, 20);
		panel.add(txttel);

		txtdni = new JTextField();
		txtdni.setForeground(Color.BLACK);
		txtdni.setBackground(Color.WHITE);
		txtdni.setColumns(10);
		txtdni.setBounds(77, 198, 122, 20);
		panel.add(txtdni);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 242, 680, 374);
		panel.add(scrollPane);

		tblpac = new JTable();
		tblpac.setBackground(Color.LIGHT_GRAY);
		tblpac.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tblpac.setFillsViewportHeight(true);
		tblpac.addMouseListener(this);
		scrollPane.setViewportView(tblpac);

		modelo = new DefaultTableModel();
		modelo.addColumn("Codigo:");
		modelo.addColumn("Nombres:");
		modelo.addColumn("Apellidos:");
		modelo.addColumn("Telefono:");
		modelo.addColumn("D.I:");

		tblpac.setModel(modelo);

		btnAdicionar = new JButton("ADICIONAR + ");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBackground(Color.WHITE);
		btnAdicionar.setIcon(
				new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\src\\img\\ingresar.png"));
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAdicionar.setBounds(10, 31, 133, 23);

		panel.add(btnAdicionar);

		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setIcon(new ImageIcon(DlgPaciente.class.getResource("/img/consulta.png")));
		btnConsultar.setBackground(Color.WHITE);
		btnConsultar.setBounds(155, 27, 111, 29);
		panel.add(btnConsultar);

		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setIcon(new ImageIcon(DlgPaciente.class.getResource("/img/modificar.png")));
		btnModificar.setBackground(Color.WHITE);
		btnModificar.setBounds(296, 25, 113, 33);
		panel.add(btnModificar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setIcon(new ImageIcon(DlgPaciente.class.getResource("/img/eliminar.png")));
		btnEliminar.setBackground(Color.WHITE);
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(427, 25, 107, 33);
		panel.add(btnEliminar);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setIcon(new ImageIcon(DlgPaciente.class.getResource("/img/registrar.png")));
		btnListar.setBackground(Color.WHITE);
		btnListar.setBounds(577, 25, 113, 33);
		panel.add(btnListar);

		txtcod = new JTextField();
		txtcod.setHorizontalAlignment(SwingConstants.CENTER);
		txtcod.setText("200001");
		txtcod.setForeground(Color.WHITE);
		txtcod.setBackground(new Color(0, 206, 209));
		txtcod.setBounds(77, 95, 122, 20);
		panel.add(txtcod);
		txtcod.setColumns(10);

		lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCdigo.setBounds(10, 94, 57, 21);
		panel.add(lblCdigo);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(new Color(72, 209, 204));
		textField.setBounds(0, 0, 702, 83);
		panel.add(textField);
		textField.setColumns(10);

		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(234, 93, 71, 25);
		panel.add(btnBuscar);

		btnGuardar = new JButton("Aceptar");
		btnGuardar.addActionListener(this);
		btnGuardar.setBounds(221, 196, 97, 25);
		panel.add(btnGuardar);
		habilitarEntradas(false);
		habilitarCodigo(false);
		limpieza();

	}

	ArregloPaciente ap = new ArregloPaciente("paciente.txt");

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(arg0);
		}
		if (arg0.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(arg0);
		}
		if (arg0.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(arg0);
		}
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			actionPerformedBtnModificar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
	}

	protected void actionPerformedBtnBuscar(ActionEvent arg0) {
		try {
			Paciente a = ap.buscar(leercodigo());
			if (a != null) {
				txtnom.setText("" + a.getNombres());
				txtape.setText("" + a.getApellidos());
				txttel.setText("" + a.getTelefono());
				txtdni.setText("" + a.getDni());

			} else {
				mensaje("el CODIGO " + leercodigo() + " no existe");
			}

			habilitarCodigo(false);

		} catch (Exception e1) {
			mensaje("Ingrese un c�digo");
		}
	}

	protected void actionPerformedBtnEliminar(ActionEvent arg0) {

		try {
			int codigo = leercodigo();
			Paciente a = ap.buscar(codigo);
			if (a == null)
				Alerta.mensaje(this, "Selecciona un registro");
			else {

				int ok = Alerta.confirmar(this, "Esta seguro que desea eliminar " + leercodigo());
				if (ok == 0) {
					ap.eliminar(a);
					listar();
					limpieza();
					habilitarEntradas(false);
				}

				habilitarEntradas(false);
				limpieza();
			}
			habilitarEntradas(false);
			limpieza();

		} catch (Exception e1) {
			mensaje("Selecciona un registro");

		}
	}

	protected void actionPerformedBtnGuardar(ActionEvent arg0) {
		try {
			Paciente a = ap.buscar(leercodigo());
			if (a != null) {
				a.setNombres(leerNombre());
				a.setApellidos(leerApellido());
				a.setTelefono(leerTelefono());
				a.setDni(leerDni());
				listar();
				limpieza();
				habilitarEntradas(false);
			} else {
				clase.Paciente x = new clase.Paciente(leercodigo(), leerNombre(), leerApellido(), leerTelefono(),
						leerDni());
				ap.adicionar(x);
				listar();
				limpieza();
				habilitarEntradas(false);
			}
		} catch (Exception e) {
			mensaje("No existen datos que agregar");

		}
	}

	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		limpieza();
		txtcod.setText("" + ap.codigoCorrelativo());
		habilitarEntradas(true);
	}

	protected void actionPerformedBtnModificar(ActionEvent arg0) {
		try {
			int codigo = leercodigo();
			Paciente a = ap.buscar(codigo);
			if (a == null)
				mensaje("Selecciona un registro");
			else {
				habilitarEntradas(true);
			}

		} catch (Exception e1) {
			mensaje("Selecciona un registro");

		}
	}

	protected void actionPerformedBtnListar(ActionEvent arg0) {
		listar();
	}

	protected void actionPerformedBtnConsultar(ActionEvent arg0) {
		limpieza();
		habilitarCodigo(true);
	}

	void habilitarEntradas(boolean is) {
		txtnom.setEditable(is);
		txtape.setEditable(is);
		txttel.setEditable(is);
		txtdni.setEditable(is);
	}

	void habilitarCodigo(boolean is) {
		txtcod.setEditable(is);
		txtcod.requestFocus();
	}

	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}

	void editarFila() {

		if (ap.tama�o() == 0)
			limpieza();
		else {
			Paciente x = ap.obtener(tblpac.getSelectedRow());
			txtcod.setText("" + x.getCodigoPaciente());
			txtnom.setText("" + x.getNombres());
			txtape.setText("" + x.getApellidos());
			txttel.setText("" + x.getTelefono());
			txtdni.setText("" + x.getDni());

		}

	}

	void listar() {
		modelo.setRowCount(0);
		for (int i = 0; i < ap.tama�o(); i++) {
			Object fila[] = { ap.obtener(i).getCodigoPaciente(), ap.obtener(i).getNombres(),
					ap.obtener(i).getApellidos(), ap.obtener(i).getTelefono(), ap.obtener(i).getDni() };
			modelo.addRow(fila);
		}
		;

	}

	void limpieza() {
		txtcod.setText("");
		txtnom.setText("");
		txtape.setText("");
		txttel.setText("");
		txtdni.setText("");
	}

	int leercodigo() {
		return Integer.parseInt(txtcod.getText().trim());
	}

	String leerApellido() {
		return txtape.getText().trim();
	}

	String leerNombre() {
		return txtnom.getText().trim();
	}

	String leerDni() {
		return txtdni.getText().trim();
	}

	String leerTelefono() {
		return txttel.getText().trim();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == tblpac) {
			mouseClickedTable(e);
		}

	}

	protected void mouseClickedTable(MouseEvent e) {
		habilitarEntradas(true);
		editarFila();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
