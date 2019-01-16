package com.rabiya.hashing;

import org.apache.commons.codec.digest.DigestUtils;

public class App {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }
        System.out.println(sampleMethod(args[0]));

    }

    public static String sampleMethod(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
