package com.donghaifunds.findfit.common.shenwan.regress;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Copyright (C), 2022, 东海基金管理有限责任公司
 * FileName: com.donghaifunds.findfit.common.shenwan.regress.ShenwanProperty
 *
 * @author sirs
 * Date:     2022/7/25 9:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@ConfigurationProperties(prefix = "shenwan-regress")
@Data
@Component
public class ShenwanProperty implements Serializable {
    String address;
    String port;
    String executorHandler;

    public String getUrl(){
        return "http://" + address + ":" + port + "/run";
    }
}
