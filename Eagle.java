public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
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
    public void takeOff(){
        System.out.println(this.getName() + " takes off in the sky.");
    }

    int alt = 0;

    @Override
    public void ascend(int distance){
        System.out.println(this.getName() + " flies upward, altitude : " + (alt+distance));
        alt = alt + distance;
    }

    @Override
    public void glide(){
        System.out.println("It flides into the air.");
    }

    @Override
    public void descend(int distance){
        System.out.println(this.getName() + " flies downward, altitude : " + (alt-distance));
        alt = alt - distance;
    }

    @Override
    public void land(){
        // return (alt > 1) ? System.out.println(this.getName() + " is too high, it can't lands.") : System.out.println(this.getName() + " lands on the ground.");
        if (alt > 1){
        System.out.println(this.getName() + " is too high, it can't lands.");
        } else {
            System.out.println(this.getName() + " lands on the ground.");
        }
    }
}
