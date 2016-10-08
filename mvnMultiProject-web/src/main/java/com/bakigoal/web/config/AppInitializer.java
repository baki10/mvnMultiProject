package com.bakigoal.web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by ilmir on 08.10.16.
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
  // Этот метод должен содержать конфигурации которые инициализируют Beans
  // для инициализации бинов у нас использовалась аннотация @Bean
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[]{
        WebConfig.class
    };
  }

  // Тут добавляем конфигурацию, в которой инициализируем ViewResolver
  @Override
  protected Class<?>[] getServletConfigClasses() {

    return new Class<?>[]{
        WebConfig.class
    };
  }

  @Override
  protected String[] getServletMappings() {
    return new String[]{"/"};
  }
}
