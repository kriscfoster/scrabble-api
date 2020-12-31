package com.kriscfoster.scrabble.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

class CORSConfiguration {

    @Configuration
    class CORSConfiguration : WebMvcConfigurer {
        override fun addCorsMappings(registry: CorsRegistry) {
            registry.addMapping("/**")
                    .allowedMethods("GET", "POST", "PATCH", "DELETE")
        }
    }
}
