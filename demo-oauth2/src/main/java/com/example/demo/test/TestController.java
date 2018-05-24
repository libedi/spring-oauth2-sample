package com.example.demo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	/*
	 * Access-Token 발급받는 방법
	 * 
	 * 1. authorization-code 방식 - 서버 사이트 웹에서 인증받을 때 사용
	 * http://localhost:8080/oauth/authorize?response_type=code&client_id=foo&redirect_uri=http://localhost:8080/test/authorization-code&scope=read
	 * -> authority로 authorize 선택하면 redirect_uri로 code가 표시
	 * -> form-data로 grant_type=authorization_code&code=코드&client_id=foo&client_secret=bar&scope=read&redirect_uri=http://localhost:8080/test/authorization-code 전송
	 * 
	 * 2. 암묵적인 동의 방식 (Implicit Grant Flow) - 클라이언트에서 인증할 때 사용 (JSONP, CORS 지원필요)
	 * http://localhost:8080/oauth/authorize?response_type=token&client_id=foo&redirect_uri=http://localhost:8080/test/authorization-code&scope=read
	 * -> redirect_uri에 해쉬문자(#) 뒤에 access-token정보가 표시.(refresh X)
	 * 
	 * 3. 자원 소유자 비밀번호 (Resource Owner Password Credential Flow) - 자원 소유자 측 사용자 아이디와 비밀번호로 발급
	 * http://foo:bar@localhost:8080/oauth/token?grant_type=password&client_id=foo&scope=read&username=user&password=test
	 * 
	 * 4. 클라이언트 인증 플로우 (Client Credential Flow) - 클라이언트가 직접 자신의 정보를 통해 토큰 발급 (refresh X)
	 * http://foo:bar@localhost:8080/oauth/token?grant_type=client_credentials&scope=read
	 * 
	 * 5. refresh-token을 통한 재발급 - 저장해둔 refresh token으로 재발급. 기존 access-token은 만료.
	 * http://localhost:8080/oauth/token?grant_type=refresh_token&scope=read&refresh_token=리프레쉬토큰
	 * -> refresh-token은 계속 재사용 가능.
	 * 
	 * *** 사실 이 메서드는 클라이언트의 redirect-uri 부분이다.
	 * *** 따라서 받아온 code로 아래와 같이 인증하여 access-token을 받아와 api를 수행한다.
	 */
	@RequestMapping("authorization-code")
	public String authorizationCodeTest(@RequestParam("code") String code) {
		return String.format("curl "
				+ "-F \"grant_type=authorization_code\" "
				+ "-F \"code=%s\" "
				+ "-F \"scope=read\" "
				+ "-F \"client_id=foo\" "
				+ "-F \"client_secret=bar\" "
				+ "-F \"redirect_url=http://localhost:8080/test/authorization_code\" "
				+ "\"http://foo:bar@localhost:8080/oauth/token\"", code);
	}
}
