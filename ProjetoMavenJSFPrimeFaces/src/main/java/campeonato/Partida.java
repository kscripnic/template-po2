package campeonato;

import java.util.ArrayList;
import java.util.Date;

import participante.Juiz;

public class Partida {
	private Date _datahora;
	
	private Equipe _mandante;
	private Equipe _visitante;
	private Local _local;
	
	private Juiz _juiz;
	private ArrayList<Juiz> _auxiliarDeJuiz;
	
	private int _placarMandante;
	private int _placarVisitante;
	
	private Partida _proximaPartida;
}
