/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linearregression;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class LinearRegression {
    
     private double m=0.0, b=0.0;
     
    public double initRegression(ArrayList<Double> x, ArrayList<Double> y)
    {
           
        double sumx=0.0;
        double sumy=0.0;
        double x2=0.0;
        double xy=0.0;
        
                 
        for(int i=0;i<x.size();i++)
        {
            sumx=sumx+x.get(i);
            sumy=sumy+y.get(i);
            x2=x2+x.get(i)*x.get(i);
            xy=xy+x.get(i)*y.get(i);
      
        }
                    
//           System.out.println("SumX Value: "+sumx);
//           System.out.println("SumY Value: "+sumy);
//           System.out.println("SumXX Value: "+x2);
//           System.out.println("SumXY Value: "+xy);
            
             double size=x.size();
             
            
             double val1=(size*xy)-(sumx*sumy);
             double val2=(size*x2)-(Math.pow(sumx, 2));
                       m= val1/val2;
            
           
       //      m=Double.parseDouble(new DecimalFormat("##.####").format(m));
            
//           
           // System.out.println("Slope is: "+m);
            
              b=(sumy-(m*sumx))/size;
       //       b=Double.parseDouble(new DecimalFormat("##.####").format(b));
              
              
            // System.out.println("Intercept is: "+b);
                
             double sum=0.0;
             for(int i=0;i<x.size();i++)
             {
                 double num=m*x.get(i)+b;
//                 num=Double.parseDouble(new DecimalFormat("##.##").format(num));
                 sum=sum+num;
                 
                 
             }
            
            
             double mean=sum/x.size();
//             mean=Double.parseDouble(new DecimalFormat("##.###").format(mean));
          //   System.out.println("mean: "+mean);
            
      return mean;
             
    }
}
