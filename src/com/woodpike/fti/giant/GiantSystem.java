package com.woodpike.fti.giant;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created with IntelliJ IDEA.
 * User: kelli1mj
 * Date: 11/4/13
 * Time: 5:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class GiantSystem {
    private GiantSystem(){

    }

    public static void init(JavaPlugin plugin) {
        new GiantListener(plugin);

    }
}
