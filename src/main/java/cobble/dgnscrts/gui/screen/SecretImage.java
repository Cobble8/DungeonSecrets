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
	public static int secretSize = Integer.parseInt(DataGetter.find("scrtSize")+"");
	public static int imgHeight = 101;
	public static int imgWidth = 192;
	public static int imgX = Integer.parseInt(DataGetter.find("scrtX")+"");
	public static int imgY = Integer.parseInt(DataGetter.find("scrtY")+"");
	public static String bgColorID = DataGetter.find("scrtBgColor")+"";
	public static int scrtColorID = Integer.parseInt(DataGetter.find("scrtTextColor")+"");
	public static Boolean transparent = (Boolean) DataGetter.find("scrtTransparent");
	
	//mc.getTextureManager().bindTexture(border);
	public SecretImage(Minecraft mc) throws IOException {
		ResourceLocation currImage = new ResourceLocation(Reference.MODID, "textures/gui/secrets/"+RenderGuiHandler.roomShape+"/"+RenderGuiHandler.roomSecretsID+"/"+RenderGuiHandler.currentSecret+".png");
		String text = RenderGuiHandler.currentSecretText.get(RenderGuiHandler.currentSecret);
		//Utils.print(imgWidth2+" "+imgHeight2);
		//this.drawModalRectWithCustomSizedTexture(imgX, imgY, 0, 0, imgWidth+4, imgHeight+16, imgWidth+4, imgHeight+16);
		if(!transparent) {
			String[] temp = bgColorID.split(";");
			float r = Float.parseFloat(temp[0].replace(",", "."));
			float g = Float.parseFloat(temp[1].replace(",", "."));
			float b = Float.parseFloat(temp[2].replace(",", "."));
			
			mc.getTextureManager().bindTexture(border);
			GlStateManager.enableBlend();
			GlStateManager.color(r, g, b);
			this.drawModalRectWithCustomSizedTexture(imgX, imgY, 0, 0, imgWidth+4, imgHeight+16, imgWidth+4, imgHeight+16);
			this.drawModalRectWithCustomSizedTexture(imgX, imgY, 0, 0, mc.fontRendererObj.getStringWidth(text)+4, 14, mc.fontRendererObj.getStringWidth(text)+4, 14);
			GlStateManager.color(1, 1, 1);
			GlStateManager.disableBlend();
		}
		//Utils.sendMessage(secretSize+"");
		mc.fontRendererObj.drawString(ChatFormatting.WHITE+"", 0, 0, 0x10);
		mc.getTextureManager().bindTexture(currImage);
		this.drawModalRectWithCustomSizedTexture(imgX+2, imgY+14, 0, 0, imgWidth, imgHeight, imgWidth, imgHeight);
		mc.fontRendererObj.drawString(ChatFormatting.WHITE+Utils.getColorFromInt(scrtColorID)+text, imgX+2, imgY+3, 0x10, true);
	
	}
	
}
