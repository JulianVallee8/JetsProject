public class AirlinerJetImpl extends Jet implements AirlinerJet{
  public AirlinerJetImpl(String model, double speed, int range, long price){
    super(model, speed, range, price);
  }

  public void loadPassenger(){
    System.out.println("Time to load passengers");
  }




}
