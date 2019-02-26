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
public class StoreT {
    
    public int itmnmbr;
    public String itmname;
    public String itmtpe;
    public Date recdte;
    public Date remdate;
    public String itmcnt;
    public int itmqty;
    public int itmreqty;
    
    
    public StoreT(int itmnmbr,String itmname,String itmtpe,Date recdte,Date remdate,String itmcnt,int itmqty,int itmreqty)
    {
        
       this.itmnmbr=itmnmbr;
       this.itmname=itmname;
       this.itmtpe=itmtpe;
       this.recdte=recdte;
       this.remdate=remdate;
       this.itmcnt=itmcnt;
       this.itmqty=itmqty;
       this.itmreqty=itmreqty;
        
        
    }
    
    public int getitmnmb(){
        return itmnmbr;
    }
    
    public String getitmname(){
        return itmname;
    }
    
    public String getitmtpe(){
        return itmtpe;
        
    }
    public Date getrecdte(){
        return recdte;
    }
    
    public Date getremdate(){
        return remdate;
    }
    
    public String getitmcnt(){
        return itmcnt;
    }
    
    public int getitmqty(){
        return itmqty;
    }
    
    public int getitmreqty(){
        return itmreqty;
    }
}
