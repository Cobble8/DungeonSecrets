package cobble.dgnscrts.events;

import cobble.dgnscrts.handlers.KeyBindingHandler;
import cobble.dgnscrts.handlers.RenderGuiHandler;
import cobble.dgnscrts.utils.DataGetter;
import cobble.dgnscrts.utils.Utils;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class PressKeyEvent
{
	//public static Boolean timerOn = false;
    @SubscribeEvent
    public void onKeyInput(KeyInputEvent event) throws Exception
    {
    	
    		
    		if(KeyBindingHandler.nextSecret.isPressed()) {
    			
    			if((Boolean) DataGetter.find("modToggle")) {
    				if(RenderGuiHandler.currentSecret < RenderGuiHandler.maxSecrets-1) {
    					RenderGuiHandler.currentSecret++;
    				}
    			}
    			else Utils.errMsg("There are no more secrets for this room!");
    			
    		} else if(KeyBindingHandler.prevSecret.isPressed()) {
    			if((Boolean) DataGetter.find("modToggle")) {
    				if(RenderGuiHandler.currentSecret >= 1) {
    					RenderGuiHandler.currentSecret--;
    				} 
    			else Utils.errMsg("There are no rooms with negative secrets!");
    			}
    		} else if(KeyBindingHandler.clearSecret.isPressed()) {
    			if((Boolean) DataGetter.find("modToggle")) {
    				RenderGuiHandler.roomSecretsID="NONE";
    			}
    		}
    }
}