/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


public class MyUtils {
    public static float ucgenCevre(float a,float b, float c) {
        return a+b+c;
    }
    
    
    /** Bu yöntem üçgenin alanını bulmak içindir. */
    
     public static float ucgenAlan(float a,float b, float c) {
        float x = MyUtils.ucgenCevre(a,b,c) / 2;
        float area=  (float)Math.sqrt(x*(x-a)*(x-b)*(x-c));
        return area;
    }
     
     /** 
Bu yöntem çokgenin çevresini bulmak içindir. */
     
     public static float cokgenCevre(float ... kenar) {
        float perimeter = 0;
        for (float j:
                kenar) {
            perimeter += j;
        }
        return perimeter;
    }
     
     
     /** Bu yöntem çokgenin alanını bulmak içindir. */
     
     public static float cokgenAlan(float ... kenar) {
        float areaP=  (float) ((1.0/4.0) *  kenar.length * (float)Math.pow(kenar[0], 2) * (1/Math.tan(Math.PI/kenar.length)) );
              return areaP;  
    }
     
     /** bu yöntem verilen özel  fonksiyonun cözümü  **/
     public static double[] lastfunction(int[] numbers) {
        double[] result = new double[numbers.length];
        int counter =0;
        for (double x: numbers) {
            x = 3 * Math.pow(x, 2) - 2*Math.pow(Math.E, x) + Math.sqrt(x);
            result[counter] = 1 / (1 + Math.pow(Math.E, x));
            counter++;
        }
        return result;
    }
    
  
    public static void main(String[] args) {
      
      System.out.println(MyUtils.ucgenCevre(10,15,10));
        System.out.println(MyUtils.ucgenAlan(10,15,10));
        System.out.println(MyUtils.cokgenCevre(10,15,10,15,10));
        System.out.println(MyUtils.cokgenAlan(10,15,10,15,10));

        int[] numbers = {34,50,-12,25,-65,-43,80,5,77,9};
        double[] results = MyUtils.lastfunction(numbers);

        for (double result:
                results) {
            System.out.println(result);
        }
    
    
    }
            
    
}
