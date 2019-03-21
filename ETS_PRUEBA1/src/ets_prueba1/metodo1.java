/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ets_prueba1;

/**
 *
 * @author josnih
 */
public class metodo1 {
    public int puchimont(int n){
        if(n<=0)
        return 1;
        int nc=0;
        for(int i=0;i<n;i++){
            nc+=puchimont(i)*puchimont(n-1-i);
        }
    return nc;
    }
}

