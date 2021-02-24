package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;

public class DiggyStairs extends StairsBlock{

	public DiggyStairs()  {
		super(new Block(Block.Properties.create(Material.ROCK)
				.hardnessAndResistance(3f, 2f)
				).getDefaultState(),

		Block.Properties.create(Material.WOOD)
				.sound(SoundType.WOOD)
				.hardnessAndResistance(3f, 2f)
		);
		setRegistryName("diggystairs");
	}

}
