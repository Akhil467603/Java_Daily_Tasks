package com.dailytask.instancevariables;

public class Librarybookrecords {

	static String libraryname = " public library";
	String title;
	String author;

	public void setDetails(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void displayInfo() {
		System.out.println("Library Name: " + libraryname);
		System.out.println("Book Title: " + title);
		System.out.println("Book Author: " + author);

	}

	public static void main(String[] args) {
		libraryname = " City public library";
		Librarybookrecords l = new Librarybookrecords();
		Librarybookrecords l1 = new Librarybookrecords();
		l.setDetails("The Great Gatsby", "F.Scott Fitzgerald");
		l1.setDetails("1984", "George");
		l.displayInfo();
		System.out.println("--------------------------------");
		l1.displayInfo();

	}

}
