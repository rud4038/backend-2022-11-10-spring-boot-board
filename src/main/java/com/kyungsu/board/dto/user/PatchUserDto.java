package com.kyungsu.board.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatchUserDto {
	private String email;
	private String nickname;
	private String profile;
}
