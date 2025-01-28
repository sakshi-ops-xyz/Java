package encapsulation;

public class EncasulationEg {
    private int price;

    public void setPrice(int price) {
        this.price=price;
    }

    public int getPrice() {
        return this.price;
    }


}

class Main {
    public static void main(String[] args) {
        EncasulationEg e=new EncasulationEg();
        e.setPrice(10);
        System.out.println(e.getPrice());
    }
}
