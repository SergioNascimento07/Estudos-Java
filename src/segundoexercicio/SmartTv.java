package segundoexercicio;

public class SmartTv {
    public boolean ligada;
    public int canal;
    public int volume;
// O nome do cnostrutor é o mesmo da classe
// Construtor nao pode ter retorno
    public SmartTv(boolean status, int canalAtual, int volumeAtual) {
        this.ligada = status;
        this.canal = canalAtual;
        this.volume = volumeAtual;
    }

    public void aumentarVolume() {
        this.volume ++;
    }
}
