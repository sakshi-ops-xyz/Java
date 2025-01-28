package interfacee;

import static interfacee.vehicleInterface1.num1;

public class BMW implements vehicleInterface1, vehicleInterface2{

    @Override
    public void speed() {
        System.out.println("Speed method in BMW");
    }

    public void variables(int num) {
        if(num1 == num) {
            System.out.println("Ok");
        }
    }


    @Override
    public void documentation() {      // in case of ambiguity in methods in interface we use super to access method of particular interface
        vehicleInterface1.super.documentation();
    }
}


