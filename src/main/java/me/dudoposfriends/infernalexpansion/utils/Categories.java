package me.dudoposfriends.infernalexpansion.utils;

import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;
import me.dudoposfriends.infernalexpansion.InfernalExpansion;

import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


@UtilityClass
public class Categories {
    //subcategoria
    public static final ItemGroup INFE_ITEMS = new SubGroup(
            "infe_items",
            new CustomItemStack(new ItemStack(Material.REDSTONE_LAMP), BukkitComponentSerializer.legacy().serialize
                    (InfernalExpansion.MM.deserialize("<gradient:#ff0000:#f4ff00>Items</gradient>")))
    );
    //categoria principal
    //DEVE FICAR DEPOIS DE TODAS AS CATEGORIAS
    public static final ItemGroup INFE_MAIN = new MultiGroup(
            "infe_main",
            new CustomItemStack(Material.NETHERITE_BLOCK, BukkitComponentSerializer.legacy().serialize
                    (InfernalExpansion.MM.deserialize("<gradient:#5e4fa2:#f79459>Elements Manipulation</gradient>"))),
            INFE_ITEMS
    );


    public static void setup(InfernalExpansion infe){
        INFE_MAIN.register(infe);
    }

}