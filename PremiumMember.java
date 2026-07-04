//subclass PremiumMember
public class PremiumMember extends GymMember
{
    //Declaration statement
    
    private final double premiumCharge;
    private String personalTrainer;
    private boolean isFullPayement;
    private double paidAmount;
    private double discountAmount;
    
    //Constructor
    
    public PremiumMember(int id,String name,String location,String phone,String email,String gender,String DOB,String membershipStartDate
    ,String personalTrainer)
    {
        super(id,name,location,phone,email,gender,DOB,membershipStartDate);
        this.premiumCharge=50000;                      //set the default value as 50000 
        this.paidAmount=0;                             //set the default value as 0 
        this.isFullPayement=false;                     //set the default value as fasle 
        this.discountAmount=0;                         //set the default value as 0 
        this.personalTrainer=personalTrainer;
    }
    
    //accessor method
    public double getPremiumCharge()
    {
        return this.premiumCharge;
    }
    
    public String getPersonalTrainer()
    {
        return this.personalTrainer;
    }
    
    public boolean getIsFullPayement()
    {
        return this.isFullPayement;
    }
    
    public double getPaidAmount()
    {
        return this.paidAmount;
    }
    
    public double getDiscountAmount()
    {
        return this.discountAmount;
    }
    
    //implementing abstract method 
    @Override
    public void markAttendance()
    {
        attendance++;                                           //increases the attendance by 1
        loyaltyPoints += 10;                                    //increases the loyalty point by 5
    }
    
    //method to pay due amount
    public String payDueAmount(double paidAmount)
    {
        if(isFullPayement)                                  //checks weather the isFullPayement is true or not
        {
            return "Payment is already complete.";
        }
        
        if(this.paidAmount+paidAmount>premiumCharge)
        {
            return "Payment exceeds the total cost. Please ask for refund.";
        }
        
        this.paidAmount+=paidAmount;                            //adds paid amount to total paid
        if(this.paidAmount==premiumCharge)                      //checks if the premiumcharge is paid or not
        {
            isFullPayement=true;
        }
        else
        {
            isFullPayement=false;
        }
        double remainingAmount = premiumCharge - this.paidAmount;
        
        return "Payement Successful. Remaining amount to be paid: "+remainingAmount;
    }
    
    public void calculateDiscount()
    {
        if(isFullPayement)                                 //checks weather the isFullPayement is true or not
        {
            discountAmount=0.10*premiumCharge;
            System.out.println("Discount amount calculated. Discount= "+discountAmount);
        }
        else
        {
            discountAmount=0;
            System.out.println("No discount available.");
        }
    }
    
    //method to revert the premium members
    public void revertPremiumMember()
    {
        super.resetMember();                                    //calling the resetMember() method from parent class
        this.personalTrainer="";                                //set the default value as empty
        this.isFullPayement=false;                               //set the default value as fasle
        this.paidAmount=0;                                      //set the default value as 0
        this.discountAmount=0;                                  //set the default value as 0
    }
    
    //display method for PremiumMember
    @Override
    public void display()
    {
        super.display();                                      //calling the display() method from parent class
        System.out.println("Your personal trainer is: "+personalTrainer);
        System.out.println("The paid amount is: "+paidAmount);
        System.out.println("The discount amount is: "+discountAmount);
        
        if(!isFullPayement)                                   //checks weather the isFullPayement is false or not
        {
            System.out.println("No discount available.");
        }
    }
}
