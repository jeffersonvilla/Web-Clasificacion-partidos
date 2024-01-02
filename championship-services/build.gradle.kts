plugins {
	java
	id("org.springframework.boot") version "2.6.12"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.championship"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(18)
	}
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
	maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-data-rest")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("mysql:mysql-connector-java:8.0.28")
	implementation("javax.persistence:javax.persistence-api:2.2")
	compileOnly ("org.projectlombok:lombok")
	developmentOnly ("org.springframework.boot:spring-boot-devtools")
	annotationProcessor ("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation ("org.junit.jupiter:junit-jupiter-api:5.8.2")
	testImplementation ("org.junit.jupiter:junit-jupiter-engine:5.8.2")
	testImplementation ("org.mockito:mockito-core:3.12.4")
	implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.3.0")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
