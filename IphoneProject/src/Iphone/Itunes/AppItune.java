package Iphone.Itunes;

public class AppItune implements Itune{
    @Override
    public void toca() {
        System.out.println("Tocando !u! ");
    }

    @Override
    public void pausar() {
        String vazio = "";

        System.out.println("Pausado musica");
        selecionarMusica(vazio);

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada foi: " + musica);
    }
}
