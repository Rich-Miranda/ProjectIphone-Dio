package Iphone.Aplicativos;

import Iphone.Itunes.Itune;
import Iphone.Safari.Safari;
import Iphone.Telefone.AppPhone;
import Iphone.Telefone.Phone;

public class Installars {
   private void AppMusic(){
       System.out.println("APP ITUNE Instalado...");
   }

   private void AppSafari(){
       System.out.println("App Safari Instalado..");
   }

   private void AppTelefone(){
       System.out.println("App Telefone Instalado");
   }


   public void AplicativosInstalados(){
       AppMusic();
       AppSafari();
       AppTelefone();
   }
}
