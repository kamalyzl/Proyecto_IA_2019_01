package Arreglo;

import java.io.*;
import java.util.ArrayList;
import clase.Medicina;

public class ArregloMedicina {

	ArrayList<Medicina> cm;
	private String archivo;

	public ArregloMedicina(String archivo) {
		cm = new ArrayList<Medicina>();
		this.archivo = archivo;
		cargarMedicina();
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public int tama�o() {
		return cm.size();
	}

	public Medicina obtener(int i) {
		return cm.get(i);
	}

	public void adicionar(Medicina x) {
		cm.add(x);
	}

	// cambiar los elementos dentro del arraylist
	public void modificar(int i, Medicina x) {
		cm.set(i, x);
	}

	// metodo eliminar del arraylist
	public void eliminar(Medicina i) {
		cm.remove(i);
	}

	public boolean existeArchivo() {
		File f = new File(archivo);
		return f.exists();
	}

	public void cargarMedicina() {
		try {

			BufferedReader br;
			int codigoMedicina, stock;
			String linea, nombre, laboratorio;
			double precio;
			String[] s;

			br = new BufferedReader(new FileReader(archivo));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				codigoMedicina = Integer.parseInt(s[0].trim());
				nombre = s[1].trim();
				laboratorio = s[2].trim();
				precio = Double.parseDouble(s[3].trim());
				stock = Integer.parseInt(s[4].trim());
				adicionar(new Medicina(codigoMedicina, nombre, laboratorio, precio, stock));
			}
			br.close();
		} catch (Exception e) {
		}
	}

	public void grabarMedicina() {
		try {
			PrintWriter pw;
			String linea;
			Medicina x;
			pw = new PrintWriter(new FileWriter(archivo));
			for (int i = 0; i < tama�o(); i++) {
				x = obtener(i);
				linea = x.getCodigoMedicina() + ";" + x.getNombre() + ";" + x.getLaboratorio() + ";"
						+ x.getPrecioUnitario() + ";" + x.getStock();
				pw.println(linea);
			}
			pw.close();
		} catch (Exception e) {
		}
	}

	// Metodo de b�squeda
	public Medicina buscar(int codigoMedicina) {
		for (int i = 0; i < tama�o(); i++)
			if (obtener(i).getCodigoMedicina() == codigoMedicina)
				return obtener(i);
		return null;
	}

	public int codigoCorrelativo() {
		if (tama�o() == 0)
			return 300001;
		else
			return obtener(tama�o() - 1).getCodigoMedicina() + 1;
	}

}
