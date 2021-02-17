package cobble.dgnscrts.handlers;

import org.lwjgl.input.Keyboard;

import cobble.dgnscrts.utils.Reference;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class KeyBindingHandler {
	
	public static KeyBinding nextSecret;
	public static KeyBinding prevSecret;
	public static KeyBinding clearSecret;
	 
    public static void register()
    {
    	nextSecret = new KeyBinding("Goes to the next secret from /secrets", Keyboard.KEY_N, Reference.NAME);
    	prevSecret = new KeyBinding("Goes to the previous secret from /secrets", Keyboard.KEY_B, Reference.NAME);
    	clearSecret = new KeyBinding("Clears the current room secrets from the screen", Keyboard.KEY_M, Reference.NAME);
    	ClientRegistry.registerKeyBinding(nextSecret);
    	ClientRegistry.registerKeyBinding(prevSecret);
    	ClientRegistry.registerKeyBinding(clearSecret);
    }
}
