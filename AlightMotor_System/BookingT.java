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
public class BookingT {
    
    public int bnmbr;
    public String clntnmbr;
    public Date bdate;
    public String btype;
    public String aprl;
    public String clinfo;
    public String cnfrmdate;
    public String job_stat;
    public String vehi_rel;
    
    public BookingT(int bnmb,String clnt,Date bd,String btp,String apr,String clinf,String cnfrmd,String jb,String vr)
    {
        
        this.bnmbr=bnmb;
        this.clntnmbr=clnt;
        this.bdate=bd;
        this.btype=btp;
        this.aprl=apr;
        this.clinfo=clinf;
        this.cnfrmdate=cnfrmd;
        this.job_stat=jb;
        this.vehi_rel=vr;
        
        
    }
    
    public int getBnmbr(){
        return bnmbr;
    }
    
    public String getclntnmbr(){
        return clntnmbr;
    }
    public Date BookinnDt(){
        return bdate;
               
    }
    public String getBokkingtpe(){
        return btype;
        
    }
    public String getAprvl(){
        return aprl;
    }
    
    public String getClientinfo(){
        return clinfo;
    }
    
    public String getCnfrdte(){
        return cnfrmdate;
    }
    
    public String getJobStat(){
        return job_stat;
    }
    
    public String getVehi_rel(){
        return vehi_rel;
    }
}
