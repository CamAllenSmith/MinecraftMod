package com.example.examplemod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomBlock extends Block {
    public CustomBlock() {
        super(AbstractBlock.Properties.of(Material.BAMBOO));


    }
}
