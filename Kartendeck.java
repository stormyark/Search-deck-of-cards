import Prog1Tools.*;
public class Kartendeck {
  static Game g;
  
  static int[] karte= {5,6,3,2,4,7};
  static int x;
  

  public static int suche(int x){
    // x=IOTools.readInteger("Welche Zahl suchen Sie?");
    for (int i=0; i<karte.length; i++) {
      if(karte[i]==x){
        // System.out.println("gefunden :-) bei "+i);
        return i;
      }
    } // end of for
    return -1;
  } 
  
  public static int suche(int x,int counter){
    // x=IOTools.readInteger("Welche Zahl suchen Sie?");
    for (int i=0; i<karte.length; i++) {
      if(karte[i]==x){
        // System.out.println("gefunden :-) bei "+i);
        if(counter==1){
          return i;
        }else{
           counter=counter-1;
           }
      }
    } // end of for
    return -1;
  } 
  
  public static int count(int x){
    int counter=0;   
    for (int i=0; i<karte.length; i++) {
      if(karte[i]==x){
       counter=counter+1;
      }else{
        //nix, weiter ...
      }
    } // end of for
    return counter;
  } 

  
  
  public static void reset(){
    for(int i=0;i<karte.length;i++){
      karte[i]=g.getRndA();
    }
  }
  
  public static String showArray(){
    String s="";
    
    for(int i=0;i<karte.length;i++){
      s=s+" "+karte[i];      
    }
    return s;
    
  }   
} // end of class Kartendeck
