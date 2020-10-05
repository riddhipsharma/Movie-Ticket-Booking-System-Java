
import java.awt.*;           // to load awt 
import java.awt.event.*;    // to load an event interface 
import java.applet.*;      // to load an applet class 

// To create an applet 
/* 
  <applet CODE="MovieTicket.class" WIDTH=1000 HEIGHT=650> 
  </applet> 
*/
public class MovieTicket extends Applet implements ActionListener
{
    String str="";
    String str1="";
    Label l0=new Label("WELCOME!!!");
    Label l1=new Label("Search for your city");
    Label l2=new Label("Select Movie");
    Label l3=new Label("Select Theatre");
    Label l4=new Label("Select Language");
    Label l5=new Label("Select format");
    Label l6=new Label("Date");
    Label l7=new Label("Select Timing");
    Label l8=new Label("How many seat(s)");
    Label l9=new Label("Enter your name");
    Label l10=new Label("Enter your email id");
    Label l11=new Label("Enter details for logging in");
    Button b0=new Button("Log in");
    Button b1=new Button("Book Tickets");
    Choice c1=new Choice();
    Choice c2=new Choice();
    Choice c3=new Choice();
    Choice c4=new Choice();
    Choice c5=new Choice();
    Choice c6=new Choice();
    Choice c7=new Choice();
    Choice c8=new Choice();
    TextField tf1=new TextField(25);
    TextField tf2=new TextField(25);
    
  public void init()
  { 
    add(l11);
    add(l9);
    add(tf1);
    add(l10);
    add(tf2);
    add(l0);
    add(l1);
    c1.add("Mumbai");
    c1.add("Thane");
    c1.add("Bengaluru");
    c1.add("Chennai");
    c1.add("Chandigarh");
    c1.add("Hyderabad");
    c1.add("Ahmedabad");
    c1.add("Pune");
    c1.add("Kolkata");
    c1.add("Kochi");
    add(c1);
    add(l2);
    c2.add("War");
    c2.add("Dream Girl");
    c2.add("Chichore");
    c2.add("The Sky is Pink");
    c2.add("Made in China");
    c2.add("Saaho");
    c2.add("Pal Pal Dil Ke Paas");
    add(c2);
    add(l3);
    c3.add("Liberty Carnival Cinemas: Marine Lines");   
    c3.add("Liberty Carnival Cinemas: Marine Lines");   
    c3.add("Central Plaza: Girgaon");   
    c3.add("INOX: Nariman Point");   
    c3.add("Metro INOX Cinemas: Marine Lines");   
    c3.add("Mukta A2 Cinemas: Jai Hind, Lalbaugh");
    add(c3);
    add(l4);
    c4.add("Hindi");
    c4.add("Telugu");
    c4.add("Tamil");
    add(c4);
    add(l5);
    c5.add("2D");
    c5.add("2D Max");
    add(c5);
    add(l6);
    c6.add("14.10.2019");
    c6.add("15.10.2019");
    c6.add("Tommorow");
    add(c6);
    add(l7);
    c7.add("9:30am");
    c7.add("11:30am");
    c7.add("9:30pm");
    c7.add("11:30pm");
    add(c7);
    add(l8);
    c8.add("1");
    c8.add("2");
    c8.add("3");
    c8.add("4");
    c8.add("5");
    c8.add("6");
    add(c8);
    add(b1);    
    add(b0);
    b1.addActionListener(this); 
    b0.addActionListener(this); 
    l1.setForeground(Color.red);
    l2.setForeground(Color.red);
    l3.setForeground(Color.red);
    l4.setForeground(Color.red);
    l5.setForeground(Color.red);
    l6.setForeground(Color.red);   
    l7.setForeground(Color.red);
    l8.setForeground(Color.red); 
    l9.setForeground(Color.red); 
    l10.setForeground(Color.red); 
    Font myFont=new Font("TimesRoman",Font.BOLD,15);
    l1.setFont(myFont);
    l2.setFont(myFont);
    l3.setFont(myFont);
    l4.setFont(myFont);
    l5.setFont(myFont);
    l6.setFont(myFont);
    l7.setFont(myFont);
    l8.setFont(myFont);
    Font mFont=new Font("Arial",Font.BOLD,50);
    l0.setFont(mFont);
    l0.setForeground(Color.blue);
    Font bFont=new Font("Calibri",Font.ITALIC,25);
    b1.setFont(bFont); 
    Font b0Font=new Font("Calibri",Font.ITALIC,15);
    b0.setFont(b0Font);
    Font lFont=new Font("Arial",Font.BOLD,20);
    l11.setFont(lFont);
  }
   
    public void paint(Graphics g)
    { 
      Font f=new Font("TimesRoman",Font.ITALIC,36);
      g.setFont(f);
      g.setColor(Color.darkGray);
      setBackground(Color.orange); 
      g.drawString(str,250,600);
      g.drawString(str1,5,400);
      l0.setLocation(250,0);
      l1.setLocation(500,100);
      l2.setLocation(500,150);
      l3.setLocation(500,200);
      l4.setLocation(500,250);
      l5.setLocation(500,300);
      l6.setLocation(500,350);
      l7.setLocation(500,400);
      l8.setLocation(500,450);
      c1.setLocation(700,100);
      c2.setLocation(700,150);
      c3.setLocation(700,200);
      c4.setLocation(700,250);
      c5.setLocation(700,300);
      c6.setLocation(700,350);
      c7.setLocation(700,400);
      c8.setLocation(700,450);
      b1.setLocation(550,500);
      b0.setLocation(100,300);
      l11.setLocation(100,100);
      l9.setLocation(50,150);
      l10.setLocation(50,200);
      tf1.setLocation(250,150);
      tf2.setLocation(250,200);
    }    

    public void actionPerformed(ActionEvent e)
    { 
     if(e.getSource()==b1)
      {  str="Congratulations!!! You have booked your tickets.";  }
     else
      {  str1="Done!! Book Your Tickets."; }
     repaint();
   }
}
     