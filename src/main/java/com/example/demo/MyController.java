package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyController {

	@Autowired
	private MyRepo repo;
	
	@GetMapping("page")
	public @ResponseBody Page<MyEntity> get(Pageable page){
		return repo.findAll(page);
	}
	
	@PostConstruct
	private void init() {
		for(int i=0; i< 2; i++) {
			repo.save(MyEntity
					.builder()
					.name("name"+System.currentTimeMillis())
					.build());
		}
	}
	
}
