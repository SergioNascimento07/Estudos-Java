package estruturadedados.arvoretipoint;

class BinNo {
    public Integer conteudo;
    private BinNo noEsq;
    private BinNo noDir;

    public BinNo(Integer conteudo) {
        this.conteudo = conteudo;
        noEsq = null;
        noDir = null;
    }

    public int compareValue(int valorOutro){
        int i = 0;

        if(this.conteudo > valorOutro){
            i = 1;
        }else if(this.conteudo < valorOutro){
            i = -1;
        }
        return i;
    }

    public BinNo() {
    }

    public Integer getConteudo() {
        return conteudo;
    }

    public void setConteudo(Integer conteudo) {
        this.conteudo = conteudo;
    }

    public BinNo getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNo noEsq) {
        this.noEsq = noEsq;
    }

    public BinNo getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNo noDir) {
        this.noDir = noDir;
    }

    @Override
    public String toString() {
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
