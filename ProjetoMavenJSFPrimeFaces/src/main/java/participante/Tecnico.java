package participante;

import campeonato.Equipe;

public class Tecnico extends Participante
{
	private String _rg;
	private boolean _isExpulso;
	private Equipe _equipe;
	
	public void expulsar(){
		_isExpulso = true;
	}
}
