public class CargoJetImpl extends Jet implements CargoJet{
  public CargoJetImpl(String model, double speed, int range, long price){
    super(model, speed, range, price);
  }

  public void loadCargo(){
    System.out.println("Time to load the cargo");
  }
}
