/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.app.service;

/**
 *
 * @author montespierreg
 */
public class EdutecService {
    
    public double promNum(int n1, int n2){
        double prom;
        
        prom = (n1 + n2)/2;
        
        return prom;
    } 
    
    public double promNum(int n1, int n2, int n3){
        double prom;
        
        prom = (n1 + n2 + n3)/3;
        
        return prom;
    }
    
    public double promNum(int n1, int n2, int n3, int n4){
        double prom;
        
        prom = (n1 + n2 + n3 + n4)/4;
        
        return prom;
    }
    
    public double promNum(int n1, int n2, int n3, int n4, int n5){
        double prom;
        
        prom = (n1 + n2 + n3 + n4 + n5)/5;
        
        return prom;
    }
}
