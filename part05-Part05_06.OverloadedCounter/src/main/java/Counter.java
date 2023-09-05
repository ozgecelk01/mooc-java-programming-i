public class Counter {

    private int startValue;

    public Counter(int startValue){
        this.startValue=startValue;
    }

    public Counter(){

    }

    public int value(){
        return startValue;
    }

    public void increase(int increaseBy){
        if(increaseBy>=0){
            this.startValue+=increaseBy;
        }
    }

    public void decrease(int decreaseBy){
        if(decreaseBy>=0){
            this.startValue-=decreaseBy;
        }
    }

    public void increase(){
        this.startValue++;
    }

    public void decrease(){
        this.startValue--;
    }
}
