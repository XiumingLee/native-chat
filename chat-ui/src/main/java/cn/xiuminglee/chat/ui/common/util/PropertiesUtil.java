package cn.xiuminglee.chat.ui.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
/**
 * @Author: Xiuming Lee
 */
public class PropertiesUtil {

    private static final Logger LOG = LoggerFactory.getLogger(PropertiesUtil.class);

    private static Properties props;

    static {
        String fileName = "application.properties";
        props = new Properties();
        try {
            InputStream inputStream = ClassLoader.getSystemResourceAsStream(fileName);
            assert inputStream != null;
            props.load(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        } catch (IOException e) {
            LOG.error("配置文件读取异常!",e);
        }
    }

    public static String getProperty(String key){
        String value = props.getProperty(key.trim());
        if("".equals(value)){
            return null;
        }
        return value.trim();
    }

    public static String getProperty(String key, String defaultValue){

        String value = props.getProperty(key.trim());
        if("".equals(value)){
            value = defaultValue;
        }
        return value.trim();
    }
}
