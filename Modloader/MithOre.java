package net.minecraft.src;

import java.util.Random;

public class MithOre extends Block
{
public MithOre(int i, int j)
{
super(i, j, Material.iron);
}
public int idDropped(int i, Random random, int j)
{
return mod_Runescape.blockMithril.blockID;
}
public int quantityDropped(Random random)
{
return 1;
}

}
