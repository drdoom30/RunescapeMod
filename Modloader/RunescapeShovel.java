package net.minecraft.src;

public class RunescapeShovel extends Runeaxetool
{
    private static Block blocksEffectiveAgainst[];
    public RunescapeShovel(int par1, EnumToolMaterialLink par2EnumToolMaterialLink)
    {
            super(par1, 1, par2EnumToolMaterialLink, blocksEffectiveAgainst);
    }
    /**
     * Returns if the item (tool) can harvest results from the block type.
     */
    public boolean canHarvestBlock(Block par1Block)
    {
            if (par1Block == Block.snow)
            {
                    return true;
            }
            return par1Block == Block.blockSnow;
    }
    static
    {
            blocksEffectiveAgainst = (new Block[]
                            {
                                    Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField, Block.slowSand, Block.mycelium
                            });
    }

}
