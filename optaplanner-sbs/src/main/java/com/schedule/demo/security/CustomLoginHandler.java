package com.schedule.demo.security;

import com.schedule.demo.entity.User;
import com.schedule.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: John Long
 * @create: 22-Apr-2020
 **/

public class CustomLoginHandler implements AuthenticationSuccessHandler {
    @Autowired
    UserService userService;

    RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        handle(httpServletRequest, httpServletResponse, authentication);
    }

    protected void handle(HttpServletRequest request,
                          HttpServletResponse response,
                          Authentication authentication) throws IOException {
        String url = determineTargetUrl(authentication);

        if(!(response.isCommitted())){
            redirectStrategy.sendRedirect(request, response, url);
        }
    }

    protected String determineTargetUrl(Authentication authentication){

        String authEmail = authentication.getName();
        User currentUser = userService.findByEmail(authEmail);

        Map<String, String> accTypeTargetUrlMap = new HashMap<>();

        accTypeTargetUrlMap.put("MANAGER","/");
        accTypeTargetUrlMap.put("EMPLOYEE","/");

        if(accTypeTargetUrlMap.containsKey(currentUser.getAccountType().toString())){
            return accTypeTargetUrlMap.get(currentUser.getAccountType().toString());
        }
        throw new IllegalStateException();
    }
}
