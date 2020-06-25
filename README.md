# apache-camel-activemq-spring-boot-poc
Example with apache camel connecting to activemq queues to consume and produce. Booted from spring-boot.

Used docker image rmohr/activemq for activemq:

1. docker pull rmohr/activemq
2. docker run -p 61616:61616 -p 8161:8161 rmohr/activemq

3. run the spring boot application
3. access activemq url: http://localhost:8161/admin/     (admin/admin)
4. publish a message in inbound.messages queue
5. see results


