package campeonato;

import java.util.ArrayList;

public class CampeonatoCategoria {

	private Campeonato _campeonato;
	private Categoria _categoria;
	
	private boolean _incricaoAtivaJogador;
	private boolean _incricaoAtivaEquipe;
	
	private ArrayList<Equipe> _equipes;
	private ArrayList<Partida> _partidas;
	
	public void addEquipe(Equipe equipe){
		_equipes.add(equipe);
	}
	 
}
