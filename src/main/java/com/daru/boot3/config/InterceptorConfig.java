package com.daru.boot3.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import com.daru.boot3.interceptor.AdminInterceptor;
import com.daru.boot3.interceptor.BoardInterceptor;
import com.daru.boot3.interceptor.SellerInterceptor;
import com.daru.boot3.interceptor.WriterCheckInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

	@Autowired
	private SellerInterceptor sellerInterceptor;
	
	@Autowired
	private AdminInterceptor adminInterceptor;
	
	@Autowired
	private BoardInterceptor boardInterceptor;
	
	@Autowired
	private WriterCheckInterceptor writerCheckInterceptor;
	
	@Autowired
	private LocaleChangeInterceptor localeChangeInterceptor;
	
	
	
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		
		//적용할 interceptor를 등록
		registry.addInterceptor(sellerInterceptor)
		//인터셉터를 사용할 URL 
		.addPathPatterns("/product/manage");
//		.addPathPatterns("")
		
		//제외할 URL주소 
//		.excludePathPatterns("")
//		registry.addInterceptor()
		
		registry.addInterceptor(adminInterceptor)
		.addPathPatterns("/admin/manage");
		
		
		registry.addInterceptor(boardInterceptor)
		.addPathPatterns("/board/*")
		.excludePathPatterns("/board/list");
		
		
		registry.addInterceptor(writerCheckInterceptor)
		.addPathPatterns("/board/update");
		
		//locale
		registry.addInterceptor(localeChangeInterceptor)
		.addPathPatterns("/**");
		
		
		
		//WebMvcConfigurer.super.addInterceptors(registry);
	}
	
}
