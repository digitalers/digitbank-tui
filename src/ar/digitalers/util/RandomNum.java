package util;

public class RandomNum {

    private int min;
    private int max;

    public RandomNum(int min, int max) {
        this.min = min;
        this.max = max;
    }
    
    public int random() {
        int rnd = (int) (int) Math.floor(Math.random() * (max - min) + min);
        return rnd;
    }
}
