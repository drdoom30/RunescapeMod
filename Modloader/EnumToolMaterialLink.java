package net.minecraft.src;

public enum EnumToolMaterialLink {
	
	Rune(3, 1561, 8.0F, 3, 10),
	Adamantite(3, 1123, 12.0F, 3, 22),
	Mithril(3, 567, 12.0F, 3, 8),
	Steel(2, 250, 6.0F, 2, 14),
	Bronze(1, 131, 4.0F, 1, 5),
	Dragon(3, 2015, 8.0F, 3, 10);
	
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiencyOnProperMaterial;
    private final int damageVsEntity;
    private final int enchantability;
    private EnumToolMaterialLink(int par3, int par4, float par5, int par6, int par7)
    {
            harvestLevel = par3;
            maxUses = par4;
            efficiencyOnProperMaterial = par5;
            damageVsEntity = par6;
            enchantability = par7;
    }
    public int getMaxUses()
    {
            return maxUses;
    }
    public float getEfficiencyOnProperMaterial()
    {
            return efficiencyOnProperMaterial;
    }
    public int getDamageVsEntity()
    {
            return damageVsEntity;
    }
    public int getHarvestLevel()
    {
            return harvestLevel;
    }
    public int getEnchantability()
    {
            return enchantability;
    }
}
