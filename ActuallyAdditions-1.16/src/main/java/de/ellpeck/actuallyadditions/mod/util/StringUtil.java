/*
 * This file ("StringUtil.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.util;

import de.ellpeck.actuallyadditions.mod.ActuallyAdditions;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.LanguageMap;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.ForgeI18n;

public final class StringUtil {

    public static final int DECIMAL_COLOR_WHITE = 16777215;
    public static final int DECIMAL_COLOR_GRAY_TEXT = 4210752;

    public static final String BUGGED_ITEM_NAME = ActuallyAdditions.MODID + ".lolWutHowUDoDis";
    //TODO: Remove
    static LanguageMap cancerino;

    /**
     * Localizes a given String
     */
    @OnlyIn(Dist.CLIENT)
    public static String localize(String text) {
        return I18n.get(text);
    }

    /**
     * Localizes a given formatted String with the given Replacements
     */
    @OnlyIn(Dist.CLIENT)
    public static String localizeFormatted(String text, Object... replace) {
        return I18n.get(text, replace);
    }

    @SuppressWarnings("deprecation")
    //TODO: delete this shit and move ItemPotionRing's getItemStackDisplayName into getUnlocalizedName
    public static String localizeIllegallyOnTheServerDontUseMePls(String langKey) {
        return I18n.get(langKey);
    }

    // TODO: Move to official
    @OnlyIn(Dist.CLIENT)
    public static void drawSplitString(FontRenderer renderer, String strg, int x, int y, int width, int color, boolean shadow) {
//        ResourcePackList <- holds the correct way
//        List<String> list = renderer.listFormattedStringToWidth(strg, width);
//        for (int i = 0; i < list.size(); i++) {
//            String s1 = list.get(i);
//            renderer.draw(s1, x, y + i * renderer.lineHeight, color, shadow);
//        }
    }

//    @OnlyIn(Dist.CLIENT)
//    public static void renderSplitScaledAsciiString(FontRenderer font, String text, int x, int y, int color, boolean shadow, float scale, int length) {
//        List<String> lines = font.listFormattedStringToWidth(text, (int) (length / scale));
//        for (int i = 0; i < lines.size(); i++) {
//            renderScaledAsciiString(font, lines.get(i), x, y + i * (int) (font.lineHeight * scale + 3), color, shadow, scale);
//        }
//    }

    @OnlyIn(Dist.CLIENT)
    public static void renderScaledAsciiString(FontRenderer font, String text, float x, float y, int color, boolean shadow, float scale) {
//        GlStateManager._pushMatrix();
//        GlStateManager.scale(scale, scale, scale);
//        boolean oldUnicode = font.getUnicodeFlag();
//        font.setUnicodeFlag(false);
//
//        font.draw(text, x / scale, y / scale, color, shadow);
//
//        font.setUnicodeFlag(oldUnicode);
//        GlStateManager._popMatrix();
    }

//    static void setupLangMap() {
//        try {
//            Method m = LanguageMap.class.getDeclaredMethod("inject", LanguageMap.class, InputStream.class);
//            m.setAccessible(true);
//            m.invoke(null, cancerino = new LanguageMap(), ActuallyAdditions.class.getResourceAsStream("/assets/actuallyadditions/lang/en_us.json"));
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException("Actually Additions failed to access LanguageMap.inject.  Report this!");
//        }
//    }

    // TODO: This might be wrong
    public static String badTranslate(String someUnlocAAItemName) {
//        if (cancerino == null) {
//            cancerino = new LanguageMap();
//            setupLangMap();
//        }
//        return cancerino.translateKey("item.actuallyadditions." + someUnlocAAItemName + ".name");
        return ForgeI18n.parseFormat("item.actuallyadditions." + someUnlocAAItemName + ".name");
    }
}
