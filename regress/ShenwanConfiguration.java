package com.donghaifunds.findfit.common.shenwan.regress; /**
 * Copyright (C), 2022, 东海基金管理有限责任公司
 * FileName: com.donghaifunds.findfit.common.shenwan.regress.ShenwanConfiguration
 *
 * @author sirs
 * Date:     2022/7/25 10:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ShenwanProperty.class)
public class ShenwanConfiguration {

    @Bean
    public ShenwanProperty shenwanProperty(ShenwanProperty input){
        return input;
    }
}
