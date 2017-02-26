package pplassque1;

import java.util.*;
import java.io.*;
public class rabnebnadijodi {
	 public static void main(String args[],int nob,int nog)throws IOException
     {
         Random any;
         any = new Random();

         InputStreamReader getin = null;
         int l = 1;
         String hisname, hername;
         int hisattractiveness;
          int   herattractiveness ;
          int      herintelligence;
           int       hisintelligence;
           int herbudget;
           int hisbudget;
           File getout = new File("hisfile.txt");
           FileOutputStream takehis  = new FileOutputStream(getout);
         BufferedWriter writehis = new BufferedWriter(new OutputStreamWriter(takehis));
             while(l <= 10) {
                 hisname = "guy" + l;
                 hisattractiveness = any.nextInt(10) + 1;
                 hisintelligence = any.nextInt(15) + 5;
                 hisbudget = any.nextInt(90000) + 10000;
                 writehis.write(hisname + " " +  hisintelligence + " "+hisattractiveness+" "+hisbudget);
                 writehis.newLine();
                 l++;

             }
             writehis.close();
             l = 1;

           File getouther = new File("herfile.txt");
           FileOutputStream takeher  = new FileOutputStream(getouther);
           BufferedWriter writeher = new BufferedWriter(new OutputStreamWriter(takeher));
            while(l <= 5) {
                     hername = "beautifulgirl" + l;
                     herattractiveness = any.nextInt(10) + 1;
                     herintelligence = any.nextInt(15) + 5;
                     herbudget = any.nextInt(90000) + 10000;
                     writeher.write(hername + " " + herattractiveness+" "+ herintelligence + " "+ herbudget);
                     writeher.newLine();
                     l++;

           }
            writeher.close();
     }
}

