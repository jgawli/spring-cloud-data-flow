# spring-cloud-data-flow

Installation instructions on Local

Download the Spring Cloud Data Flow Server and shell by using the following commands:

wget https://repo.spring.io/release/org/springframework/cloud/spring-cloud-dataflow-server/2.1.0.RELEASE/spring-cloud-dataflow-server-2.1.0.RELEASE.jar

wget https://repo.spring.io/release/org/springframework/cloud/spring-cloud-dataflow-shell/2.1.0.RELEASE/spring-cloud-dataflow-shell-2.1.0.RELEASE.jar

Download Skipper by running the following commands:

wget https://repo.spring.io/release/org/springframework/cloud/spring-cloud-skipper-server/2.0.2.RELEASE/spring-cloud-skipper-server-2.0.2.RELEASE.jar

Start Spring Cloud Data Server Skipper:

java -jar spring-cloud-skipper-server-2.0.2.RELEASE.jar

Start Spring Cloud Data Flow Server:

java -jar spring-cloud-dataflow-server-2.1.0.RELEASE.jar

Start Spring Cloud Data Shell:

java -jar spring-cloud-dataflow-shell-2.1.0.RELEASE.jar

Import pre-built applications from dataflow shell:

app import --uri https://dataflow.spring.io/Einstein-SR2-stream-applications-kafka-maven

Open Dashboard:

http://localhost:9393/dashboard/#/streams/definitions


Reference Docs:

https://dataflow.spring.io/docs/installation/

https://docs.spring.io/spring-cloud-dataflow/docs/current/reference/htmlsingle/#getting-started-local

https://docs.spring.io/spring-cloud-dataflow/docs/2.0.0.BUILD-SNAPSHOT/reference/htmlsingle/#spring-cloud-dataflow-stream-examples
