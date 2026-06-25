package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Library;

public interface LibraryService {
	
	void add(Library l);
	List<Library> display();

}
