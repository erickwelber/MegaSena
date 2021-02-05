
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erick
 */
public class Mega {
    
    public static void main(String[] args) {
        
        /*Integer numeros[] = {49,04,31,39,52,53,15,16,18,44};
        List<Integer> lista = Arrays.asList(numeros);
        
        Collections.shuffle(lista);
        
        for(int i=0; i<6; i++){
            System.out.print(lista.get(i) + " ");
        }
        
        System.out.println("");*/
        
        Integer numeros[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
                            21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,
                            38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,
                            55,56,57,58,59,60};
        
        List<Integer> lista = Arrays.asList(numeros);
        
        Collections.shuffle(lista);
        
        int mega[] = new int[6];
        
        for(int i=0; i<mega.length; i++){
            mega[i] = lista.get(i);
        }
        
        Arrays.sort(mega);
        
        String valores = "";
        
        for(int i=0; i<mega.length; i++){
            valores = valores + mega[i] + "-";
        }
        
        char vetor[] = valores.toCharArray();
        
        for(int i=0; i<vetor.length-1; i++){
            System.out.print(vetor[i]);
        }
        //System.out.println(valores);
        
        System.out.println("");
        
        
    }
}
