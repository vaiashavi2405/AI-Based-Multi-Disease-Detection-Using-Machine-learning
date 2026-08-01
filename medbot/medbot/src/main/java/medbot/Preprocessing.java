/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medbot;

import java.util.ArrayList;


public class Preprocessing {
    
    
    public ArrayList getPreprocessData(ArrayList trainingdata)
    {
      ArrayList preprocessdata=new ArrayList();
      
       for(int i=0;i<trainingdata.size();i++)
        {
            ArrayList temp=new ArrayList();
            ArrayList row=(ArrayList) trainingdata.get(i);
            String attr1=(String) row.get(0);
            String attr2=(String) row.get(2);
            String attr3=(String) row.get(3);
            String attr4=(String) row.get(4);
            String attr5=(String) row.get(5);
            String attr6=(String) row.get(6);
            String attr7=(String) row.get(7);
            
            temp.add(attr1);
            temp.add(attr2);
            temp.add(attr3);
            temp.add(attr4);
            temp.add(attr5);
            temp.add(attr6);
            temp.add(attr7);
            preprocessdata.add(temp);
            
        }
        
      return preprocessdata;
              
    }
    
}
