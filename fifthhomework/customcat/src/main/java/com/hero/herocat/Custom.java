package com.hero.herocat;

public class Custom {
    public static void run(String[] args) throws Exception {
        HeroCatServer server = new HeroCatServer("com.hero.webapp");
        server.start();
    }
}
