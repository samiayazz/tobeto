package com.tobeto.day1.homeworks;

import java.util.HashMap;
import java.util.Scanner;

public class Homework1 {
	
	/* 1- Switch case ile müşteriden alınan sipariş numarasına göre 
	 hangi ürünün sipariş edildiğini belirleyen algoritma yazınız.
	 Input için Scanner kullanınız */
	
	public static void main(String[] args) {
		HashMap<Integer, String> orders = createOrders();
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Sipariş numarasını giriniz: ");
        String input = scanner.next();
        
        try {
        	int orderNumber = Integer.parseInt(input);
            
            if (orders.containsKey(orderNumber))
            	System.out.println(orderNumber + " numaralı siparişe ait ürünün adı: " + orders.get(orderNumber));
            else
            	System.out.println(orderNumber + " numaralı sipariş bulunamadı.");
        } catch (NumberFormatException e) {
            System.out.println("Geçersiz bir sipariş numarası girildi.");
        }
        
        scanner.close();
	}
	
	private static HashMap<Integer, String> createOrders() {
		HashMap<Integer, String> orders = new HashMap<>();
		orders.put(1, "Bilgisayar");
		orders.put(2, "Cep Telefonu");
		orders.put(3, "Gözlük");
		return orders;
	}

}
