package com.method.task;

public class LibrarySystem {
	public String issueBook(String bookName,boolean isAvailable) {
		if(isAvailable) {
			return "Book Issued...!" + bookName;
		}else {
			return "Book not available";
		}
	}

}
