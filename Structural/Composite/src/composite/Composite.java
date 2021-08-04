/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList; 
import java.util.List; 

/**
 *
 * @author USER
 */
public class Composite implements Karyawan 
{ 
    private List<Karyawan> ListKaryawan = new ArrayList<Karyawan>(); 
       
    @Override
    public void TampilDataKaryawan()  
    { 
        for(Karyawan karyawan:ListKaryawan) 
        { 
            karyawan.TampilDataKaryawan(); 
        } 
    } 
    
    public void HapusKaryawan(Karyawan karyawan) 
    { 
        ListKaryawan.remove(karyawan); 
    } 
    
    public void TambahKaryawan(Karyawan karyawan) 
    { 
        ListKaryawan.add(karyawan); 
    } 
       
    
} 