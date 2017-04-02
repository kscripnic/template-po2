package participante;

import campeonato.PartidaJogador;

public class Juiz extends Participante
{
	public void penalizarJogador(PartidaJogador jogador){
		jogador.aplicarCartaoAmarelo();
	}
	
	public void expulsarTecnico(Tecnico tecnico){
		tecnico.expulsar();
	}
}
