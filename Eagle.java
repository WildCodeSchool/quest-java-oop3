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
    public String takeOff() {
        System.out.println(name + " takes off in the sky");
        return name + " takes off in the sky";
    }

    @Override
    public String ascend(int meters) {
        System.out.println(name + " flies upward, altitude : " + meters + "m");
        return name + " flies upward, altitude : " + meters + "m";
    }

    @Override
    public String descend(int meters) {
        System.out.println(name + " flies downward, altitude : " + meters + "m");
        return name + " flies downward, altitude : " + meters + "m";
    }

    @Override
    public String glide() {
        System.out.println("It glides into the air.");
        return "It glides into the air.";
    }

    @Override
    public String land() {
        System.out.println(name + " lands on the ground.");
        return name + " lands on the ground.";
        
    }
}
