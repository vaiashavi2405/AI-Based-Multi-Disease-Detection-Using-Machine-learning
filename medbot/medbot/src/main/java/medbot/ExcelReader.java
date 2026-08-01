/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medbot;


import java.io.*;
import java.util.ArrayList;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
 /* Import declarations to the JExcel JAR file *//* Import declarations to the JExcel JAR file */
public class ExcelReader /* The name of our class file */
{

    public ArrayList getExcelData(String path)
    {
        ArrayList orgdata=new ArrayList();

      try
        {
            Workbook ReadExcel = Workbook.getWorkbook(new File(path));
            Sheet sheet = ReadExcel.getSheet(0);
            int a=sheet.getColumns();
            int b=sheet.getRows();
//            System.out.println("Number of collumns "+Integer.toString(a));
//            System.out.println("Number of rows " +Integer.toString(b));
           
            for (int i=1;i<b;i++)
            {
                ArrayList temp=new ArrayList();
                for(int j=0;j<a;j++)
                {

                 
                Cell a1 = sheet.getCell(j,i); /* Get the first cell of Column A , 0 maps to A */

                String ed = a1.getContents();
                ed=ed.trim();
                temp.add(ed);
                }
                orgdata.add(temp);
                
            }
              ReadExcel.close();
            }
        catch (Exception e)
        {
            System.out.println("Exception in ExcelReader class is: "+e);
        }

        return orgdata;
        
    }
}