package campeonato;

import participante.Jogador;

public class PartidaJogador {
	private Partida _partida;
	private Jogador _jogador;
	
	private int _gols;
	private int _faltas;
	private int _qtdCartaoAmarelo;
	private boolean _isExpulso;
	
	public void marcarGol(){
		_gols++;
		
		_jogador.addGol();
	}	

	public void aplicarCartaoAmarelo()
	{
		_qtdCartaoAmarelo++;

		_jogador.addCartaoAmarelo();
		
		if(_qtdCartaoAmarelo == 2)
		{
			_isExpulso = true;
			
			_jogador.addCartaoVermelho();			
		}
	}
}
