package interfacee;

public interface vehicleInterface2 {
    abstract void speed();

    default void documentation() {
        System.out.println("Vehicle Interface2 Documentation");
    }
}
