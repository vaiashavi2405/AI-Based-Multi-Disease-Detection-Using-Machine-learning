/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medbot;

import Pearson.PearsonInit;
import decisiontree.DecisionTreeInit;
import hmm.HMMInit;
import java.util.ArrayList;
import knn.KNNInit;
import linearregression.LinearInit;


public class ProcessInit {
    
    public String getDiseaseResult(ArrayList userinfo, String diseasename)
    {
        
        ArrayList trainingdata=new ArrayList();
        
        if(diseasename.equals("heart"))
        {
           trainingdata= new ExcelReader().getExcelData(DatasetPath.heartdatasetpath);  
        }
        else if(diseasename.equals("covid"))
        {
           trainingdata= new ExcelReader().getExcelData(DatasetPath.coviddatasetpath);  
        }
        else if(diseasename.equals("kidney"))
        {
           trainingdata= new ExcelReader().getExcelData(DatasetPath.kidneydatasetpath);  
        }
               
                
       System.out.println("TRAINING"+" "+diseasename.toUpperCase()+" "+"DISEASE DATA****************************************************");
       System.out.println();
       
        for(int i=0;i<trainingdata.size();i++)
        {
            ArrayList row=(ArrayList) trainingdata.get(i);
            System.out.println(row);
           
        }
        
        
      System.out.println();
      System.out.println("TRAINING DATA AFTER PREPROCESSING****************************************************");
      System.out.println();
      
      ArrayList preprocesslist=new Preprocessing().getPreprocessData(trainingdata);
        for(int i=0;i<preprocesslist.size();i++)
        {
            ArrayList row=(ArrayList) preprocesslist.get(i);
            System.out.println(row);
           
        }
        
      System.out.println();
      System.out.println("PEARSON CORRELATION LIST****************************************************");
      System.out.println();
      
      ArrayList pearsonlist=new PearsonInit().getPearsonList(preprocesslist, userinfo);
      for(int i=0;i<pearsonlist.size();i++)
        {
            ArrayList row=(ArrayList) pearsonlist.get(i);
            System.out.println(row);
           
        }
      
      System.out.println();
      System.out.println("KNN  LIST****************************************************");
      System.out.println();
      
      ArrayList knnlist=new KNNInit().getKNNList(pearsonlist, userinfo);
      for(int i=0;i<knnlist.size();i++)
        {
            ArrayList row=(ArrayList) knnlist.get(i);
            System.out.println(row);
           
        }
      
      System.out.println();
      System.out.println("LINEAR REGRESSION  LIST****************************************************");
      System.out.println();
      
      ArrayList regressionlist=new LinearInit().getLinearRegressionList(knnlist, userinfo);
      for(int i=0;i<regressionlist.size();i++)
        {
            ArrayList row=(ArrayList) regressionlist.get(i);
            System.out.println(row);
           
        }
      
      System.out.println();
      System.out.println("HMM PROBABILITY LIST****************************************************");
      System.out.println();
      
      ArrayList hmmprobilitylist=new HMMInit().getHMMProbability(regressionlist,userinfo);
      for(int i=0;i<hmmprobilitylist.size();i++)
        {
            ArrayList row=(ArrayList) hmmprobilitylist.get(i);
            System.out.println(row);
           
        }
      
      System.out.println();
      System.out.println("DECISION TREE RESULT****************************************************");
      System.out.println();
      
      String medbotreply="";
      if(diseasename.equals("heart"))
        {
         medbotreply=new DecisionTreeInit().decisionTreeHeartInit(hmmprobilitylist); 
        }
      else if(diseasename.equals("covid"))
        {
         medbotreply=new DecisionTreeInit().decisionTreeCovidInit(hmmprobilitylist); 
        }
      else if(diseasename.equals("kidney"))
        {
         medbotreply=new DecisionTreeInit().decisionTreeKidneyInit(hmmprobilitylist); 
        }
     
        
        return medbotreply;
    }
    
}
