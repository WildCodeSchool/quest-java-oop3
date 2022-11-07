public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;
    private String name;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
        this.name = name;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println(name + " takes off in the sky");
    }

    @Override
    public void ascend(int meters) {
        System.out.println(name + " flies upward, altitude : " + meters + "m");
    }

    @Override
    public void descend(int meters) {
        System.out.println(name + " flies downward, altitude : " + meters + "m");
    }

    @Override
    public void glide() {
        System.out.println("It glides into the air.");
    }

    @Override
    public void land() {
        System.out.println(name + " lands on the ground.");
        
    }
}
