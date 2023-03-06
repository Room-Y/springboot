package com.itheima.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * @author: Java_cmr
 * @Date: 2023/3/3 - 13:18
 */

@Component
@Data
@ConfigurationProperties(prefix = "servers")
@Validated
public class ServerConfig {
    private String ipAddress;
    @Max(value = 8888, message = "最大值不能超过8888")
    private int port;
    private long timeout;
    @DurationUnit(ChronoUnit.SECONDS)
    private Duration serverTimeOut;
    @DataSizeUnit(DataUnit.KILOBYTES)
    private DataSize dataSize;
}
