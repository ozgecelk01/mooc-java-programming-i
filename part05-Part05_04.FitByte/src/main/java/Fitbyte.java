public class Fitbyte {
    private int a;
    private int r;
    public Fitbyte(int age, int restingHeartRate){
        this.a=age;
        this.r=restingHeartRate;
    }
    public double targetHeartRate(double percentageOfMaximum){
        double maximumHeartRate = 206.3 - (0.711 * this.a);
        return (maximumHeartRate - this.r) * (percentageOfMaximum) + this.r;
    }
}
