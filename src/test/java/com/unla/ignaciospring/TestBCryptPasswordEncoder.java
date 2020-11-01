package com.unla.ignaciospring;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.unla.ignaciospring.entities.User;

public class TestBCryptPasswordEncoder {
	public static void main(String[] args) {
		BCryptPasswordEncoder pe = new BCryptPasswordEncoder();
		System.out.println(pe.encode("user"));
	}
}
