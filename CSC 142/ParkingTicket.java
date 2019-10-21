public class ParkingTicket
{
   private int minutesParked;
   private int parkingPaid;
   private ParkedCar ParkedCar;
   private PoliceOfficer officer;
   private double fine;
   private double fineOne = 25.0;
	private double hourlyFine = 10.0;
   
   public ParkingTicket(ParkedCar ParkedCar, PoliceOfficer officer, int minutesParked) 
   {
		this.ParkedCar = ParkedCar;
      String make = ParkedCar.getMake();
      String model =ParkedCar.getModel();
      String license = ParkedCar.getLicense();
      String color = ParkedCar.getColor();
      minutesParked = ParkedCar.getMinutesParked();
      
		this.officer = officer;
     
		this.minutesParked = minutesParked;
      
	}
   //parked car
   public ParkedCar getParkedCar()
   {
      return ParkedCar;
   }
   public void setParkedCar(ParkedCar ParkedCar)
   {
		this.ParkedCar = ParkedCar;
	}
   //officer
   public PoliceOfficer getOfficer()
   {
		return officer;
	}
   public void setOfficer(PoliceOfficer officer)
   {
		this.officer = officer;
	}
   //parking meter
   public void setParkingPaid(int parkingPaid)
   {
      this.parkingPaid = parkingPaid;
   }
   public int getParkingPaid()
   {
      return parkingPaid;
   }
   public void Fine() 
   {
		double hours = minutesParked / 60.0;
		int hoursAsInt = (int) hours;
      if ((hours - hoursAsInt) > 0)
      {
			hoursAsInt++;
		}
			fine = fineOne;
			fine += (hoursAsInt * hourlyFine);
		}
   public double getFine() 
   {
		return fine;
	}
   public void setFine(double fine)
   {
		this.fine = fine;
	}
   public String toString()
   {
		return "ParkingTicket [car=" + ParkedCar + ", officer=" + officer
					+ ", fine=" + fine + ", minutes=" + minutesParked
					+ ", Initial Fine=" + fineOne + ", Hourly Fine="
					+ hourlyFine + "]";
		}

}