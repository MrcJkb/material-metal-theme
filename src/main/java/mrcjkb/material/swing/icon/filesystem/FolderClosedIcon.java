package mrcjkb.material.swing.icon.filesystem;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.util.LinkedList;

public class FolderClosedIcon implements Icon {

    /** The foreground color of the icon */
    private final Color foreground;

    /** The width of this icon. */
    private final int width;

    /** The height of this icon. */
    private final int height;

    /** The rendered image. */
    private BufferedImage image;

    /**
     * Creates a new transcoded SVG image.
     */
    public FolderClosedIcon() {
        this(24, 24, UIManager.getColor("MaterialSwing.primary1Color"));
    }

    /**
     * Creates a new transcoded SVG image.
     * @param width the width
     * @param height the height
     * @param foreground the foreground color
     */
    public FolderClosedIcon(int width, int height, Color foreground) {
        this.width = width;
        this.height = height;
        this.foreground = foreground;
    }

    @Override
    public int getIconHeight() {
        return height;
    }

    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (image == null) {
            image = new BufferedImage(getIconWidth(), getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            double coef = Math.min((double) width / (double) 1, (double) height / (double) 1);

            Graphics2D g2d = image.createGraphics();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.scale(coef, coef);
            paint(g2d);
            g2d.dispose();
        }

        g.drawImage(image, x, y, null);
    }

    /**
     * Paints the transcoded SVG image on the specified graphics context.
     *
     * @param g Graphics context.
     */
    private void paint(Graphics2D g) {
        GeneralPath shape;

        LinkedList<AffineTransform> transformations = new LinkedList<>();


        //
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.0625f, 0, 0, 0.0625f, 0, 0));

        // _0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 2.0108564f, 0.0086851f));

        // _0_0

        g.setTransform(transformations.pop()); // _0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.90677965f, 0, 0, 0.90677965f, -16.508474f, -0.30128425f));

        // _0_1
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 19.028038f, 1.4636421f));

        // _0_1_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1.0153685f, 0, 0, 1.0153685f, 3.1476429f, 0.9812588f));

        // _0_1_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.9719636f, 0, 0, 0.9719636f, 14.292922f, 0.07761799f));

        // _0_1_0_0_0

        // _0_1_0_0_0_0
        shape = new GeneralPath();
        shape.moveTo(-15.786442, 0.21898606);
        shape.lineTo(-7.676441, 0.21898606);
        shape.lineTo(-6.676441, 2.218986);
        shape.lineTo(-3.7904413, 2.218986);
        shape.curveTo(-2.9634414, 2.218986, -2.2904413, 2.891986, -2.2904413, 3.718986);
        shape.lineTo(-2.2904413, 11.7189865);
        shape.curveTo(-2.2904413, 12.545986, -2.9634414, 13.2189865, -3.7904413, 13.2189865);
        shape.lineTo(-15.786442, 13.2189865);
        shape.curveTo(-16.613441, 13.2189865, -17.286442, 12.545986, -17.286442, 11.7189865);
        shape.lineTo(-17.286442, 1.7189862);
        shape.curveTo(-17.286442, 0.89198613, -16.613441, 0.21898615, -15.786442, 0.21898615);
        shape.closePath();

        g.setPaint(Color.WHITE);
        g.fill(shape);

        // _0_1_0_0_0_1
        shape = new GeneralPath();
        shape.moveTo(-3.790442, 3.218986);
        shape.lineTo(-7.294442, 3.218986);
        shape.lineTo(-8.294442, 1.218986);
        shape.lineTo(-15.786442, 1.218986);
        shape.curveTo(-16.062584, 1.218986, -16.286442, 1.4428437, -16.286442, 1.718986);
        shape.lineTo(-16.286442, 11.7189865);
        shape.curveTo(-16.286442, 11.995129, -16.062584, 12.2189865, -15.786442, 12.2189865);
        shape.lineTo(-3.7904415, 12.2189865);
        shape.curveTo(-3.5142992, 12.2189865, -3.2904415, 11.995129, -3.2904415, 11.7189865);
        shape.lineTo(-3.2904415, 3.718986);
        shape.curveTo(-3.2904415, 3.4428437, -3.5142992, 3.218986, -3.7904415, 3.218986);
        shape.closePath();
        shape.moveTo(-15.286442, 2.218986);
        shape.lineTo(-8.912441, 2.218986);
        shape.lineTo(-8.412441, 3.218986);
        shape.lineTo(-15.286442, 3.218986);
        shape.closePath();

        g.setPaint(foreground);
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_1_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 2.7595825f, -4.712117f));

        // _0_1_0_0_1

        // _0_1_0_0_1_0

        g.setTransform(transformations.pop()); // _0_1_0_0_1

        g.setTransform(transformations.pop()); // _0_1_0_0

        g.setTransform(transformations.pop()); // _0_1_0

        g.setTransform(transformations.pop()); // _0_1

        g.setTransform(transformations.pop()); // _0

    }
}

