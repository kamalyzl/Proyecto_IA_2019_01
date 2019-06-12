package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;

public class DlgMed extends JDialog {
	private JPanel panel;
	private JLabel lblCantidad;
	private JLabel lblPreciounitario;
	private JTextField textField;
	private JTextField textField_1;
	private JScrollPane scrollPane;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JTextField textField_4;
	private JLabel label_4;
	private JLabel lblelCdigoDe;
	private JButton btnPorCantidad;
	private JButton btnPorPrecio;
	private JTable table;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgMed dialog = new DlgMed();
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
	public DlgMed() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\bin\\img\\TriCell.jpg"));
		setTitle("Medicamentos:");
		setBounds(100, 100, 610, 331);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 594, 291);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(30, 34, 57, 14);
		panel.add(lblCantidad);
		
		lblPreciounitario = new JLabel("Precio/unitario:");
		lblPreciounitario.setBounds(30, 59, 86, 14);
		panel.add(lblPreciounitario);
		
		textField = new JTextField();
		textField.setBounds(129, 31, 57, 20);
		textField.setForeground(Color.WHITE);
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 56, 57, 20);
		textField_1.setForeground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		panel.add(textField_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 105, 560, 172);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(192, 192, 192));
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		
		button = new JButton("ADICIONAR");
		button.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\bin\\img\\ingresar.png"));
		button.setBounds(196, 34, 133, 40);
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(Color.WHITE);
		panel.add(button);
		
		button_1 = new JButton("CONSULTAR");
		button_1.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\bin\\img\\generar.png"));
		button_1.setBounds(74, 80, 133, 23);
		button_1.setBackground(new Color(176, 224, 230));
		panel.add(button_1);
		
		button_2 = new JButton("MODIFICAR");
		button_2.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\bin\\img\\modificar.png"));
		button_2.setBounds(206, 80, 137, 23);
		button_2.setBackground(new Color(176, 224, 230));
		panel.add(button_2);
		
		button_3 = new JButton("ELIMINAR");
		button_3.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\bin\\img\\eliminar.png"));
		button_3.setBounds(336, 80, 133, 23);
		button_3.setBackground(new Color(176, 224, 230));
		panel.add(button_3);
		
		button_4 = new JButton("LISTAR");
		button_4.setIcon(new ImageIcon("F:\\AED\\sdfsd\\Soluci\u00F3n_Proyectos_IA\\Proyecto_\\bin\\img\\reportar.png"));
		button_4.setBounds(466, 80, 104, 23);
		button_4.setBackground(new Color(176, 224, 230));
		panel.add(button_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(129, 10, 57, 20);
		textField_4.setForeground(Color.WHITE);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.RED);
		panel.add(textField_4);
		
		label_4 = new JLabel("C\u00F3digo:");
		label_4.setBounds(30, 9, 57, 21);
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel.add(label_4);
		
		lblelCdigoDe = new JLabel("(*)El c\u00F3digo de medicamento comienza con 'm' luego son n\u00FAmeros");
		lblelCdigoDe.setBounds(200, 9, 384, 14);
		lblelCdigoDe.setForeground(Color.RED);
		panel.add(lblelCdigoDe);
		
		btnPorCantidad = new JButton("Por Cantidad");
		btnPorCantidad.setBounds(336, 55, 111, 23);
		panel.add(btnPorCantidad);
		
		btnPorPrecio = new JButton("Por Precio");
		btnPorPrecio.setBounds(445, 55, 98, 23);
		panel.add(btnPorPrecio);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Ordenar por:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(336, 34, 207, 39);
		panel.add(panel_1);

	}
}
