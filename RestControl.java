package com.yaswanth.restexp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControl {
	@GetMapping("/hello")
 public Name getName(){
	 return new Name("Yaswanth","Arasu");
 }
	@GetMapping("hli")
	public List<Name> getNames(){
		List<Name> sru=new ArrayList<>();
		sru.add(new Name("1","Name"));
		sru.add(new Name("1","Name"));
		sru.add(new Name("1","Name"));
		sru.add(new Name("1","Name"));
		sru.add(new Name("1","Name"));
		return sru;
	}
	@GetMapping("/name/{fname}/{lname}")
	public Name getpatv(@PathVariable("fname") String fname,@PathVariable("lname") String lname) {
		return new Name(fname,lname);
	}
	
	@GetMapping("/name")
	public Name getreqpar(@RequestParam(name="fname") String fname,@RequestParam(name="lname")String lname) {
		return new Name(fname,lname);
	}
}
