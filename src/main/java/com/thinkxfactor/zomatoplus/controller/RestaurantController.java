package com.thinkxfactor.zomatoplus.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Item;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;



@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

	@Autowired
	 private RestaurantRepository restaurantRepository;
	 
	 @PostMapping("/add")
	 public Restaurant addUser(@RequestBody Restaurant r1)
	 { 
		 Restaurant persistedRes=restaurantRepository.save(r1);
		 return persistedRes;
	 }
		 
	 @GetMapping("/getAll")
	 public List<Restaurant> getAll(){
		 List<Restaurant> listofres=restaurantRepository.findAll();
		 return listofres;
	 }
}
