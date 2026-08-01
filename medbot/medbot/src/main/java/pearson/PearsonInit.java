/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pearson;

import java.util.ArrayList;
import medbot.Sorter;

public class PearsonInit {
    
    public ArrayList getPearsonList(ArrayList preprocesslist, ArrayList userinfo)
    {
        ArrayList clusterPearsonCo = new MeanOfClusterCorelation().cal(preprocesslist,userinfo);
        
        ArrayList sortedpearsonlist = new Sorter().getDescendingSortedList(clusterPearsonCo);
        
        ArrayList pearsonlist=new ArrayList();
        
        int size=sortedpearsonlist.size()*80/100;
         
        for(int i=0; i<size; i++)
        {
            pearsonlist.add(sortedpearsonlist.get(i));
        }
        

         return pearsonlist;
                
    }
}
