package com.apple.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
		var test = new Friend("park");
		System.out.println(test.name);
	}

}

// class는 변수, 함수 보관함
// class 에 있던 변수, 함수 쓰려면 복사부터
// constructor, 변수, 파라미터 사용가능
class Friend {
	String name = "kim";
	int age = 20;
	// [Constructor] 자동으로 실행
	Friend (String name) {
		this.name = name;
	}
}
