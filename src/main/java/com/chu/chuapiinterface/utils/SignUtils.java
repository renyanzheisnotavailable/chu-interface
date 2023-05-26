package com.chu.chuapiinterface.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

import java.util.Map;

/**
 * 签名工具
 * @author Chu
 */
public class SignUtils {

    /**
     * 生成签名
     * @param hashMap 客户端传递信息
     * @param secretKey
     * @return
     */
    public static String genSign(Map<String, String> hashMap, String secretKey) {
        Digester md5 = new Digester(DigestAlgorithm.SHA256);
        String content = hashMap.toString() + "." + secretKey;
        return md5.digestHex(content);
    }
}
