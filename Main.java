package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        ArrayList<String> kopi = new ArrayList<String>();
        ArrayList<String> Topping = new ArrayList<String>();
        ArrayList<String> Asal = new ArrayList<String>();

        Kopi robusta = new Kopi();
        robusta.setNama_kopi("Robusta");
        robusta.setAsal_kopi("Eropa");
        kopi.add(robusta.getNama_kopi());
        Asal.add(robusta.getAsal_kopi());

        Kopi arabica = new Kopi();
        arabica.setNama_kopi("Arabica");
        arabica.setAsal_kopi("Timur Tengah");
        kopi.add(arabica.getNama_kopi());
        Asal.add(arabica.getAsal_kopi());

        Kopi flores = new Kopi();
        flores.setNama_kopi("Flores");
        flores.setAsal_kopi("Asia");
        kopi.add(flores.getNama_kopi());
        Asal.add(flores.getAsal_kopi());

        Topping fadil = new Topping();
        fadil.setTopping("Boba");
        Topping.add(fadil.getTopping());
        fadil.setTopping("Keju");
        Topping.add(fadil.getTopping());

        System.out.println("\t MENU KOPI");
        for (int i = 0; i < kopi.size(); i++) {
            int j = i + 1;
            System.out.println("\t " + j + ": " + kopi.get(i));
        }

        System.out.println("\t MENU TOPPING");
        for (int i = 0; i < Topping.size(); i++) {
            int j = i + 1;
            System.out.println("\t " + j + ": " + Topping.get(i));

        }

        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("");
            System.out.print("Masukkan Pilihan Kopi Anda : ");
            int pilihkopi = keyboard.nextInt() - 1;
            System.out.print("Masukkan Pilihan Topping Anda : ");
            int pilihtopping = keyboard.nextInt() - 1;

            System.out.println("");
            System.out.println("Pesanan anda adalah kopi " + kopi.get(pilihkopi) + " yang berasal dari " + Asal.get(pilihkopi) + " dengan topping " + Topping.get(pilihtopping));
        } catch (Exception e) {
            System.out.println("Inputan Anda Salah ");
            System.out.println(e + "\n");
        }


    }

}




