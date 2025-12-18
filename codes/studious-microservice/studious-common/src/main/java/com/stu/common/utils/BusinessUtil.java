package com.stu.common.utils;


import com.stu.common.enumInfo.ResultCodeInterface;
import com.stu.common.exception.BusinessException;

import java.util.UUID;


/**
 * 通用工具类
 */
public class BusinessUtil {
    public static void stopBusiProcess(ResultCodeInterface errorCodes) throws BusinessException {
        throw new BusinessException(errorCodes);
    }

    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replaceAll("-", "");
        return uuid;
    }

}
