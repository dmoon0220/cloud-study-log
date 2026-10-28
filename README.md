
# Cloud Study Log

AWS와 DevOps를 공부하면서 배운 내용을 기록하고 복습하는 웹 서비스입니다.

## 주요 기능

- 공부 기록 등록
- 공부 기록 목록 조회
- 복습 상태 변경
- 공부 기록 삭제

## 사용 기술

- Java 21
- Spring Boot
- Thymeleaf
- Spring Data JPA
- MySQL 8.4
- Docker Compose
- Gradle

## 실행 방법

### 1. 필요한 프로그램

- Java 21
- Git
- Docker Desktop

### 2. 환경설정 파일 준비

프로젝트 최상위 폴더에서 실행합니다.

```bash
cp .env.example .env
cp src/main/resources/application.properties.example src/main/resources/application.properties
```

`.env`와 `application.properties`의 데이터베이스 설정이 서로 일치하는지 확인합니다.

### 3. MySQL 실행

Docker Desktop을 실행한 뒤 다음 명령어를 입력합니다.

```bash
docker compose up -d
```

### 4. Spring Boot 실행

```bash
./gradlew bootRun
```

### 5. 웹 서비스 접속

브라우저에서 다음 주소로 접속합니다.

http://localhost:8080

### 6. MySQL 종료

실습을 마친 뒤 다음 명령어로 MySQL 컨테이너를 중지합니다.

```bash
docker compose down
```

## 프로젝트 목적

Spring Boot 웹 개발, 데이터베이스 연결, Docker를 이용한 실행 환경 구성을 연습하기 위한 프로젝트입니다.

## 보안 주의사항

- 실제 비밀번호가 들어 있는 `.env` 파일은 GitHub에 올리지 않습니다.
- 실제 `application.properties` 파일도 GitHub에 올리지 않습니다.
- `.env.example`과 `application.properties.example`은 설정 방법을 공유하기 위한 예시 파일입니다.
## 자동 테스트 (CI)

GitHub Actions를 사용해 코드 변경 사항을 자동으로 검사합니다.

- `main` 브랜치로 Pull Request를 만들면 테스트가 실행됩니다.
- 테스트 명령어: `./gradlew test`
- 테스트가 실패하면 원인을 수정한 뒤 다시 검사합니다.