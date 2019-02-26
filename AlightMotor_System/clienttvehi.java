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
public class clienttvehi {
    
    public int vehiid;
    public String vnmbr;
    public String cnmbr;
    public String vtype;
    
    
    public clienttvehi(int xvehiid,String xvnmbr,String xcnmbr,String xvtype)
    {
        
        this.vehiid=xvehiid;
        this.vnmbr=xvnmbr;
        this.cnmbr=xcnmbr;
        this.vtype=xvtype;
        
        
        
    }
    
    public int getvehiid(){
        return vehiid;
    }
     public String getcnmbr(){
        return cnmbr;
    }
    
    public String getvnmbr(){
        return vnmbr;
    }
    public String getvtype(){
        return vtype;
               
    }
    
}
