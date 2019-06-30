package Arreglo;

import clase.Paciente;
import java.io.*;
import java.util.ArrayList;

public class ArregloPaciente {
	ArrayList<Paciente> pac;
	private String archivo;

	// constructor
	public ArregloPaciente(String archivo) {

		pac = new ArrayList<Paciente>();
		this.archivo = archivo;
		cargarPaciente();
	}

	public void adicionar(Paciente x) {
		pac.add(x);

	}

	public int tama�o() {
		return pac.size();
	}

	public Paciente obtener(int i) {
		return pac.get(i);
	}

	// metodo eliminar del arraylist
	public void eliminar(Paciente i) {
		pac.remove(i);
	}
	// Operaciones adicionales

	public void cargarPaciente() {
		try {

			BufferedReader br;
			String linea, nombres, apellidos, telefono, dni;
			String[] s;
			int codigoPaciente;
			br = new BufferedReader(new FileReader(archivo));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				codigoPaciente = Integer.parseInt(s[0].trim());
				nombres = s[1].trim();
				apellidos = s[2].trim();
				telefono = s[3].trim();
				dni = s[4].trim();
				adicionar(new Paciente(codigoPaciente, nombres, apellidos, telefono, dni));

			}
			br.close();
		} catch (Exception e) {
		}
	}

	public void grabarPaciente() {
		try {
			PrintWriter pw;
			String linea;
			Paciente x;
			pw = new PrintWriter(new FileWriter(archivo));
			for (int i = 0; i < tama�o(); i++) {
				x = obtener(i);
				linea = x.getCodigoPaciente() + ";" + x.getNombres() + ";" + x.getApellidos() + ";" + x.getTelefono()
						+ ";" + x.getDni();
				pw.println(linea);
			}
			pw.close();
		} catch (Exception e) {
		}
	}

	// Metodo de b�squeda
	public Paciente buscar(int codigo) {
		for (int i = 0; i < tama�o(); i++)
			if (obtener(i).getCodigoPaciente() == codigo)
				return obtener(i);
		return null;
	}

	public int codigoCorrelativo() {
		if (tama�o() == 0)
			return 200001;
		else {
			return obtener(tama�o() - 1).getCodigoPaciente() + 1;
		}
	}

}
