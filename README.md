# Library Management API
#### REST API for a library management system.
<hr>

### Languages, Frameworks, Libraries, and Tools used

<p align="left"> 
  <a href="https://www.postgresql.org" target="_blank" rel="noreferrer" title="PostgreSQL"> 
    <img src="https://github.com/devicons/devicon/blob/master/icons/postgresql/postgresql-original.svg" alt="postgresql" width="30" height="30"/> 
  </a>
  <a href="https://www.java.com" target="_blank" rel="noreferrer" title="Java"> 
    <img src="https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg" alt="java" width="30" height="30"/> 
  </a> 
  <a href="https://spring.io/" target="_blank" rel="noreferrer" title="Spring">
    <img src="https://github.com/devicons/devicon/blob/master/icons/spring/spring-original.svg" alt="spring" width="30" height="30"/>
  </a>
  <a href="https://maven.apache.org/" target="_blank" rel="noreferrer" title="Maven">
    <img src="https://github.com/devicons/devicon/blob/master/icons/maven/maven-original.svg" alt="maven" width="30" height="30"/>
  </a>
  <a href="https://junit.org/" target="_blank" rel="noreferrer" title="JUnit 5">
    <img src="https://github.com/devicons/devicon/blob/master/icons/junit/junit-original-wordmark.svg" alt="junit" width="30" height="30"/>
  </a>
  <a href="https://swagger.io/" target="_blank" rel="noreferrer" title="Swagger">
    <img src="https://github.com/gilbarbara/logos/blob/main/logos/swagger.svg" alt="swagger" width="30" height="30"/>
  </a>
  <a href="https://postman.com" target="_blank" rel="noreferrer" title="Postman">
    <img src="https://github.com/devicons/devicon/blob/master/icons/postman/postman-original.svg" alt="postman" width="30" height="30"/>
  </a>
</p>

<ul>
    <li>Relational Database: <strong>PostgreSQL</strong>, version <strong>17</strong></li>
    <li>Language: <strong>Java</strong>, version <strong>17</strong></li>
    <ul>
        <li>Framework: <strong>Spring Boot</strong>, version <strong>3.2.4</strong></li>
        <li>Dependencies Manager: <strong><a href="https://maven.apache.org/">Maven</a></strong></li>
        <li>ORM (Object-Relational Mapping): <strong>Hibernate</strong></li>
        <li>Unit Tests Framework: <strong>JUnit 5</strong></li>
    </ul>
    <li>API Documentation: <strong><a href="https://swagger.io/">Swagger</strong></a></li>
</ul>
<hr>

### Layered Architecture

```
      HTTP/REST Client
             ↓↑
Controller (Presentation Layer)
             ↓↑
Service (Business Logic Layer)
             ↓↑
Repository (Data Access Layer)
             ↓↑
Database/PostgreSQL (Data Layer)
```
<hr>

### Features
<ul>
    <li>Data modeling with relationships</li>
    <li><strong>CRUD</strong> operations of entities</li>
    <li><strong>Validation</strong> of input data, and return of <strong>clear validation error messages</strong></li>
    <li><strong>Custom exception handling</strong> to clearly communicate failures to the client and return appropriate <strong>HTTP status codes</strong> (200, 201, 400, 404, 500, etc.)</li>
    <li>Simple <strong>authentication</strong> mechanism using a <strong>static API Key</strong> to secure certain routes</li>
    <li><strong>API documentation</strong> using Swagger</li>
    <li><strong>Unit Tests</strong> with JUnit 5 and Mockito</li>
</ul>
<hr>

      
### Steps to run locally on your machine

<ul>
  
  #### 1º Clone this repository
  ```bash
  git clone https://github.com/crisbeloneto/library-api.git
  ```
  Or manually download it via the button 'Download ZIP'

  
  #### 2º ...
</ul>
<hr>

> URLs to access the API documentation:
> <br>Locally 👉 http://localhost:8080/swagger-ui.html
> <br>Online 👉 https://librarymgmtapi.onrender.com/swagger-ui.html
