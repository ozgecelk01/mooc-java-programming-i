public class Timer {
    private ClockHand hs;
    private ClockHand s;

    public Timer(){
        this.hs = new ClockHand(100);
        this.s = new ClockHand(60);
    }

    public void advance(){
        this.hs.advance();
        if(this.hs.value() == 0){
            this.s.advance();
        }
    }

    @Override
    public String toString(){
        return s + ":" + hs;
    }

}
