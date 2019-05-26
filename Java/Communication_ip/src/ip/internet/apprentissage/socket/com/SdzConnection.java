package ip.internet.apprentissage.socket.com;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SdzConnection {

   public static void main(String[] args){
      try {
         //On se connecte à OC
         Socket sock = new Socket("fr.wikipedia.org", 80);
         
         //On récupère maintenant la réponse du serveur 
         //dans un flux, comme pour les fichiers...
         BufferedInputStream bis = new BufferedInputStream(sock.getInputStream());
         
         //Il ne nous reste plus qu'à le lire
         String content = "";
         int stream;
         while((stream = bis.read()) != -1){
            content += (char)stream;
         }
         
         Browser browser = new Browser("fr.wikipedia.org", content);
         
      } catch (UnknownHostException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }   
}