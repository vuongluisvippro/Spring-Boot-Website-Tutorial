package com.tutorial.genealogy.security;

import org.springframework.stereotype.Component;

import com.tutorial.genealogy.model.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtGenerator {

    public String generate(User user) {
        Claims claims = Jwts.claims()
                .setSubject(user.getUserName());
        claims.put("userId", String.valueOf(user.getId()));
        claims.put("role", user.getRole());
        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, "youtube")
                .compact();
    }
}
