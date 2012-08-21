package net.minecraft.src;

import java.util.Random;

public class RuneOre extends Block
{
public RuneOre(int i, int j)
{
super(i, j, Material.iron);
}
public int idDropped(int i, Random random, int j)
{
return mod_Runescape.blockRune.blockID;
}
public int quantityDropped(Random random)
{
return 1;
}

}
