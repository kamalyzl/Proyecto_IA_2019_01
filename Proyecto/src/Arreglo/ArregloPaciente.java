package Arreglo;

import clase.Paciente;
import java.util.ArrayList;

public class ArregloPaciente {
	private ArrayList<Paciente> pac;

	// constructor
	public ArregloPaciente() {
		pac = new ArrayList<Paciente>();
		adicionar(new Paciente(001, "kamaly", "zapana", "930184997", "71306952"));
		adicionar(new Paciente(002, "Jorges", "Quispe", "999999999", "1234567"));
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

}
