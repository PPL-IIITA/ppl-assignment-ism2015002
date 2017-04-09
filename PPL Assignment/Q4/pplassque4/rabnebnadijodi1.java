
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class rabnebnadijodi1 {
	/**
	 * this function used to generate random boys and girls
	 * and store them in files and 
	 * @param args (accept the arguments)
	 * @param nob (parameter to input number of boys)
	 * @param nog (parameter to input number of girls)
	 * @throws IOException (throws i/o exception if there is error in input ,output subclass of exception) 
	 */
	 public static void main(String args[],int nob,int nog)throws IOException
     {
         Random any;
         /**
          * object of random class
          */
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
           int k;
           File getout = new File("hisfile1.txt");
           FileOutputStream takehis  = new FileOutputStream(getout);
         BufferedWriter writehis = new BufferedWriter(new OutputStreamWriter(takehis));
             while(l <= 10) {
                 hisname = "guy" + l;
                 hisattractiveness = any.nextInt(10) + 1;
                 hisintelligence = any.nextInt(15) + 5;
                 hisbudget = any.nextInt(90000) + 10000;
                 k = any.nextInt(3) + 1;
                 writehis.write(hisname + " " +  hisintelligence + " "+hisattractiveness+" "+hisbudget+" "+ k);
                 writehis.newLine();
                 l++;

             }
             writehis.close();
             l = 1;

           File getouther = new File("herfile1.txt");
           FileOutputStream takeher  = new FileOutputStream(getouther);
           BufferedWriter writeher = new BufferedWriter(new OutputStreamWriter(takeher));
            while(l <= 5) {
                     hername = "beautifulgirl" + l;
                     herattractiveness = any.nextInt(10) + 1;
                     herintelligence = any.nextInt(15) + 5;
                     herbudget = any.nextInt(90000) + 10000;
                     k = any.nextInt(3) + 1;

                     writeher.write(hername + " " + herattractiveness+" "+ herintelligence + " "+ herbudget+" "+k);
                     writeher.newLine();
                     l++;

           }
            writeher.close();
     }

}
