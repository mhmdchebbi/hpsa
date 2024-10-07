package net.heberd;


import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class Main {

    public static void main(String[] args) throws Exception {

        CamelContext context = new DefaultCamelContext();

        while(true)
            context.start();

    }
}