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
public class prisoneratn {
    
    private int prisonerid;
    private String mrngst;
    private String evest;
    
    public prisoneratn(int pid,String morning_status,String evening_status)
    {
        this.prisonerid=pid;
        this.mrngst=morning_status;
        this.evest=evening_status;
    }
    
    public int getpid()
    {
        return prisonerid;
    }
    
    public String getmrn()
    {
        return mrngst;
    }
    public String geteve()
    {
        return evest;
    }
    
    
}
