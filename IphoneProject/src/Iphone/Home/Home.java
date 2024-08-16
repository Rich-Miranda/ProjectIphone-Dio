package Iphone.Home;

import Iphone.Aplicativos.Installars;
import Iphone.Itunes.AppItune;
import Iphone.Itunes.Itune;
import Iphone.Safari.AppSafari;
import Iphone.Telefone.AppPhone;

public class Home {
    public static void main(String[] args) {
        Installars iphoneS1 = new Installars();


        System.out.println("===========================");
        System.out.println("APP ABAIXADOS");
        iphoneS1.AplicativosInstalados();
        System.out.println("=============================");
        AppItune music = new AppItune();
        music.toca();
        music.pausar();
        music.selecionarMusica("Majestade coral");
        AppSafari safari = new AppSafari();
        AppPhone telefone = new AppPhone();


        


    }
}
