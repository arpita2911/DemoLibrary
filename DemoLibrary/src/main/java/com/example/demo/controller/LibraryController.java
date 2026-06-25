package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Library;
import com.example.demo.service.LibraryService;

@RestController
public class LibraryController {
	
	@Autowired
	private LibraryService ls;
	
	@GetMapping("display")
	public List<Library> displayLibraries(){
		return ls.display();
	}
	
	@PostMapping("add")
	public void addLibrary(Library l) {
		ls.add(l);
	}

}
