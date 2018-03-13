import java.util.Scanner;

public class JetsApplication{



  public static void main(String[] args) {
		 Airfield kyip = new Airfield();
     Scanner sc = new Scanner(System.in);

    int userinput;

    String menuArray[] = { "1. List Fleet", "2. Fly all jets", "3. View fastest jet "
    , "4. View jet with longest range", "5. Load all Cargo Jets", "6. Dogfight!"
    , "7. Add a jet to Fleet", "8. Quit"};

    do{
      System.out.println("Choose from the following:");

      for (int i = 0; i < menuArray.length; i++){
        System.out.println(menuArray[i]);
      }
      userinput = sc.nextInt();

      switch(userinput) {
        case 1:
          kyip.jetList();
          break;
        case 2:
          kyip.flyJets();
          break;
        case 3:
          Jet j = kyip.fastestJet();
          System.out.println("The fastest jet is " + j);
          
          break;
        case 4:
          kyip.getLongestRange();
          break;
        case 5:
          break;
        case 6:
          break;
        case 7:
          kyip.addJet();
          break;
        case 8:
          break;
        }
      }while(userinput != 8);
      System.out.println("See ya later");

      sc.close();
    }

}
