# [수정판] 스프링 시큐리티와 JWT를 사용한 사용자 인증 예제 프로젝트 (by 엉클제다이)
### [프로젝트 개요]
- [[Spring Security] Spring Security와 JWT를 사용하여 사용자 인증 구현하기(Spring Boot 3.0.0 이상)](https://colabear754.tistory.com/171) 블로그 포스트의 예제 프로젝트를 원본으로 하여,
- 원본 Github:  [예외 처리를 하지 않고 스프링 시큐리티와 JWT 설정만 완료한 브랜치](https://github.com/Colabear754/authentication_example_java/tree/without-handling-exception)
- Spring Boot 3.3.2 + Java 17 + H2 Server mode 등, 내 개발 환경에 맞게 수정함
- application.properties 로 프러퍼티 파일 변경함 <br>
- 애플리케이션 구동시 기존의 H2 DB를 초기화하지 않고 유지하도록 수정함
- 원본 포스트의 설명 흐름에 맞도록 Swagger의 API 출현 순서를 변경함
  (위에서 부터 아래로 순차적으로 테스트하면 됨)
- 이 외에 자잘한 수정들..oTL
<br><br>
### [예제 테스트 방법]
0. H2용 authentication_example.mv.db 파일을 윈도우 사용자 계정 폴더에 생성<br>
  ( 예: C:\Users\[계정명]\ )
1. 프로젝트 실행
2. http://localhost:8080/ 로 웹브라우징
3. 위에서 아래 순서로 테스트 진행
<br><br>
### [예제 프로젝트 구현 내용] 
- 스프링 시큐리티를 통해 비밀번호를 암호화하여 DB에 저장
- DB에 저장된 사용자의 계정과 비밀번호로 로그인하고, JWT를 사용하여 로그인한 사용자에게 토큰 발급
- 스프링 시큐리티를 통해 인가된 토큰의 권한에 따라 API 접근 권한 제어
- 스프링 시큐리티에서 발생하는 예외를 처리하여 클라이언트에게 응답
<br><br>
### [브랜치 정보]
- master : 예외 처리를 하지 않고 스프링 시큐리티와 JWT 설정만 완료한 브랜치
<br><br>
### 환경 정보
- Java 17
- Spring Boot 3.3.2
- Spring Security 3.3.2
- Spring Data JPA 3.3.2
- H2 DB 2.2.224
- Gradle 7.6.1
- Lombok 1.18.34
