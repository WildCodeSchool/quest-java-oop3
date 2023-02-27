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


    @Override
    public void ascend(int altitude){
        this.altitude += altitude;
        System.out.println(this.getName() + " flies upward, altitude : " + this.altitude);
    }

    @Override
    public void glide(){
        System.out.println("It flides into the air.");
    }

    @Override
    public void descend(int altitude){
        this.altitude -= altitude;
        System.out.println(this.getName() + " flies downward, altitude : " + this.altitude);
    }

    @Override
    public void land(){
        System.out.println(this.altitude > 1 ? this.getName() + " is too high, it can't lands." : this.getName() + " lands on the ground.");
    }
}
