package com.kyungsu.board.service;

import org.springframework.stereotype.Service;

import com.kyungsu.board.dto.auth.AuthPostDto;
import com.kyungsu.board.dto.auth.LoginDto;
import com.kyungsu.board.dto.response.ResponseDto;

@Service
public class AuthService {

	public ResponseDto<LoginDto> login(AuthPostDto dto) {
		LoginDto result = new LoginDto("JWT", 3600000);
		return ResponseDto.setSuccess("", result);
	}
}
