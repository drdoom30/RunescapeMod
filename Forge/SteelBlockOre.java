package net.minecraft.src;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class SteelBlockOre extends Block
{
    public SteelBlockOre(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    public String getTextureFile()
    {
            return "/Runescape/gui/terrian.png";
    }
}

