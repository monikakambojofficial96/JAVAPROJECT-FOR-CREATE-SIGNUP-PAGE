import java.awt.*;
import javax.swing.*;

class javaminiproject extends JFrame
{
    javaminiproject()
    {
       //font

       Font f=new Font("Serif",Font.BOLD,30);

//login panel

  JPanel login=new JPanel();
   login.setSize(400,350);
   login.setLayout(null);
   login.setBackground(new Color(0,0,0,60));
  login.setBounds(250,175,400,350);

   JTextField username=new JTextField("Enter username.....");
   username.setBounds(50,50,300,50);
   username.setForeground(Color.WHITE);
   username.setBackground(new Color(210,180,140));
   login.add(username);


  JTextField password=new JTextField("Enter password.....");
   password.setBounds(50,150,300,50);
   password.setBackground(new Color(210,180,140));
  password.setForeground(Color.WHITE);
   login.add(password);

   JButton signup=new JButton("Sign Up");
   signup.setBounds(50,250,100,50);
   signup.setBackground(new Color(160,182,45));
   login.add(signup);

   JButton signin=new JButton("Login");
   signin.setBounds(250,250,100,50);
   signin.setBackground(new Color(160,182,45));
   login.add(signin);


       //header
      
       JPanel heading;
       heading=new JPanel();
       heading.setBackground(new Color(0,0,0,80));
       
       heading.setBounds(0,0,900,100);
       JLabel name=new JLabel("Login Example");
     
       name.setForeground(Color.WHITE);
       name.setBounds(200,50,400,50);
       name.setFont(f);
   
       heading.add(name);
     
         //frame

         setSize(900,600);
         setLayout(null);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         
         //background

         ImageIcon background_image  = new ImageIcon("C:\\Users\\KAMBOJ\\Desktop\\image.jpg");
        
         Image img=background_image.getImage();
         Image temp_img=img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
         background_image=new ImageIcon(temp_img);
         JLabel background=new JLabel("",background_image,JLabel.CENTER);
         background.add(heading);
         background.add(login);
       background.setBounds(0,0,900,600);
         add(background);
          setVisible(true);
     }

  public static void main(String args[])
{

        javaminiproject javaminiproject = new javaminiproject();
}

}

     
