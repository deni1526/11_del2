import java.util.Random;
class RaffleCup {   
   

   private int dieSum;
   private Die[] die;

   public RaffleCup(int die, int min, int max){
      var dice = new Die[die];
      this.dieSum = 0;
      for(int i = 0; i < dice.length; i++) {
         dice[i] = new Die(min, max);
      }
      this.die = dice;
      
   }
    
   //methods
   public void shakeDie() {
      Random rand = new Random();
      this.dieSum = 0;
      for(int i = 0; i < this.die.length;i++){
         die[i].setFaceValue(rand.nextInt(this.die[i].getMax() - this.die[i].getMin() + 1) + this.die[i].getMin());
         this.dieSum += die[i].getFaceValue();
      }
      
   }
   public void callDieSum(){
      this.dieSum = 0;
      for(int i = 0; i < this.die.length;i++){
        this.dieSum += die[i].getFaceValue();
      }
   }

   public int getDieSum() {
      return this.dieSum;
   }

   public void setDieSum(int sum) {
      this.dieSum = sum;
   }

   public int[] getDiceValues() {
      var DiceValues = new int[die.length];
      for(int i = 0; i < die.length; i++) {
         DiceValues[i] = die[i].getFaceValue();
      }
      return DiceValues;
   }
}




   



   







