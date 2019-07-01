package guis;

import java.awt.EventQueue;
import javax.swing.border.Border;
import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import Arreglo.ArregloConsulta;
import clase.Cama;
import clase.Consulta;

import java.text.SimpleDateFormat;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class DlgRConsultas extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel lblTotalAPagar;
	private JLabel lblEstado;
	private JTextField txtTotal;
	private static DefaultTableModel modelo;
	private JComboBox cboestado;
	private JScrollPane scrollPane;
	private JTable tblconmed;
	private JLabel lblNConsulta;
	private JTextField txtConsulta;
	private JButton btnSeleccionar;
	static JTextField txtPaciente;
	private JButton btnAdicionar;
	private JButton btnAceptar;

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
					DlgRConsultas dialog = new DlgRConsultas();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static class RoundedBorder implements Border {

	    private int radius;


	    RoundedBorder(int radius) {
	        this.radius = radius;
	    }


	    public Insets getBorderInsets(Component c) {
	        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
	    }


	    public boolean isBorderOpaque() {
	        return true;
	    }


	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	    }
	}
	/**
	 * Create the dialog.
	 */
	public DlgRConsultas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgRConsultas.class.getResource("/img/TriCell.jpg")));
		setTitle("Consultas Medicas");
		setBounds(100, 100, 750, 570);
		getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(-4, 0, 736, 523);
		getContentPane().add(panel);
		panel.setLayout(null);

		cboestado = new JComboBox();
		cboestado.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		cboestado.setAlignmentY(Component.TOP_ALIGNMENT);
		cboestado.setOpaque(false);
		cboestado.setBackground(new Color(240, 255, 240));
		cboestado.setBorder(UIManager.getBorder("ToggleButton.border"));
		cboestado.setModel(new DefaultComboBoxModel(new String[] { "Atencion", "Pagada" }));
		cboestado.setBounds(508, 28, 104, 26); 
	 
 
		panel.add(cboestado);

		lblTotalAPagar = new JLabel("Total a Pagar");
		lblTotalAPagar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblTotalAPagar.setBounds(576, 152, 87, 17);
		panel.add(lblTotalAPagar);

		lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblEstado.setBounds(446, 30, 50, 20);
		panel.add(lblEstado);

		txtTotal = new JTextField();
		txtTotal.setBackground(new Color(240, 255, 240));
		txtTotal.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtTotal.setBorder(UIManager.getBorder("ToggleButton.border"));
		txtTotal.setColumns(10);
		txtTotal.setBounds(560, 181, 124, 64);
		txtTotal.setBorder(new RoundedBorder(20));
		panel.add(txtTotal);

		scrollPane = new JScrollPane();
		scrollPane.setFocusCycleRoot(true);
		scrollPane.setBorder(UIManager.getBorder("TitledBorder.border"));
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(27, 254, 684, 170);
		panel.add(scrollPane);

		tblconmed = new JTable();
		tblconmed.setBackground(Color.WHITE);
		scrollPane.setViewportView(tblconmed);

		modelo = new DefaultTableModel();
		modelo.addColumn("Cod. consulta:");
		modelo.addColumn("Cod. paciente:");
		modelo.addColumn("Fecha atenci�n:");
		modelo.addColumn("Hora atenci�n:");
		modelo.addColumn("Total a Pagar:");
		modelo.addColumn("Estado atenci�n:");
		// modelo.addColumn("Receta:");
		tblconmed.setModel(modelo);

		lblNConsulta = new JLabel("N\u00B0 consulta");
		lblNConsulta.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNConsulta.setBounds(51, 26, 104, 28);
		panel.add(lblNConsulta);

		txtConsulta = new JTextField();
		txtConsulta.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtConsulta.setBackground(new Color(255, 255, 255));
		txtConsulta.setBorder(UIManager.getBorder("TitledBorder.border"));
		txtConsulta.setBounds(182, 26, 131, 39);
		txtConsulta.setBorder(new RoundedBorder(10));
		panel.add(txtConsulta);
		txtConsulta.setColumns(10);

		btnSeleccionar = new JButton("Paciente");
		btnSeleccionar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnSeleccionar.setBorder(UIManager.getBorder("ToggleButton.border"));
		btnSeleccionar.addActionListener(this);
		btnSeleccionar.setBounds(37, 120, 133, 25);
		btnSeleccionar.setBorder(new RoundedBorder(20));
		btnSeleccionar.setOpaque(false);
		panel.add(btnSeleccionar);

		txtPaciente = new JTextField();
		txtPaciente.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtPaciente.setBackground(new Color(240, 255, 240));
		txtPaciente.setBorder(UIManager.getBorder("CheckBox.border"));
		txtPaciente.setBounds(182, 113, 131, 39);
		txtPaciente.setBorder(new RoundedBorder(10));
		panel.add(txtPaciente);
		txtPaciente.setColumns(10);

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setOpaque(false);
		btnAdicionar.setBorder(UIManager.getBorder("MenuItem.border"));
		btnAdicionar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnAdicionar.setForeground(Color.BLACK);
		btnAdicionar.setBackground(Color.WHITE);
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(37, 178, 133, 27); 
		panel.add(btnAdicionar);
		
		
		btnAdicionar.setBorder(new RoundedBorder(20));

		
		btnAceptar = new JButton("Guardar");
		btnAceptar.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnAceptar.setBorder(UIManager.getBorder("ToggleButton.border"));
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(288, 453, 115, 39);
		panel.add(btnAceptar);
		
		btnAceptar.setBorder(new RoundedBorder(20));
		btnAceptar.setOpaque(false);
		
		listar();
		habilitarEntradas(false);
		habilitarCodigo(false);

	}

	ArregloConsulta ac = new ArregloConsulta("consulta.txt");

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
		if (arg0.getSource() == btnSeleccionar) {
			actionPerformedBtnSeleccionar(arg0);
		}
	}

	protected void actionPerformedBtnSeleccionar(ActionEvent arg0) {
		DlgLisPac dRC = new DlgLisPac();
		dRC.setLocationRelativeTo(this);
		dRC.setVisible(true);
	}

	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		double montoInicial = 100.00;
		limpieza();
		txtConsulta.setText("" + ac.codigoCorrelativo());
		txtTotal.setText("" + montoInicial);
		habilitarEntradas(true);
	}

	protected void actionPerformedBtnAceptar(ActionEvent arg0) {

		try {
			clase.Consulta x = new clase.Consulta(leerCodigoConsulta(), leerCodigoPaciente(), obtenerFecha(),
					obtenerHora(), leerTotal(), leerEstado());
			ac.adicionar(x);
			listar();
			limpieza();
			habilitarEntradas(false);

		} catch (Exception e) {
			mensaje("No existen datos que agregar");

		}

	}

	void limpieza() {
		txtPaciente.setText("");
		txtConsulta.setText("");
		txtTotal.setText("");
	}

	void habilitarEntradas(boolean is) {
		txtTotal.setEditable(is);
		btnSeleccionar.setEnabled(is);
	}

	void habilitarCodigo(boolean is) {
		cboestado.setEnabled(is);
		txtConsulta.setEditable(is);
		txtPaciente.setEditable(is);
	}

	String obtenerFecha() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(d);
	}

	String obtenerHora() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		return sdf.format(d);
	}

	void listar() {
		modelo.setRowCount(0);
		for (int i = 0; i < ac.tama�o(); i++) {
			Object[] fila = { ac.obtener(i).getCodigoConsulta(), ac.obtener(i).getCodigoPaciente(),
					ac.obtener(i).getFechaAtencion(), ac.obtener(i).getHoraAtencion(), ac.obtener(i).getTotalPagar(),
					ac.obtener(i).detalleEstado() };
			modelo.addRow(fila);
		}
	}

	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}

	int leerEstado() {
		return cboestado.getSelectedIndex();
	}

	int leerCodigoConsulta() {
		return Integer.parseInt(txtConsulta.getText().trim());
	}

	int leerCodigoPaciente() {
		return Integer.parseInt(txtPaciente.getText().trim());
	}

	double leerTotal() {
		return Double.parseDouble(txtTotal.getText().trim());
	}

}
