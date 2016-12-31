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
public class wardenst {
    private int wardenid;
    private String name;
    private String address;
    private int contact;
    private int salary;
    private int rank;
    
    public wardenst(int wid,String name,String address,int contact,int sal,int rnk)
    {
        this.wardenid=wid;
        this.name=name;
        this.address=address;
        this.contact=contact;
        this.salary=sal;
        this.rank=rnk;
    }
    
    public int getwid()
    {
        return wardenid;
    }
    
    public String getname()
    {
        return name;
    }
    public String getaddress()
    {
        return address;
    }
    public int getcontact()
    {
        return contact;
    }
    public int getsalary()
    {
        return salary;
    }
    public int getrank()
    {
        return rank;
    }
    
}
