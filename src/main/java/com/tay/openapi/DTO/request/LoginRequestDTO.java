package com.tay.openapi.DTO.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"username", "password"})
public class LoginRequestDTO {
	
	@JsonProperty("username")
	private String username;
	
	@JsonProperty("password")
	private String password;

}
