/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlightMotor_System;

import java.util.Date;

/**
 *
 * @author Ayesh Perera
 */
public class Homemsge {
    
    public int bnmbr;
    public String msg;
    public Date bdate;
    
    
    public Homemsge(int bnmb,String msg,Date bd)
    {
        
        this.bnmbr=bnmb;
        this.msg=msg;
        this.bdate=bd;
        
        
        
    }
    
    public int getBnmbr(){
        return bnmbr;
    }
    
    public String getmsg(){
        return msg;
    }
    public Date BookinnDt(){
        return bdate;
               
    }
  
}
