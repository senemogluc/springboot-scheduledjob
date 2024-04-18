# Spring Boot Kotlin Scheduled Job with Feign Client

This project serves as a demonstration of scheduling jobs in a Spring Boot application written in Kotlin, utilizing a Feign client for making HTTP requests to external services.

## Features

- **Scheduled Job**: Illustrates how to create scheduled tasks to perform repetitive actions at specified intervals.
- **Feign Client Integration**: Demonstrates how to use Feign client for making HTTP requests to external services.
- **Swagger UI Integration**: Implements Swagger UI for API documentation and testing.

## Setup

1. **Clone the Repository**:
```
git clone https://github.com/senemogluc/springboot-scheduledjob.git
```

2. **About Configuration**:
- Open `application.yml`.
- Modify the properties related to the your desired cron expression.

3. **Configuration**:

```yaml
cron:
  syncCronExpression: <your-cron-expression>
```

4.  **Curl**:

```
curl --location 'http://localhost:8080/test/trigger'
```
