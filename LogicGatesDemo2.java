import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LogicGatesv2 extends JFrame implements ItemListener
{
   JLabel lnum1, lnum2;
   JTextField tres;
   JComboBox Logic, tnum1, tnum2;
   String Logics[] = {"AND", "OR", "NAND", "NOR", "XOR", "XNOR"};
   String n[] = {"0", "1"};
   Container c = getContentPane();
   
   LogicGatesv2() //constructor serves as 1. GUI Components
   {
      super("Simple Calculator v1");
      lnum1 = new JLabel("Input num1: ");
      lnum2 = new JLabel("Input num2: ");
      Logic = new JComboBox(Logics);
      
      tnum1 = new JComboBox(n);
      tnum2 = new JComboBox(n);
      tres = new JTextField(5); tres.setEditable(false);
      
      Logic.addItemListener(this);
      
      c.setLayout(new GridLayout(3,2));
      c.add(lnum1); c.add(tnum1);
      c.add(lnum2); c.add(tnum2);
      c.add(Logic); c.add(tres);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300, 200);
      setResizable(false);
   }
   
   public void itemStateChanged(ItemEvent e)//2. Listener Method
   {
      int num1 =0, num2=0;
      boolean res=false;

      try
      {
         if(tnum1.getSelectedIndex() == 0)
         num1 = 0;
         else
         num1 = 1;
         if(tnum2.getSelectedIndex() == 0)
         num2 = 0;
         else
         num2 = 1;
         
         
         if(Logic.getSelectedIndex()==0)
         {
            res = AND(num1, num2);
         }
         else
         if(Logic.getSelectedIndex()==1)
         {
            res = OR(num1, num2);
         }
         else
         if(Logic.getSelectedIndex()==2)
         {
            res = NAND(num1, num2);
         }
         else
         if(Logic.getSelectedIndex()==3)
         {
            res = NOR(num1, num2);
         }
         else
         if(Logic.getSelectedIndex()==4)
         {
            res = XOR(num1, num2);
         }
         else
         if(Logic.getSelectedIndex()==5)
         {
            res = XNOR(num1, num2);
         }
         tres.setText(res+"");
      }

      catch(NumberFormatException nfe)
      {
         tres.setText("Boang ka!");
      }
      catch(Exception ex)
      {
      
      }
   }
   
     //3. Application Methods
   public boolean AND(int num1, int num2)
   {
      if(num1 == 1 && num2 == 1)
      return true;
      else if(num1 == 1 && num2 == 0)
      return false;
      else if(num1 == 0 && num2 == 1)
      return false;
      else if(num1 == 0 && num2 == 0)
      return false;
      else
      return false;
      
   }
   public boolean OR(int num1, int num2)
   {
      if(num1 == 1 && num2 == 1)
      return true;
      else if(num1 == 1 && num2 == 0)
      return true;
      else if(num1 == 0 && num2 == 1)
      return true;
      else if(num1 == 0 && num2 == 0)
      return false;
      else
      return false;

   }
   public boolean NAND(int num1, int num2)
   {
      if(num1 == 1 && num2 == 1)
      return false;
      else if(num1 == 1 && num2 == 0)
      return true;
      else if(num1 == 0 && num2 == 1)
      return true;
      else if(num1 == 0 && num2 == 0)
      return true;
      else
      return false;

   }
   public boolean NOR(int num1, int num2)
   {
      if(num1 == 1 && num2 == 1)
      return false;
      else if(num1 == 1 && num2 == 0)
      return false;
      else if(num1 == 0 && num2 == 1)
      return false;
      else if(num1 == 0 && num2 == 0)
      return true;
      else
      return false;

   }
    public boolean XOR(int num1, int num2)
   {
      if(num1 == 1 && num2 == 1)
      return false;
      else if(num1 == 1 && num2 == 0)
      return true;
      else if(num1 == 0 && num2 == 1)
      return true;
      else if(num1 == 0 && num2 == 0)
      return false;
      else
      return false;

   }
    public boolean XNOR(int num1, int num2)
   {
      if(num1 == 1 && num2 == 1)
      return true;
      else if(num1 == 1 && num2 == 0)
      return false;
      else if(num1 == 0 && num2 == 1)
      return false;
      else if(num1 == 0 && num2 == 0)
      return true;
      else
      return false;

   }
 
}

//--------------------------------------------
public class LogicGatesDemo2
{
   public static void main(String args[])
   {
     LogicGatesv2 lg = new LogicGatesv2();
      lg.setVisible(true);
   }
}