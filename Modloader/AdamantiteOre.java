package net.minecraft.src;

import java.util.Random;

public class AdamantiteOre extends Block
{
public AdamantiteOre(int i, int j)
{
super(i, j, Material.iron);
}
public int idDropped(int i, Random random, int j)
{
return mod_Runescape.blockAdamantite.blockID;
}
public int quantityDropped(Random random)
{
return 1;
}
}
