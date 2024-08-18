package com.colabear754.authentication_example_java.controller;

import com.colabear754.authentication_example_java.dto.ApiResponse;
import com.colabear754.authentication_example_java.service.AdminService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Tag: Swagger 에서 API 연산(Operation)을 그룹화하는 데 사용되는 어노테이션
@Tag(name = "2. 관리자용 API")
@RequiredArgsConstructor
@PreAuthorize("hasAuthority('ADMIN')")
@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;

    //@Operation: Swagger 의 API 문서 생성 어노테이션
    @Operation(summary = "관리자 목록 조회")
    @GetMapping("/admins")
    public ApiResponse getAllAdmins() {
        return ApiResponse.success(adminService.getAdmins());
    }

    @Operation(summary = "회원 목록 조회")
    @GetMapping("/members")
    public ApiResponse getAllMembers() {
        return ApiResponse.success(adminService.getMembers());
    }
}
