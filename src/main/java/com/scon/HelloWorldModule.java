package com.scon;

import com.googlecode.utterlyidle.Resources;
import com.googlecode.utterlyidle.modules.ResourcesModule;

import static com.googlecode.utterlyidle.annotations.AnnotatedBindings.annotatedClass;

public class HelloWorldModule implements ResourcesModule{
    @Override
    public Resources addResources(Resources resources) throws Exception {
        return resources.add(annotatedClass(HelloWorldResource.class));
    }
}
