package com.example.korus.controllers;

import com.example.korus.dao.MembersGroupDaoInMemory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class MemberRestControllerMockTest {

    @Mock
    private MembersGroupDaoInMemory membersGroupDaoInMemory;

    @BeforeEach
    void setMockOutput() {
        when(membersGroupDaoInMemory.getAllNameOfMembersYoungerPathVariableAge(25)).thenReturn(Collections.singleton("Hello Mockito From Repository"));
    }

    @DisplayName("Test Mock helloService + helloRepository")
    @Test
    void testGet() {
        assertEquals(Collections.singleton("Hello Mockito From Repository"), membersGroupDaoInMemory.getAllNameOfMembersYoungerPathVariableAge(25));
    }

    @Test
    void getMembersYoungerCurrentAge() {
    }
}