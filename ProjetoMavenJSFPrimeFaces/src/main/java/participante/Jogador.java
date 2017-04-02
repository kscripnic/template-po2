package participante;

import java.util.Date;

import campeonato.Equipe;

public class Jogador extends Participante
{
	private int _totalCartalAmarelo;
	private int _totalGols;
	private int _totalFaltas;
	private int _totalCartaoVermelho;
	private String _rg;
	private Date _dataNascimento;
		
	private Equipe _equipe;
	
	public int getIdade(){
		long ageInMillis = new Date().getTime() - _dataNascimento.getTime();

	    Date age = new Date(ageInMillis);

	    return age.getYear();
	}
	
	public void addGol(){
		_totalGols++;
	}
	
	public void addFalta(){
		_totalFaltas++;
	}
	
	public void addCartaoAmarelo(){
		_totalCartalAmarelo++;
	}
	
	public void addCartaoVermelho(){
		_totalCartaoVermelho++;
	}
	
}