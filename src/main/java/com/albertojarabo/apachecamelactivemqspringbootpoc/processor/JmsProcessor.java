package com.albertojarabo.apachecamelactivemqspringbootpoc.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JmsProcessor implements Processor {

	static final Logger log = LoggerFactory.getLogger(JmsProcessor.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		log.info("Exchange: {}", exchange);
	}

}
