package net.minecraft.src;

public class Runescapeaxe extends Runeaxetool {

	private static Block blocksEffectiveAgainst[];
    protected Runescapeaxe(int par1, EnumToolMaterialLink par2EnumToolMaterialLink)
    {
            super(par1, 3, par2EnumToolMaterialLink, blocksEffectiveAgainst);
    }
    /**
     * Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
     * sword
     */
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
            if (par2Block != null && par2Block.blockMaterial == Material.wood)
            {
                    return efficiencyOnProperMaterial;
            }
            else
            {
                    return super.getStrVsBlock(par1ItemStack, par2Block);
            }
    }
    static
    {
            blocksEffectiveAgainst = (new Block[]
                            {
                                    Block.planks, Block.bookShelf, Block.wood, Block.chest, Block.stairsWoodBirch, Block.stairsWoodJungle, Block.stairCompactPlanks, Block.stairsWoodSpruce, Block.pumpkin, Block.pumpkinLantern
                            });
    }
	
}
