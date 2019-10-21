import java.util.Scanner;

public class ParkedCar
{
   private String make;
   private String model;
   private String color;
   private String license;
   private int minutesParked;
   
   public ParkedCar(String make, String model, String color,
				String license, int minutesParked) 
   {
			
	   this.make = make;
		this.model = model;
		this.color = color;
		this.license = license;
		this.minutesParked = minutesParked;
   }
   public void setMake(String make)
   {
      this.make = make;
   }
   public String getMake()
   {
      return make;
   }
   public void setModel(String model)
   {
      this.model = model;
   }
   public String getModel()
   {
      return model;
   }
   public void setColor(String color)
   {
      this.color = color;
   }
   public String getColor()
   {
      return color;
   }
   public void setLicense(String license)
   {
      this.license = license;
   }
   public String getLicense()
   {
      return license;
   }
   public void setMinutesParked(int minutesParked)
   {
      this.minutesParked = minutesParked;
   }
   public int getMinutesParked()
   {
      return minutesParked;
   }
}
   