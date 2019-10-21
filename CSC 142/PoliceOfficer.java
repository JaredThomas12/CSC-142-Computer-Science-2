public class PoliceOfficer
{
   private String officer;
   private String badgeNumber;
   
   public PoliceOfficer(String officer, String badgeNumber) 
   {
			
		this.officer = officer;
		this.badgeNumber = badgeNumber;
    
	}
   public void setOfficer(String officer)
   {
      this.officer = officer;
   }
   public String getOfficer()
   {
      return officer;
   }
   public void setBadgeNumber(String badgeNumber)
   {
      this.badgeNumber = badgeNumber;
   }
   public String getBadgeNumberZ()
   {
      return badgeNumber;
   }
}