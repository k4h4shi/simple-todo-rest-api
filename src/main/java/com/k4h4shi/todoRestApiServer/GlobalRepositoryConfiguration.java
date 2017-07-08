package com.k4h4shi.todoRestApiServer;

import com.k4h4shi.todoRestApiServer.domain.Todo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class GlobalRepositoryConfiguration extends RepositoryRestConfigurerAdapter {

  private static final String CORS_BASE_PATTERN = "/**";
  private static final String ALLOWED_ORIGINS = "*";
  private static final String ALLOWED_HEADERS = "*";
  private static final String ALLOWED_METHODS = "*";

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
    config.getCorsRegistry()
          .addMapping(CORS_BASE_PATTERN)
          .allowedOrigins(ALLOWED_ORIGINS)
          .allowedHeaders(ALLOWED_HEADERS)
          .allowedMethods(ALLOWED_METHODS)
          .allowCredentials(true);
    
    config.exposeIdsFor(Todo.class);
  }

}
