package com.pedro.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.pedro.domain.Item;
import com.pedro.repository.ClienteRepository;



@Component
public class SpringDataRestCustomization 
implements RepositoryRestConfigurer 
{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		config.exposeIdsFor(Item.class,ClienteRepository.class);
	}
}
