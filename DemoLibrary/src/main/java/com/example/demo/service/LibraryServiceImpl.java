package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Library;
import com.example.demo.repository.LibraryRepository;

@Service
public class LibraryServiceImpl implements LibraryService {
	
	@Autowired
	private LibraryRepository lr;
	

	@Override
	public void add(Library l) {
		// TODO Auto-generated method stub
		lr.save(l);

	}

	@Override
	public List<Library> display() {
		// TODO Auto-generated method stub
		return lr.findAll();
	}

}
