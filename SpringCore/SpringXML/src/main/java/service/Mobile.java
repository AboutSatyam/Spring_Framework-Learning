package service;

class Battery {
    void charge() {
        System.out.println("Battery Is Charging ");
    }
}


public class Mobile {


    private Battery battery;

    public static void main(String[] args) {
        Battery bat = new Battery();
        Mobile mob = new Mobile();
        mob.setBattery(bat);
        mob.show();
    }

    public boolean show() {
        battery.charge();
        return false;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }


}
