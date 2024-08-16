package Iphone.Safari;

public class AppSafari implements Safari {

    @Override
    public void exibirPagina(String url) {
        System.out.println("https:/" + url);
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando página");
    }

    @Override
    public void atualizadoPagina() {
        System.out.println("Atualizando página");
    }
}
