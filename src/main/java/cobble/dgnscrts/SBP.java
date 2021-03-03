package cobble.dgnscrts;

import com.google.gson.JsonSyntaxException;

import cobble.dgnscrts.commands.functional.SecretOverride;
import cobble.dgnscrts.commands.menus.SecretFinder;
import cobble.dgnscrts.events.PressKeyEvent;
import cobble.dgnscrts.handlers.KeyBindingHandler;
import cobble.dgnscrts.handlers.RenderGuiHandler;
import cobble.dgnscrts.utils.DataGetter;
import cobble.dgnscrts.utils.Reference;
import cobble.dgnscrts.utils.Utils;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, clientSideOnly = true)
public class SBP 
{
	public static Boolean firstLaunch = false;
	public static int textStyle = 0;
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) throws JsonSyntaxException, Exception
	{
		
		KeyBindingHandler.register();
		MinecraftForge.EVENT_BUS.register(new PressKeyEvent());
		
		
		
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) throws Exception
	{
		textStyle = Integer.parseInt(DataGetter.find("textStyle")+"");
		Utils.chromaSpeed = Integer.parseInt(DataGetter.find("chromaSpeed")+"");
		//Big Mod Stuff
		if((Boolean) DataGetter.find("scrtToggle")) {
			ClientCommandHandler.instance.registerCommand(new SecretFinder());
			ClientCommandHandler.instance.registerCommand(new SecretOverride());
		}
		System.out.println("Dungeons Secrets Initialized");
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) throws Exception
	{
		
		MinecraftForge.EVENT_BUS.register(new RenderGuiHandler());
		
	}
	
	
	@EventHandler
	public void serverInit(FMLServerStartingEvent event)
	{
		
	}
	
	
	
}