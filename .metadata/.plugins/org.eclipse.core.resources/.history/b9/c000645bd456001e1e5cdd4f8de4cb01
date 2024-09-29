package com.jwt;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import com.service.UserDetailsServiceImpl;

public class TokenFilter extends OncePerRequestFilter {
  @Autowired
  private JwtUtility jwtUtils;

  @Autowired
  private UserDetailsServiceImpl userDetailsService;

 
  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {
    
  }

  
}
