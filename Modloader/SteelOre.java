package net.minecraft.src;

import java.util.Random;

public class SteelOre extends Block
{
public SteelOre(int i, int j)
{
super(i, j, Material.iron);
}
public int idDropped(int i, Random random, int j)
{
return mod_Runescape.blockSteel.blockID;
}
public int quantityDropped(Random random)
{
return 1;
}

}
