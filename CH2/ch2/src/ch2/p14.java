package ch2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p14 {
	public static void main(String[]args)throws IOException{
		System.out.println("請輸入整數");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int num =Integer.parseInt(br.readLine());
		switch(num) {
			case 1:{
				System.out.println("輸入的是1");
				break;
			}
			case 2:{
				System.out.println("輸入的是2");
				break;
			}
			default:{
				System.out.println("請輸入1或2");
				break;
			}	
		}
	}
}
