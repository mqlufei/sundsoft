package teststring;

import java.io.File;

public class Ts {
	public static void main(String[] args) {
		String s = "7\\2016\\10\\ff382171-381a-4848-a74d-b32f0f33f95d\\0001";
		System.out.println(s);
		char oldChar = (File.separatorChar == '\\') ? '/' : '\\';
		System.out.println(oldChar);
		System.out.println(File.separator);
		if(s.contains(""+oldChar)){
			System.out.println(s);
			s = s.replace(""+oldChar, File.separator);
		}
		System.out.println(s);
	}
}
