package me.dudoposfriends.infernalexpansion.items;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.dudoposfriends.infernalexpansion.InfernalExpansion;
import me.dudoposfriends.infernalexpansion.utils.Categories;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Items {
    /*SlimefunItemStack dos itens
    *decide ID, Item, nome, e lore do item
     */
    //exemplo de item
    public static final SlimefunItemStack EXAMPLE_ITEM_1 = new SlimefunItemStack(
            "INFE_EXAMPLE_ITEM",
            Material.SMITHING_TABLE,
            "&aJunction table",
            "&7Used to craft items from elements"
    );
    //exemplo de outro item
    public static final SlimefunItemStack EXAMPLE_ITEM_2 = new SlimefunItemStack(
            "INFE_EXAMPLE_ITEM_2",
            Material.SMITHING_TABLE,
            "&aJunction table",
            "&7Used to craft items from elements"
    );
    /**
    *Função usada para setup os itens
     * @see InfernalExpansion
     */
    public static void setup(InfernalExpansion infe){
        /*
        new ItemStack(Material.ITEM)
        usado para colocar itens vanila na receita
        SlimefunItems.ITEM
        usado para colocar itens do slimefun
        null
        slot vazio na receita
         */
        new SlimefunItem(Categories.INFE_ITEMS, EXAMPLE_ITEM_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.DIAMOND), null, new ItemStack(Material.DIAMOND),
                null, SlimefunItems.CARBONADO, null,
                new ItemStack(Material.DIAMOND), null, new ItemStack(Material.DIAMOND)
        }).register(infe);
        //também pode usar itens do addon, colocando o SlimefunItemStack dele
        new SlimefunItem(Categories.INFE_ITEMS, EXAMPLE_ITEM_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.DIAMOND), null, new ItemStack(Material.DIAMOND),
                null, EXAMPLE_ITEM_1, null,
                new ItemStack(Material.DIAMOND), null, new ItemStack(Material.DIAMOND)
        }).register(infe);
        
    }
}
