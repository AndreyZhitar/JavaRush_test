package com.zhitar.part_man_sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.zhitar.part_man_sb.dao")
@EntityScan("com.zhitar.part_man_sb.entity")
public class PartManSbApplication {

    public static void main(String[] args) {
        SpringApplication.run(PartManSbApplication.class, args);
    }

}

