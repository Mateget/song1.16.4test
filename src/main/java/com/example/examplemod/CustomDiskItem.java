package com.example.examplemod;

import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.SoundEvent;

public class CustomDiskItem extends MusicDiscItem{

	private final SoundEvent sound;

	public CustomDiskItem(String name, SoundEvent soundIn, Item.Properties builder) 
	{
		super(1, soundIn, builder);
		//this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.sound = soundIn;
		//=this.displayName = "item.record." + name + ".desc";
	}
}