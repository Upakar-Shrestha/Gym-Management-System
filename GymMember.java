//Parent abstract class GymMember
public abstract class GymMember
{
    //Declaration Statements
    
    protected int id;                                                                
    protected String name;
    protected String location;
    protected String phone;
    protected String email;
    protected String gender;
    protected String DOB;
    protected String membershipStartDate;
    protected int attendance;
    protected double loyaltyPoints;
    protected boolean activeStatus;
    
    
    //Constructor 

    public GymMember(int id,String name,String location,String phone,String email,String gender,String DOB,String membershipStartDate)
    {
        this.id=id;
        this.name=name;
        this.location=location;
        this.phone=phone;
        this.email=email;
        this.gender=gender;
        this.DOB=DOB;
        this.membershipStartDate=membershipStartDate;
        this.attendance=0;               //initialized to 0 as default
        this.loyaltyPoints=0;            //initialized to 0 as default
        this.activeStatus=false;         //initialized to false as default
    }
    
    
    //accessor method 
    
    public int getId()
    {
        return this.id;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getLocation()
    {
        return this.location;
    }
    
    public String getPhone()
    {
        return this.phone;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public String getGender()
    {
        return this.gender;
    }
    
    public String getDOB()
    {
        return this.DOB;
    }
    
    public String getMembershipStartDate()
    {
        return this.membershipStartDate;
    }
    
    public int getAttendance()
    {
        return this.attendance;
    }
    
    public double getLoyaltyPoints()
    {
        return this.loyaltyPoints;
    }
    
    public boolean getActiveStatus()
    {
        return this.activeStatus;
    }
    
    //abstract method to track attendance
    public abstract void markAttendance();
    
    //method to activate or renew a membership
    public void activateMembership()
    {
        if(!activeStatus)                             //checks wether the active status is false or not
        {
            activeStatus = true;                                                 //sets the acivestatus to true          
            System.out.println("Membership has been activated.");
        }
        else
        {
            System.out.println("Membership is already activated.");             //incase the membership is already activated
        }
    }
    
    //method to deactivate or pause a membership
    public void deactivateMembership()
    {
        if(activeStatus)                                                  //checks wether the active status is true or not
        {
            activeStatus = false;                                                //sets the acivestatus to false          
            System.out.println("Membership has been deactivated.");
        }
        else
        {
            System.out.println("Membership is already deactivated.");             //incase the membership is already deactivated
        }
        
    }
    
    //method to reset membership
    public void resetMember()
    { 
        this.activeStatus=false;                             //sets the acivestatus to false  
        this.attendance=0;                                   //sets the attendance to 0  
        this.loyaltyPoints=0;                                //sets the loyaltypoints to o  
    }
    
    //display method for GymMember 
    public void display()
    {
        //printing statement
        System.out.println("<----------------------------------->");
        System.out.println("The member's ID is: "+id);
        System.out.println("The member's name is: "+name);
        System.out.println("The member's location is: "+location);
        System.out.println("The member's phone number is: "+phone);
        System.out.println("The member's email is: "+email);
        System.out.println("The member's gender is: "+gender);
        System.out.println("The member's DOB is: "+DOB);
        System.out.println("The member's start date is: "+membershipStartDate);
        System.out.println("The member's attendance is: "+attendance);
        System.out.println("The member's loyalty points is: "+loyaltyPoints);
        System.out.println("The member's active status is: "+activeStatus);
    }
}
