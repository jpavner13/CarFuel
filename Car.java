public class Car{

    private String model ;
    private String type ;
    private int tankSize ;
    private double time ;

    public Car(String model, String type, int tankSize, double time){
        this.model = model ;
        this.type = type ;
        this.tankSize = tankSize ;
        this.time = time ;
    }

    public String getModel(){
        return this.model;
    }

    public String gettype(){
        return this.type;
    }

    public int getTankSize(){
        return this.tankSize;
    }

    public double getTime(){
        return this.time;
    }

    public double calculateGasMilage(){
        double gasmilage ;

        double distance = (60 * this.time);

        return ((distance / this.tankSize) * 3.785);
    }

    public Boolean fitStandard(String Model, double milage){
        if (Model.equals("Sedan") && (milage >= 50)){
            return true;
        } else if (Model.equals("SUV") && (milage >= 40)){
            return true;
        } else if (Model.equals("Truck") && (milage >= 30)){
            return true;
        } else {
            return false;
        }
    }
}