class Field {
    private String[][] description;
    private int[] fieldValue;
    private String[] languages;
    private int language;
    private int[] turn;

    public Field() {
        var description = new String[2][13];
        description[0][0] = "Game info";
        description[0][2] = "Field 2: You climb to the top of the tower and discover a hidden treasure. You gain 250 points!";
        description[0][3] = "Field 3: You stumble into a deep crater and struggle to get out. You lose 100 points.";
        description[0][4] = "Field 4: You approach the grand palace gates, and the guards reward you with a gift. You gain 100 points.";
        description[0][5] = "Field 5: The cold desert drains your energy as you cross it. You lose 20 points.";
        description[0][6] = "Field 6: You enter the walled city and receive a warm welcome with gifts. You gain 180 points!";
        description[0][7] = "Field 7: You rest at the monastery. No gain, no loss, but you feel at peace."; 
        description[0][8] = "Field 8: The black cave is dark and eerie, and you lose your way. You lose 70 points.";
        description[0][9] = "Field 9: You find friendly huts in the mountains where villagers offer you provisions. You gain 60 points!";
        description[0][10] = "Field 10: You face the mighty Werewall and lose some strength. You lose 80 points, but the wall grants you an extra turn.";
        description[0][11] = "Field 11: You fall into a deep pit and struggle to climb out. You lose 50 points.";
        description[0][12] = "Field 12: You have found gold in the mountain and sell it for 650 points. You are rich!";
        description[1][0] = "Game info";
        description[1][2] = "Felt 2: Du klatrer til toppen af tårnet og opdager en skjult skat. Du får 250 point!";
        description[1][3] = "Felt 3: Du klatrer til toppen af tårnet og opdager en skjult skat. Du får 250 point!"; 
        description[1][4] = "Felt 4: Du nærmer dig de storslåede paladsporte, og vagterne belønner dig med en gave. Du får 100 point.";
        description[1][5] = "Felt 5: Den kolde ørken dræner din energi, mens du krydser den. Du mister 20 point.";
        description[1][6] = "Felt 6: Du kommer ind i den befæstede by og modtager en varm velkomst med gaver. Du får 180 point!"; 
        description[1][7] = "Felt 7: Du hviler i klosteret. Ingen gevinst, intet tab, men du føler dig i fred."; 
        description[1][8] = "Felt 8: Den sorte hule er mørk og uhyggelig, og du mister orienteringen. Du mister 70 point.";
        description[1][9] = "Felt 9: Du finder venlige hytter i bjergene, hvor landsbyboerne tilbyder dig forsyninger. Du får 60 point!"; 
        description[1][10] = "Felt 10: Du står over for den mægtige Werewall og mister noget styrke. Du mister 80 point, men muren giver dig en ekstra tur.";
        description[1][11] = "Felt 11: Du falder ned i et dybt hul og kæmper for at komme op. Du mister 50 point.";
        description[1][12] = "Felt 12: Du har fundet guld i bjergene og sælger det for 650 point. Du er rig!";

        this.description = description;

        var fieldValue = new int[13];
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

        var languages = new String[2];
        languages[0] = "English";
        languages[1] = "Dansk";

        this.languages = languages;

        var turn = new int[13];
        turn[0] = 1;
        turn[2] = 1;
        turn[3] = 1;
        turn[4] = 1;
        turn[5] = 1;
        turn[6] = 1;
        turn[7] = 1;
        turn[8] = 1;
        turn[9] = 1;
        turn[10] = 0;
        turn[11] = 1;
        turn[12] = 1;

        this.turn = turn;
    }

    public void setDescription(String[][] description){
        this.description = description;
    }

    public String getDescription(int language, int field) {
        return this.description[language][field];
    }

    public void setLanguage(int language) {
        this.language = language; 
    }

    public int getLanguage() {
        return this.language;
    }

    public void setFieldValue(int[] fieldValue) {
        this.fieldValue = fieldValue;
    }

    public int getFieldValue(int field) {
        return this.fieldValue[field];
    }

    public void setTurn(int[] turn) {
        this.turn = turn;
    }

    public int getTurn(int turn) {
        return this.turn[turn];
    }
    
}
