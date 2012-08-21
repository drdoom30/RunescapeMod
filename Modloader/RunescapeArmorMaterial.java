package net.minecraft.src;

public enum RunescapeArmorMaterial {

	Dragon("Dragon", 10, 48, new int[]{3, 10, 8, 3}, 20),
	Rune("Rune", 11, 33, new int[]{3, 8, 6, 3}, 10),
	Adamantite("Addy", 12, 28, new int[]{2, 6, 4, 1}, 25),
	Mithril("Mith", 13, 21, new int[]{2, 3, 2, 1}, 8),
	Steel("Steel", 14, 7, new int[] {1, 4, 3, 2}, 9),
	Bronze("Bronzw", 15, 11, new int[] {3, 6, 5, 2}, 9);
	
    
	 private int maxDamageFactor;
	  private int[] damageReductionAmountArray;
	  private int enchantability;
   
 
    private RunescapeArmorMaterial(String s, int i, int j, int ai[], int k)
    {
        this.maxDamageFactor = j;
        this.damageReductionAmountArray = ai;
        this.enchantability = k;
    }
 
    public int func_40576_a(int i)
    {
        return ItemArmor.getMaxDamageArray()[i] * this.maxDamageFactor;
    }
        
    public int getDamageReductionAmount(int i) {
        return this.damageReductionAmountArray[i];
    }
 
    public int getEnchantability()
    {
        return this.enchantability;
    }
 
}
