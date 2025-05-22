package org.example;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.DefaultXYDataset;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //variables de vida y puntaje
        int lives = 5;
        int score = 0;

        // variable para generar un numero random
        Random rand = new Random();

        while (lives > 0){
            // nuemro random entre 0 a 1
            int n = rand.nextInt(2);
            System.out.println(n);
            // si n es igual a 1 pierde una vida, si no, aumenta el puntaje en 1
            if (n == 1 ){
                //decrementa su vida
                lives--;

            }
            else {
                // incrementa su puntaje
                score++;

            }
        }
        System.out.println("Perdiste todas tus vidas y tu maximo puntaje es: "+ score);
    }
       /* DefaultXYDataset dataset = new DefaultXYDataset();
        dataset.addSeries("firefox", new double[][]{{2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017}, {25, 29.1, 32.1, 32.9, 31.9, 25.5, 20.1, 18.4, 15.3, 11.4, 9.5}});
        dataset.addSeries("ie", new double[][]{{2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017}, {67.7, 63.1, 60.2, 50.6, 41.1, 31.8, 27.6, 20.4, 17.3, 12.3, 8.1}});
        dataset.addSeries("chrome", new double[][]{{2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017}, {0.2, 6.4, 14.6, 25.3, 30.1, 34.3, 43.2, 47.3, 58.4}});

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.ORANGE);
        renderer.setSeriesPaint(1, Color.BLUE);
        renderer.setSeriesPaint(2, Color.GREEN);
        renderer.setSeriesStroke(0, new BasicStroke(2));
        renderer.setSeriesStroke(1, new BasicStroke(2));
        renderer.setSeriesStroke(2, new BasicStroke(2));

        JFreeChart chart = ChartFactory.createXYLineChart("Browser Quota", "Year", "Quota", dataset);

        chart.getXYPlot().getRangeAxis().setRange(0, 100);
        ((NumberAxis) chart.getXYPlot().getRangeAxis()).setNumberFormatOverride(new DecimalFormat("#'%'"));
        chart.getXYPlot().setRenderer(renderer);

        BufferedImage image = chart.createBufferedImage(600, 400);
        ImageIO.write(image, "png", new File("xy-chart.png"));
    }*/
}

