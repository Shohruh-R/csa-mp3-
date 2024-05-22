public class Scoreboard {
  private String team1, team2;
  private int score1, score2; 
  private int play = 1; 

  public Scoreboard(String team1, String team2){
    this.team1 = team1;
    this.team2 = team2; 
  }

  public void recordPlay(int n){
    if(n == 0){
      play++;
    }
    else{
      if(play % 2 ==1){
        score1 += n;
      }
      else{
        score2 += n;
      }
    }
  }

  
  public String getScore(){
   String t ="";
   if(play % 2==1){
    t = team1;
    }
  
   else{
     t = team2;
   }
    return score1 + "-" + score2 + "-" + t;

  }
}
