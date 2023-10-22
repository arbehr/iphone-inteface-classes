package src;

public class Fabrica {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        ReprodutorMusical reprodutorMusical = iphone;
        AparelhoTelefonico aparelhoTelefonico = iphone;
        NavegadorInternet navegadorInternet = iphone;

        reprodutorMusical.tocar();
        aparelhoTelefonico.ligar();
        navegadorInternet.exibirPagina();
    }
}
