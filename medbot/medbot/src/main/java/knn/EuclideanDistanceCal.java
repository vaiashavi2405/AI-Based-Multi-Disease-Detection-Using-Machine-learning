/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class EuclideanDistanceCal {
    
    
    public ArrayList getDistance(ArrayList pearsonlist, ArrayList userinfo)
    {
        ArrayList distancelist=new ArrayList();
               
        for(int i=0;i<pearsonlist.size();i++)
        {
         
            ArrayList row = (ArrayList) pearsonlist.get(i);
            double sum=0.0;
            for (int j = 0; j <row.size()-1; j++) 
            {
                double x1=Double.parseDouble((String) row.get(j));
                double y1=Double.parseDouble((String) userinfo.get(j));
                sum=sum+Math.pow(y1-x1,2);
            }

            double euclediandis = Math.sqrt(sum);
            euclediandis=Double.parseDouble(new DecimalFormat("##.##").format(euclediandis));
            
            row.set(row.size()-1, Double.toString(euclediandis));
            distancelist.add(row);
            
         }   
        
        return distancelist;
    }
    
}
