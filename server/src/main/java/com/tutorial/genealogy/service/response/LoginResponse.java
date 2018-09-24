package com.tutorial.genealogy.service.response;

public class LoginResponse {
	
	private MessageResponse message;
    private String token;

    public LoginResponse(MessageResponse message, String token) {
        this.message = message;
        this.token = token;
    }

    public MessageResponse getMessage() {
        return message;
    }

    public void setMessage(MessageResponse message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
