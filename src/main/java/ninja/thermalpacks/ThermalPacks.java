package ninja.thermalpacks;

import cpw.mods.fml.common.Mod;
import ninja.thermalpacks.api.IMainModClass;

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
