package com.Run;

import java.util.List;
import java.util.Scanner;

import org.hibernate.ObjectNotFoundException;

import com.dao.Datadao;
import com.model.User;

public class TestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User();
//		u.setId(2);
//		u.setUsername("testUser123456");
//		u.setEmail("user12356@gmail.com");
//		u.setPassword("123456");
		
		Datadao d = new Datadao();
//		d.insertData(u);
		
		d.FetchAllData().forEach(i->{
			System.out.println(i.getId() +"  |  "+i.getUsername()+"  |  "+i.getEmail()+"  |  "+i.getPassword());					
			});
		Scanner scn = new Scanner(System.in);
		System.out.println("Select your option:");
		System.out.println("1.Insert Data");
		System.out.println("2.Update Data");
		System.out.println("3.Delete Data");
		System.out.println("4.Fetch Data using Id");
		System.out.println("5 Fetch Data");
		System.out.println("6.Exit");
		
		System.out.println("Enter your choice :");
		
		int option  = scn.nextInt();
		
		while(option!=7) {
			switch(option) {
				case 1:	
						System.out.println("Enter username :");
						String username=scn.next();
						u.setUsername(username);
						
						System.out.println("Enter pasword :");
						String password=scn.next();;						
						u.setPassword(password);
						
						System.out.println("Enter email :");
						String email=scn.next();
						u.setEmail(email);
						
						d.insertData(u);						
						break;
				case 2:
						int id=scn.nextInt();;
						System.out.println("Enter Id :");
						u.setId(id);
						
						System.out.println("Enter username :");
						username=scn.next();
						u.setUsername(username);
						
						System.out.println("Enter pasword :");
						password=scn.next();;						
						u.setPassword(password);
						
						System.out.println("Enter email :");
						email=scn.next();
						u.setEmail(email);
						
						d.UpdateData(u);
						break;
				case 3:						
						System.out.println("Enter Id :");
						id=scn.nextInt();
						u.setId(id);
						d.DeleteData(u);
						break;
				case 4:
						System.out.println("Enter Id :");
						id=scn.nextInt();
						u.setId(id);
						User user1 = (User) d.fetchData(id);
						if(user1==null) {
							System.out.println("User Not Found!..");
							break;
						}
						System.out.println(user1.getId() +"  |  "+user1.getUsername()+"  |  "+user1.getEmail()+"  |  "+user1.getPassword());
						
						break;						
				case 5:						
						d.FetchAllData().forEach(i->{
						System.out.println(i.getId() +"  |  "+i.getUsername()+"  |  "+i.getEmail()+"  |  "+i.getPassword());					
						});
						break;
				case 6:
						System.out.println("You are Exit");
						break;
			}
			
			if(option==6){
				
				break;
			}else {
				System.out.println("Select your option:");
				System.out.println("1.Insert Data");
				System.out.println("2.Update Data");
				System.out.println("3.Delete Data");
				System.out.println("4.Fetch Data using Id");
				System.out.println("5 Fetch Data");
				System.out.println("6.Exit");
				
				System.out.println("Enter your choice :");
				option = scn.nextInt();
			}
		}
		
	}

}
