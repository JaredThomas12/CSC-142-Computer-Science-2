public class ParkingTicketDemo
{
   public static void main(String[] args)
   {
		ParkedCar car = new ParkedCar("Honda", "Accord",
				"Gold", "AAA 1111", 120);
		ParkingMeter meter = new ParkingMeter(60);
		PoliceOfficer officer = new PoliceOfficer(
				"Officer Chen", "14203");
      ParkingTicket p1 = new ParkingTicket(car, officer, 120);

      System.out.println(p1);
   }
}