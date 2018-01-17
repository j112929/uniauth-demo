package com.shenma.dianrong.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import com.dianrong.common.uniauth.client.config.UniauthSecurityConfig;

/**
 * Created by mayao on 2017/10/11.
 *
 * 这个类的配置，让后台页面允许iframe
 *不然，页面报一个
 * "Refused to display 'http://......' in a frame because it set 'X-Frame-Options' to 'DENY'. "错误
 */
@Order(2)
@Configuration
public class IframeSecurityConfiguration extends UniauthSecurityConfig {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http.headers().frameOptions().disable();//这个配置
        super.configure(http);
    }
}
