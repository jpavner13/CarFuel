public class FitStandard{

    public static void main(String[] args) {

        Car car1 = new Car("Takk" , "Sedan" , 40 , 9.5);
        Car car2 = new Car("Beklager" , "Sedan" , 45 , 7.5);
        Car car3 = new Car("Vakker" , "SUV" , 60 , 7.5);
        Car car4 = new Car("Stygg" , "SUV" , 50 , 9.0);
        Car car5 = new Car("Vanskellig" , "Truck" , 60 , 8.75);
        Car car6 = new Car("Lastebil" , "Truck" , 70 , 5.5);

        System.out.println(car1.getModel() + ": " + car1.calculateGasMilage() + " Miles per gallon.");
        System.out.println(car1.fitStandard(car1.gettype(), car1.calculateGasMilage()));
        System.out.println(car2.getModel() + ": " + car2.calculateGasMilage() + " Miles per gallon.");
        System.out.println(car2.fitStandard(car2.gettype(), car2.calculateGasMilage()));
        System.out.println(car3.getModel() + ": " + car3.calculateGasMilage() + " Miles per gallon.");
        System.out.println(car3.fitStandard(car3.gettype(), car3.calculateGasMilage()));
        System.out.println(car4.getModel() + ": " + car4.calculateGasMilage() + " Miles per gallon.");
        System.out.println(car4.fitStandard(car4.gettype(), car4.calculateGasMilage()));
        System.out.println(car5.getModel() + ": " + car5.calculateGasMilage() + " Miles per gallon.");
        System.out.println(car5.fitStandard(car5.gettype(), car5.calculateGasMilage()));
        System.out.println(car6.getModel() + ": " + car6.calculateGasMilage() + " Miles per gallon.");
        System.out.println(car6.fitStandard(car6.gettype(), car6.calculateGasMilage()));
    }
}