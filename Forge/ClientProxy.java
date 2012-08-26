package net.minecraft.src;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxyTutorial
{
    @Override
    public void registerRenderThings()
    {
     MinecraftForgeClient.preloadTexture("/TutTextures.png");
    }
}