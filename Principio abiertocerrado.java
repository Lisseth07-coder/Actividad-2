/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.principiossolid;

/**
 *
 * @author diana
 */
public class Bebida {
    

    public String Name;
    public String Type;
    public String Price;

public class Invoice {
    
    
    public decimal GetTotal(IEnumerable<Bebida> IstBebida)
            
            decimal total = 0;
            foreach (var Bebida in lstBebida)
            
            {
              if (bebida.Type == "Agua")  
                  total += bebida.price;
              else if (bebida.Type == "Azucar")
                  total += bebida.price * 0.33m;
                  else if (bebida.Type == "Alcohol")
                  total += bebida.price * 0.16m;
            }
            
   
    
    }

public interface Ibebida
        
    public String Name;
    public decimal Invoice;
    public decimal Price;
    public decimal GetPrice()
            
    {
        return Price * Invoice;
    }


    

        
        }
    }
    

public class Invoice
{

}

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
}
    



       
