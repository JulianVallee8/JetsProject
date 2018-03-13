public class BusinessJetImpl extends Jet implements BusinessJet{
  public BusinessJetImpl(String model, double speed, int range, long price){
  super(model, speed, range, price);
  }

  public void loadBusiness(){
    System.out.println("Time to load Business passengers");
  }




}
