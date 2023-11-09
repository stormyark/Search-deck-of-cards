// import Math.*;  //ist schon im Standard drin
public class Game {
  public static int dieZufallszahl=-1;
  public static String dieZufallszahlStr="-1";
  
  
  public static  int getRndA(){
    dieZufallszahl = (int) Math.round( Math.random()*10); 
    return    dieZufallszahl;
  }

  
  public static String getRndStrA(){
    dieZufallszahlStr=getRndA()+"";
    return  dieZufallszahlStr;
  }  
  
} // end of class Game
