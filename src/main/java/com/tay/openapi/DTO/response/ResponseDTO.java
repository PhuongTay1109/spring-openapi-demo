package com.tay.openapi.DTO.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"code", "status", "message"})
public class ResponseDTO {

	@JsonProperty("code")
	private Integer code;
	
	@JsonProperty("status")
	private String status;
	
	@JsonProperty("message")
	private String message;

}
