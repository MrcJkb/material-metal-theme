package mrcjkb.material.swing.materialui.util;

import java.awt.*;
import java.util.Map;

public class MaterialDrawingUtils {

	/**
	 * Add rendering hints to g to improve quality.
	 * @param g the original graphics
	 * @return the improved graphics
	 */
	public static Graphics getAliasedGraphics (Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		@SuppressWarnings("unchecked")
		Map<RenderingHints.Key, Object> hints = (Map<RenderingHints.Key, Object>) Toolkit.getDefaultToolkit ().getDesktopProperty ("awt.font.desktophints");
		if (null != hints) {
			hints.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			hints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_DEFAULT);
			hints.put(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_DEFAULT);
			hints.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);

			g2d.addRenderingHints(hints);
		}
		return g2d;
	}
}
