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

    public void takeOff(){
        if(!this.flying && altitude==0){
            this.flying = true;
            System.out.println(this.getName()+" takes off in the sky.");
        }
    }
    public int ascend(int meters){
        if(this.flying){
            this.altitude = this.altitude + meters;
            System.out.println(this.getName()+" flies upward, altitude: "+ this.altitude);
        }
        return this.altitude;
    }
    public void glide(){
        if(this.flying) {
            System.out.println("glides into the air.");
        }
    }
    public int descend(int meters){
        if(this.flying){
            this.altitude = this.altitude - meters;
            System.out.println(this.getName()+" flies downward,altitude "+this.altitude);
        }
        return this.altitude;
    }
    public void land(){
        if(flying && this.altitude<=1){
            System.out.println(this.getName()+" lands on the ground.");
        }
        else{
            System.out.println(this.getName()+" is too high, it can't land!");
        }

    }
}
