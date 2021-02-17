package cobble.dgnscrts.handlers;

import java.io.IOException;
import java.util.ArrayList;

import cobble.dgnscrts.gui.screen.SecretImage;
import cobble.dgnscrts.utils.DataGetter;
import cobble.dgnscrts.utils.Utils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RenderGuiHandler {
	
	public static Boolean PuzzleGUI = false;
	public static Boolean HelpGUI = false;
	public static Boolean MainGUI = false;
	public static String imageID = "NONE";
	public static String roomSecretsID = "NONE";
	public static String roomShape = "NONE";
	public static int maxSecrets = 0;
	public static int currentSecret = 0;
	public static ArrayList<String> currentSecretText = new ArrayList();
	private int i=0;
	@SubscribeEvent
	public void onRenderGui(RenderGameOverlayEvent.Post event) throws IOException, NumberFormatException, IllegalAccessException {
		
		
		if(roomSecretsID != "NONE" && roomShape != "NONE") {
			new SecretImage(Minecraft.getMinecraft());
		}
		
	
	//Utils.print(DataGetter.find("secretSize"));
	i++;
	if(i == 1) {
		SecretImage.secretSize = Integer.parseInt(DataGetter.find("scrtSize")+"");
	} else if(i == 100) {
		
		SecretImage.imgWidth = Integer.parseInt(Math.round(192 * (Double.parseDouble(SecretImage.secretSize+"")/10))+"");
	} else if(i == 200) {

		SecretImage.imgHeight = Integer.parseInt(Math.round(101 * (Double.parseDouble(SecretImage.secretSize+"")/10))+"");
	} else if(i == 300) {
		SecretImage.imgX = Integer.parseInt(DataGetter.find("scrtX")+"");
	} else if(i == 400) {
		SecretImage.imgY = Integer.parseInt(DataGetter.find("scrtY")+"");
	} else if(i == 500) {
		SecretImage.bgColorID = DataGetter.find("scrtBgColor")+"";
	} else if(i == 600) {
		SecretImage.scrtColorID = Integer.parseInt(DataGetter.find("scrtTextColor")+"");
	} else if(i == 700) {
		SecretImage.transparent = (Boolean) DataGetter.find("scrtTransparent");
		/*if(Utils.getCurrentActionBar().toLowerCase().contains("secrets")) {
				int currSecretsInt = 0;
				String[] tempArray = Utils.getCurrentActionBar().split(" ");
				for(int i=0; i<tempArray.length;i++) {
					if(tempArray[i].contains("Secrets")) {
						currSecretsInt = i-1;
					}
				}
				String scrtsFind = Utils.stripColor(tempArray[currSecretsInt]);
				if(!scrtsFind.equals("0/0")) {
					String[] tmpCurrScrts = scrtsFind.split("/");
					Double currScrts = 0.0;
					if(tmpCurrScrts.length > 1) {
						currScrts = new Double(Integer.parseInt(tmpCurrScrts[0]) / Integer.parseInt(tmpCurrScrts[1]));
					}
					
					//Utils.sendMessage(currScrts+"");
					if(currScrts.equals(1.0)) {
						RenderGuiHandler.roomSecretsID="NONE";
					}
				}
				
				
				
				
			}*/
		i=0;
	}
	
		
	}
	
	
}
