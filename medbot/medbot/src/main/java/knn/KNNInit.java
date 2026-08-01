/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn;

import java.util.ArrayList;
import medbot.Sorter;


public class KNNInit {
    
    
    public ArrayList getKNNList(ArrayList pearsonlist, ArrayList userinfo)
    {
        
        ArrayList distancelist=new EuclideanDistanceCal().getDistance(pearsonlist, userinfo);
        ArrayList sortedknnlist=new Sorter().getAescendingSortedList(distancelist);
        
        
        ArrayList knnlist=new ArrayList();
        int k=40;
        
        int size=sortedknnlist.size()*k/100;
         
        for(int i=0; i<size; i++)
        {
            knnlist.add(sortedknnlist.get(i));
        }
       
    
        return knnlist;
        
    }
    
}
