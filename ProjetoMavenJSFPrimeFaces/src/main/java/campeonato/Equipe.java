package campeonato;

import java.util.ArrayList;
import java.util.Date;

import participante.Auxiliar;
import participante.Jogador;
import participante.Massagista;
import participante.PreparadorFisico;
import participante.Tecnico;

public class Equipe{
	private String _nome;
	private boolean _isPago;
	private boolean _isValido;
	private int _golsPro;
	private int _golsContra;
	
	private Tecnico _tecnico;
	private Massagista _massagista;
	private Auxiliar _auxiliar;
	private PreparadorFisico _preparadorFisico;
	
	private ArrayList<Jogador> _jogadores;
		
	private Campeonato _campeonato;
	private Categoria _categoria;
	
	public Categoria getCategoria() {
		return _categoria;
	}
	
	public int saldoGols()
	{
		return _golsPro - _golsContra;
	}
	
	public void inscreverJogador(Jogador jogador) throws Exception
	{
		if(_categoria.isIdadeValida(jogador.getIdade())){
			_jogadores.add(jogador);
		}
		else{
			throw new Exception("Idade inválida para a categoria");
		}
	}
}