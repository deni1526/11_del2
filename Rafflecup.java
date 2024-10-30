import java.util.Random;
class RaffleCup {   
   

   private int dieSum;
   private Die die[];

   public RaffleCup(int die){
      var dice = new Die[die];
      this.die = dice;
   }
    
   //methods
   public void shakeDie() {
      Random rand = new Random();
      for(int i = 0; i < this.die.length;i++){
         die[i].setFaceValue(rand.nextInt(this.die[i].getMax() - this.die[i].getMin() + 1) + this.die[i].getMin());
      }
   }
   public void calDieSum(){
      this.dieSum = 0;
      for(int i = 0; i < this.die.length;i++){
        this.dieSum += die[i].getFaceValue();
      }
   }

   public int getDieSum() {
      return this.dieSum;
   }
}




   



   







