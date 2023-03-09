public class User {
    public static void main(String[] args) throws Exception {

        SmartTV smartTv = new SmartTV();
        System.out.println("TV ligada? " + smartTv.tvligada);
        System.out.println("O canal é " + smartTv.canal);
        System.out.println("O volume atual é " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada atualmente? " + smartTv.tvligada);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("O volume atual é " + smartTv.volume);
        smartTv.mudarCanal(13);
        System.out.println("O canal é " + smartTv.canal);
        smartTv.desligar();
        System.out.println("TV ligada atualmente? " + smartTv.tvligada);

    }
}
