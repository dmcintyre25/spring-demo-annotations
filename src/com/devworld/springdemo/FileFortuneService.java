package com.devworld.springdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	
	private ArrayList<String> data = new ArrayList<String>();	
	private Random myRandom = new Random();
	
	public FileFortuneService() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("src/fortunes.txt"));
		
		reader.lines().forEach(line -> {
			data.add(line);
		});
		
		reader.close();
		
	}
	
	@PostConstruct
	void doMyStartupStuff() {
		data.forEach(fortune -> System.out.println("Furtune: " + fortune));
	}
	
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(data.size());
		return data.get(index);
	}

}
