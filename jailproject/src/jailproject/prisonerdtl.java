/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jailproject;

/**
 *
 * @author root
 */
public class prisonerdtl {
    
    private int prisonerid;
    private String name;
    private String address;
    private String Dateofprison;
    private String Dateofrelease;
    private String Dateofbirth;
    private String crime;
    private String personalbelonging;
    private String gender;
    
    public prisonerdtl(int pid,String name,String address,String dop,String dor,String dob,String crm,String pb,String g)
    {
        this.prisonerid=pid;
        this.name=name;
        this.address=address;
        this.Dateofprison=dop;
        this.Dateofrelease=dor;
        this.Dateofbirth=dob;
        this.crime=crm;
        this.personalbelonging=pb;
        this.gender=g;
    }
    
    public int getpid()
    {
        return prisonerid;
    }
    
    public String getname()
    {
        return name;
    }
    public String getaddress()
    {
        return address;
    }
    public String getdop()
    {
        return Dateofprison;
    }
    public String getdor()
    {
        return Dateofrelease;
    }
    public String getdob()
    {
        return Dateofbirth;
    }
    public String getcrm()
    {
        return crime;
    }
    public String getpb()
    {
        return personalbelonging;
    }
    public String getg()
    {
        return gender;
    }
}
