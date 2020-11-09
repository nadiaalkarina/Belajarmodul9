package com.company;
import java.util.HashMap;

public class CobaHashMap {
    public static void main(String[] args) {
        // membuat objek hashmap
        HashMap<Integer, String> days = new
                HashMap<Integer, String>();

        // mengisi nilai ke objek days
        days.put(1, "Minggu");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "Kamis");
        days.put(6, "Jum'at");
        days.put(7, "Sabtu");

        // mencetak semua isi dari objek days
        System.out.println("Isi objek days: " + days);
        System.out.println("Hari kedua: " + days.get(2));
        System.out.println("Hari keempat: " + days.get(4));
        System.out.println("Hari kelima: " + days.get(5));
        System.out.println("Hari keenam: " + days.get(6));

        // menghapus malam minggu
        days.remove(1);
        System.out.println("Isi objek days: " + days);

        // mengubah hari menggu menjadi hari ahad
        days.put(1, "Ahad");

        // mengubah hari rabu menjadi rabo
        days.replace(4, "Rabo");

        // mencetak semua isi dari objek days
        System.out.println("Isi objek days: " + days);


    }
}
