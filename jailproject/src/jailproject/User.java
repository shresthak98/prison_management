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
public class User {
    
    private int visitorid;
    private String name;
    private String address;
    private String contact;
    
    public User(int vid,String name,String address,String contact)
    {
        this.visitorid=vid;
        this.name=name;
        this.address=address;
        this.contact=contact;
    }
    
    public int getvid()
    {
        return visitorid;
    }
    
    public String getname()
    {
        return name;
    }
    public String getaddress()
    {
        return address;
    }
    public String getcontact()
    {
        return contact;
    }
    
}
