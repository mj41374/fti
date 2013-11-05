package com.woodpike.fti;

import com.woodpike.fti.giant.GiantSystem;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created with IntelliJ IDEA.
 * User: kelli1mj
 * Date: 11/4/13
 * Time: 5:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Plugin extends JavaPlugin {
    public void onEnable() {
        GiantSystem.init(this);


    }

    public void onDisable() {


    }


}
