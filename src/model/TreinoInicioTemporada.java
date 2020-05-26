package model;

public class TreinoInicioTemporada extends Treino {

	@Override
	void preparoFisico() {
		System.out.println("Preparo fisico leve");
		
	}

	@Override
	void jogoTreino() {
		System.out.println("Jogo treino para inicio da temporada");
		
	}

}
