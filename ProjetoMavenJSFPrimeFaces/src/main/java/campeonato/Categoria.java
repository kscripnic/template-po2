package campeonato;

public class Categoria {

	private String _descricao;
	private int _minIdade;
	private int _maxIdade;
	private int _sexo;
	
	public boolean isIdadeValida(int idade) {
		return idade >= _minIdade && idade <= _maxIdade;
	}
}
