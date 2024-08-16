package Iphone.Telefone;

public class AppPhone implements Phone{
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para numero (11)"+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreiodeVoz() {
        System.out.println("Foi enviado ao correio de voz");
    }
}
