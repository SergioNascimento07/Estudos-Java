package classeenum;

public enum Filme {
    SHREK ("shrek", "comédia"),
    BARBIE ("barbie", "menininha"),
    TROPA_DE_ELITE ("ossoDuro", "tiro");

    private String nome;
    private String genero;

    private Filme(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String toString() {
        return "nome: " + this.nome + ", genero: " + this.genero;
    }

}
