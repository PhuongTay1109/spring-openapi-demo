package com.tay.openapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tay.openapi.DTO.request.LoginRequestDTO;
import com.tay.openapi.DTO.response.ResponseDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

	@PostMapping("signIn")
	@Operation(summary = "Sign in endpoint", description = "This is an example sign in endpoint")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Successfully retrieved"),
			@ApiResponse(responseCode = "400", ref = "#/components/responses/badRequestApi"),
			@ApiResponse(responseCode = "401", ref = "#/components/responses/unauthorizedApi"),
			@ApiResponse(responseCode = "500", ref = "#/components/responses/internalServerErrorApi") })
	public ResponseEntity<ResponseDTO> signIn(@RequestBody LoginRequestDTO request) {
		ResponseDTO responseDTO = new ResponseDTO(
				HttpStatus.OK.value(), 
				HttpStatus.OK.getReasonPhrase(),
				"Successfully signed in!");
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);
	}
}
