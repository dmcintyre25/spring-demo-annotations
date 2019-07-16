package com.devworld.springdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	
	private String[] data;	
	
	public FileFortuneService() throws FileNotFoundException {
		BufferedReader reader = new BufferedReader(new FileReader("src/fortunes.txt"));
		String currentLine = reader.readLine();
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
