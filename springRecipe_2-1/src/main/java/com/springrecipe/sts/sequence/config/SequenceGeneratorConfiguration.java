package com.springrecipe.sts.sequence.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
		includeFilters = {
				@ComponentScan.Filter(
							type = FilterType.REGEX,
							pattern = {"com.springrecipe.sts.sequence.*Dao","com.springrecipe.sts.sequence.*Service"}
						)
		},
		excludeFilters = {
				@ComponentScan.Filter(
							type = FilterType.ANNOTATION,
							classes = {org.springframework.stereotype.Controller.class}
						)
		}
)
public class SequenceGeneratorConfiguration {

}
