package participante;

public class Tecnico extends Participante
{
	private String _rg;
	private boolean _isExpulso;
	
	public void expulsar(){
		_isExpulso = true;
	}
}
