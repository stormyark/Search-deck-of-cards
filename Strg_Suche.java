import Prog1Tools.*;

public class Strg_Suche {
  public static Kartendeck k;
  // public static KartendecGUIk kGui;

  public static int auswahl = -1;
  public static int x, erg, n;

  public static void main(String[] args) {

    for (; auswahl != 99;) {

      System.out.println("******SUCHEN in FELDERN****");
      System.out.println("1 Suchen ");
      System.out.println("2 neue Zufallszahlen setzen ");
      System.out.println("3 Feld anzeigen ");
      System.out.println("4 n-ten Treffer suchen ");
      System.out.println("5 Anzahl der Treffer ermitteln");

      System.out.println("99 ENDE");
      System.out.println("*****************************");
      auswahl = IOTools.readInteger("Ihre Wahl:");

      // switch anstelle von mehrfach IF
      switch (auswahl) {

        case 1:// EVA Ein- und Ausgabe in der Strg.
          x = IOTools.readInteger("Welche Zahl suchen Sie?");
          erg = k.suche(x);
          System.out.println("gefunden bei " + erg);
          break;

        case 2:
          k.reset();
          break;

        case 3:
          String s;
          s = k.showArray();
          System.out.println(s);
          break;

        case 4:
          x = IOTools.readInteger("Welche Zahl suchen Sie?");
          n = IOTools.readInteger("Den wievielten Treffer suchen Sie?");

          erg = k.suche(x, n);
          if (erg == -1) {
            System.out.println("Ihre Zahl ist nicht in der gesuchten Anzahl vorhanden");
          } else {
            System.out.println(x + " zum " + n + "ten mal gefunden bei " + erg);
          }

          break;

        case 5:// EVA Ein- und Ausgabe in der Strg.
          x = IOTools.readInteger("Welche Zahl suchen Sie?");
          erg = k.count(x);
          System.out.println(x + " wurde " + erg + " mal gefunden");
          break;

        default:

      } // end of switch

    } // end of for

  } // end of main

} // end of class Strg_Suche
