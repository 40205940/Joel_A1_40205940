/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment12;
import java.util.Scanner;
/**
 *
 * @author 40205940
 */
public class Assignment12 {

    public static void main(String[] args) {
       
      String[] month = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "December"};
        int[] temp2023 = {8,9,12,16,18,22,24,22,20,16,12,9};
        int[] temp2024 = {8,8,12,17,19,20,23,22,19,16,10,8};
        
           
         
        String lookmonth;
       Scanner inputmonth = new Scanner (System.in);
       System.out.println("Enter then name of the month you want ot search: ");
        lookmonth = inputmonth.next();
        
        
        boolean found = false;
        
        for (int p=0; p<12; p++){
           if (lookmonth.equalsIgnoreCase(month[p])){
           System.out.println("Records for" + month[p]+ ":");
           System.out.println("2023 Temp:" + temp2023[p]);
           System.out.println("2024 Temp:" + temp2024[p]);
           found=true;
           break;
        }
    }
    }
        
        
        
        
        
        
       
        
        
    }
        
        
        

