public class AllRounder implements Batsman, Bowler {
public int AllRounderRanking;
public AllRounder(int r){

AllRounderRanking = r;

}
public void print(){
Batsman.super.print();
Bowler.super.print();
 System.out.println("All Rounder has ranking :"+ AllRounderRanking );

}

public int getranking(){
System.out.println("Batsman Ranking:"+ Batsman.super.getranking()); 
System.out.println("Bowler Ranking: " + Bowler.super.getranking());
System.out.println("AllRounder Ranking: " + AllRounderRanking);
return 0;
}
}
