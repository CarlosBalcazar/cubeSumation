package Util;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Carlos
 */
public class SystemUtil {

    private final Scanner sc;

    public SystemUtil() {
        sc = new Scanner(System.in);
    }

    public Scanner getSc() {
        return sc;
    }

    public Integer getInt() {
        Integer n = -1;
        try {
            n = sc.nextInt();
        } catch (InputMismatchException e) {
        }
        return n;
    }
    
    public void skip() {
        sc.skip("\n");
    }
    
    public String getString() {
        return sc.nextLine();
    }

    
}
