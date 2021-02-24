package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class DiggyStairsItem extends BlockItem {

	public DiggyStairsItem(String name,Block blockIn, Properties properties) {
		super(blockIn, properties);
		this.setRegistryName(name);
	}

}
