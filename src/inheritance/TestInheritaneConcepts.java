package inheritance;

public class TestInheritaneConcepts {

	public static void main(String[] args) {

		Developer dev1 = new Developer();

		dev1.pay();
		dev1.bonus();
		dev1.fourOoneK();

		SalesPerson salesPerson1 = new SalesPerson();

		salesPerson1.pay();
		salesPerson1.bonus();
		salesPerson1.fourOoneK();
		salesPerson1.profitSharing();
		
		
		Clerk clerk1 = new Clerk();
		clerk1.pay();
		clerk1.bonus();
		
		
	}

}
