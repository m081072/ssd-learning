package com.scon;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HelloWorldResourceTest {

    @Test
    public void saysHelloWorld() {
        assertThat(new HelloWorldResource().index(), is("Hello World"));
    }
}
