package com.spring.springselenium.resource;

import com.spring.springselenium.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ResourceTest extends SpringBaseTestNGTest {

    //    @Value("classpath:data/testdata.csv")
//    @Value("file/Users/dmitrii/Desktop/Projects/JAVA/spring-selenium/src/test/java/resources/data/testdata.csv")
//    @Value("https://www.google.com")
    @Value("https://www.w3.org/TR/PNG/iso_8859-1.txt")
    private Resource resource;

    @Value("${screenshot.path}/some.txt")
    private Path path;

    @Test
    public void resourceTest() throws IOException {
//        Files.readAllLines(resource.getFile().toPath()).forEach(System.out::println);
//        System.out.println(new String(resource.getInputStream().readAllBytes()));
        FileCopyUtils.copy(resource.getInputStream(), Files.newOutputStream(path));

    }

}
