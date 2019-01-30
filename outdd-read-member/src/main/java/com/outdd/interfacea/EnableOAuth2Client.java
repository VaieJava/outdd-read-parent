package com.outdd.interfacea;

import org.springframework.context.annotation.Import;
import org.springframework.security.oauth2.config.annotation.web.configuration.OAuth2ClientConfiguration;

import java.lang.annotation.*;

/**
 * @author vaie
 * @Created 2019/1/28 15:34
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(OAuth2ClientConfiguration.class)
public @interface EnableOAuth2Client {
}
