package me.dudoposfriends.infernalexpansion;


import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.dudoposfriends.infernalexpansion.items.Items;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import net.kyori.adventure.text.minimessage.tag.standard.StandardTags;
import org.bstats.bukkit.Metrics;


public final class InfernalExpansion extends AbstractAddon implements SlimefunAddon {
    private static InfernalExpansion i;



    public static final MiniMessage MM = MiniMessage.builder()
            .tags(TagResolver.builder()
                    .resolver(StandardTags.color())
                    .resolver(StandardTags.decorations())
                    .resolver(StandardTags.gradient())
                    .build()
            )
            .build();
    MiniMessage mm = MiniMessage.miniMessage();
    public InfernalExpansion() {
        super("Dudoposfriends", "InfernalExpansion", "master", "options.auto-update");
    }
    @Override
    public void enable() {
        //instance and setup
        i = this;
        //aqui colocamos o setup dos itens
        Items.setup(this);
    }

    @Override
    public void disable() {
        // Set instance to null
        i = null;
    }

    public static InfernalExpansion i() {
        return i;
    }

}