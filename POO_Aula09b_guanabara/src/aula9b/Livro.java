package aula9b;

//A CLASSE LIVRO IMPLEMENTA A INTERFACE PUBLICACAO
public class Livro implements Publicacao {
    // ATRIBUTOS

    private Pessoa leitor;// INSTANCIA DA CLASSE PESSOA(OBJETO) QUE RECEBE ATRIBUTO DE LEITOR
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;

    // METODO CONSTRUTOR
    public Livro(Pessoa leitor, String titulo, String autor, int totPaginas, int pagAtual, boolean aberto) {
        super();
        this.leitor = leitor;
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
    }

    // METODOS
    public void detalhes() {
        System.out.println("Leitor = " + this.leitor.getNome() + ",  Idade = " + this.leitor.getIdade() + ", Sexo = "
                + this.leitor.getSexo() + "\nLivro = " + this.getTitulo() + ", Autor = " + this.getAutor()
                + "\nTotal de Páginas = " + this.getTotPaginas() + ", Página Atual = " + this.pagAtual + ", Aberto = "
                + this.aberto);
        System.out.println("--------------------------------------");
    }

    // METODOS ACESSORES
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (this.getAberto() && p <= this.getTotPaginas()) {
            this.pagAtual = p;
        } else {
            System.out.println("Não é possível avançar até a página selecionada\n");
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltartPag() {
        this.pagAtual--;
    }

}
