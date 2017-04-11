package campeonato;

import java.util.ArrayList;
import java.util.Date;

import participante.Juiz;
import participante.Usuario;

public class Campeonato {
	private int _ano;
	private String _nome;
	private Date _incioCampeonato;
	private Date _fimCampeonato;
	private Date _inicioInscricoes;
	private Date _fimInscricoes;
	private int _maxJogadores;
	private int _minJogadores;
	private float _valorInscricao;
	private Usuario _criador;
	
	private ArrayList<CampeonatoCategoria> _categorias;
	private ArrayList<Juiz> _juizes;
	
	public void inscreverEquipe(Equipe equipe){
		for (CampeonatoCategoria campeonatoCategoria : _categorias) {
			if(equipe.getCategoria().equals(campeonatoCategoria)){
				campeonatoCategoria.addEquipe(equipe);
			}
		}
	}
}
