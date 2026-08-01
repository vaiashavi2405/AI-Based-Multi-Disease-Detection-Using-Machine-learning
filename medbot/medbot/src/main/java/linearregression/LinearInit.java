/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linearregression;

import java.text.DecimalFormat;
import java.util.ArrayList;
import medbot.Sorter;



public class LinearInit {
    
    public ArrayList getLinearRegressionList(ArrayList knnlist, ArrayList userinfo)
    {
        ArrayList regressionvaluelist=new ArrayList();
        
        for (int i = 0; i <knnlist.size(); i++) 
        {
            ArrayList row= (ArrayList) knnlist.get(i);
            ArrayList<Double> x=new ArrayList<Double>();
            ArrayList<Double> y=new ArrayList<Double>();
            
            for (int j = 0; j <row.size()-1; j++) 
            {
                x.add(Double.parseDouble((String) row.get(j)));
                y.add(Double.parseDouble((String) userinfo.get(j)));
                
            }
            
//            System.out.println("x: "+x);
//            System.out.println("y: "+y);

            double slopeintercevalue= new LinearRegression().initRegression(x,y);
            row.set(row.size()-1,Double.toString(slopeintercevalue));
             
           regressionvaluelist.add(row);
           
        }
        
         ArrayList sortedlinearlist=new Sorter().getDescendingSortedList(regressionvaluelist);
         
         int size=sortedlinearlist.size()*80/100;
         
         ArrayList regressionlist=new ArrayList();
         
        for(int i=0; i<size; i++)
        {
            regressionlist.add(sortedlinearlist.get(i));
        }
        
         return regressionlist;
    }
    
}
