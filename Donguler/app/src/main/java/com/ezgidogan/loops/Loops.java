package com.ezgidogan.loops;

public class Loops {
    public static void main(String[] args ){
        // for loops

        int[] myNumbers= {12,15,18,21,24};

        for (int i=0 ; i < myNumbers.length; i++){
            int x= myNumbers[i]/3*5;
            //System.out.println(x);
        }

        for (int number: myNumbers){
          //  System.out.println(number/3*5);
        }
      for(int a= 0; a<10;a++){
          int b = a*10;
          System.out.println(b);
      }


      // while

        int y=0;

      while (y<10){
          int m= y*10;
          System.out.println(m);
          y++;
      }
    }
}
