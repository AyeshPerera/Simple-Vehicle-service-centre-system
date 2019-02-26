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
public class EmployeeT {
    
    private int id;
    private String E_name;
    private String Section;
    private String Addr;
    private String tnmbr;
    private Date Ass_Date;
    private int b_sal;
    private String gender;
    private String password;
    
    public EmployeeT(int id,String e_name,String section,String adr,String tnmbr,Date dte,int sal,String gen,String pass ){
        
        this.id=id;
        this.E_name=e_name;
        this.Section=section;
        this.Addr=adr;
        this.tnmbr=tnmbr;
        this.Ass_Date=dte;
        this.b_sal=sal;
        this.gender=gen;
        this.password=pass;
              
    }
    
    public int getid(){
        return id;
    }
    
    public String getName()
    {
        return E_name;
    }
    
    public String getAdr()
    {
        return Addr;
    }
    
    public String getsect()
    {
        return Section;
    }
    
    public String getTnmbr(){
        
        return tnmbr;
    }
    
    public Date getDate()
    {
        return Ass_Date;
    }
    
    public int getsal()
    {
        return b_sal;
    }
    public String getGen(){
        
        return gender;
    }
    
    public String getPass()
    {
        return password;
    }
}

