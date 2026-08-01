/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pearson;

import java.util.ArrayList;


public class MeanOfClusterCorelation {
    
    public ArrayList cal(ArrayList preprocesslist, ArrayList userinfo)
    {
        double x1=Double.parseDouble((String) userinfo.get(0));
        double x2=Double.parseDouble((String) userinfo.get(1));
        double x3=Double.parseDouble((String) userinfo.get(2));
        double x4=Double.parseDouble((String) userinfo.get(3));
        double x5=Double.parseDouble((String) userinfo.get(4));
        double x6=Double.parseDouble((String) userinfo.get(5));
        double x7=Double.parseDouble((String) userinfo.get(6));
       
         
        double x[]={x1,x2,x3,x4,x5,x6,x7};
        
        ArrayList clusterPearsonCo = new ArrayList();
        
       
        for(int i=0; i<preprocesslist.size(); i++)
        {
              ArrayList row=(ArrayList) preprocesslist.get(i);
              
              double y1=Double.parseDouble((String) row.get(0));
              double y2=Double.parseDouble((String) row.get(1));
              double y3=Double.parseDouble((String) row.get(2));
              double y4=Double.parseDouble((String) row.get(3));
              double y5=Double.parseDouble((String) row.get(4));
              double y6=Double.parseDouble((String) row.get(5));
              double y7=Double.parseDouble((String) row.get(6));
                           
              double y[]={y1,y2,y3,y4,y5,y6,y7};
              
              double correlationvalue=new PearsonCorrelation().getCorrelation(x, y);
              
              row.add(Double.toString(correlationvalue));
           
              clusterPearsonCo.add(row);
        }
            
            return clusterPearsonCo;
    }
}
