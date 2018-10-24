package Cadastros;

public class DuracaoMinutos {
	DuracaoMinutos duracaoMinutos;
	
	int totalMinutos;
	int minutosInicio;
	int minutosTermino;	
	
	void CalcularDuracaoMinutos (DuracaoMinutos duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}
	
	public void caculo() {
	
		if (minutosTermino > minutosInicio) 
			this.duracaoMinutos.totalMinutos = minutosTermino - minutosInicio;
		else {
			this.duracaoMinutos.totalMinutos = 60 - minutosInicio + minutosTermino;
			if (this.duracaoMinutos.totalMinutos == 60) //caso especial
				this.duracaoMinutos.totalMinutos = 0;
		}
	}

}
