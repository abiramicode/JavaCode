package com.example.SpringBootwithNosqlDB;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@EnableSwagger2
public class SwaggerConfig {
	
		@Bean
		public Docket apiDoc{
			return new Docket(DocumentationType.SWAGGGER_2) 
					.select()
					.apis(RequestHandlerSeletors.basePackage("com.example.SpringBootwithNosqlDb"))
					.paths(PathSelectors.any())
					.build();
	}

}
