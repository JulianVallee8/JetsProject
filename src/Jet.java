public class Jet{
  private String model;
  private double speed;
  private int range;
  private long price;

  public Jet(String model, double speed, int range, long price){
    this.model = model;
    this.speed = speed;
    this.range = range;
    this.price = price;
  }


  public void fly(){
    double flightTime = speed/range;
    System.out.println("This model is a " + model + ". It flies at a speed of "
    + speed + "mph. Its range is " + range + " miles. At a price of $" + price);
    System.out.println("The flight time is " + flightTime);
  }

  public double getSpeedInMach() {
          double result = speed * 0.00130332;
          return result;
      }

  public String getModel() {
          return model;
      }

  public void setModel(String model) {
          this.model = model;
      }

  public double getSpeed() {
          return speed;
      }

  public void setSpeed(double speed) {
          this.speed = speed;
      }

  public int getRange() {
          return range;
      }

  public void setRange(int range) {
          this.range = range;
      }

  public long getPrice() {
          return price;
      }

  public void setPrice(long price) {
          this.price = price;
      }


@Override
public String toString() {
	return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
}
  
  }
