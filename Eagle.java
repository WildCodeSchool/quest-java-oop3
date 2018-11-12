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
    	System.out.println("I fly because i fly ");
    }
    
   public int ascend( int meters){
   	System.out.println(meters +  "ok it's cool ");
        this.altitude = this.altitude + meters;
        return meters;
   
   }
   
   public int descend( int meters ) {
   	System.out.println(meters + " ok it's cool ");
        this.altitude = this.altitude + meters;
        return meters;

   }

  public void land(){

  	System.out.println("Oui");

}
}
