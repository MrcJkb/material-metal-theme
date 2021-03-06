package mrcjkb.material.swing.ui;

import mrcjkb.material.swing.icon.combobox.DownArrowIcon;
import mrcjkb.material.swing.materialui.util.MaterialDrawingUtils;
import mrcjkb.material.swing.materialui.util.MaterialUIMovement;
import mrcjkb.material.swing.util.RotatedIcon;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicSpinnerUI;
import java.awt.*;

public class MaterialSpinnerUI extends BasicSpinnerUI {

	private static final int SPINNER_ARROW_ICON_SIZE = 14;

    public static ComponentUI createUI(JComponent c) {
        return new MaterialSpinnerUI();
    }

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);

        JSpinner spinner = (JSpinner) c;
        spinner.setOpaque(false);
    }

    @Override
    public void uninstallUI(JComponent c) {
        super.uninstallUI(c);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        super.paint(g, c);
    }

    @Override
    public void update(Graphics g, JComponent c) {
        super.update(MaterialDrawingUtils.getAliasedGraphics(g), c);
    }

    @Override
    protected Component createNextButton() {
    	RotatedIcon icon = new RotatedIcon(DownArrowIcon.builder()
				.withHeight(SPINNER_ARROW_ICON_SIZE)
				.withWidth(SPINNER_ARROW_ICON_SIZE)
				.withForeground(UIManager.getColor("SpinnerButton.foreground"))
				.build(),
				RotatedIcon.Rotate.UPSIDE_DOWN);
    	JButton button = new JButton(icon);
        button.setOpaque(true);
        button.addMouseListener(MaterialUIMovement.getMovement(button, UIManager.getColor("MaterialSwing.hoverColor")));
        installNextButtonListeners(button);
        button.setBorder(BorderFactory.createLineBorder(button.getBackground()));
        return button;
    }

    @Override
    protected Component createPreviousButton() {
        Icon icon = DownArrowIcon.builder()
				.withHeight(SPINNER_ARROW_ICON_SIZE)
				.withWidth(SPINNER_ARROW_ICON_SIZE)
				.withForeground(UIManager.getColor("SpinnerButton.foreground"))
				.build();
        JButton button = new JButton(icon);
        button.setOpaque(true);
        button.addMouseListener(MaterialUIMovement.getMovement(button, UIManager.getColor("MaterialSwing.hoverColor")));
        installPreviousButtonListeners(button);
        button.setBorder(BorderFactory.createLineBorder(button.getBackground()));
        return button;
    }
}