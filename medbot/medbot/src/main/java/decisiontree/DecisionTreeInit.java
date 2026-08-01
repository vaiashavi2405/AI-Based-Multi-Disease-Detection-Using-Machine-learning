/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisiontree;

import java.util.ArrayList;


public class DecisionTreeInit {
    
    public String decisionTreeHeartInit(ArrayList hmmlist)
    {
        String medbotreply="";
        
        int rowcount=0;
        
              
        for (int i = 0; i <hmmlist.size(); i++) 
        {
            ArrayList row=(ArrayList) hmmlist.get(i);
            int count=0;
            
          
            double trestbps=Double.parseDouble((String) row.get(2));
            double chol=Double.parseDouble((String) row.get(3));
            double thalach=Double.parseDouble((String) row.get(6));
            double hmmprob=Double.parseDouble((String) row.get(row.size()-1));
            
            if(trestbps>130)
                count++;
            if(chol>200)
                count++;
            if(thalach>130)
                count++;
            if(hmmprob>65.0)
                count=count+1;
            if(count>2)
                rowcount=rowcount+1;            
            
        }
        
        
        int percentage=(rowcount*100)/hmmlist.size();
        
        if (percentage>=0&&percentage<=50)
            medbotreply="You are normal no need to worry.";
        else if(percentage>50)
            medbotreply="You have to contact heart specialist doctor soon.";
        
        System.out.println("percentage: "+percentage);
        System.out.println("MedBotReply: "+medbotreply);
        
        return medbotreply;
    }
    
    public String decisionTreeCovidInit(ArrayList hmmlist)
    {
        String medbotreply="";
        
        int rowcount=0;
        
            
        
              
        for (int i = 0; i <hmmlist.size(); i++) 
        {
            int count=0;
            ArrayList row=(ArrayList) hmmlist.get(i);
            
            System.out.println("row: "+row);
            
            int cough=Integer.parseInt((String) row.get(1));
            int fever=Integer.parseInt((String) row.get(2));
            int sore_throat=Integer.parseInt((String) row.get(3));
            int sob=Integer.parseInt((String) row.get(4));
            int headache=Integer.parseInt((String) row.get(5));
            double hmmprob=Double.parseDouble((String) row.get(row.size()-1));
            
            System.out.println(cough+" "+fever+" "+sore_throat+" "+sob+" "+headache);
           
            if(cough==1)
                count=count+1;
            if(fever==1)
                count=count+1;
            if(sore_throat==1)
                count=count+1;
            if(sob==1)
                count=count+1;
            if(headache==1)
                count=count+1;
            if(hmmprob==1.0)
                count=count+1;
            
            System.out.println("count: "+count);
            if(count>1)
                rowcount=rowcount+1;            
            
        }
        
        System.out.println("rowcount: "+rowcount);
        int percentage=(rowcount*100)/hmmlist.size();
        
        if (percentage>=0&&percentage<=50)
            medbotreply="You are normal. It may be possible that you have some mild corona infection,"
                    + "so I would suggest you quarantine yourself at home for some days."+"\n"+
                    "Please try these home remedies: "+"\n"+"1. Drink Warm Turmeric Milk "+"\n"+"2. Take Steam "+"\n"+"3. Eat Healthy Food "+"\n"+"4. Eat Fruits";
        else if(percentage>50)
            medbotreply="Your test result showing severe corona infection. So, plesae contact your nearest doctor as soon as possible.";
        
        System.out.println("percentage: "+percentage);
        System.out.println("MedBotReply: "+medbotreply);
        
        return medbotreply;
    }
    
     public String decisionTreeKidneyInit(ArrayList hmmlist)
    {
        String medbotreply="";
        
        int rowcount=0;
        
              
        for (int i = 0; i <hmmlist.size(); i++) 
        {
            ArrayList row=(ArrayList) hmmlist.get(i);
            int count=0;
            
          
            double albumin=Double.parseDouble((String) row.get(1));
            double bgr=Double.parseDouble((String) row.get(2));
            double bu=Double.parseDouble((String) row.get(3));
            double sc=Double.parseDouble((String) row.get(4));
            double hemo=Double.parseDouble((String) row.get(5));
            double dm=Double.parseDouble((String) row.get(6));
            double hmmprob=Double.parseDouble((String) row.get(row.size()-1));
            
            if(albumin>0)
                count++;
            if(bgr>140)
                count++;
            if(bu>20)
                count++;
            if(sc>1.3)
                count++;
            if(hemo>12.0)
                count++;
            if(dm==1)
                count++;
            if(hmmprob>65.0)
                count=count+1;
            if(count>2)
                rowcount=rowcount+1;            
            
        }
        
        
        int percentage=(rowcount*100)/hmmlist.size();
        
        if (percentage>=0&&percentage<=50)
            medbotreply="You are normal no need to worry.";
        else if(percentage>50)
            medbotreply="You have to contact kidney specialist doctor soon.";
        
        
        System.out.println("percentage: "+percentage);
        System.out.println("MedBotReply: "+medbotreply);
        
        
        
        return medbotreply;
    }
    
}
