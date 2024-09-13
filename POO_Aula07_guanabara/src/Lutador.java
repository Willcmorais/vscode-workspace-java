
public class Lutador {
	// ATRIBUTOS; CARACTERISTICAS, VARIAVEIS;
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private double altura, peso;

	// METODO CONSTRUTOR
	public Lutador(String no, String na, int id, int vi, int de, int em, double al, double pe) {
		this.setNome(no);
		this.setNacionalidade(na);
		this.setIdade(id);
		this.setVitorias(vi);
		this.setDerrotas(de);
		this.setEmpates(em);
		this.setAltura(al);
		this.setPeso(pe);
	}

	// METODOS
	public void Apresentar() {
		System.out.println("Apresentamos o Lutador " + this.getNome());
		System.out.println("Com sua origem diretamente do(a) " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " Anos");
		System.out.println(this.getAltura() + "m de altura");
		System.out.println("Pesando " + this.getPeso() + "KG");
		System.out.println("Ganhou: " + this.getVitorias());
		System.out.println("Perdeu: " + this.getDerrotas());
		System.out.println("Empatou: " + this.getEmpates());
	}

	public void status() {
		System.out.println(this.getNome() + " e um peso " + this.getCategoria());
		System.out.println("Tem " + this.getVitorias() + " Vitorias");
		System.out.println(this.getDerrotas() + " Derrotas");
		System.out.println(this.getEmpates() + " Empates");
	}

	public void ganhar() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perder() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatar() {
		this.setEmpates(this.getEmpates() + 1);
	}

	// METODOS ACESSORES
	public String getNome() {
		return nome;
	}

	public void setNome(String no) {
		this.nome = no;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String na) {
		this.nacionalidade = na;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String ca) {
		if (this.getPeso() < 52.2) {
			System.out.println("Invalido");
		} else if (this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		} else if (this.getPeso() <= 83.9) {
			this.categoria = "Medio";
		} else if (this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		} else {
			System.out.println("Invalido");
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int id) {
		this.idade = id;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vi) {
		this.vitorias = vi;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int de) {
		this.derrotas = de;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int em) {
		this.empates = em;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double al) {
		this.altura = al;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double pe) {
		this.peso = pe;
		this.setCategoria(categoria);
	}
}
