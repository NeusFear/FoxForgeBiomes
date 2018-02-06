package foxforgebiomes.core;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static foxforgebiomes.core.FoxForgeBiomes.MOD_NAME;

@Mod(modid = FoxForgeBiomes.MOD_ID, version = FoxForgeBiomes.MOD_VERSION, name = MOD_NAME)
public class FoxForgeBiomes {
    public static final String MOD_NAME = "FoxForge Biomes";
    public static final String MOD_ID = "foxforgebiomes";
    public static final String MOD_VERSION = "v1.0.0";

    @Mod.Instance(MOD_ID)
    public static FoxForgeBiomes isntance;

    public static Logger logger = LogManager.getLogger(MOD_ID);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }
}
