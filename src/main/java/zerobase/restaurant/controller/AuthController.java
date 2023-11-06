package zerobase.restaurant.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import zerobase.restaurant.dto.Auth;
import zerobase.restaurant.security.TokenProvider;
import zerobase.restaurant.service.MemberService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final MemberService memberService;

    private final TokenProvider tokenProvider;

    @GetMapping("/signup")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> signup(@RequestBody Auth.SighUp request) {
        var result = this.memberService.register(request);
        return ResponseEntity.ok(result);
    }
    // Postman으로 signup get 요청보낼시 계속 403 에러가 뜨는데 Security쪽 문제같으나 원인을 도저히 모르겠다...

    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestBody Auth.SignIn request) {
        var member = this.memberService.authenticate(request);
        var token = this.tokenProvider.generateToken(member.getUsername(), member.getRoles());
        return ResponseEntity.ok(token);
    }

}
