package com.clean.example.configuration;

import com.clean.example.core.usecase.GetAllExamples;
import com.clean.example.dataproviders.database.GetAllExamplesFromDatabaseDataProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DatabaseDataProviderConfiguration {

    @Bean
    public GetAllExamples getAllExamples(JdbcTemplate jdbcTemplate) {
        return new GetAllExamplesFromDatabaseDataProvider(jdbcTemplate);
    }

}