package day09;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Test01_String {

	public static void main(String[] args) {
		//String msg2 = new String(new char[] {'g','h'});
		//String msg1 = args[0];
		String msg1 = JOptionPane.showInputDialog("book 정보를 입력하세요 ex(title/price)");
		//String msg1 = "Java programming/23000";
		//System.out.println(msg1);
		//System.out.println(msg1 = msg1.toUpperCase());
		
		System.out.println(msg1);
		if(msg1.indexOf("/") == -1) {
			System.out.println("다시 입력하세요");
			System.out.println(" / 가 필요합니다.");
			return;
		}
		
		//System.out.println(msg1);
		String[] data = msg1.split("/");
		System.out.println(Arrays.toString(data));
		
		Book b1 = new Book(data[0],Integer.parseInt(data[1].trim()));
		b1.print();
	}

}
