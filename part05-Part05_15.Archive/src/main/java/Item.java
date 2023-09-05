public class Item {
    private String name;
    private String name2;

    public Item(String name,String name2){
        this.name=name;
        this.name2=name2;
    }

    @Override
    public String toString(){
        return name + ": " + name2;
    }

    public boolean equals(Object compared) {
        Item item = (Item) compared;
        return this.name.equals(item.name);
    }
}
