/* <applet code="Q7DEMO" height=150 width=400>   </applet> */

import java.awt.*;
import java.applet.*;

public class Q7DEMO extends Applet
{
     TextField T1,T2,T3;
      Button b1 ;
      public void init(){
          T1 = new TextField(10);
          T2 = new TextField(10);
          T3 = new TextField(10);
          
          add(T1);
          add(T2);
          add(T3);
         // add(b1);
          T1.setText("0");
          T2.setText("0");
          T3.setText("0");
           
        }

        public void paint(Graphics g){
             int a, b, c,result=0;
             String str;

             g.drawString("Enter value to Check the Maximum of 3 ",10,50);

             
             a=Integer.parseInt(T1.getText());
             
             b=Integer.parseInt(T2.getText());
          
             c=Integer.parseInt(T3.getText());

              result = a>b?((a>c)?a:c):((b>c)?b:c);
             if(result==0)
              {
                  result = a ;
              }
              g.drawString("Maximnum of 3 No is "+result,10,70);
              showStatus("MAXIMUM OF 3 NUMBERS");
            }

            public boolean action(Event e, Object o){
                  repaint();
                  return true;
            }
}