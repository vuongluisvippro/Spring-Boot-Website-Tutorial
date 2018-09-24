package com.tutorial.genealogy.security;

import org.springframework.stereotype.Component;

import com.tutorial.genealogy.model.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtValidator {
	
	private String secret = "youtube";

    public User validate(String token) {
        User user = null;
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();

            user = new User();

            user.setUserName(body.getSubject());
            user.setId(Integer.parseInt(body.get("userId").toString()));
            user.setRole((String) body.get("role"));
        }
        catch (Exception e) {
            System.out.println(e);
        }

        return user;
    }
}
