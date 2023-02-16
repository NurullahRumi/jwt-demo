package dev.nr.jwtdemo.service;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TokenService {

    private final JwtEncoder encoder;
    public TokenService(JwtEncoder encoder) {
        this.encoder = encoder;
    }


}
