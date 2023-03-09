public class SmartTV {

    boolean tvligada = false;
    int volume = 10;
    int canal = 1;

    public void ligar(){
        tvligada = true;
    }

    public void desligar(){
        tvligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

}
