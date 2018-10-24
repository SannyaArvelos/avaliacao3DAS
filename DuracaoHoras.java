package Cadastros;

public class DuracaoHoras {
	DuracaoHoras duracaoHoras;
	
	int minutosInicio;
	int horaTermino;
	int minutosTermino;
	int horaInicio;
	int totalHoras;
	
	void CalcularDuracaoHoras (DuracaoHoras duracaoHoras) {
		this.duracaoHoras = duracaoHoras;
	}
	
	public void calculo() {
		if (horaTermino == horaInicio)
			totalDeHorasIgual0();
		if (horaTermino > horaInicio) //varias possibilidades... 
			if (horaTermino == horaInicio + 1) {  
				if (diferencaDeMinutos())  //nao chegou a uma hora
					totalDeHorasIgual0();
				else //durou pelo menos uma hora
					totalDeHorasIgual1();
			} else { //possivelmente ultrapassou duas horas
				if (restoDasHoras() > 2) //
					this.duracaoHoras.totalHoras = restoDasHoras();
				else if (restoDasHoras() == 2 &&   //certamente menos de duas horas  
						 diferencaDeMinutos())    //e mais de uma hora
					totalDeHorasIgual1();
				else //duracao de duas horas, certamente
					this.duracaoHoras.totalHoras = 2;
					
			}
		if (horaTermino < horaInicio) 
			this.duracaoHoras.totalHoras = -1; //para casos em que a hora de termino nao foi registrada
	}

	private int totalDeHorasIgual0() {
		return this.duracaoHoras.totalHoras = 0;
	}

	private int totalDeHorasIgual1() {
		return this.duracaoHoras.totalHoras = 1;
	}

	private boolean diferencaDeMinutos() {
		return minutosTermino < minutosInicio;
	}

	private int restoDasHoras() {
		return horaTermino - horaInicio;
	}
}
