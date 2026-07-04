//subclass RegularMember
public class RegularMember extends GymMember
{
    //Declaration Statements
    
    private final int attendanceLimit;
    private boolean isEligibleForUpgrade;
    private String removalReason;
    private String referralSource;
    private String plan;
    private double price;
    
    //Constructor
    public RegularMember(int id,String name,String location,String phone,String email,String gender,String DOB,String 
                        membershipStartDate,String referralSource)
    {
        super(id,name,location,phone,email,gender,DOB,membershipStartDate);  //calls the constructor from super class
        this.isEligibleForUpgrade=false;            //set the default value as fasle 
        this.attendanceLimit=30;                    //sets the default value as 30
        this.plan="basic";                          //sets the default value as "basic"
        this.price=6500;                            //sets the default value as 6500
        this.removalReason="";                      //sets the default value as ""
        this.referralSource = referralSource;
    }
    
    //accessor method
    
    public int getAttendanceLimit()
    {
        return this.attendanceLimit;
    }
    
    public boolean getIsEligibleForUpgrade()
    {
        return this.isEligibleForUpgrade;
    }
    
    public String getRemovalReason()
    {
        return this.removalReason;
    }
    
    public String getReferralSource()
    {
        return this.referralSource;
    }
    
    public  String getPlan()
    {
        return this.plan;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    
    
    //implementing abstract method 
    @Override
    public void markAttendance()
    {
        attendance++;                                   //increases the attendance by 1
        loyaltyPoints += 5;                             //increases the loyalty point by 5
        
        if(attendance>=attendanceLimit)                 //checks whether the attendance greater than equal to the attendance limit
        {
            isEligibleForUpgrade=true;                  //sets isEligibleForUpgrade to true
        }
    }
    
    //method to get price acc to plan
    public double getPlanPrice(String plan)
    {
            //implementing swtch case
            switch(plan.toLowerCase())
            {
                case "basic":           //for basic plan
                    return 6500;
                    //break;
                    
                case "standard":        //for standard plan
                    return 12500;
                    //break;
                    
                case "deluxe":          //for deluxe plan
                    return 18500;
                    //break;
                    
                default:                //if invalid plan
                    return -1;
            }
    }
    
    //method to upgrade plan
    public String upgradePlan(String plan)
    {
        if(!isEligibleForUpgrade)                     //checks if isEligibleForUpgrade is set to false
        {
            return "Sorry! You are not eligible for an upgrade.";
        }
        if(plan.equals(this.plan))                      //if the user selects the same plan
        {
            return "You are already subscribed to this plan.";
        }
        
        double price=getPlanPrice(plan);                        //gets the price of new plan
        if(price==-1)                       
        {
            return "Invalid plan!!";
        }
        
        //upgrading the plan
        this.plan=plan;
        this.price=price;
        return "Your plan is successfully upgraded.";
    }
    
    //method to revert membership
    public void revertRegularMember(String removalReason)
    {
        super.resetMember();                                //calling the resetMember() method from parent class
        this.isEligibleForUpgrade=false;                    //set the default value as fasle 
        this.plan="basic";                                  //sets the default value as "basic"
        this.price=6500;                                    //sets the default value as 6500
        this.removalReason=removalReason;
    }
    
    //display method for Regularmember
    @Override
    public void display()
    {
        super.display();                                      //calling the display() method from parent class
        System.out.println("The chosen plan is: "+plan);
        System.out.println("The price of the plan is: "+price);
        if(removalReason!="")                                  //checks weather the removalreason is empty or not
        {
            System.out.println("The reason for removal is: "+removalReason);
        }
    }
}
