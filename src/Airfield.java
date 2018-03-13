import java.util.Scanner;

public class Airfield {

	Jet[] jets = new Jet[100];

	public Airfield() {

		Jet delta = new AirlinerJetImpl("B777", 550, 10375, 275_600_000);
		Jet ant = new CargoJetImpl("An225", 525.0, 9570, 225_000_000L);
		Jet jtv = new BusinessJetImpl("G450", 548, 4834, 40_000_000);
		Jet fal = new JetImpl("F900", 590, 4598, 43_00_000);
		Jet ccx = new BusinessJetImpl("CiteX", 600, 3700, 22_000_000);

		jets[0] = delta;
		jets[1] = ant;
		jets[2] = jtv;
		jets[3] = fal;
		jets[4] = ccx;
	}

	public void jetList() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				System.out.println(jets[i].getModel());
			}
		}
	}

	public void flyJets() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				jets[i].fly();
			}
		}
	}

	public Jet fastestJet(){
    Jet fastest = jets[0];
    for (int i = 1; i < jets.length; i++){
      if(jets[i] != null){
        if (jets[i].getSpeed() > fastest.getSpeed()){
          fastest = jets[i];
      }
    }
     
  }
	return fastest;
}
    public void getSpeedInMach() {
    for(int i =0; i < jets.length; i++){
        if(jets[i] != null){
          jets[i].getSpeedInMach();
        }
    }
    
  }
  

	public void getLongestRange() {
		Jet longest = jets[0];
		for (int i = 1; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getRange() > longest.getRange()) {
					longest = jets[i];
				}
			}
		}
		System.out.println(longest.getModel() + "is the aircraft with the longest range. It can fly  "
				+ longest.getRange() + "miles.");
	}

	public void addJet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide the aircraft model: ");
		String model = sc.next();

		System.out.println("Provide the aircraft speed: ");
		Double speed = sc.nextDouble();

		System.out.println("Provide the aircraft range: ");
		int range = sc.nextInt();

		System.out.println("Provide the aircraft price: ");
		long price = sc.nextLong();

		Jet userjet = new JetImpl(model, speed, range, price);
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = userjet;
				break;
			}
		}

	}
}
