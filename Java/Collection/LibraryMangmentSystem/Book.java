package com.prity_Collection;

public record Book(Integer id, String title, String author) {

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}

}
