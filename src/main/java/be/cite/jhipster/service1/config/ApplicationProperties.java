package be.cite.jhipster.service1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to J Hipster Sample Oauth 2 Service.
 * <p>
 * Properties are configured in the application.yml file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

}
