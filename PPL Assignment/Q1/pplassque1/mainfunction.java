package pplassque1;
import java.util.*;
import java.io.*;

public class mainfunction {


		public static void main(String args[]) throws IOException{
	        int nob;
	        int nog;
	        nob = 10;
	        nog = 5;
	        String[] arg1 = new String[0];
	        rabnebnadijodi.main(arg1, nob, nog);
	        honestboys ladka[] = new honestboys[10];
	        selfishgirl ladki[] = new selfishgirl[5];
	        BufferedReader ki ;
	        FileReader ka ;
	        ka = new FileReader("hisfile.txt");
	        ki = new BufferedReader(ka);
	        int l = 0;
	         String hisname1, hername1;
	            int hisattractiveness1;
	             int   herattractiveness1 ;
	             int      herintelligence1;
	              int       hisintelligence1;
	              int herbudget1;
	              int hisbudget1;
	              String input;
	        while(l < nob) {
	                input = ki.readLine();
	                StringTokenizer longstring = new StringTokenizer(input," ");
	                    hisname1 = longstring.nextToken();
	                    hisattractiveness1 = Integer.parseInt(longstring.nextToken());
	                    hisintelligence1 = Integer.parseInt(longstring.nextToken());
	                    hisbudget1 = Integer.parseInt(longstring.nextToken());
	                    ladka[l] = new honestboys(hisname1, hisattractiveness1,hisintelligence1,hisbudget1,0);
	                    l++;
	        }
	         BufferedReader ki1 ;
	        FileReader ka1;
	        ka1 = new FileReader("herfile.txt");
	        ki1 = new BufferedReader(ka1);
	        l= 0;
	        String input1;
	         while(l < nog) {
	                input1 = ki1.readLine();
	                StringTokenizer longstring = new StringTokenizer(input1);
	                    hername1 = longstring.nextToken();
	                    herattractiveness1 = Integer.parseInt(longstring.nextToken());
	                    herintelligence1= Integer.parseInt(longstring.nextToken());
	                    herbudget1 = Integer.parseInt(longstring.nextToken());
	                    ladki[l] = new selfishgirl(hername1, herattractiveness1,herintelligence1,herbudget1,0);
	                    l++;
	        }
	        int identity =0;
	        int j = 0, k = 0;
	        makecouple jodi[] = new makecouple[10];
	         while(j < nog) {
	        	 	k=0;
	                while(k < nob)  {
	                    if(ladki[j].herbudget < ladka[k].hisbudget &&ladka[k].hisstatus == 0 && ladki[j].herstatus==0) {
	                           jodi[identity] = new makecouple(ladki[j].hername,ladka[k].hisname,identity);
	                           identity++;
	                           ladka[k].hisstatus = 1;
	                           ladki[j].herstatus = 1;

	                    }
	                    k++;
	                }
	                j++;
	         }

	         File getout = new File("output1.txt");
	           FileOutputStream takehis  = new FileOutputStream(getout);
	         BufferedWriter writehis = new BufferedWriter(new OutputStreamWriter(takehis));
	         j = 0;
	         while(j < identity) {
	                
	                writehis.write(jodi[j].dumbboy + " " +  jodi[j].smartgirl);
	                 writehis.newLine();
	                j++;
	         }
	         writehis.close();
	      }
	}



