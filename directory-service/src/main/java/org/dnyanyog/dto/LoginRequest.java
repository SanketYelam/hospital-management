package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotNull;

@Component
public class LoginRequest {

	@NotNull
	private String mobileNumber;

	@NotNull
	private String password;

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
