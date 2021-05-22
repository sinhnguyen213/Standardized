package com.luvina.standardized;

public class Standard2 {
	// khai báo thuộc tính
	private String str;

	// phương thức khởi tạo
	public Standard2(String str) {
		this.str = str;
	}

	public void standardized2() {
		int left = 0;
		int right = 0;
		StringBuilder newStr = new StringBuilder(str);
		StringBuilder newStr2 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) != '(' && str.charAt(i) != ')') {
				System.out.println("Nhập lại chuỗi ký tự '(', ')'");
				return;
			}
			if(str.charAt(i)=='(') {
				left ++;
			}else {
				right++;
			}
		}
		int l = 0; 	//đếm số ký tự '(' (left)
		if(left<=right) {
			for (int i = 0; i < newStr.length(); i++) {
				newStr2.append(newStr.charAt(i));

				if (newStr.charAt(i) == '(') {
					l++;
				}
				if (newStr.charAt(i) == ')') {
					l--;
					if ( l<0) {
						newStr2.deleteCharAt(newStr2.length()-1);
						l = 0;
					}
				}
			}
		}
		//
		if(left>right) {
			int n = newStr.length();
			while(n-->0) {
				newStr2.append(newStr.charAt(n));

				if (newStr.charAt(n) == ')') {
					l++;
				} 
				if (newStr.charAt(n) == '(') {
					l--;
					if ( l<0) {
						newStr2.deleteCharAt(newStr2.length()-1);
						l = 0;
					}
				}
			}
			newStr2.reverse();
		}
		System.out.println(newStr2);
	}
}
