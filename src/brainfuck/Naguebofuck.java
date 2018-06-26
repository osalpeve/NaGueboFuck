/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brainfuck;

import java.util.Scanner;
import java.util.regex.Pattern;


class Naguebofuck {
    private Scanner scan ;
    private final int L = 65535;
    private byte[] mem ;
    private int apuntador;
    public  Naguebofuck(){
    this.scan= new Scanner(System.in);
    this.mem= new byte[L];
    }
     public void interpretar(String code) {
        int l = 0;

            code=code.replace("\n","").replace("\t","");
            String[] parte = code.split(" ");
            
            //for(int i = 0; i < parte.length; i++) {
            //System.out.println(parte[i]);
            //} 
    try{
        for(int i = 0; i <parte.length-1; i++) {
            if(parte[i].equals("COÑO")) {
                apuntador = (apuntador == L-1) ? 0 : apuntador + 1;
                
            } else if(parte[i].equals("VERGA")) {
                
                apuntador = (apuntador == 0) ? L-1 : apuntador - 1;
                
                
            } else if(parte[i].equals("MARICO")) {
                mem[apuntador]++;
            } else if(parte[i].equals("NOJODA")) {
                mem[apuntador]--;
            } else if(parte[i].equals("MAMAGUEVO")) {
                System.out.print((char) mem[apuntador]);
            } else if(parte[i].equals("PAJUO")) {
                mem[apuntador] = (byte) scan.next().charAt(0);
            } else if(parte[i].equals("GUEBON")) {
                if(mem[apuntador] == 0) {
                    i++;
                    while(l > 0 || !"CABRON".equals(parte[i])) {
                        if(parte[i].equals("GUEBON")) l++;
                        if(parte[i].equals("CABRON")) l--;
                        i++;
                    }
                }
            } else if(parte[i].equals("CABRON")) {
                if(mem[apuntador] != 0) {
                    i--;
                    while(l > 0 || !"GUEBON".equals(parte[i])) {
                        if(parte[i].equals("CABRON")) l++;
                        if(parte[i].equals("GUEBON")) l--;
                        i--;
                    }
                    i--;
                }
            }
        }
    } catch(ArrayIndexOutOfBoundsException e){

}
    
     } 
}
