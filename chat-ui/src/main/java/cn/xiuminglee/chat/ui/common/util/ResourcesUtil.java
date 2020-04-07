package cn.xiuminglee.chat.ui.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Xiuming Lee
 * @description 资源文件工具类
 *
 * eg: new Image("url")的方式在模块化下，会出现找不到的问题，
 * 通过此类，诸如new Image("url")方式统一改为new Image(InputStream)的形式。
 */
public class ResourcesUtil {
    private static final Logger LOG = LoggerFactory.getLogger(ResourcesUtil.class);


    public static InputStream getResource(String resourceName){
        try {
            return ResourcesUtil.class.getResource(resourceName).openStream();
        } catch (IOException e) {
            LOG.error("读取资源失败！",e);
        }
        return null;
    }
}
