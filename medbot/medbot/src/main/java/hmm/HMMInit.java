/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmm;

import java.util.ArrayList;
import medbot.Sorter;

public class HMMInit {
    
    public ArrayList getHMMProbability(ArrayList regressionlist, ArrayList userinfo)
    {
        
         ArrayList hmmlist=new ArrayList();
          
          ArrayList temp=(ArrayList)regressionlist.get(0);
         
        double[][] G = new double[2][userinfo.size()];
            
        for (int i = 0; i <userinfo.size(); i++) 
        {
            String str=(String)userinfo.get(i);
            
         //   System.out.println("str: "+str);
            G[0][i]=Double.parseDouble(str);
        }
        
       
        int N = 2; 
        int S = 1, F = 2, T = 1;
        
        for (int i = 0; i <regressionlist.size(); i++) 
        {
            ArrayList row = (ArrayList) regressionlist.get(i);
            for (int j = 0; j < row.size()-1; j++) 
            {
            String str=(String)row.get(j);
            G[1][j]=Double.parseDouble(str);
           
            }
            
           double probvalue=new FindProbability().findProbability(G, N, F, S, T);
           row.set(row.size()-1, Double.toString(probvalue)); 
            hmmlist.add(row);
          
        }
        
        ArrayList sortedhmmlist=new Sorter().getDescendingSortedList(hmmlist);
        
       int size=sortedhmmlist.size()*50/100;
       
       ArrayList finalhmmlist=new ArrayList();
         
        for(int i=0; i<size; i++)
        {
            finalhmmlist.add(sortedhmmlist.get(i));
        }
               
               
        return finalhmmlist;
    }
    
}
