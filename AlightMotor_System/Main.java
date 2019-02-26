/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlightMotor_System;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;
import java.io.*;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import static java.lang.Thread.sleep;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.TableModel;

/**
 *
 * @author Ayesh Perera
 */

 

public class Main {
    
    public Connection cn;
    public Statement st;
    public String un;
    public String uname;
    public String sec;
    public String Date;
     public String Time;
    
//    public Main(String unmb,String una,String sec){
//        
//        this.un=unmb;
//        this.uname=una;
//        this.sec=sec;
//        
//        
//    }
    
    
    public Connection getcon(){
            
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/alightmotors?zeroDateTimeBehavior=convertToNull","root","");
        
            st=cn.createStatement();
           
                  
            return cn;
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Not Connected");
                        return null;
                    }
        
        
        
    }
    
     public String cTime(){
       
       
            
            
                   
                        Calendar cale=new GregorianCalendar();
        
                        int Second=cale.get(Calendar.SECOND);
                        int Minutes=cale.get(Calendar.MINUTE);
                        int Hour=cale.get(Calendar.HOUR);
                        int Year=cale.get(Calendar.YEAR);
                        int Month=cale.get(Calendar.MONTH);                        
                            Month=Month+1;                            
                        int Day=cale.get(Calendar.DATE);

                        Date=Integer.toString(Year)+ "-"+Integer.toString(Month)+"-"+Integer.toString(Day);                         
                        Time=Integer.toString(Hour) +"-"+Integer.toString(Minutes)+"-"+Integer.toString(Second);
                        
                        try{
                            sleep(1000);
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null,e);
                        }
                        
                        
                    
                    
                     return Date;
                    
                }
            
       
       
        
        
        
    
   
    
    
    
    public static void main(String[] args){
        
        
       LoginFrm lf=new LoginFrm();
       lf.setVisible(true);
        
    }
    
}


