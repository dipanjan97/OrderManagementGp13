package com.psl.project.services

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateBill {
	
public static String createBill(String customerName, Order orders) throws IOException {
		String res = customerName+"Bill"+orders.getOrderDate();
		String write = "";
		double total = 0;
		write += "Name : "+customerName;
		write += "\tOrder Date : "+orders.getOrderDate();
		write += "\nStatus : "+orders.getStatus();
		write += "\n\n|ItemNo.  |  ItemDesc  |  Quantity  |  ItemPrice  |  Total  |\n";
		write += "-------------------------------------------------------------\n";
		OrderItems[] oi = orders.getOrderItems();
		for(int i = 0;i<oi.length;i++) {
			write += String.format("|%"+(9)+"d",oi[i].getItemNumber());
			write += String.format("|%"+(12)+"s", oi[i].getItemDescription());
			write += String.format("|%"+12+"d", oi[i].getQuantity());
			write += String.format("|%"+13+".2f", oi[i].getItemPrice());
			write += String.format("|%"+9+".2f", oi[i].getItemPrice()*oi[i].getQuantity());
			total = oi[i].getItemPrice()*oi[i].getQuantity();
			write += "\n";
		}
		write += String.format("%"+60+"s","Grand Total : "+total+"0");
//		System.out.println(write);
		File newFile = new File("C:\\gitproject\\"+res+orders.getOrderDate()+".txt");
		newFile.createNewFile() ;
		try (
				FileWriter out = new FileWriter(newFile);) {
			
			out.write(write);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res+" created.";
	}