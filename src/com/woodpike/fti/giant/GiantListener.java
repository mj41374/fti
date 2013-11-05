package com.woodpike.fti.giant;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

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
            //If this is a Creeper Entity dying
            //Then on a 1:4 chance (25%)...
            Random random = new Random();
            int chance = random.nextInt(100);
            if (chance < 25) {
                //Drop an Emerald
                ItemStack emerald = new ItemStack(Material.EMERALD,1);
                event.getDrops().add(emerald);
            }


        }
    }



}
