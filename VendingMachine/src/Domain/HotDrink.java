package Domain;

public class HotDrink extends Product{
    double temperature;
    public HotDrink(String name, int price, double temperature1) {
        super(name, price, new PrType("HotDrink"));
        this.temperature = temperature1;
        
    }

    @Override
    public String toString(){
        return super.toString() + ": temperature = " + this.temperature;

    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    
   
}
