/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author ma11-132
 */

import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть кількість структур: ");
        int mas = scan.nextInt();
        MyGroup [] Group = new MyGroup[mas+2];
       
        
        
        for (int i = 0; i < Group.length-2; i++){
            MyGroup temp = new MyGroup();
            
            
            System.out.println("Введіть дані: ");
            temp.Data = scan.next();
            
            
            System.out.println("Ввеліть ключ: ");
            temp.Key = scan.nextFloat();
           Group[i] = temp;
           System.out.println(  "Введіть іншу структкру " );
            
            
        }
        
        boolean flag = true;
        while(flag == true){
            flag=false;
            for (int i = 0; i<mas-1; i++){
                if (Group[i].Key < Group[i+1].Key){
                    flag = true;               
                    MyGroup change = new MyGroup();
                    
                    change.Data = Group[i].Data;
                    change.Key = Group[i].Key;
                    
                    
                    Group[i].Data = Group[i+1].Data;
                    Group[i].Key = Group[i+1].Key;
                
                    
                    Group[i+1].Data = change.Data;
                    Group[i+1].Key = change.Key;
                }  
            }
        }
        
        System.out.println("Структури за зростанням ключів:");
        for(int i = 0; i<mas; i++){
          System.out.println(i);
          System.out.println(  " Дані: " + Group[i].Data+ " Ключ: " + Group[i].Key);
          
        }
          for (int i = Group.length-2; i < Group.length; i++){
            MyGroup temp1 = new MyGroup();
          
            System.out.println("Введіть дані: ");
            temp1.Data = scan.next();

            System.out.println("Ввеліть ключ: ");
            temp1.Key = scan.nextFloat();
            Group[i] = temp1;
           System.out.println(  "Введіть іншу структкру " );
            
        }
           boolean flag1 = true;
        while(flag1 == true){
            flag1=false;
            for (int i = 0; i<mas+1; i++){
                if (Group[i].Key < Group[i+1].Key){
                    flag1 = true;               
                    MyGroup change = new MyGroup();
                    
                    change.Data = Group[i].Data;
                    change.Key = Group[i].Key;
                    
                    
                    Group[i].Data = Group[i+1].Data;
                    Group[i].Key = Group[i+1].Key;
                
                    
                    Group[i+1].Data = change.Data;
                    Group[i+1].Key = change.Key;
                }  
            }
        }
          
           System.out.println("Структури за зростанням ключів(з нивими струкрурами):");
        for(int i = 0; i<Group.length; i++){
          System.out.println(i);
          System.out.println(  " Дані: " + Group[i].Data+ " Ключ: " + Group[i].Key);
          
        }
        
    } 
 }