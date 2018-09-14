package com.example.camunda;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngineConfiguration;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CamundaApplicationTests {

    @Test
    public void contextLoads() {
        ProcessEngine processEngine = ProcessEngineConfiguration.createStandaloneInMemProcessEngineConfiguration()
                .setJdbcDriver("com.mysql.jdbc.Driver")
                .setJdbcUrl("jdbc:mysql://localhost:3308/camunda")
                .setJdbcUsername("root")
                .setJdbcPassword("123456")
                .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE)
                .setJobExecutorActivate(true)
                .buildProcessEngine();
    }

}
