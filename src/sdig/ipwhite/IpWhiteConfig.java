package sdig.ipwhite;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.Charsets;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

/**
 * <p>Description: IP白名单配置</p>
 * <p>Copyright: Copyright (c) 2021</p>
 * <p>Company: TranzVision, Co. Ltd.</p>
 * @author ZhangLang
 * Create Time: 2021年12月9日 下午2:53:38
 */
public class IpWhiteConfig {

    // IP白名单，默认允许所有IP
    private String ipWhiteList = "*";

    /**
     * IP白名单配置
     * @param property 配置属性
     */
    public IpWhiteConfig(String property) {
        //从配置文件中读取BPM数据库配置信息
        Resource resource = new ClassPathResource("IPWhiteConfig.properties");
        EncodedResource encodedResource = new EncodedResource(resource, Charsets.UTF_8);
        try {
            Properties ipProps = PropertiesLoaderUtils.loadProperties(encodedResource);
            if(ipProps.containsKey(property) == true) {
                ipWhiteList = ipProps.getProperty(property);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @return 返回IP白名单列表
     */
    public String getIpWhiteList() {
        return ipWhiteList;
    }
}

