class Field {
    private String[][] description;
    private int[] fieldValue;
    private String[] language;
    private int[] turn;

    public Field() {
        var description = new String[this.language.length][12];
        description[0][0] = "Game info";
        description[0][2] = "You climb to the top of the tower and discover a hidden treasure. You gain 250 points!";
        description[0][3] = "You stumble into a deep crater and struggle to get out. You lose 100 points.";
        description[0][4] = "You approach the grand palace gates, and the guards reward you with a gift. You gain 100 points.";
        description[0][5] = "The cold desert drains your energy as you cross it. You lose 20 points.";
        description[0][6] = "You enter the walled city and receive a warm welcome with gifts. You gain 180 points!";
        description[0][7] = "You rest at the monastery. No gain, no loss, but you feel at peace."; 
        description[0][8] = "The black cave is dark and eerie, and you lose your way. You lose 70 points.";
        description[0][9] = "You find friendly huts in the mountains where villagers offer you provisions. You gain 60 points!";
        description[0][10] = "You face the mighty Werewall and lose some strength. You lose 80 points, but the wall grants you an extra turn.";
        description[0][11] = "You fall into a deep pit and struggle to climb out. You lose 50 points.";
        description[0][12] = "You have found gold in the mountain and sell it for 650 points. You are rich!";
        description[1][0] = "Game info";
        description[1][2] = "";
        description[1][3] = ""; 
        description[1][4] = "";
        description[1][5] = "";
        description[1][6] = ""; 
        description[1][7] = ""; 
        description[1][8] = "";
        description[1][9] = ""; 
        description[1][10] = "";
        description[1][11] = "";
        description[1][12] = "";

        this.description = description;

        var fieldValue = new int[12];
        fieldValue[0] = 0;
        fieldValue[2] = +250;
        fieldValue[3] = -100;
        fieldValue[4] = +100;
        fieldValue[5] = -20;
        fieldValue[6] = +180;
        fieldValue[7] = 0;
        fieldValue[8] = -70;
        fieldValue[9] = +60;
        fieldValue[10] = -80;
        fieldValue[11] = -50;
        fieldValue[12] = +650;

        this.fieldValue = fieldValue;

        var language = new String[2];
        language[0] = "English";
        language[1] = "Dansk";

        this.language = language;



    }
    
}
