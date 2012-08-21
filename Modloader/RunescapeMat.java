package net.minecraft.src;

public enum RunescapeMat {

	
	sapphire(2, 400, 6.0F, 2, 14);
	
	private int harvestLevel;
	private int maxUses;
	private float efficiencyOnProperMaterial;
	private int damageVsEntity;
	private int enchantability;
	
	
	private RunescapeMat(int par1, int par2, float par3, int par4, int par5){
		harvestLevel=par1;
		maxUses =par2;
		efficiencyOnProperMaterial = par3;
		damageVsEntity=par4;
		enchantability=par5;
	}
	
	
	public int getHarvestLevel(){
		return harvestLevel;
	}
	public int getMaxUses(){
		return maxUses;
	}
	public float getEfficiencyOnProperMaterial(){
		return efficiencyOnProperMaterial;
	}
	public int getDamageVsEntity(){
		return damageVsEntity;
	}
	public int getEnchantability(){
		return enchantability;
	}
	
}