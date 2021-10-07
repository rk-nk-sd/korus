package com.example.korus.controllers;

import com.example.korus.dao.MembersGroupDaoInMemory;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/members")
@AllArgsConstructor
public class MemberRestController {

    private final MembersGroupDaoInMemory membersGroupDaoInMemory;

    @GetMapping()
    public Set<String> getAll() {
        return null;
    }

    @GetMapping("/younger/{age}")
    public ResponseEntity<Set<String>> getMembersYoungerCurrentAge(@PathVariable(value = "age") int age) {
        return ResponseEntity.ok(
                membersGroupDaoInMemory.getAllNameOfMembersYoungerPathVariableAge(age)
        );
    }
}
