import java.util.Random;
class RaffleCup {   
   
   private int dieSum;
   private Die[] die;

   public RaffleCup(Die[] die) {
      this.die = die;
   }


   public void createDie(int dice) {
      var die = new Die[dice];
      this.die = die;
   }
    
   //methods
   public void shakeRaffle() {
      for(int i = 0; i < this.die.length; i++) {
         Random rand = new Random();
         this.die[i].setFaceValue(rand.nextInt(this.die[i].getMax() - this.die[i].getMin() + 1) + this.die[i].getMin());
      }
   }


   public void setFaceValue() {

   }
   
}




   



   







