

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.StringTokenizer;
import java.lang.*;

/**
 * 
 * @author swapnesh
 *
 */
public class mainfunction1 {
	/**
	 * to search the commited boys in  couples by using binary search
	 * and taking  out their girlfriends name
	 * @param arr (to accept couple array)
	 * @param l (to accept lower limit of couple)
	 * @param r (to accept higher limit of couple)
	 * @param x (to accept boy whose girlfirend has to be searched)
	 * @return
	 */
	static	int binarySearch(makecouple1 arr[], int l, int r, honestboys1 x)
	{
	   if (r >= l)
	   {
	        int mid = l + (r - l)/2;
	 
	        // If the element is present at the middle itself
	        if (arr[mid].dumbboy.compareTo( x.hisname) == 0)  return mid;
	 
	        // If element is smaller than mid, then it can only be present
	        // in left subarray
	        if (arr[mid].dumbboy.compareTo(x.hisname) > 0) return binarySearch(arr, l, mid-1, x);
	 
	        // Else the element can only be present in right subarray
	        return binarySearch(arr, mid+1, r, x);
	   }
	 
	   // We reach here when element is not present in array
	   return -1;
	}
	/**
	 * this function used to perform breakup and form different couples
	 * for this technique used is
	 * first we will change the status of girl to single(i.e 0) then we will find a
	 * suitable boys for her then we will change the status of her previous boyfriend
	 * to single(i.e 0) in this way there is no chance of formation
	 * of same couple
	 * @throws IOException (to throw ioexception)
	 * @param args (to accept arguments)
	 */
	
	public static void main(String args[]) throws IOException{
        int nob;
        int nog;
        nob = 10;
        nog = 5;
        String[] arg1 = new String[0];
        rabnebnadijodi1.main(arg1, nob, nog);
        honestboys1 ladka[] = new honestboys1[10];
        selfishgirl1 ladki[] = new selfishgirl1[5];
        BufferedReader ki ;
        FileReader ka ;
        ka = new FileReader("hisfile1.txt");
        ki = new BufferedReader(ka);
        int l = 0;
         String hisname1, hername1;
            int hisattractiveness1;
             int   herattractiveness1 ;
             int      herintelligence1;
              int       hisintelligence1;
              int herbudget1;
              int hisbudget1, histype,  hertype;
              String input;
        while(l < nob) {
                input = ki.readLine();
                StringTokenizer longstring = new StringTokenizer(input," ");
                    hisname1 = longstring.nextToken();
                    hisattractiveness1 = Integer.parseInt(longstring.nextToken());
                    hisintelligence1 = Integer.parseInt(longstring.nextToken());
                    hisbudget1 = Integer.parseInt(longstring.nextToken());
                    histype = Integer.parseInt(longstring.nextToken());
                    ladka[l] = new honestboys1(hisname1, hisattractiveness1,hisintelligence1,hisbudget1,0, histype);
                    l++;
        }
         BufferedReader ki1 ;
        FileReader ka1;
        ka1 = new FileReader("herfile1.txt");
        ki1 = new BufferedReader(ka1);
        l= 0;
        String input1;
         while(l < nog) {
                input1 = ki1.readLine();
                StringTokenizer longstring = new StringTokenizer(input1," ");
                    hername1 = longstring.nextToken();
                    herattractiveness1 = Integer.parseInt(longstring.nextToken());
                    herintelligence1= Integer.parseInt(longstring.nextToken());
                    herbudget1 = Integer.parseInt(longstring.nextToken());
                    hertype = Integer.parseInt(longstring.nextToken());
                    ladki[l] = new selfishgirl1(hername1, herattractiveness1,herintelligence1,herbudget1,0, hertype);
                    l++;
        }
        int identity =0;
        int j = 0, k = 0;
        honestboys1 comb[] = new honestboys1[10];
        selfishgirl1 comg[] = new selfishgirl1[5];
        makecouple1 jodi[] = new makecouple1[10];
        honestboys1 commited[] = new honestboys1[10];
        int m = 0;
         while(j < nog) {
        	 	k=0;
                while(k < nob)  {
                    if(ladki[j].herbudget < ladka[k].hisbudget &&ladka[k].hisstatus == 0 && ladki[j].herstatus==0) {
                           jodi[identity] = new makecouple1(ladki[j].hername,ladka[k].hisname,identity);
                           identity++;
                           ladka[k].hisstatus = 1;
                           ladki[j].herstatus = 1;
                           commited[m] = ladka[k];
                           comb[m] = ladka[k];
                           comg[m] = ladki[j];
                           m++;

                    }
                    k++;
                }
                j++;
         }
         for(int  i = 0; i < identity - 1; i++) {
        	 	for( j = 0; j < identity - i - 1; j++) {
        	 			if(jodi[j].dumbboy.compareTo(jodi[j + 1].dumbboy) > 0) {
        	 					makecouple1 temp = jodi[j];
        	 					jodi[j] = jodi[j + 1];
        	 					jodi[j + 1] = temp;
        	 				}
        	 			
        	 	}
        	 	
         }
         
         File getout = new File("output2.txt");
         FileOutputStream takehis  = new FileOutputStream(getout);
         BufferedWriter writehis = new BufferedWriter(new OutputStreamWriter(takehis));
         int y = nob -1;
         writehis.write("after searching");;
         while(y >= 0) {
        	 	int t = binarySearch(jodi,0, identity - 1, ladka[y]);
        	 	if(t > 0) {
        	 			writehis.write(ladka[y] + " has girlfriend" + jodi[t].smartgirl );
        	 			writehis.newLine();
        	 			
        	 	}
        	 	y--;
         }
        	 	
         
	
       
       writehis.close();
    }

	  
}

