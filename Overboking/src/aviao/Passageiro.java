package aviao;

public class Passageiro {

	private String cpf;
	private String Nome;
	private Tipo categoria;
	private int Poltrona;

	public Passageiro(String cpf, String nome, Tipo categoria, int Poltrona) {
		this.cpf = cpf;
		this.Nome = nome;
		this.categoria = categoria;
		this.Poltrona = Poltrona;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getPoltrona() {
		return Poltrona;
	}

	public void setPoltrona(int Poltrona) {
		this.Poltrona = Poltrona;
	}

	public Tipo getCategoria() {
		return categoria;
	}

	public void setCategoria(Tipo categoria) {
		this.categoria = categoria;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Passageiro() {}

	@Override
	public String toString() {
		return "Passageiro [cpf=" + cpf + ", Nome=" + Nome + ", categoria="
				+ categoria + ", numeroPoltrona=" + Poltrona + "]";
	}
}
