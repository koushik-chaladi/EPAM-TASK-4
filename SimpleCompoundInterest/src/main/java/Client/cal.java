/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

/**
 *
 * @author HP
 */
import com.mycompany.simplecompoundinterest.*;
import java.util.*;
import java.io.*;
public class cal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        double principle=s.nextInt();
        double rate=s.nextInt();
        double time=s.nextInt();      
        OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
        streamWriter.write(String.valueOf(Simple.calSimple(principle, rate, time)));
        streamWriter.flush();
    }
    
}
