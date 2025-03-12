package com.green.greengram;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

/*
    테스트 테이블 entity 생성

*/
@ActiveProfiles("test-init")
@Rollback(false)
@SpringBootTest
@Sql(scripts = {"classpath:test-import.sql"})
public class TestInit {
    @Test
    void init() {}
}
