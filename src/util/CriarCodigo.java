package util;

/**
 * @author: Lucas Lourenço
 * @date: 13/12/2018
 * @Location: Ciarama Máquinas Ltda.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.output.OutputException;

public abstract class CriarCodigo {
    //QrCode QRcode = new QrCode;
    public static ImageIcon criarImagem(Barcode b, String l, BufferedImage q) {

        try {
            int width = 302, height = 113;
            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = (Graphics2D) image.getGraphics();
            Font font = new Font("SansSarif", Font.BOLD, 16);
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, width, height);
            b.draw(g, -2, 25);
            g.drawImage(q, null, 160, 25);
            g.setColor(Color.BLACK);
            g.setFont(font);
            g.drawString("Naviraí - " + l, 0, 16);
            return new ImageIcon(image);
        } catch (OutputException ex) {
            JOptionPane.showMessageDialog(null, "Falhou! \n" + ex);
        } catch (Exception ex) {
            Logger.getLogger(CriarCodigo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static ImageIcon criarImagemLoc(String l) {

        try {
            int width = 302, height = 113;
            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = (Graphics2D) image.getGraphics();
            Font font = new Font("SansSarif", Font.BOLD, 20);
            Font fonte = new Font("SansSarif", Font.BOLD, 28);
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, width, height);
            g.setColor(Color.BLACK);
            g.setFont(font);
            g.drawString("Naviraí", 88, 40);
            g.setFont(fonte);
            g.drawString(l, 75, 65);
            return new ImageIcon(image);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falhou! \n" + ex);
        }
        return null;
    }

    public static void imprimir(Component component) {
        PrinterJob pj = PrinterJob.getPrinterJob();
        PageFormat pf = pj.getPageFormat(null);
        Paper paper = pf.getPaper();
        paper.setImageableArea(0.0, 0.0, pf.getPaper().getWidth(), pf.getPaper().getHeight());
        pf.setPaper(paper);

        pj.setPrintable(new Printable() {
            @Override
            public int print(Graphics pg, PageFormat pf, int pageNum)
                    throws PrinterException {
                if (pageNum > 0) {
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2 = (Graphics2D) pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                component.paint(g2);
                return Printable.PAGE_EXISTS;
            }
        }, pf);
        pj.validatePage(pf);

        try {
            pj.print();

        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "Erro na impressão! \n" + ex);
        }
    }

}
