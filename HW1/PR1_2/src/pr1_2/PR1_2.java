/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_2;

/**
 * @author doliver17
 */
public class PR1_2 {
    public static void main(String[] args) {
        String s = " ";
        for(int i = 0; i < 3; i++) {
            //PT: Should probably be if (args.length > i)
            //    What if you only got two arguments?
            if(args.length > 0)
                s = args[i];
            System.out.println(s);
        }
    }
}
