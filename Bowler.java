


public interface Bowler extends Cricketer {
public int Wickets= 16;
public int BowlerRanking= 5;


public default void print(){
 System.out.println("Bowler has taken "+ Wickets + " wickets and has ranking :"+ BowlerRanking + " as a bowler");
}

public default int getranking(){
return BowlerRanking;
}
}
