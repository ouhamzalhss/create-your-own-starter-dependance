package com.ouhamza;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Lhouceine OUHAMZA
 */

@ConfigurationProperties("hello")
public class HelloProperties {

    /**
     * Prefix of welcome message
     */
    private String prefix = "Hello";

    /**
     * Suffix of welcome message
     */
    private String suffix = "my childres";

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
