

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


public class mainfunction1 {
	/**
	 * here we make couple by odd-even value of
	 * variable if value is odd a suitable boy is searched over an array
	 * for girls else vice-versa
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
        for(int i  = 0; i < nog - 1; i++) {
        		for(int j = 0; j < nog - i - 1; j++) {
        				if(ladki[j].herbudget > ladki[j+ 1].herbudget) {
        						selfishgirl1 temp = ladki[j];
        						 ladki[j] = ladki[j+ 1];
        						 ladki[j + 1] = temp;
        				}
        		}
        	 
         }
        for(int i  = 0; i < nob - 1; i++) {
    		for(int j = 0; j < nob - i - 1; j++) {
    				if(ladka[j].hisattractiveness > ladka[j+ 1].hisattractiveness) {
    						honestboys1 temp = ladka[j];
    						 ladka[j] = ladka[j+ 1];
    						 ladka[j + 1] = temp;
    				}
    		}
    	 
     }
        int identity =0;
        int j = 0, k = 0;
        honestboys1 comb[] = new honestboys1[10];
        selfishgirl1 comg[] = new selfishgirl1[5];
        makecouple1 jodi[] = new makecouple1[10];
        int m = 0;
        int u = 1;
        int h = 0;
         while(true) {
        	 if(u % 2 == 1) {
        		 if(ladki[j].herstatus == 1){
                 	j++;
                 }
        	 	k=0;
                while(k < nob)  {
                    if(ladki[j].herbudget < ladka[k].hisbudget &&ladka[k].hisstatus == 0 && ladki[j].herstatus==0) {
                           jodi[identity] = new makecouple1(ladki[j].hername,ladka[k].hisname,identity);
                           identity++;
                           ladka[k].hisstatus = 1;
                           ladki[j].herstatus = 1;
                           comb[m] = ladka[k];
                           comg[m] = ladki[j];
                           m++;

                    }
                    k++;
                }
                if(ladki[j].herstatus == 1){
                	j++;
                }
        	 } else {
        		 if(ladka[h].hisstatus == 1) {
        			 	h++;
        		 }
        		  int w = 0;
                 while(w < nog)  {
                     if(ladki[w].herbudget < ladka[h].hisbudget &&ladka[h].hisstatus == 0 && ladki[w].herstatus==0) {
                            jodi[identity] = new makecouple1(ladki[w].hername,ladka[h].hisname,identity);
                            identity++;
                            ladka[h].hisstatus = 1;
                            ladki[w].herstatus = 1;
                            comb[m] = ladka[k];
                            comg[m] = ladki[j];
                            m++;

                     }
                     
                 }
                 if(ladka[k].hisstatus == 1) {
                	 h++;
                 }
                 
        		 	
        	 }
        	 if(m == 5) {
        		 	break;
        	 }
        	 u++;
         }
         Random any = new Random();
         int i = 0;
         int a,b,c,d;
         costlygifts gh[] = new costlygifts[200];
         for(i = 0; i < 200; i++) {
        	 	int t = any.nextInt(3) + 1;
        	 	if(t == 1) {
        	 			a = any.nextInt(350) + 1;
        	 			b = any.nextInt(50)+1;
        	 			gh[i] =new  costlygifts(a,b,t);
        	 	}
        	 	if(t == 2) {
        	 			a= any.nextInt(10000) + 1000;
        	 			b = any.nextInt(100) + 50;
        	 			c = any.nextInt(5) + 1;
        	 			d = any.nextInt(10) + 1;
        	 			gh[i] = new  costlygifts(a,b,c,d);
        	 	}
        	 	if(t == 3) {
    	 			a= any.nextInt(500) + 1000;
    	 			b = any.nextInt(35) + 15 ;
    	 			c = any.nextInt(5) + 1;
    	 			d = any.nextInt(10) + 1;
    	 			gh[i] = new  costlygifts(a,b,c,d,t);
    	 	}

         }
         for(i = 0; i < 200 - 1; i++) {
        	 	for( j = 0; j < 200 - i - 1; j++) {
        	 			if(gh[j].price1 > gh[j+1].price1) {
        	 					costlygifts temp = gh[j];
        	 					gh[j+1] = gh[j];
        	 					gh[j] = temp;

        	 			}
        	 	}
         }
         File getout = new File("output2.txt");
         FileOutputStream takehis  = new FileOutputStream(getout);
         BufferedWriter writehis = new BufferedWriter(new OutputStreamWriter(takehis));
         happyness ha[] = new happyness[100];
         compatibility ha1[] = new compatibility[100];
         int sum = 0;
         int k1= 0, k2 = 0;
         double x;
         for(i = 0; i < m; i++) {
        	 if(comb[i].histype == 1) {
        		 writehis.write("gifts exchange between" + comb[i].hisname+ "and"+ comg[i].hername);
        		 writehis.newLine();
        		 	for(j = 0; j < 200; j++) {
        		 			if(sum + gh[j].price1 <= comg[i].herbudget){
        		 					sum = sum + gh[j].price1;
        		 					if(gh[j].gifttype == 1) {
        		 						writehis.write("essentialgift"+ gh[j].price1 +" "+ gh[j].essentialgifts_value);
        		 						 writehis.newLine();
        		 					}
        		 					if(gh[j].gifttype == 2) {
        		 						writehis.write("luxurygift" + gh[j].price1 + gh[j].luxurygifts_value + " "+gh[j].luxurygifts_rating+ " " + gh[j].luxurygifts_difficulty);
        		 						 writehis.newLine();
        		 					}
        		 					if(gh[j].gifttype == 3) {
        		 						writehis.write("utilitygift" + gh[j].price1 + gh[j].utilitygifts_utyvalue + " "+gh[j].utilitygifts_class+ " " + gh[j].utilitygifts_value);
        		 						 writehis.newLine();
        		 					}


        		 			}
        		 	}

        		 	k1 = comb[i].hisbudget - sum;
        		 	x = sum;
        		 	if(comg[i].hertype == 1){
        		 		k2 = (int)Math.log(x);

        		 	}
        		 	if(comg[i].hertype == 2){
         		 		k2 = sum + comg[i].herbudget;

         		 	}
         		 	if(comg[i].hertype == 3){
         		 		k2 = (int)Math.exp(x);

         		 	}

        		 	ha[i] = new happyness(k1+k2, comb[i].hisname,comg[i].hername);
        		 	k1 = Math.abs(comb[i].hisbudget - comg[i].herbudget) + Math.abs(comb[i].hisattractiveness - comg[i].herattractiveness)+  Math.abs(comb[i].hisintelligence - comg[i].herintelligence);
         		 	ha1[i] = new compatibility(k1,comb[i].hisname,comg[i].hername );



        	 }
        	 if(comb[i].histype == 2) {
        		 writehis.write("gifts exchange between" + comb[i].hisname+ "and"+ comg[i].hername);
        		 writehis.newLine();
     		 	for(j = 199; j >= 0; j--) {
     		 			if(sum + gh[j].price1 <= comg[i].herbudget){
     		 					sum = sum + gh[j].price1;
     		 					if(gh[j].gifttype == 1) {
     		 						writehis.write("essentialgift"+ gh[j].price1 +" "+ gh[j].essentialgifts_value);
     		 						 writehis.newLine();
     		 					}
     		 					if(gh[j].gifttype == 2) {
     		 						writehis.write("luxurygift" + gh[j].price1 + gh[j].luxurygifts_value + " "+gh[j].luxurygifts_rating+ " " + gh[j].luxurygifts_difficulty);
     		 						 writehis.newLine();
     		 					}
     		 					if(gh[j].gifttype == 3) {
     		 						writehis.write("utilitygift" + gh[j].price1 + gh[j].utilitygifts_utyvalue + " "+gh[j].utilitygifts_class+ " " + gh[j].utilitygifts_value);
     		 						 writehis.newLine();
     		 					}


     		 			}
     		 	}

     		 	k1 = comb[i].hisbudget - sum;
     		 	x = sum;
     		 	if(comg[i].hertype == 1){
     		 		k2 = (int)Math.log(x);

     		 	}
     		 	if(comg[i].hertype == 2){
     		 		k2 = sum + comg[i].herbudget;

     		 	}
     		 	if(comg[i].hertype == 3){
     		 		k2 = (int)Math.exp(x);

     		 	}
     		 	k1 = k2;


     		 	ha[i] = new happyness(k1+k2, comb[i].hisname,comg[i].hername);
     		 	k1 = Math.abs(comb[i].hisbudget - comg[i].herbudget) + Math.abs(comb[i].hisattractiveness - comg[i].herattractiveness)+  Math.abs(comb[i].hisintelligence - comg[i].herintelligence);
     		 	ha1[i] = new compatibility(k1,comb[i].hisname,comg[i].hername );

        	 }


         if(comb[i].histype == 3) {
        	 writehis.write("gifts exchange between" + comb[i].hisname+ "and"+ comg[i].hername);
        	 writehis.newLine();
  		 	for(j = 0; j < 200; j++) {
  		 			if(sum + gh[j].price1 <= comg[i].herbudget){
  		 					sum = sum + gh[j].price1;
  		 					if(gh[j].gifttype == 1) {
  		 						writehis.write("essentialgift"+ gh[j].price1 +" "+ gh[j].essentialgifts_value);
  		 						writehis.newLine();
  		 					}
  		 					if(gh[j].gifttype == 2) {
  		 						writehis.write("luxurygift" + gh[j].price1 + gh[j].luxurygifts_value + " "+gh[j].luxurygifts_rating+ " " + gh[j].luxurygifts_difficulty);
  		 						writehis.newLine();
  		 					}
  		 					if(gh[j].gifttype == 3) {
  		 						writehis.write("utilitygift" + gh[j].price1 + gh[j].utilitygifts_utyvalue + " "+gh[j].utilitygifts_class+ " " + gh[j].utilitygifts_value);
  		 						writehis.newLine();
  		 					}


  		 			}
  		 	}

  		 	k1 = comb[i].hisbudget - sum;
  		 	for(j = 0; j < 200; j++) {
  		 			if(gh[j].gifttype == 2 && gh[j].price1 <=k1){
  		 					sum = sum + gh[j].price1;
  		 			}

  		 	}
  		 	x = sum;
  		 	if(comg[i].hertype == 1){
  		 		k2 = (int)Math.log(x);

  		 	}
  		 	if(comg[i].hertype == 2){
  		 		k2 = sum + comg[i].herbudget;

  		 	}
  		 	if(comg[i].hertype == 3){
  		 		k2 = (int)Math.exp(x);

  		 	}
  		 	k1 = comg[i].herintelligence;


  		 	ha[i] = new happyness(k1+k2, comb[i].hisname,comg[i].hername);
  		 	k1 = Math.abs(comb[i].hisbudget - comg[i].herbudget) + Math.abs(comb[i].hisattractiveness - comg[i].herattractiveness)+  Math.abs(comb[i].hisintelligence - comg[i].herintelligence);
 		 	ha1[i] = new compatibility(k1,comb[i].hisname,comg[i].hername );


     	 }





      }
	  k = 3;
	  for(i = 0; i < m -1; i++) {
		  	for(j = 0; j < m - i - 1;j++) {
		  			if(ha[j].happy < ha[j+1].happy) {
		  					happyness temp = ha[j];
		  					ha[j] = ha[j+1];
		  					ha[j+1] = temp;

		  			}
		  			if(ha1[j].comp < ha1[j+1].comp) {
	  					compatibility temp = ha1[j];
	  					ha1[j] = ha1[j+1];
	  					ha1[j+1] = temp;

		  			}
		  	}
	  }
	  writehis.write("happy couples");
	  writehis.newLine();
	  for(i = 0; i < k; i++) {
		  writehis.write(ha[i].s1 + " "+ ha[i].s2);
		  writehis.newLine();

	  }
	  writehis.write("compatibile couples");
	  writehis.newLine();

	  for(i = 0; i < k; i++) {
		  writehis.write(ha1[i].str1 + " "+ ha1[i].str2);
		  writehis.newLine();
	  }
	  writehis.close();

	}
}
