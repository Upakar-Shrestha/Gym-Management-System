
import java.util.ArrayList;                             //importing java util package for arraylist

//importing swing and awt package
import javax.swing.JFrame;                              
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class GymGUI implements ActionListener
{
    //frame
    JFrame fr;
    //labels
    JLabel heading1,heading2,heading3,heading4,heading5,heading6,heading7,heading8,regID,regName,regPhone,regLocation,regGender,regEmail,regDOB,
        regMemStartdate,premID,premName,premPhone,premLocation,premGender,premEmail,premDOB,premMemStartdate,Plan,
        Price,Referralsrc,Removalreg,Removalprem,Paidamount,Trainername,premiumCharge,discountAmount,imgLabel,activateId,
        deactivateId,markAttID,revertregId,revertpremId;
    //textfields    
    JTextField regIDTF,premIDTF,regNameTF,premNameTF,regPhoneTF,premPhoneTF,regLocationTF,premLocationTF,
        regEmailTF,premEmailTF,priceTF,paidamountTF,trainernameTF,premiumChargeTF,discountAmountTF,activateIdTF,
        deactivateIdTF,markAttIDTF,revertregIdTF,revertpremIdTF;
    //radiobuttons    
    JRadioButton regMale,regFemale,premMale,premFemale;
    //buttongroup
    ButtonGroup regbg,prembg;
    //cpmbobox
    JComboBox regdobYearComboBox,regdobMonthComboBox,regdobDayComboBox,regmsYearComboBox,regmsMonthComboBox,regmsDayComboBox,planComboBox,
        premdobYearComboBox,premdobMonthComboBox,premdobDayComboBox,premmsYearComboBox,premmsMonthComboBox,premmsDayComboBox;
    //textarea
    JTextArea referralsrcTA,removalregTA,removalpremTA;
    //panels
    JPanel home,toppanel,bottompanel,toppanelreg,regular,toppanelprem,premium,activateMembership,toppanelAct,
        deactivateMembership,toppanelDea,markAtt,toppanelMark,toppanelRevreg,toppanelRevprem,revertregMembership,revertpremMembership,
        toppanelDis,displayMem;
    //buttons
    JButton addregularBTN,addpremiumBTN,activatemsBTN,deactivatemsBTN,markattendanceBTN,revertmemBTN,displayBTN,
        clearBTN,homeBTNreg,homeBTNprem,homeBTNact,homeBTNdea,homeBTNmark,homeBTNrevreg,homeBTNrevprem,submitregBTN,submitpremBTN,
        submitactBTN,submitdeaBTN,submitmarkBTN,revpremBTN,revregBTN,submitRevreg,submitRevprem,homeBTNdis,displayregMem,displaypremMem;
    
    ArrayList<GymMember> a = new ArrayList<GymMember>();        //creating generic arraylist
    public GymGUI()
    {
         
        
        
        //<------------------titlebar for frame----------------------------->
        fr = new JFrame("Gym Management System");                    
                                   //changes the image icon
        
    
        //<-------------------top panel for home page--------------------->
        toppanel = new JPanel();
        toppanel.setLayout(null);
        toppanel.setBounds(0,0,900,100);
        toppanel.setBackground(Color.BLACK);
        
        //header for regular member
        heading1 = new JLabel("TITANFIT");                    
        heading1.setFont(new Font("Arial",Font.BOLD,30));
        heading1.setForeground(Color.white);
        heading1.setBounds(370,30,250,50);
    
        //adding heading to top panel
        toppanel.add(heading1);
    
        
        //<--------------------------main panel for home page------------------------>
        home = new JPanel();
        home.setLayout(null);
        home.setBounds(0,0,900,530); 
        home.setBackground(new Color(0xE5E5E5));
        
        heading2 = new JLabel("WELCOME!!");
        heading2.setFont(new Font("Arial",Font.BOLD,50));
        heading2.setBounds(300,100,400,100);
        
        ImageIcon img = new ImageIcon("logo2.png");                  //creates a image icon
        imgLabel = new JLabel(img);
        imgLabel.setBounds(250,200,400,250);
        
        home.add(heading2);//adding heading2 in home panel
        home.add(imgLabel);//adding img label in home panel
        
        //------------------------top panel for REGULAR MEMBER------------------------->
        toppanelreg = new JPanel();
        toppanelreg.setLayout(null);
        toppanelreg.setBounds(0,0,900,100);
        toppanelreg.setBackground(Color.BLACK);
        
        //header for regular member
        heading1 = new JLabel("REGULAR MEMBER");                    
        heading1.setFont(new Font("Arial",Font.BOLD,25));
        heading1.setForeground(Color.white);
        heading1.setBounds(340,30,250,50); 
        
        //adding heading to panel2
        toppanelreg.add(heading1);  
        
        
        //-----------------------------main panel for regular member------------------------------>
        regular = new JPanel();
        regular.setLayout(null);
        regular.setBounds(0,0,900,530);
        regular.setBackground(new Color(0x90E0EF));
        
        //creating label id
        regID = new JLabel("ID:");                               
        regID.setFont(new Font("Arial",Font.BOLD,16));
        regIDTF = new JTextField("");
        
        //creating label Name
        regName = new JLabel("Name:");                             
        regName.setFont(new Font("Arial",Font.BOLD,16));
        regNameTF = new JTextField("");
        
        //creating label phone
        regPhone = new JLabel("Phone:");                            
        regPhone.setFont(new Font("Arial",Font.BOLD,16));
        regPhoneTF = new JTextField("");
        
        //creating label location
        regLocation = new JLabel("Location:");                         
        regLocation.setFont(new Font("Arial",Font.BOLD,16));
        regLocationTF = new JTextField("");
        
        //creating label gender
        regGender = new JLabel("Gender:");                           
        regGender.setFont(new Font("Arial",Font.BOLD,16));
        regMale = new JRadioButton("Male");
        regMale.setFont(new Font("Arial",Font.BOLD,14));
        regFemale = new JRadioButton("Female");
        regFemale.setFont(new Font("Arial",Font.BOLD,14));
        
        //creating label email 
        regEmail = new JLabel("Email:");                           
        regEmail.setFont(new Font("Arial",Font.BOLD,16));
        regEmailTF = new JTextField("");
        
        //creating label DOB
        regDOB = new JLabel("DOB:");                              
        regDOB.setFont(new Font("Arial",Font.BOLD,16));
        String[] dobyear = {"2000","2001","2002","2003","2004","2005","2006"};
        regdobYearComboBox = new JComboBox(dobyear);
        String[] dobmonth = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        regdobMonthComboBox = new JComboBox(dobmonth);
        String[] dobday = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        regdobDayComboBox = new JComboBox(dobday);
        
        //creating label Membership startdate
        regMemStartdate = new JLabel("Membership startdate:");             
        regMemStartdate.setFont(new Font("Arial",Font.BOLD,14));
        String[] msyear = {"2020","2021","2022","2023","2024","2025"};
        regmsYearComboBox = new JComboBox(msyear);
        String[] msmonth = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        regmsMonthComboBox = new JComboBox(msmonth);
        String[] msday = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        regmsDayComboBox = new JComboBox(msday);
        
        //creating label plan
        Plan = new JLabel("Plan:");                            
        Plan.setFont(new Font("Arial",Font.BOLD,16));
        String[] plan = {"Basic","Standard","Deluxe"};
        planComboBox = new JComboBox(plan);
        planComboBox.addActionListener(this);
        
        
        //creating label Price
        Price = new JLabel("Price:");                         
        Price.setFont(new Font("Arial",Font.BOLD,16));
        priceTF = new JTextField("");
        priceTF.setEditable(false);
        
        //creating label Referral Source
        Referralsrc = new JLabel("Referral Source:");                            
        Referralsrc.setFont(new Font("Arial",Font.BOLD,16));
        referralsrcTA= new JTextArea("");
        
        //creating a button to go back to home page
        homeBTNreg = new JButton("HOME");
        homeBTNreg.addActionListener(this);
        
        //creating a button to submit
        submitregBTN = new JButton("SUBMIT");
        submitregBTN.addActionListener(this);
        
        //adding buttongroup for radiobutton
        regbg = new ButtonGroup();                        
        regbg.add(regMale);
        regbg.add(regFemale);
        
        //arranging the different components
        regID.setBounds(40,110,80,50);
        regIDTF.setBounds(110,120,300,30);
        regName.setBounds(440,110,80,50);
        regNameTF.setBounds(530,120,300,30);
        regPhone.setBounds(40,150,70,50);
        regPhoneTF.setBounds(110,160,300,30);
        regLocation.setBounds(440,150,80,50);
        regLocationTF.setBounds(530,160,300,30);
        regGender.setBounds(40,195,80,50);
        regMale.setBounds(140,205,100,30);
        regFemale.setBounds(240,205,100,30);
        regEmail.setBounds(40,245,80,50);
        regEmailTF.setBounds(110,255,300,30);
        regDOB.setBounds(440,195,80,50);
        regdobYearComboBox.setBounds(530,205,95,30);
        regdobMonthComboBox.setBounds(630,205,95,30);
        regdobDayComboBox.setBounds(730,205,95,30);
        regMemStartdate.setBounds(440,240,200,50);
        regmsYearComboBox.setBounds(610,250,70,30);
        regmsMonthComboBox.setBounds(685,250,70,30);
        regmsDayComboBox.setBounds(760,250,70,30);
        Plan.setBounds(40,290,130,50);
        planComboBox.setBounds(170,300,240,30);
        Price.setBounds(440,290,120,50);
        priceTF.setBounds(570,300,260,30);
        Referralsrc.setBounds(40,330,130,50);
        referralsrcTA.setBounds(180,345,230,130);
        homeBTNreg.setBounds(40,485,100,30);
        submitregBTN.setBounds(730,485,100,30);
        
        //adding the labels,textfields,etc to the regular                                               
        regular.add(regID);
        regular.add(regIDTF);
        regular.add(regName);
        regular.add(regNameTF);
        regular.add(regPhone);
        regular.add(regPhoneTF);
        regular.add(regLocation);
        regular.add(regLocationTF);
        regular.add(regGender);
        regular.add(regMale);
        regular.add(regFemale);
        regular.add(regEmail);
        regular.add(regEmailTF);
        regular.add(regDOB);
        regular.add(regdobYearComboBox);
        regular.add(regdobMonthComboBox);
        regular.add(regdobDayComboBox);
        regular.add(regMemStartdate);
        regular.add(regmsYearComboBox);
        regular.add(regmsMonthComboBox);
        regular.add(regmsDayComboBox );
        regular.add(Plan);
        regular.add(planComboBox);
        regular.add(Price);
        regular.add(priceTF);
        regular.add(Referralsrc);
        regular.add(referralsrcTA);
        regular.add(homeBTNreg);
        regular.add(submitregBTN);
        
        regular.setVisible(false);//setting visibilty to false as default
        
        
        //<-----------------------------top panel for premium member--------------------------------->
        toppanelprem = new JPanel();
        toppanelprem.setLayout(null);
        toppanelprem.setBounds(0,0,900,100);
        toppanelprem.setBackground(Color.BLACK);
        
        //header for regular member
        heading3 = new JLabel("PREMIUM MEMBER");                    
        heading3.setFont(new Font("Arial",Font.BOLD,25));
        heading3.setForeground(Color.white);
        heading3.setBounds(340,30,250,50); 
        
        //adding heading to panel2
        toppanelprem.add(heading3);  
        
        
        //-----------------------------main panel for premium member------------------------------>
        premium = new JPanel();
        premium.setLayout(null);
        premium.setBounds(0,0,900,530);
        premium.setBackground(new Color(0x90E0EF));
        
        //creating label id
        premID = new JLabel("ID:");                               
        premID.setFont(new Font("Arial",Font.BOLD,16));
        premIDTF = new JTextField("");
        
        //creating label Name
        premName = new JLabel("Name:");                             
        premName.setFont(new Font("Arial",Font.BOLD,16));
        premNameTF = new JTextField("");
        
        //creating label phone
        premPhone = new JLabel("Phone:");                            
        premPhone.setFont(new Font("Arial",Font.BOLD,16));
        premPhoneTF = new JTextField("");
        
        //creating label location
        premLocation = new JLabel("Location:");                         
        premLocation.setFont(new Font("Arial",Font.BOLD,16));
        premLocationTF = new JTextField("");
        
        //creating label gender
        premGender = new JLabel("Gender:");                           
        premGender.setFont(new Font("Arial",Font.BOLD,16));
        premMale = new JRadioButton("Male");
        premMale.setFont(new Font("Arial",Font.BOLD,14));
        premFemale = new JRadioButton("Female");
        premFemale.setFont(new Font("Arial",Font.BOLD,14));
        
        //creating label email 
        premEmail = new JLabel("Email:");                           
        premEmail.setFont(new Font("Arial",Font.BOLD,16));
        premEmailTF = new JTextField("");
        
        //creating label DOB
        premDOB = new JLabel("DOB:");                              
        premDOB.setFont(new Font("Arial",Font.BOLD,16));
        premdobYearComboBox = new JComboBox(dobyear);
        premdobMonthComboBox = new JComboBox(dobmonth);
        premdobDayComboBox = new JComboBox(dobday);
        
        //creating label Membership startdate
        premMemStartdate = new JLabel("Membership startdate:");             
        premMemStartdate.setFont(new Font("Arial",Font.BOLD,14));
        premmsYearComboBox = new JComboBox(msyear);
        premmsMonthComboBox = new JComboBox(msmonth);
        premmsDayComboBox = new JComboBox(msday);
        
        //creating label Paid amount
        Paidamount = new JLabel("Paid Amount: ");
        Paidamount.setFont(new Font("Arial",Font.BOLD,16));
        paidamountTF = new JTextField("");
        
        //creating label Trainer's name
        Trainername = new JLabel("Trainer's Name: ");
        Trainername.setFont(new Font("Arial",Font.BOLD,16));
        trainernameTF = new JTextField("");
        
        //creating label premiumCharge
        premiumCharge = new JLabel("Premium Charge: ");
        premiumCharge.setFont(new Font("Arial",Font.BOLD,16));
        premiumChargeTF = new JTextField("");
        premiumChargeTF.setEditable(false);
        
        //creating label discount amount
        discountAmount = new JLabel("Discount Amount: ");
        discountAmount.setFont(new Font("Arial",Font.BOLD,16));
        discountAmountTF = new JTextField("");
        discountAmountTF.setEditable(false);
 
        //creating a button to go to home page
        homeBTNprem = new JButton("HOME");
        homeBTNprem.addActionListener(this);
        
        //creating a button to submit
        submitpremBTN = new JButton("SUBMIT");
        submitpremBTN.addActionListener(this);
        
        //adding buttongroup for radiobutton
        prembg = new ButtonGroup();                        
        prembg.add(premMale);
        prembg.add(premFemale);
        
        //arranging the different components
        premID.setBounds(30,110,80,50);
        premIDTF.setBounds(110,120,300,30);
        premName.setBounds(440,110,80,50);
        premNameTF.setBounds(530,120,300,30);
        premPhone.setBounds(30,150,70,50);
        premPhoneTF.setBounds(110,160,300,30);
        premLocation.setBounds(440,150,80,50);
        premLocationTF.setBounds(530,160,300,30);
        premGender.setBounds(30,195,80,50);
        premMale.setBounds(140,205,100,30);
        premFemale.setBounds(240,205,100,30);
        premEmail.setBounds(30,245,80,50);
        premEmailTF.setBounds(110,255,300,30);
        premDOB.setBounds(440,195,80,50);
        premdobYearComboBox.setBounds(530,205,95,30);
        premdobMonthComboBox.setBounds(630,205,95,30);
        premdobDayComboBox.setBounds(730,205,95,30);
        premMemStartdate.setBounds(440,240,200,50);
        premmsYearComboBox.setBounds(610,250,70,30);
        premmsMonthComboBox.setBounds(685,250,70,30);
        premmsDayComboBox.setBounds(760,250,70,30);
        Paidamount.setBounds(440,295,140,30);
        paidamountTF.setBounds(550,295,280,30);
        Trainername.setBounds(440,335,140,30);
        trainernameTF.setBounds(570,335,260,30);
        premiumCharge.setBounds(30,295,140,30);
        premiumChargeTF.setBounds(180,295,230,30);
        discountAmount.setBounds(30,335,160,30);
        discountAmountTF.setBounds(180,335,230,30);
        homeBTNprem.setBounds(40,485,100,30);
        submitpremBTN.setBounds(730,485,100,30);
        
        //adding the labels,textfields,etc to the premium                                               
        premium.add(premID);
        premium.add(premIDTF);
        premium.add(premName);
        premium.add(premNameTF);
        premium.add(premPhone);
        premium.add(premPhoneTF);
        premium.add(premLocation);
        premium.add(premLocationTF);
        premium.add(premGender);
        premium.add(premMale);
        premium.add(premFemale);
        premium.add(premEmail);
        premium.add(premEmailTF);
        premium.add(premDOB);
        premium.add(premdobYearComboBox);
        premium.add(premdobMonthComboBox);
        premium.add(premdobDayComboBox);
        premium.add(premMemStartdate);
        premium.add(premmsYearComboBox);
        premium.add(premmsMonthComboBox);
        premium.add(premmsDayComboBox );
        premium.add(Paidamount);
        premium.add(paidamountTF);
        premium.add(Trainername);
        premium.add(trainernameTF);
        premium.add(premiumCharge);
        premium.add(premiumChargeTF);
        premium.add(discountAmount);
        premium.add(discountAmountTF);
        premium.add(homeBTNprem);
        premium.add(submitpremBTN);
    
        premium.setVisible(false);//setting visibilty to false as default
        
        
        
        //------------------------top panel for activate membership------------------------->
        toppanelAct = new JPanel();
        toppanelAct.setLayout(null);
        toppanelAct.setBounds(0,0,900,100);
        toppanelAct.setBackground(Color.BLACK);
        
        //header for activate membership
        heading4 = new JLabel("ACTIVATE MEMBERSHIP");                    
        heading4.setFont(new Font("Arial",Font.BOLD,25));
        heading4.setForeground(Color.white);
        heading4.setBounds(320,30,380,50); 
        
        //adding heading 
        toppanelAct.add(heading4);  
        
        //<---------------------------------main panel for activate membership----------------------------->
        activateMembership = new JPanel();
        activateMembership.setLayout(null);
        activateMembership.setBounds(0,0,900,530);
        activateMembership.setBackground(new Color(0x90E0EF));
        
        
        activateId = new JLabel("MEMBER ID: ");
        activateId.setFont(new Font("Arial",Font.BOLD,20));
        activateIdTF = new JTextField("");
        
        //creating a button to go to home page
        homeBTNact = new JButton("HOME");
        homeBTNact.addActionListener(this);
        
        //creating a button to submit
        submitactBTN = new JButton("SUBMIT");
        submitactBTN.addActionListener(this);
        
        //setting bounds
        activateId.setBounds(200,280,300,70);
        activateIdTF.setBounds(370,290,300,40);
        homeBTNact.setBounds(40,485,100,30);
        submitactBTN.setBounds(730,485,100,30);
        
        
        activateMembership.add(activateId);
        activateMembership.add(activateIdTF);
        activateMembership.add(submitactBTN);
        activateMembership.add(homeBTNact);
        
        activateMembership.setVisible(false);
        
        //------------------------top panel for deactive membership------------------------->
        toppanelDea = new JPanel();
        toppanelDea.setLayout(null);
        toppanelDea.setBounds(0,0,900,100);
        toppanelDea.setBackground(Color.BLACK);
        
        //header for deactivate membership
        heading5 = new JLabel("DEACTIVATE MEMBERSHIP");                    
        heading5.setFont(new Font("Arial",Font.BOLD,25));
        heading5.setForeground(Color.white);
        heading5.setBounds(320,30,380,50); 
        
        //adding heading 
        toppanelDea.add(heading5);  
        
        //<---------------------------------main panel for deactivate membership----------------------------->
        deactivateMembership = new JPanel();
        deactivateMembership.setLayout(null);
        deactivateMembership.setBounds(0,0,900,530);
        deactivateMembership.setBackground(new Color(0x90E0EF));
        
        
        deactivateId = new JLabel("MEMBER ID: ");
        deactivateId.setFont(new Font("Arial",Font.BOLD,20));
        deactivateIdTF = new JTextField("");
        
        //creating a button to go to home page
        homeBTNdea = new JButton("HOME");
        homeBTNdea.addActionListener(this);
        
        //creating a button to submit
        submitdeaBTN = new JButton("SUBMIT");
        submitdeaBTN.addActionListener(this);
        
        //setting bounds
        deactivateId.setBounds(200,280,300,70);
        deactivateIdTF.setBounds(370,290,300,40);
        homeBTNdea.setBounds(40,485,100,30);
        submitdeaBTN.setBounds(730,485,100,30);
        
        deactivateMembership.add(deactivateId);
        deactivateMembership.add(deactivateIdTF);
        deactivateMembership.add(homeBTNdea);
        deactivateMembership.add(submitdeaBTN);
        
        deactivateMembership.setVisible(false);
        
        
        //------------------------top panel for mark attendance------------------------->
        toppanelMark = new JPanel();
        toppanelMark.setLayout(null);
        toppanelMark.setBounds(0,0,900,100);
        toppanelMark.setBackground(Color.BLACK);
        
        //header for mark attendance
        heading6 = new JLabel("MARK ATTENDANCE");                    
        heading6.setFont(new Font("Arial",Font.BOLD,25));
        heading6.setForeground(Color.white);
        heading6.setBounds(320,30,380,50); 
        
        //adding heading 
        toppanelMark.add(heading6);  
        
        //<---------------------------------main panel for mark attendance----------------------------->
        markAtt = new JPanel();
        markAtt.setLayout(null);
        markAtt.setBounds(0,0,900,530);
        markAtt.setBackground(new Color(0x90E0EF));
        
        
        markAttID = new JLabel("MEMBER ID: ");
        markAttID.setFont(new Font("Arial",Font.BOLD,20));
        markAttIDTF = new JTextField("");
        
        //creating a button to go to home page
        homeBTNmark = new JButton("HOME");
        homeBTNmark.addActionListener(this);
        
        //creating a button to submit
        submitmarkBTN = new JButton("SUBMIT");
        submitmarkBTN.addActionListener(this);
        
        //setting bounds
        markAttID.setBounds(200,280,300,70);
        markAttIDTF.setBounds(370,290,300,40);
        homeBTNmark.setBounds(40,485,100,30);
        submitmarkBTN.setBounds(730,485,100,30);
        
        markAtt.add(markAttID);
        markAtt.add(markAttIDTF);
        markAtt.add(homeBTNmark);
        markAtt.add(submitmarkBTN);
        
        markAtt.setVisible(false);
        
        //------------------------top panel for revert reg member------------------------------------------>
        toppanelRevreg = new JPanel();
        toppanelRevreg.setLayout(null);
        toppanelRevreg.setBounds(0,0,900,100);
        toppanelRevreg.setBackground(Color.BLACK);
        
        //header for revert member
        heading7 = new JLabel("REVERT REGULAR MEMBERSHIP");                    
        heading7.setFont(new Font("Arial",Font.BOLD,25));
        heading7.setForeground(Color.white);
        heading7.setBounds(280,30,500,50); 
        
        //adding heading 
        toppanelRevreg.add(heading7);  
        
        //<---------------------------------main panel for revert regular member----------------------------->
        revertregMembership = new JPanel();
        revertregMembership.setLayout(null);
        revertregMembership.setBounds(0,0,900,530);
        revertregMembership.setBackground(new Color(0x90E0EF));
        
        
        revertregId = new JLabel("REGULAR MEMBER ID: ");
        revertregId.setFont(new Font("Arial",Font.BOLD,18));
        revertregIdTF = new JTextField("");
        
        //creating label Removal Reason
        Removalreg = new JLabel("Removal Reason:");                         
        Removalreg.setFont(new Font("Arial",Font.BOLD,16));
        removalregTA = new JTextArea("");
        
        //creating a button to go to home page
        homeBTNrevreg = new JButton("HOME");
        homeBTNrevreg.addActionListener(this);
        
        //creating a button to revert Premium member
        revpremBTN = new JButton("Premium");
        revpremBTN.addActionListener(this);
        
        
        //creating a button to revert Premium member
        submitRevreg = new JButton("Submit");
        submitRevreg.addActionListener(this);
        
        //creating a button to revert regular member
        //revregBTN = new JButton("Regular");
        //revregBTN.addActionListener(this);
        //revregBTN.setVisible(false);
        
        //setting bounds
        revertregId.setBounds(160,200,300,70);
        revertregIdTF.setBounds(370,210,300,40);
        Removalreg.setBounds(160,250,160,50);
        removalregTA.setBounds(370,265,300,130);
        homeBTNrevreg.setBounds(40,485,100,30);
        revpremBTN.setBounds(620,485,100,30);
        //revregBTN.setBounds(620,485,100,30);
        submitRevreg.setBounds(730,485,100,30);
        
        //adding to panel
        revertregMembership.add(revertregId);
        revertregMembership.add(revertregIdTF);
        revertregMembership.add(Removalreg);
        revertregMembership.add(removalregTA);
        revertregMembership.add(homeBTNrevreg);
        revertregMembership.add(revpremBTN);
        //revertregMembership.add(revregBTN);
        revertregMembership.add(submitRevreg);
        
        revertregMembership.setVisible(false);
        
        //------------------------top panel for revert prem member------------------------------------------>
        toppanelRevprem = new JPanel();
        toppanelRevprem.setLayout(null);
        toppanelRevprem.setBounds(0,0,900,100);
        toppanelRevprem.setBackground(Color.BLACK);
        
        //header for revert member
        heading7 = new JLabel("REVERT PREMIUM MEMBERSHIP");                    
        heading7.setFont(new Font("Arial",Font.BOLD,25));
        heading7.setForeground(Color.white);
        heading7.setBounds(280,30,500,50); 
        
        //adding heading 
        toppanelRevprem.add(heading7);
        
        //<---------------------------------main panel for revert premium member----------------------------->
        revertpremMembership = new JPanel();
        revertpremMembership.setLayout(null);
        revertpremMembership.setBounds(0,0,900,530);
        revertpremMembership.setBackground(new Color(0x90E0EF));
        
        
        revertpremId = new JLabel("PREMIUM MEMBER ID: ");
        revertpremId.setFont(new Font("Arial",Font.BOLD,18));
        revertpremIdTF = new JTextField("");
        
        //creating label Removal Reason
        Removalprem = new JLabel("Removal Reason:");                         
        Removalprem.setFont(new Font("Arial",Font.BOLD,16));
        removalpremTA = new JTextArea("");
        
        //creating a button to go to home page
        homeBTNrevprem = new JButton("HOME");
        homeBTNrevprem.addActionListener(this);
        
        //creating a button to revert Premium member
        //revpremBTN = new JButton("Premium");
        //revpremBTN.addActionListener(this);
        //revpremBTN.setVisible(false);
        
        //creating a button to revert Premium member
        submitRevprem = new JButton("Submit");
        submitRevprem.addActionListener(this);
        
        //creating a button to revert regular member
        revregBTN = new JButton("Regular");
        revregBTN.addActionListener(this);
        
        
        //setting bounds
        revertpremId.setBounds(160,200,300,70);
        revertpremIdTF.setBounds(370,210,300,40);
        Removalprem.setBounds(160,250,160,50);
        removalpremTA.setBounds(370,265,300,130);
        homeBTNrevprem.setBounds(40,485,100,30);
        //revpremBTN.setBounds(620,485,100,30);
        revregBTN.setBounds(620,485,100,30);
        submitRevprem.setBounds(730,485,100,30);
        
        //adding to panel
        revertpremMembership.add(revertpremId);
        revertpremMembership.add(revertpremIdTF);
        revertpremMembership.add(Removalprem);
        revertpremMembership.add(removalpremTA);
        revertpremMembership.add(homeBTNrevprem);
        // revertpremMembership.add(revpremBTN);
        revertpremMembership.add(revregBTN);
        revertpremMembership.add(submitRevprem);
        
        revertpremMembership.setVisible(false);
        
        //------------------------top panel for Display method------------------------->
        toppanelDis = new JPanel();
        toppanelDis.setLayout(null);
        toppanelDis.setBounds(0,0,900,100);
        toppanelDis.setBackground(Color.BLACK);
        
        //header for mark attendance
        heading8 = new JLabel("DISPLAY MEMBER");                    
        heading8.setFont(new Font("Arial",Font.BOLD,25));
        heading8.setForeground(Color.white);
        heading8.setBounds(320,30,380,50); 
        
        //adding heading 
        toppanelDis.add(heading8);  
        
        //<---------------------------------main panel for Display method----------------------------->
        displayMem = new JPanel();
        displayMem.setLayout(null);
        displayMem.setBounds(0,0,900,530);
        displayMem.setBackground(new Color(0x90E0EF));
        
        
        displayregMem = new JButton("REGULAR MEMBERS");
        displayregMem.setFont(new Font("Arial",Font.BOLD,15));
        displayregMem.addActionListener(this);
        displaypremMem = new JButton("PREMIUM MEMBERS");
        displaypremMem.setFont(new Font("Arial",Font.BOLD,15));
        displaypremMem.addActionListener(this);
        
        //creating a button to go to home page
        homeBTNdis = new JButton("HOME");
        homeBTNdis.addActionListener(this);
        
        
        //setting bounds
        displayregMem.setBounds(220,280,200,40);
        displaypremMem.setBounds(450,280,200,40);
        homeBTNmark.setBounds(40,485,100,30);
        //submitmarkBTN.setBounds(730,485,100,30);
        
        displayMem.add(displayregMem);
        displayMem.add(displaypremMem);
        displayMem.add(homeBTNmark);
        
        displayMem.setVisible(false);
        
        //<----------------------bottom panel for all  pages-------------------------->
        bottompanel = new JPanel();
        bottompanel.setLayout(null);
        bottompanel.setBounds(0,530,900,100);
        bottompanel.setBackground(Color.BLACK);
        
        //adding different buttons
        addregularBTN = new JButton("Add Regular Member");
        addregularBTN.addActionListener(this);
        addpremiumBTN = new JButton("Add Premium Member");
        addpremiumBTN.addActionListener(this);
        activatemsBTN = new JButton("Activate Membership");
        activatemsBTN.addActionListener(this);
        deactivatemsBTN = new JButton("Deactivate Membership");
        deactivatemsBTN.addActionListener(this);
        markattendanceBTN = new JButton("Mark Attendance");
        markattendanceBTN.addActionListener(this);
        revertmemBTN = new JButton("Revert Member");
        revertmemBTN.addActionListener(this);
        displayBTN = new JButton("Display");
        displayBTN.addActionListener(this);
        clearBTN = new JButton("Clear");
        clearBTN.addActionListener(this);
        
        
        //arranging the buttons
        addregularBTN.setBounds(30,10,200,40);
        addpremiumBTN.setBounds(240,10,200,40);
        activatemsBTN.setBounds(450,10,200,40);
        deactivatemsBTN.setBounds(660,10,200,40);
        markattendanceBTN.setBounds(30,55,200,35);
        revertmemBTN.setBounds(240,55,200,35);
        displayBTN.setBounds(450,55,200,35);
        clearBTN.setBounds(660,55,200,35);
        
        //adding the buttons to the panel
        bottompanel.add(addregularBTN);
        bottompanel.add(addpremiumBTN);
        bottompanel.add(activatemsBTN);
        bottompanel.add(deactivatemsBTN);
        bottompanel.add(markattendanceBTN);
        bottompanel.add(revertmemBTN);
        bottompanel.add(displayBTN);
        bottompanel.add(clearBTN);

        
        //---------------------------------adding the required panels to the frame-------------------------->
        home.add(toppanel);
        regular.add(toppanelreg); 
        premium.add(toppanelprem);
        activateMembership.add(toppanelAct);
        deactivateMembership.add(toppanelDea);
        markAtt.add(toppanelMark);
        revertregMembership.add(toppanelRevreg);
        revertpremMembership.add(toppanelRevprem);
        displayMem.add(toppanelDis);
        fr.add(home);
        fr.add(regular);
        fr.add(premium);
        fr.add(activateMembership);
        fr.add(deactivateMembership);
        fr.add(markAtt);
        fr.add(revertregMembership);
        fr.add(revertpremMembership);
        fr.add(displayMem);
        fr.add(bottompanel);
        
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(false);
        fr.setSize(900,700);
        fr.setLayout(null);
        fr.setVisible(true);
    } 
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        //<--------------------------------event handling to goto regular member panels------------------------>
        if(e.getSource() == addregularBTN)
        {
            home.setVisible(false);
            regular.setVisible(true);
            premium.setVisible(false);
            activateMembership.setVisible(false);
            deactivateMembership.setVisible(false);
            markAtt.setVisible(false);
            revertregMembership.setVisible(false);
            revertpremMembership.setVisible(false);
            displayMem.setVisible(false);
        }

        
        //<--------------------------------event handling to goto premium member panels------------------------>
        if(e.getSource() == addpremiumBTN) 
        {
            home.setVisible(false);
            regular.setVisible(false);
            premium.setVisible(true);
            activateMembership.setVisible(false);
            deactivateMembership.setVisible(false);
            markAtt.setVisible(false);
            revertregMembership.setVisible(false);
            revertpremMembership.setVisible(false);
            displayMem.setVisible(false);
        }
        
        //<-----------------------------event handling to goto activate membership panel--------------------------->
        if(e.getSource() == activatemsBTN) 
        {
            home.setVisible(false);
            regular.setVisible(false);
            premium.setVisible(false);
            activateMembership.setVisible(true);
            deactivateMembership.setVisible(false);
            markAtt.setVisible(false);
            revertregMembership.setVisible(false);
            revertpremMembership.setVisible(false);
            displayMem.setVisible(false);
        }
        
        
        //<-----------------------------event handling to goto activate membership panel--------------------------->
        if(e.getSource() == deactivatemsBTN) 
        {
            home.setVisible(false);
            regular.setVisible(false);
            premium.setVisible(false);
            activateMembership.setVisible(false);
            deactivateMembership.setVisible(true);
            markAtt.setVisible(false);
            revertregMembership.setVisible(false);
            revertpremMembership.setVisible(false);
            displayMem.setVisible(false);
        }
        
        
        //<-----------------------------event handling to goto Mark Attendece panel--------------------------->
        if(e.getSource() == markattendanceBTN) 
        {
            home.setVisible(false);
            regular.setVisible(false);
            premium.setVisible(false);
            activateMembership.setVisible(false);
            deactivateMembership.setVisible(false);
            markAtt.setVisible(true);
            revertregMembership.setVisible(false);
            revertpremMembership.setVisible(false);
            displayMem.setVisible(false);
        }
        
        
        //<-----------------------------event handling to goto revert membership panel--------------------------->
        if(e.getSource() == revertmemBTN) 
        {
            home.setVisible(false);
            regular.setVisible(false);
            premium.setVisible(false);
            activateMembership.setVisible(false);
            deactivateMembership.setVisible(false);
            markAtt.setVisible(false);
            revertregMembership.setVisible(true);
            revertpremMembership.setVisible(false);
            displayMem.setVisible(false);
        }
        
        //<-----------------------------event handling to goto display members panel--------------------------->
        if(e.getSource() == displayBTN) 
        {
            home.setVisible(false);
            regular.setVisible(false);
            premium.setVisible(false);
            activateMembership.setVisible(false);
            deactivateMembership.setVisible(false);
            markAtt.setVisible(false);
            revertregMembership.setVisible(false);
            revertpremMembership.setVisible(false);
            displayMem.setVisible(true);
        }
        
        
        //<--------------------------------event handling to clear all the textfields------------------------>
        if(e.getSource() == clearBTN)
        {
            //making the textfileds and text area empty after clicking the clear button
            regIDTF.setText("");
            regNameTF.setText("");
            regPhoneTF.setText("");
            regLocationTF.setText("");
            regEmailTF.setText("");
            referralsrcTA.setText("");
            removalregTA.setText("");
            removalpremTA.setText("");
            premIDTF.setText("");
            premNameTF.setText("");
            premPhoneTF.setText("");
            premLocationTF.setText("");
            premEmailTF.setText("");
            paidamountTF.setText("");
            trainernameTF.setText("");
            activateIdTF.setText("");
            deactivateIdTF.setText("");
            markAttIDTF.setText("");
            revertregIdTF.setText("");
            revertpremIdTF.setText("");

            
            //setting the comboboxes to default after clicking the clear button
            regdobYearComboBox.setSelectedIndex(0);
            regdobMonthComboBox.setSelectedIndex(0);
            regdobDayComboBox.setSelectedIndex(0);
            regmsYearComboBox.setSelectedIndex(0);
            regmsMonthComboBox.setSelectedIndex(0);
            regmsDayComboBox.setSelectedIndex(0);
            planComboBox.setSelectedIndex(0);
            premdobYearComboBox.setSelectedIndex(0);
            premdobMonthComboBox.setSelectedIndex(0);
            premdobDayComboBox.setSelectedIndex(0);
            premmsYearComboBox.setSelectedIndex(0);
            premmsMonthComboBox.setSelectedIndex(0);
            premmsDayComboBox.setSelectedIndex(0);
            
            //to clear the selected gender after clicling the clear
            regbg.clearSelection();
            prembg.clearSelection();
        }
        
        
        //<--------------------------------event handling to goto Home panel------------------------>
        if(e.getSource() == homeBTNreg || e.getSource() == homeBTNprem ||e.getSource() == homeBTNact ||
        e.getSource() == homeBTNdea || e.getSource() == homeBTNmark || e.getSource() == homeBTNrevreg || 
        e.getSource() == homeBTNrevprem ||e.getSource() == homeBTNdis )
        {
            home.setVisible(true);
            regular.setVisible(false);
            premium.setVisible(false);
            activateMembership.setVisible(false);
            deactivateMembership.setVisible(false);
            markAtt.setVisible(false);
            revertregMembership.setVisible(false);
            revertpremMembership.setVisible(false);
            displayMem.setVisible(false);
        }
        
        
        //<----------event handling for non editable textfield price according to selected plan-------->
        if(planComboBox.getSelectedItem() == "Basic") 
        {
            priceTF.setText("6500");
        }
        else if(planComboBox.getSelectedItem() == "Standard") 
        {
            priceTF.setText("12500");
        }
        else
        {
            priceTF.setText("18500");
        }
        
        
        //<--------------------------------event handling when regular member is added------------------------>
        if(e.getSource() == submitregBTN)
        {
            try
            {
                // Check if any required text field is empty 
                if (regIDTF.getText().isEmpty() || regNameTF.getText().isEmpty() || regPhoneTF.getText().isEmpty() || 
                regLocationTF.getText().isEmpty() || (!regMale.isSelected() && !regFemale.isSelected()) ||
                regEmailTF.getText().isEmpty() || referralsrcTA.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(fr, "Please fill in all required fields!", "Textfield Empty", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                // Extract data
                int r_id = Integer.parseInt(regIDTF.getText());
                String r_name = regNameTF.getText();
                String r_phone = regPhoneTF.getText();
                String r_location = regLocationTF.getText();
                String r_gender = regMale.isSelected() ? "Male" : "Female";
                String r_email = regEmailTF.getText();
                String r_dob = regdobYearComboBox.getSelectedItem() + " / " + regdobMonthComboBox.getSelectedItem() + " / " + regdobDayComboBox.getSelectedItem();
                String r_memStartDate = regmsYearComboBox.getSelectedItem() + " / " + regmsMonthComboBox.getSelectedItem() + " / " + regmsDayComboBox.getSelectedItem();
                String plan = planComboBox.getSelectedItem().toString();  
                double price = Double.parseDouble(priceTF.getText());    
                String referral = referralsrcTA.getText();
                
                //checking if the id is repeated or not using for each loop
                for (GymMember r_mem : a) 
                {
                    if (r_mem.getId() == r_id) 
                    {
                        JOptionPane.showMessageDialog(fr, "A member with this ID already exists!", "Duplicate ID", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                
                // Creating object of regular member
                RegularMember r_obj = new RegularMember(r_id, r_name, r_location, r_phone, r_email, r_gender, r_dob, r_memStartDate, referral);
                
                //adding object to arraylist
                a.add(r_obj);

                JOptionPane.showMessageDialog(fr, "Regular Member added successfully!","Member added",JOptionPane.INFORMATION_MESSAGE);
            }
            catch(NumberFormatException r_ne)
            {
                JOptionPane.showMessageDialog(fr, "Invalid number format in ID field!", "Input ID Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
         //<--------------------------------event handling when premium member is added------------------------>
        if(e.getSource() == submitpremBTN)
        {
            try
            {
                
                // Check if any required text field is empty 
                if (premIDTF.getText().isEmpty() || premNameTF.getText().isEmpty() || premPhoneTF.getText().isEmpty() || 
                premLocationTF.getText().isEmpty() || (!premMale.isSelected() && !premFemale.isSelected()) ||
                premEmailTF.getText().isEmpty() || trainernameTF.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(fr, "Please fill in all required fields!", "Textfield Empty", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Extract data
                int p_id = Integer.parseInt(premIDTF.getText());
                String p_name = premNameTF.getText();
                String p_phone = premPhoneTF.getText();
                String p_location = premLocationTF.getText();
                String p_gender = premMale.isSelected() ? "Male" : "Female";
                String p_email = premEmailTF.getText();
                String p_dob = premdobYearComboBox.getSelectedItem() + " / " + premdobMonthComboBox.getSelectedItem() + " / " + premdobDayComboBox.getSelectedItem();
                String p_memStartDate = premmsYearComboBox.getSelectedItem() + " / " + premmsMonthComboBox.getSelectedItem() + " / " + premmsDayComboBox.getSelectedItem();
                //double pCharge = Double.parseDouble(premiumCharge.getText());     
                String trainerName = trainernameTF.getText();
                
                //checking if the id is repeated or not using for each loop
                for (GymMember p_mem : a) 
                {
                    if (p_mem.getId() == p_id) 
                    {
                        JOptionPane.showMessageDialog(fr, "A member with this ID already exists!", "Duplicate ID", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                
                // Creating object of premium member
                PremiumMember p_obj = new PremiumMember(p_id, p_name, p_location, p_phone, p_email, p_gender, p_dob, p_memStartDate, trainerName);
                
                //adding object to arraylist
                a.add(p_obj);

                JOptionPane.showMessageDialog(fr, "Premium Member added successfully!","Member added",JOptionPane.INFORMATION_MESSAGE);
            }
            catch(NumberFormatException p_ne)
            {
                JOptionPane.showMessageDialog(fr, "Invalid number format in ID field!", "Input ID Error", JOptionPane.ERROR_MESSAGE);
            }
        }
            
        
        //<--------------------------------event handling when activate membership is clicked------------------------>
        if(e.getSource() == submitactBTN)
        {
            try
            {
                // Checking if member id text field is empty 
                if(activateIdTF.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(fr, "Please enter the Member ID", "Textfield Empty", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                //extracting the value from the textfield
                int actID = Integer.parseInt(activateIdTF.getText());
                
                // assuming that no member is found
                boolean mem_find = false;
                //for each loop
                for (GymMember mem : a) 
                {
                    //checking if the written id is valid or not
                    if (mem.getId() == actID) 
                    {
                        mem_find = true;
                        
                        // Check if membership is active
                        if (mem.activeStatus) 
                        {
                            JOptionPane.showMessageDialog(fr, "This membership is already activated!", "Already Activated", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        
                        mem.activateMembership();
                        JOptionPane.showMessageDialog(fr, "Mmebership Activated Successfully!", "Activate Membership", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }
                //if no member id is found
                if(!mem_find)
                {
                    JOptionPane.showMessageDialog(fr, "Member ID not found", "Invalid ID", JOptionPane.ERROR_MESSAGE);                    
                }
            }
            catch(NumberFormatException p_ne)
            {
                JOptionPane.showMessageDialog(fr, "Invalid number format in Member ID field!", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //<--------------------------------event handling when deactivate membership is clicked------------------------>
        if(e.getSource() == submitdeaBTN)
        {
            try
            {
                // Checking if member id text field is empty 
                if(deactivateIdTF.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(fr, "Please enter the Member ID", "Textfield Empty", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                //extracting the value from the textfield
                int deactID = Integer.parseInt(deactivateIdTF.getText());
                
                // assuming that no member is found
                boolean mem_find = false;
                //for each loop
                for (GymMember mem : a) 
                {
                    //checking if the written id is valid or not
                    if (mem.getId() == deactID) 
                    {
                        mem_find = true;
                        
                        // Check if membership is active
                        if (!mem.activeStatus) 
                        {
                            JOptionPane.showMessageDialog(fr, "This membership is already deactivated or not activated!", "Not Deactivated", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        mem.deactivateMembership();
                        JOptionPane.showMessageDialog(fr, "Mmebership Deactivated Successfully!", "Deactivate Membership", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }
                //if no member id is found
                if(!mem_find)
                {
                    JOptionPane.showMessageDialog(fr, "Member ID not found", "Invalid ID", JOptionPane.ERROR_MESSAGE);                    
                }
            }
            catch(NumberFormatException p_ne)
            {
                JOptionPane.showMessageDialog(fr, "Invalid number format in Member ID field!", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
        //<--------------------------------event handling when mark attendance is clicked------------------------>
        if(e.getSource() == submitmarkBTN)
        {
            try
            {
                // Checking if member id text field is empty 
                if(markAttIDTF.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(fr, "Please enter the Member ID", "Textfield Empty", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                //extracting the value from the textfield
                int markID = Integer.parseInt(markAttIDTF.getText());
                
                // assuming that no member is found
                boolean mem_find = false;
                //for each loop
                for (GymMember mem : a) 
                {
                    //checking if the written id is valid or not
                    if (mem.getId() == markID) 
                    {
                        mem_find = true;
                        
                        // Check if membership is active
                        if (!mem.activeStatus) 
                        {
                            JOptionPane.showMessageDialog(fr, "Cannot mark attendance. Membership is deactivated!", "Inactive Membership", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        
                        mem.markAttendance();
                        JOptionPane.showMessageDialog(fr, "Attendance Marked Successfully!", "Mark Attendance", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }
                //if no member id is found
                if(!mem_find)
                {
                    JOptionPane.showMessageDialog(fr, "Member ID not found", "Invalid ID", JOptionPane.ERROR_MESSAGE);                    
                }
            }
            catch(NumberFormatException p_ne)
            {
                JOptionPane.showMessageDialog(fr, "Invalid number format in Member ID field!", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //<--------------------------------event handling to goto premium revert panels------------------------>
        if(e.getSource() == revpremBTN) 
        {
            home.setVisible(false);
            regular.setVisible(false);
            premium.setVisible(false);
            activateMembership.setVisible(false);
            deactivateMembership.setVisible(false);
            markAtt.setVisible(false);
            revertregMembership.setVisible(false);
            revertpremMembership.setVisible(true);
        }
        
        //<--------------------------------event handling to goto regular revert panels------------------------>
        if(e.getSource() == revregBTN) 
        {
            home.setVisible(false);
            regular.setVisible(false);
            premium.setVisible(false);
            activateMembership.setVisible(false);
            deactivateMembership.setVisible(false);
            markAtt.setVisible(false);
            revertregMembership.setVisible(true);
            revertpremMembership.setVisible(false);
        }
        
        //<--------------------------------event handling when revert regular is clicked------------------------>
        if(e.getSource() == submitRevreg)
        {
            try
            {
                // Checking if member id text fielxd is empty 
                if(revertregIdTF.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(fr, "Please enter the Regular Member ID", "Textfield Empty", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                // Checking if removal reason text fielxd is empty 
                if(removalregTA.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(fr, "Please enter the reason for removal", "Textfield Empty", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                //extracting the value from the textfield
                int rev_rID = Integer.parseInt(revertregIdTF.getText());
                String reason = removalregTA.getText();
                
                // assuming that no member is found
                boolean mem_find = false;
                //for each loop
                for (GymMember mem : a) 
                {
                    //checking if the written id is valid or not
                    if (mem.getId() == rev_rID) 
                    {
                        mem_find = true;
                        
                        // Check if membership is active
                        if (!mem.activeStatus) 
                        {
                            JOptionPane.showMessageDialog(fr, "Cannot Revert Membership. Member already reverted!", "Reverted Membership", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        
                        if (mem instanceof RegularMember) 
                        {
                            ((RegularMember) mem).revertRegularMember(reason);
                            JOptionPane.showMessageDialog(fr, "Membership Reverted Successfully!", "Revert Membership", JOptionPane.INFORMATION_MESSAGE);
                        } 
                        else 
                        {
                            JOptionPane.showMessageDialog(fr, "Member is not a Regular Member!", "Invalid Operation", JOptionPane.ERROR_MESSAGE);
                        }               
                        return;
                    }
                }
                //if no member id is found
                if(!mem_find)
                {
                    JOptionPane.showMessageDialog(fr, "Member ID not found", "Invalid ID", JOptionPane.ERROR_MESSAGE);                    
                }
            }
            catch(NumberFormatException p_ne)
            {
                JOptionPane.showMessageDialog(fr, "Invalid number format in Member ID field!", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //<--------------------------------event handling when revert premium is clicked------------------------>
        if (e.getSource() == submitRevprem) 
        {
            try 
            {
                // Check if Member ID text field is empty
                if (revertpremIdTF.getText().isEmpty()) 
                {
                    JOptionPane.showMessageDialog(fr, "Please enter the Premium Member ID", "Textfield Empty", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Extract Member ID
                int rev_pID = Integer.parseInt(revertpremIdTF.getText());

                // assuming that no member is found
                boolean mem_found = false;

                // for each loop
                for (GymMember mem : a) 
                {
                    //checking if the written id is valid or not
                    if (mem.getId() == rev_pID) 
                    {
                        mem_found = true;

                        // Check if membership is already reverted
                        if (!mem.activeStatus) 
                        {
                            JOptionPane.showMessageDialog(fr, "Cannot revert. Member already reverted!", "Already Reverted", JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        // Check if member is a PremiumMember
                        if (mem instanceof PremiumMember) 
                        {
                            ((PremiumMember) mem).revertPremiumMember();
                            JOptionPane.showMessageDialog(fr, "Premium Membership Reverted Successfully!", "Revert Membership", JOptionPane.INFORMATION_MESSAGE);
                        } 
                        else 
                        {
                            JOptionPane.showMessageDialog(fr, "Member is not a Premium Member!", "Invalid Operation", JOptionPane.ERROR_MESSAGE);
                        }
                        
                        return;
                        }
                }

                // If no member found
                if (!mem_found) 
                {
                    JOptionPane.showMessageDialog(fr, "Member ID not found", "Invalid ID", JOptionPane.ERROR_MESSAGE);
                }

                } catch (NumberFormatException ex) 
                {
                    JOptionPane.showMessageDialog(fr, "Invalid number format in Member ID field!", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
        }
        
        //<--------------------------------event handling when display is clicked------------------------>
        if (e.getSource() == displayregMem) 
        {
            //checks if there are any members
            if (a.isEmpty()) 
            {
                JOptionPane.showMessageDialog(fr, "No members to display!", "Empty List", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            // Loop through each member and call their display() method
            for (GymMember mem : a) 
            {
                if (mem instanceof RegularMember) 
                        {
                            ((RegularMember) mem).display();
                            JOptionPane.showMessageDialog(fr, "All regular member information printed!", "Display Members", JOptionPane.INFORMATION_MESSAGE);
                        } 
            }
        }   
            //<--------------------------------event handling when display is clicked------------------------>
        if (e.getSource() == displaypremMem) 
        {
            //checks if there are any members
            if (a.isEmpty()) 
            {
                JOptionPane.showMessageDialog(fr, "No members to display!", "Empty List", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            // Loop through each member and call their display() method
            for (GymMember mem : a) 
            {
                if (mem instanceof PremiumMember) 
                        {
                            ((PremiumMember) mem).display();
                            JOptionPane.showMessageDialog(fr, "All premium member information printed!", "Display Members", JOptionPane.INFORMATION_MESSAGE);
                        } 
            }
        }
    }
    
    
        
    public static void main(String[]args)
        {
        new GymGUI();
        }
    }
    
    

