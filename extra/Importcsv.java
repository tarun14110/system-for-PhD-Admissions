/*

tarun and sujeet
2014110  and  2014108

*/
package com.iiitd.ap.lab7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

    public static  void main(String[] args) throws IOException, ParseException
    {
        FileInputStream fs= new FileInputStream("/home/tarun/workspace/IIITD/src/Data_to_Import_with;(2).csv");
        BufferedReader br = new BufferedReader(new InputStreamReader(fs));
     
        FileOutputStream fd= new FileOutputStream("/home/tarun/workspace/IIITD/src/Data_to_Export.txt");
        BufferedWriter bd = new BufferedWriter(new OutputStreamWriter(fd));
     
        
            String line,out_line="";
         
            String[] c;line=br.readLine();
            int id=0;
           // System.out.println(line);
     
            while((line=br.readLine())!=null)
                {
               // System.out.println(line);
                c=line.split(","); 
                bd.write(c[0]+",");
                bd.write(c[1]+",");
                bd.write(c[c.length-1]+",");
                bd.write(c[2]+",");
                bd.write(c[3]+",");
              for(int i=4;i<11;i++)
                bd.write(c[i]+",");
              String s1=c[11];
              //System.out.println(c[11]);
      
             
   
              DateFormat format3 = new SimpleDateFormat("dd-MM-yyyy");
               Date dat = format3.parse(s1);
              // System.out.println("formatted "+date);
             
          
               DateFormat format12 = new SimpleDateFormat("yyyy-MM-dd");
             bd.write(format12.format(dat)+",");
           System.out.println(c[20]);
             for(int i=12;i<17;i++)
                 bd.write(c[i]+",");
             bd.write(c[17].toLowerCase()+",");
             
             for(int i=18;i<20;i++)
                 bd.write(c[i]+",");
             
            bd.write(c[20].toLowerCase()+",");
            
            for(int i=21;i<23;i++)
                bd.write(c[i]+",");
             
             if(c[23].equals("B.Tech"))
                 bd.write("Btech,");
             else
                 bd.write(c[23]+",");
             if(c[24].equals("Computer Science"))
                 bd.write("CSE,");
             else if(c[24].equals("Electronics and Communication"))
                 bd.write("ECE,");
             else
                 bd.write(c[24]+",");
          
             for(int i=25;i<28;i++)
                 bd.write(c[i]+",");
            bd.write(c[28].toLowerCase()+",");
             for(int i=29;i<30;i++)
            	 bd.write(c[i]+",");
            
             if(c[30].charAt(0)=='M')
            	 bd.write(c[30].substring(6));
             else
            	 bd.write(c[30].substring(5));
             
             bd.write(",");
          //   bd.write("'hoooooo'");
            
              for(int i=32;i<35;i++)
              {
              if(c[31].equals("Yes"))
              {bd.write(c[i]+";");
                
              }
              else
                  bd.write(";");
              }
              if(!c[31].equals("Yes"))
            	  bd.write(";faltu");
              
              if(c[31].equals("Yes"))
              {bd.write(c[35]);
                
              }
          
              bd.write(",");
          
           
                  if(c[36].equals("Yes"))
                  {
                      bd.write(c[39]+";");
                      bd.write(c[41]+";");
                      bd.write(c[42].toLowerCase()+";");
                      bd.write(c[38]+";");
                      if(c[37].equals("M.Tech,"))
                          bd.write("Mtech");
                      else
                          bd.write(c[37]+",");
                    //  bd.write(c[37].toLowerCase()+",");
                      bd.write(c[40]+";");
                  
                    
                    
                  }
                    else
                        bd.write(";;;;;;faltu,;");
                
            
              for(int i=43;i<44;i++)
              {
                  if(c[36].equals("Yes"))
                  {
                      bd.write(c[i]+";");
                    
                  }
                    else
                        bd.write(";");
                  
             
              }
              if(!c[36].equals("Yes"))
            	  bd.write(";faltu");
             
              if(c[36].equals("Yes"))
              {
            	  if(c[44].charAt(0)=='M')
            	  bd.write(c[44].substring(6));
            	  else{
            		System.out.println(c[44].substring(5));
            		  bd.write(c[44].substring(5));
            	  }
              }
              else
            	  bd.write(";"); 
              
              
              if(c[36].equals("Yes"))
              {
                  bd.write(c[45]);
                
              }
              bd.write(",");
              for(int i=47;i<50;i++)
              {
              
                        bd.write(";");
                
              }
              if(c[46].equals("Yes"))
              {
                  bd.write(c[50]);
                
              }
              bd.write(",");
              if(c[51].equals("Yes"))
              {
                  bd.write(c[55]);
                
              }
                else
                    bd.write("");
              bd.write(",");
for(int i=57;i<c.length-2;i++)
    bd.write(c[i]+",");
        

           
                String s=c[c.length-2];
             
              
    
                DateFormat format = new SimpleDateFormat("yyyy-MMM-dd");
                Date date = format.parse(s);
               // System.out.println("formatted "+date);
              
               // System.out.println(s);
                DateFormat format2 = new SimpleDateFormat("yyyy/MM/dd");
              bd.write(format2.format(date)+",");
              bd.newLine();
            // System.out.println(c[c.length-2]);
            //  id++;
         
                } 
               
              
             
     
    }
 
}
