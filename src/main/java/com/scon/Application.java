package com.scon;

import com.googlecode.utterlyidle.RestApplication;

import static com.googlecode.utterlyidle.ApplicationBuilder.application;
import static com.googlecode.utterlyidle.BasePath.basePath;
import static com.googlecode.utterlyidle.ServerConfiguration.defaultConfiguration;

public class Application {
    public static void main(String[] args) {
        final RestApplication application = new RestApplication(basePath("/"), new HelloWorldModule());
        application(application).start(defaultConfiguration().port(port(args)));
    }

    private static int port(String []args) {
        if(args.length == 1) {
            return Integer.parseInt(args[0]);
        }
        return 8000;
    }
}
