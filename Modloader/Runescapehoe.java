package net.minecraft.src;

public class Runescapehoe extends Item {

	public Runescapehoe(int par1, EnumToolMaterialLink par2EnumToolMaterialLink)
    {
            super(par1);
            maxStackSize = 1;
            setMaxDamage(par2EnumToolMaterialLink.getMaxUses());
    }
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7)
    {
            if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6))
            {
                    return false;
            }
            int i = par3World.getBlockId(par4, par5, par6);
            int j = par3World.getBlockId(par4, par5 + 1, par6);
            if (par7 != 0 && j == 0 && i == Block.grass.blockID || i == Block.dirt.blockID)
            {
                    Block block = Block.tilledField;
                    par3World.playSoundEffect((float)par4 + 0.5F, (float)par5 + 0.5F, (float)par6 + 0.5F, block.stepSound.getStepSound(), (block.stepSound.getVolume() + 1.0F) / 2.0F, block.stepSound.getPitch() * 0.8F);
                    if (par3World.isRemote)
                    {
                            return true;
                    }
                    else
                    {
                            par3World.setBlockWithNotify(par4, par5, par6, block.blockID);
                            par1ItemStack.damageItem(1, par2EntityPlayer);
                            return true;
                    }
            }
            else
            {
                    return false;
            }
    }

    public boolean isFull3D()
    {
            return true;
    }
}
