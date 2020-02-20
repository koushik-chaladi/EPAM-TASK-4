/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import com.mycompany.housing.*;
import java.util.*;
public class calProce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic he
        Scanner s=new Scanner(System.in);
        String mat=s.nextLine();
        int total=s.nextInt();
        boolean auto=s.nextBoolean();
        System.out.println(Pricing.calPrice(mat, total, auto));
    }
    
}
