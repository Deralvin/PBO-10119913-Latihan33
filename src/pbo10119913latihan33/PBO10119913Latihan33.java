/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan33;

import java.util.Scanner;

/**
 * @author
 * NAMA     : Muhammad Alvin Rizqi Ramadhan 
 * KELAS    : IF 10K
 * NIM      : 10119913
 */
public class PBO10119913Latihan33 {

     private static String usName, passWord;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        usName = scanner.nextLine();
        System.out.print("Masukkan Password : ");
        passWord = scanner.nextLine();
        User user1 = new User();
        user1.pengecekkanLogin(usName,passWord);
    }
    
}
