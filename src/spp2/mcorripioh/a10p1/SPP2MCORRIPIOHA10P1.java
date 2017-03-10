/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.a10p1;
import java.util.Scanner;

/**
 *
 * @author MayteCorripio
 */
public class SPP2MCORRIPIOHA10P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] a,b,r;
        int tamano=solicitaTamano();
        
        //Crear matrices
        a=crearMatriz("A",tamano);
        b=crearMatriz("B",tamano);
        
        //Restar matrices
        r=restaMatrices(a,b);
       
        System.out.println("La resta de las matrices es" +r);
        
    }
    
    public static int solicitaTamano(){
        Scanner kb= new Scanner (System.in);
        int var;
        System.out.println("Introduce el tamaño de la matriz");
        var = solicitarNumero();
        return var;
                
    }
    
    public static int [][]crearMatriz(String nom,int tamano){
        int[][] miMatriz= new int[tamano][tamano];
        for(int i=0; i<miMatriz.length; i++){
            for(int j=0; j<miMatriz[i].length; j++){
                miMatriz[i][j]= solicitarNumero();
            }
        
    } return miMatriz;
    
    }
    
    public static int solicitarNumero(){
        Scanner kb = new Scanner (System.in);
        int varEntera=0;
        boolean flag;
        
        do { 
            System.out.println("Introduce un número");
            try{
                //Código que puede producir un error (Excepcion)
                varEntera = kb.nextInt();
                flag = false;
            } catch (Exception ex){
                //Código para el manejo del error
                System.out.println("Introdujiste algo que no es entero " +ex);
                flag = true;
                 kb.nextLine();
            }
        } while (flag);
        return varEntera;
    }
    
    public static int[][] restaMatrices(int [][]a, int [][]b){
        int[][]r= new int[a.length][a.length];
       
        for (int i=0; i<r.length;i++){
            for (int j=0; j<r[i].length; j=j+1){
             r[i][j]=a[i][j] - b[i][j];
            }
             
    }
        return r;
        
  
}
    
}

