package com.org.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public String getNameById(int id) {
		int i = 10/0;
		return "Car";
	}
}
