package Train;
import java.util.Scanner;
import java.util.ArrayList;
public class TrainSchedule{
	public static void main(String[] args){
		ArrayList trainList = new ArrayList<Train>();
		
		Train mumbaiExpress = new Train();
		mumbaiExpress.initialize(123,"Mumbai Express","Chennai","Mumbai","06:00 AM","10:AM");
		trainList.add(mumbaiExpress);
		
		Train maduraiExpress = new Train();
		maduraiExpress.initialize(456,"Madurai Express","Kovilpatti","Madurai","07:00 AM","10:29 AM");
		trainList.add(maduraiExpress);
		
		
		Train nagercoilExpress = new Train();
		nagercoilExpress.initialize(678,"Nagercoil Express","Virudhunagar","Nagercoil","08:00 AM","12:00 PM");
		trainList.add(nagercoilExpress);
		
		Train vaigaiExpress = new Train();
		vaigaiExpress.initialize(246,"Vaigai Express","Madurai","Trichy","09:00 AM","1:00 AM");
		trainList.add(vaigaiExpress);
		
		System.out.println("Please enter your destination----->");
		Scanner trainScanner = new Scanner(System.in);
		String dest = trainScanner.next();
		
		for(int i = 0;i<trainList.size();i++){
			Train currentTrain = (Train)trainList.get(i);
			if(currentTrain.destination.equalsIgnoreCase(dest)){
				currentTrain.print();
			}
		}
		
		}
}