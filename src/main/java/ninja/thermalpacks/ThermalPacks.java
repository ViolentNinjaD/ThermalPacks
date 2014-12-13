package ninja.thermalpacks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import ninja.thermalpacks.api.IMainModClass;
import ninja.thermalpacks.proxy.IProxy;
import ninja.thermalpacks.reference.Reference;

/**
    @author ViolentNinjaD
    ThermalPacks
    Licensed under LGPLv3
**/

@Mod(modid = ThermalPacks.MOD_ID, name = ThermalPacks.MOD_NAME, version = ThermalPacks.MOD_VERSION)
public class ThermalPacks implements IMainModClass
{
    public static final String MOD_ID = "ThermalPacks";
    public static final String MOD_NAME = "Thermal Packs";
    public static final String MOD_VERSION = "@VERSION@";

    @Mod.Instance(MOD_ID)
    public static ThermalPacks instance;

    @SidedProxy(clientSide = Reference.Proxy.CLIENT, serverSide = Reference.Proxy.SERVER)
    public static IProxy proxy;

    @Override
    public String modid()
    {
        return MOD_ID;
    }

    @Override
    public String name()
    {
        return MOD_NAME;
    }

    @Override
    public String version()
    {
        return MOD_VERSION;
    }
}
