public class ParkingMeter
{
   private int parkingPaid;
   
   public ParkingMeter(int parkingPaid) 
   {
		this.parkingPaid = parkingPaid;
   }
   public void setParkingPaid(int parkingPaid)
   {
      this.parkingPaid = parkingPaid;
   }
   public int getParkingPaid()
   {
      return parkingPaid;
   }
}