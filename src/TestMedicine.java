import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		Random random = new Random();
		
		Tablet coughTablet = new Tablet(25, "21/02/2025");
		Syrup coughSyrup = new Syrup(40, "22/04/2023");
		Tablet genericTablet = new Tablet(25, "21/08/2025");
		Syrup genericSyrup = new Syrup(40, "22/05/2023");
		Ointment genericOintmet = new Ointment(40, "22/07/2023");
		Medicine[] listOfMedicine = {coughTablet, coughSyrup, genericTablet, genericSyrup, genericOintmet};
		
		for(Medicine med: listOfMedicine) {
			med.displayLabel();
			med.getDetails();
			System.out.println();
		}
		
		int medicineToBeCreated = random.nextInt(3);
		
		System.out.println("Med to be created Random: ");
		switch(medicineToBeCreated) {
		case 0:
			Tablet newTablet = new Tablet(1, "01/01/2025");
			newTablet.displayLabel();
			break;
		case 1:
			Syrup newSyrup = new Syrup(2, "22/04/2025");
			newSyrup.displayLabel();
			break;
		case 2:
			Ointment newOintment = new Ointment(3, "22/07/2023");
			newOintment.displayLabel();
			break;
		}
	}

}
