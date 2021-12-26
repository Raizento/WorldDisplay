package com.gmail.molitor.alexander.it.worlds;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

import com.gmail.molitor.alexander.it.WorldDisplayLogger;
import com.google.gson.Gson;

public class WorldInfoFactory {
    public static HashMap<String, WorldInfo> createHashMapFromJson(String resourcePath) throws IOException {
        URL f = WorldInfoFactory.class.getClassLoader().getResource("json/worldInfo.json");
        File fa = new File(f.getPath());

        WorldDisplayLogger.getInstance().info(f.getFile());
        WorldDisplayLogger.getInstance().info(String.valueOf(fa.exists()));


        return null;
    }
}
