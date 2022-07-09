package com.min.toma;

import com.min.toma.mapper.memberDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class TimeMapperTest {

    @Autowired
    private memberDao timeMapper;


    //XML 방식
    @Test
    public void testGetTime2() {
        log.info("getTime2");
        log.info("getTime2: " + timeMapper.getTime2());
    }
}