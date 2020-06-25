package com.albertojarabo.apachecamelactivemqspringbootpoc.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.albertojarabo.apachecamelactivemqspringbootpoc.processor.JmsProcessor;

@Component
public class JmsRouteBuilder extends RouteBuilder {

	static final Logger log = LoggerFactory.getLogger(JmsRouteBuilder.class);
	
	@Override
	public void configure() throws Exception {
		from("{{inbound.endpoint}}")
		.transacted()
		.log(LoggingLevel.INFO, log, "Message Received")
		.process(new JmsProcessor())
		.loop()
		.simple("{{outbound.loop.count}}")
		.to("{{outbound.endpoint}}")
		.log(LoggingLevel.INFO, log, "Message Sent. Iteration: ${exchangeProperty.CamelLoopIndex}")
		.end();
	}

}
