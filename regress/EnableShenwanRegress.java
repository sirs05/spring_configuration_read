package com.donghaifunds.findfit.common.shenwan.regress;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Copyright (C), 2022, 东海基金管理有限责任公司
 * FileName: com.donghaifunds.findfit.common.shenwan.regress.EnableShenwanRegress
 *
 * @author sirs
 * Date:     2022/7/25 10:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({ShenwanConfiguration.class})
@Documented
public @interface EnableShenwanRegress {
}
