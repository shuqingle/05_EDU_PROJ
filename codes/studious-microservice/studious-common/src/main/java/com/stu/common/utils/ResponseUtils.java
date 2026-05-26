package com.stu.common.utils;


import com.stu.common.enumInfo.ResultCodeInfo;
import com.stu.common.enumInfo.ResultCodeInterface;
import com.stu.common.model.response.ObjectResponse;
import com.stu.common.model.response.TableResponse;

import java.util.List;

public class ResponseUtils {
    public static <T> ObjectResponse<T> objectSuccess(){
        return new ObjectResponse(ResultCodeInfo.SUCCESS.code(),ResultCodeInfo.SUCCESS.message());
    }

    public static <T> ObjectResponse<T> objectSuccess(T data){
        return new ObjectResponse(ResultCodeInfo.SUCCESS.code(),ResultCodeInfo.SUCCESS.message(),data);
    }

    public static <T> TableResponse<T> tableSuccess(ResultCodeInterface errorCodes, List<T> list){
        PageUtils<T> pu = new PageUtils<>();
        return pu.right(list);
    }
}
