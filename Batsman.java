public interface Batsman extends Cricketer {
public int Score= 720;
public int BatterRanking=2;


public default void print(){
 System.out.println("Batsman has made  "+ Score + " score and has ranking :"+ BatterRanking + " as a bowler");
}

public default int getranking(){
return BatterRanking;
}
}
