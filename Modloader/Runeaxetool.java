package net.minecraft.src;

public class Runeaxetool extends Item{

	private Block blocksEffectiveAgainst[];
	protected float efficiencyOnProperMaterial;
	private int damageVsEntity;
	protected EnumToolMaterialLink toolMaterial;
	protected Runeaxetool(int i, int j, EnumToolMaterialLink par3EnumToolMaterialLink, Block par4ArrayOfBlock[])
	{
	super(i);
	efficiencyOnProperMaterial = 4F;
	toolMaterial = par3EnumToolMaterialLink;
	blocksEffectiveAgainst = par4ArrayOfBlock;
	maxStackSize = 1;
	setMaxDamage(par3EnumToolMaterialLink.getMaxUses());
	efficiencyOnProperMaterial = par3EnumToolMaterialLink.getEfficiencyOnProperMaterial();
	damageVsEntity = j + par3EnumToolMaterialLink.getDamageVsEntity();
	}
	/**
	* Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
	* sword
	*/
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
	{
	for (int i = 0; i < blocksEffectiveAgainst.length; i++)
	{
	if (blocksEffectiveAgainst[i] == par2Block)
	{
	        return efficiencyOnProperMaterial;
	}
	}
	return 1.0F;
	}
	/**
	* Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
	* the damage on the stack.
	*/
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	{
	par1ItemStack.damageItem(2, par3EntityLiving);
	return true;
	}
	//If someone decompiles a more updated MCP after the time of writing this tutorial and you get an error on this method, please let me know via either a PM or just a post on this topic. The method hasn't been named yet so it is highly likely in a forthcoming MCP update it will be.

	public boolean func_77660_a(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLiving par7EntityLiving)
	{
	if ((double)Block.blocksList[par3].getBlockHardness(par2World, par4, par5, par6) != 0.0D)
	{
	par1ItemStack.damageItem(1, par7EntityLiving);
	}

	return true;
	}
	/**
	* Returns the damage against a given entity.
	*/
	public int getDamageVsEntity(Entity par1Entity)
	{
	return damageVsEntity;
	}
	/**
	* Returns True is the item is renderer in full 3D when hold.
	*/
	public boolean isFull3D()
	{
	return true;
	}
	/**
	* Return the enchantability factor of the item, most of the time is based on material.
	*/
	public int getItemEnchantability()
	{
	return toolMaterial.getEnchantability();
	}
}
