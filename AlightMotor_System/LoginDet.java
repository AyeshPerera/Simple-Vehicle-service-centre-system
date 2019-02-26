/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlightMotor_System;

/**
 *
 * @author Ayesh Perera
 */
public class LoginDet {
    
    public String Enmb;
    public String Ename;
    public String section;
    
    public LoginDet(String enmb,String ename,String sec){
        
        this.Enmb=enmb;
        this.Ename=ename;
        this.section=sec;
        
    }
    
    public String getEnmb(){
        return Enmb;
    }
    
    public String getEname(){
        return Ename;
    }
    
    public String getSec(){
        return section;
        
    }
    
}
