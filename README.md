# docker-compose-spring-mysql

1 - Criar o jar:<br>mvn package<br>
2 - Criar a imagem docker:<br>docker build -f Dockerfile -t cesarschutz/spring-demo-app . <br>
3 - Subir compose<br>docker-compose up<br>

localhost:8080/ola-mundo<br>
localhost:8080/all<br>
localhost:8080/demo/add?name=cesar&email=cesar@cesar.com<br>
