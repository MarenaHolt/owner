package qa.guru.owner.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class WebDriverConfigOld {

    public String getBaseUrl() {
        //зачитываем значение из настроек
        String baseUrl = System.getProperty("baseUrl");
        //проверяем дефолтное значение
        if (Objects.isNull(baseUrl)) {
            baseUrl = "https://github.com";
        }
        //возвращаем результат
        return baseUrl;
       // return "https://github.com";
    }

    public Browser getBrowser() {
        //зачитываем значение из настроек
        String browser = System.getProperty("browser");
        //проверяем дефолтное значение
        if (Objects.isNull(browser)) {
            browser = "CHROME";
        }
        //возвращаем результат с приведением типов
        return Browser.valueOf(browser);
        //return Browser.CHROME;
    }

    public URL getRemoteURL() throws MalformedURLException {
        //зачитываем значение из настроек
        String remoteUrl = System.getProperty("remoteUrl");
        //проверяем дефолтное значение
        if (Objects.isNull(remoteUrl)) {
            remoteUrl = "http://localhost:4444";
        }
        //возвращаем результат с приведением типов
        return new URL(remoteUrl);
        //return Browser.CHROME;
    }


}
