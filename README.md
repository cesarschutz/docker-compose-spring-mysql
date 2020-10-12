# docker-compose-spring-mysql

1 - Criar o jar:
 mvn package
2 - Criar a imagem docker:
  docker build -f Dockerfile -t cesarschutz/spring-demo-app . 
3 - Subir compose
  docker-compose up
