public class Usuário {
    public static void main(String[] args) throws Exception {
        

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual volume? " + smartTv.volume);
        System.out.println("Qual o canal? " + smartTv.canal);

        smartTv.ligar();
        System.out.println(" A TV ligou: " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Qual volume? " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Qual volume? " + smartTv.volume);

        smartTv.subirCanal();
        System.out.println("Qual o canal? " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Qual o canal? " + smartTv.canal);

        smartTv.novoCanal(45);
        System.out.println("Qual o canal? " + smartTv.canal);


    }
}
