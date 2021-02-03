package com.example.examplemod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(ExampleMod.MODID)
public class ItemInit {

	public final static Item DIGGY_DISK = new CustomDisk("diggy", ExampleMod.DIGGY_SONG, new Item.Properties().group(ItemGroup.MISC).rarity(Rarity.RARE).maxStackSize(1));

		   
	@Mod.EventBusSubscriber(modid = ExampleMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Register
	{	
		@SubscribeEvent
		public static void registerItem(final RegistryEvent.Register<Item> event)
		{
			ExampleMod.LOGGER.info("Item INIT DIGGY");
			final Item[] items = {
					DIGGY_DISK,
			};
		
			event.getRegistry().registerAll(items);
		}
	}
}