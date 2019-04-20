# ingenieria-software-lab2
  Java SpringBoot
  
  
  Spring Initializr
  
  
  Servicios RESTful
      
# Dockerfiles
      FROM openjdk:8-jre-alpine
      EXPOSE 9008
      ADD estudiantes-0.0.1-SNAPSHOT.jar estudiantes.jar
      ENTRYPOINT ["java","-jar","estudiantes.jar"]

      FROM openjdk:8-jre-alpine
      EXPOSE 9009
      ADD cursos-0.0.1-SNAPSHOT.jar cursos.jar
      ENTRYPOINT ["java","-jar","cursos.jar"]   
      
# Comandos docker
      sudo docker pull mariajosesm/lab2-estudiantes
      sudo docker pull mariajosesm/lab2-cursos

      sudo docker run -p 9001:9008 mariajosesm/lab2-estudiantes
      sudo docker run -p 9002:9009 mariajosesm/lab2-cursos
      
# Postman
      http://localhost:9008/estudiantes/buscarTodos
      http://localhost:9008/estudiantes/registrar

      http://localhost:9009/cursos/buscarTodos
      http://localhost:9009/cursos/crear

      http://localhost:9009/catedratico/buscarTodos
      http://localhost:9009/catedratico/registrar
      
*Maria Jose Sazo 1290-15-13436*
