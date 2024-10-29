class Die {
    private int min;
    private int max;
    private int facevalue;

    Die(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getFaceValue() {
        //random = random method her
        //this.facevalue = random
        return this.facevalue;
    }

    public void setFaceValue(int faceValue) {
        this.facevalue = faceValue;
    }

    public int getMax() {
        return this.max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return this.min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
