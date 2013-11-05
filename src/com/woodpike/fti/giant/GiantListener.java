package com.woodpike.fti.giant;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created with IntelliJ IDEA.
 * User: kelli1mj
 * Date: 11/4/13
 * Time: 6:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class GiantListener implements Listener {
    public GiantListener(JavaPlugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(this,plugin);
    }


    //This is the Bukkit Event handler
    @EventHandler
    public void onGiantDeath(EntityDeathEvent event){
        if (event.getEntityType() == EntityType.CREEPER){
            ItemStack emerald = new ItemStack(Material.EMERALD,1);
            event.getDrops().add(emerald);


        }
    }



}
