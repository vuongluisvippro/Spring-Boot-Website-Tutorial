package com.tutorial.genealogy.security;

import org.springframework.stereotype.Component;

import com.tutorial.genealogy.model.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtValidator {
	
	private String secret = "youtube";

    public User validate(String token) {
        User jwtUser = null;
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();

            jwtUser = new User();

            jwtUser.setUserName(body.getSubject());
            jwtUser.setId(Integer.parseInt(body.get("userId").toString()));
            jwtUser.setRole((String) body.get("role"));
        }
        catch (Exception e) {
            System.out.println(e);
        }

        return jwtUser;
    }
}
