public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume Atual : " + smartTv.volume);

        System.out.println("Canal Atual : " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Novo Status -> Canal Atual : " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Novo Status -> Canal Atual : " + smartTv.canal);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Novo Status -> Canal Atual : " + smartTv.canal);
        

    }
}
