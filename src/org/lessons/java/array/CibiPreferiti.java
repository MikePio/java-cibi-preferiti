// ## Todo
// - nel progetto `java-cibi-preferiti` aggiungete la classe `CibiPreferiti` nel package `org.lessons.java.array` col suo metodo `main`
// - nel programma inizializzare un array (con i metodi visti a lezione) con la classifica dei vostri cibi preferiti (minimo 5, massimo 10 elementi)

// Poi stampate a video:
// - la lunghezza della classifica
// - il vostro cibo top (prima posizione della classifica)
// - il vostro cibo preferito ma non troppo (ultima posizione della classifica)

// Stampate a video anche il cibo di mezza classifica, cioè che si trova nella posizione mediana

// > Attenzione agli array di lunghezza pari
package org.lessons.java.array;

public class CibiPreferiti {
  public static void main(String[] args) {
    
    // caso 1 array con elementi dispari
    // String[] cibiPreferiti  = new String[5];
    // caso 2 array con elementi pari
    String[] cibiPreferiti  = new String[6];
    
    cibiPreferiti[0] = "Pizza";
    cibiPreferiti[1] = "Pasta";
    cibiPreferiti[2] = "Sushi";
    cibiPreferiti[3] = "Gelato";
    cibiPreferiti[4] = "Mela";
    cibiPreferiti[5] = "Arancina";
    
    int indiceCiboNellaMedia = (cibiPreferiti.length / 2);
    
    System.out.println("Hai " + cibiPreferiti.length + " cibi preferiti");

      if(cibiPreferiti.length%2!=0){
        System.out.println("Il cibo di mezza classifica è: " + (indiceCiboNellaMedia + 1) + "°) " + cibiPreferiti[indiceCiboNellaMedia]);
      }else{
        System.out.println("I cibi di mezza classifica sono:\n" 
          + (indiceCiboNellaMedia - 1) + "°) " + cibiPreferiti[indiceCiboNellaMedia - 1] + "\n" 
          + (indiceCiboNellaMedia) + "°) " + cibiPreferiti[indiceCiboNellaMedia]);
      }

  }

}
