package com.Lominashvili.Calendar;

import com.Lominashvili.Calendar.config.ContentCalendarProperties;
import com.Lominashvili.Calendar.model.Content;
import com.Lominashvili.Calendar.model.Status;
import com.Lominashvili.Calendar.model.Type;
import com.Lominashvili.Calendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class CalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalendarApplication.class, args);
	}


}
