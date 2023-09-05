public class Container {
    private int container;

    public Container(){
        this.container=0;
    }
    public int contains(){
        return this.container;
    }

    public void add(int amount){
        if((container+amount)<=100 && amount>=0){
            container+=amount;
        }
        else if((container+amount)>100 && amount>=0){
            container=100;
        }
    }

    public void remove(int amount){
        if((container-amount)>=0 && amount>=0){
            container-=amount;
        }
        else if((container-amount)<0 && amount>=0){
            container=0;
        }
    }

    public String toString(){
        return container+"/100";
    }
}