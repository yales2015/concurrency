package com.yy;

import com.yy.controller.TestController;
import org.springframework.boot.SpringApplication;

/**
 * Created by yy on 2018/3/23.
 */
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(TestController.class, args);
    }
}
