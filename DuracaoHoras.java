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
			this.duracaoHoras.totalHoras = 0;
		if (horaTermino > horaInicio) //varias possibilidades... 
			if (horaTermino == horaInicio + 1) {  
				if (minutosTermino < minutosInicio)  //nao chegou a uma hora
					this.duracaoHoras.totalHoras = 0;
				else //durou pelo menos uma hora
					this.duracaoHoras.totalHoras = 1;
			} else { //possivelmente ultrapassou duas horas
				if (horaTermino - horaInicio > 2) //
					this.duracaoHoras.totalHoras = horaTermino - horaInicio;
				else if (horaTermino - horaInicio == 2 &&   //certamente menos de duas horas  
						 minutosTermino < minutosInicio)    //e mais de uma hora
					this.duracaoHoras.totalHoras = 1;
				else //duracao de duas horas, certamente
					this.duracaoHoras.totalHoras = 2;
					
			}
		if (horaTermino < horaInicio) 
			this.duracaoHoras.totalHoras = -1; //para casos em que a hora de termino nao foi registrada
	}
}
