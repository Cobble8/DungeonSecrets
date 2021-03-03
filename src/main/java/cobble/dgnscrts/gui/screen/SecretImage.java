package cobble.dgnscrts.gui.screen;

import java.io.IOException;

import com.mojang.realmsclient.gui.ChatFormatting;

import cobble.dgnscrts.handlers.RenderGuiHandler;
import cobble.dgnscrts.utils.DataGetter;
import cobble.dgnscrts.utils.Reference;
import cobble.dgnscrts.utils.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class SecretImage extends Gui {
	ResourceLocation border = new ResourceLocation(Reference.MODID, "textures/gui/imageBorder_1.png");
	public static int secretSize = 10;
	public static int imgHeight = 101;
	public static int imgWidth = 192;
	public static int imgX = 0;
	public static int imgY = 0;
	public static String bgColorID = "transparent";
	public static int scrtColorID = 0;
	//public static Boolean transparent = (Boolean) DataGetter.find("scrtTransparent");
	
	//mc.getTextureManager().bindTexture(border);
	public SecretImage(Minecraft mc) throws IOException {
		ResourceLocation currImage = new ResourceLocation(Reference.MODID, "textures/gui/secrets/"+RenderGuiHandler.roomShape+"/"+RenderGuiHandler.roomSecretsID+"/"+RenderGuiHandler.currentSecret+".png");
		String text = RenderGuiHandler.currentSecretText.get(RenderGuiHandler.currentSecret);
		//Utils.print(imgWidth2+" "+imgHeight2);
		//this.drawModalRectWithCustomSizedTexture(imgX, imgY, 0, 0, imgWidth+4, imgHeight+16, imgWidth+4, imgHeight+16);
		Boolean transparent = false;
		if(bgColorID.equals("transparent")) {transparent=true;}
		
		if(!transparent) {
			String[] temp = bgColorID.split(";");
			float r = Float.parseFloat(temp[0].replace(",", "."));
			float g = Float.parseFloat(temp[1].replace(",", "."));
			float b = Float.parseFloat(temp[2].replace(",", "."));
			
			mc.getTextureManager().bindTexture(border);
			GlStateManager.enableBlend();
			GlStateManager.color(r, g, b);
			this.drawModalRectWithCustomSizedTexture(imgX, imgY, 0, 0, imgWidth+4, imgHeight+16+9, imgWidth+4, imgHeight+16+9);
			this.drawModalRectWithCustomSizedTexture(imgX, imgY, 0, 0, mc.fontRendererObj.getStringWidth(text)+4, 14, mc.fontRendererObj.getStringWidth(text)+4, 14);
			GlStateManager.color(1, 1, 1);
			GlStateManager.disableBlend();
		}
		mc.fontRendererObj.drawString(ChatFormatting.WHITE+"", 0, 0, 0x10);
		mc.getTextureManager().bindTexture(currImage);
		this.drawModalRectWithCustomSizedTexture(imgX+2, imgY+14, 0, 0, imgWidth, imgHeight, imgWidth, imgHeight);
		String color = Utils.getColorFromInt(scrtColorID);
		
		Utils.drawString(color+text, imgX+2, imgY+3);
		
		int credX = imgX+2;
		int credY = imgY+imgHeight+17;
		
		GlStateManager.pushMatrix();
		GlStateManager.scale(0.7, 0.7, 0.7);
		int posX = Integer.parseInt((Math.round(credX/0.7))+"");
		int posY = Integer.parseInt((Math.round(credY/0.7))+"");
		
		Utils.drawString(color+"Images by Dungeon Secret Guide Discord Server", posX, posY);
		GlStateManager.popMatrix();
	
	}
	
}
