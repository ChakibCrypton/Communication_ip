package ip.internet.apprentissage.com;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class url {

   public static void main(String[] args) {
	   /* Cette classe va nous permettre de nous connecter à un site internet, ici google
	    * On utilise la classe url qui va nous permettre de nous connecter grâce à une url 
	    * La classe url ne fait que nous fournir des informations sur la connection
	    */
      try {
         
         URL url = new URL("https://www.google.fr");
         
         System.out.println("Authority : " + url.getAuthority()); // Cette méthode retourne le nom du site
         System.out.println("Default port : " + url.getDefaultPort()); // Cette méthode retourne le port par défaut
         System.out.println("Host : " + url.getHost()); // Cette méthode retourne l'host
         System.out.println("Port : " + url.getPort()); // Cette méthode retourne le port si il y en un qui a été sélectionné
         System.out.println("Protocol : " + url.getProtocol()); // Cette méthode retourne le protocole
         
      } catch (MalformedURLException e) {
         e.printStackTrace(); // Erreur si la machine ne peut pas accédé au site 
      }
   }
}