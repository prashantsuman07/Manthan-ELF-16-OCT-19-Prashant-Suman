package com.manthan.array.test;

public class Testb {
	public static void main(String[] args) {
		
	double[] d=new double[5];
	char[] c=new char[5];
	String[] s=new String[5];
	d[0]=1.0;
	d[1]=2.0;
	d[3]=3.0;
	d[4]=4.0;
	d[2]=5.0;
	c[0]='a';
	c[4]='e';
	s[0]="dimple";
	s[4]="pimple";
	for(int i=0;i<d.length;i++)
		System.out.println(d[i]);
	for(int i=0;i<c.length;i++)
		System.out.println(c[i]);
	for(int i=0;i<s.length;i++)
		System.out.println(s[i]);

}
}