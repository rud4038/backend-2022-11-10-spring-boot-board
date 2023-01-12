package com.kyungsu.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyungsu.board.dto.response.ResponseDto;
import com.kyungsu.board.dto.user.GetUserResponseDto;
import com.kyungsu.board.dto.user.PatchUserDto;
import com.kyungsu.board.dto.user.PostUserDto;
import com.kyungsu.board.dto.user.ResultResponseDto;
import com.kyungsu.board.service.UserService;

@RestController
@RequestMapping("api/user/")
public class UserController {
	
	@Autowired UserService userService;
	
	@PostMapping("")
	public ResponseDto<ResultResponseDto> postUser(@RequestBody PostUserDto requestBody) {
		return userService.postUser(requestBody);
	}
	
	@GetMapping("")
	public ResponseDto<List<GetUserResponseDto>> getAllUser() {
		return userService.getAllUser();
	}
	
	@GetMapping("{email}")
	public ResponseDto<GetUserResponseDto> getUser(@PathVariable("email") String email) { 
		return userService.getUser(email);
	}
	
	@PatchMapping("")
	public ResponseDto<GetUserResponseDto> patchUser(@RequestBody PatchUserDto requestBody) {
		return userService.patchUser(requestBody);
	}
	
	@DeleteMapping("{email}")
	public ResponseDto<ResultResponseDto> deleteUser(@PathVariable("email") String email) {
		return userService.deleteUser(email);
	}
	
	
}
