package com.dwring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;


/**
 * @ClassName: ZipkinApplicationStart
 * @Description: zipkin
 * @author haichangzhang
 * @date 2021年3月15日 下午3:52:10
 *
 */
@EnableZipkinServer
@SpringBootApplication
public class ZipkinServerApplicationStart {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerApplicationStart.class, args);
	}

}
