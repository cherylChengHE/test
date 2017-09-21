package test;

import javax.swing.text.AbstractDocument.Content;

import org.omg.CORBA.PUBLIC_MEMBER;

public class test {
	 public static void main(String[] args) {
		 String YP_content = "�������#code#,����Ǳ��˲����������";
		 String Content = YP_content.replace("#code#", "126456");
		 
		 System.out.println(Content);
	 
}
	 public String get() {		 
		 return "hello world";
	 }
}