package com.cognizant.jwt.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {

    private final String SECRET_KEY = "mysecretkey"; // 🔒 In real apps, keep this in environment or config

    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)                             // Who the token is about
                .setIssuedAt(new Date(System.currentTimeMillis())) // When token is issued
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 10)) // 10 minutes validity
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)   // Signing algorithm + secret key
                .compact();
    }
}
