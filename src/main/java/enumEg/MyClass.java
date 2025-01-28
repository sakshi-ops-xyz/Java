package enumEg;

enum LightMode {
    OFF, DIM, BRIGHT, CUSTOM;
}

enum LightShade {
    WARM_WHITE(255, 244, 229),
    COOL_WHITE(255, 255, 255),
    BLUE(0, 0, 255),
    GREEN(0, 255, 0),
    RED(255, 0, 0),
    CUSTOM(-1, -1, -1); 

    private int r;
    private int g;
    private int b;

    LightShade(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }
    
    public void setCustomRGB(int r, int g, int b) {
        if (this == CUSTOM) {
            this.r = r;
            this.g = g;
            this.b = b;
        } 
    }


}

enum TemperatureMode {
    OFF(-1), COOL(15), HEAT(35), AUTO(-1);

    private int temp;

    TemperatureMode(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
}

enum DeviceState {
    ACTIVE, INACTIVE;
}

class Controller {
    private LightMode lightMode = LightMode.OFF;
    private LightShade lightShade = LightShade.WARM_WHITE;
    private TemperatureMode temperatureMode = TemperatureMode.OFF;
    private DeviceState deviceState = DeviceState.INACTIVE;

    public void setLightMode(LightMode mode) {
        this.lightMode = mode;
    }

    public void setLightShade(LightShade shade) {
        this.lightShade = shade;
    }

    public void setTemperatureMode(TemperatureMode mode) {
        this.temperatureMode = mode;
    }

    public void setDeviceState(DeviceState state) {
        this.deviceState = state;
    }

    public void displayCurrentSettings() {
        System.out.println("\nCurrent Settings:");
        System.out.println("Light Mode: " + lightMode);
        System.out.println("Light Shade: " + lightShade);
        System.out.println("Temperature Mode: " + temperatureMode);
        System.out.println("Device State: " + deviceState + "\n");
    }
}

public class MyClass {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.setLightMode(LightMode.BRIGHT);
        controller.setLightShade(LightShade.BLUE);
        controller.setTemperatureMode(TemperatureMode.COOL);
        controller.setDeviceState(DeviceState.ACTIVE);

        controller.displayCurrentSettings();

        // setting a custom shade
        LightShade customShade = LightShade.CUSTOM;
        customShade.setCustomRGB(123, 45, 67);
        controller.setLightShade(customShade);

        controller.displayCurrentSettings();
    }
}
