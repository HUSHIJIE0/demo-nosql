package com.example.demo.io;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Base64;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2020/03/26/10:20
 * @Description:
 */
public class Base64Util {
    private static Base64.Encoder encoder= Base64.getEncoder();
    private static Base64.Decoder decoder= Base64.getDecoder();

    public static void main(String[] args) {
        File image = new File("");
        base64ToImage("", "png", imageToBase64(image));
    }

    public static String imageToBase64(File file){
        byte[] data = null;
        try {
            InputStream is = new FileInputStream(file);
            data = new byte[is.available()];
            is.read(data);
            is.close();
        } catch (Exception e) {
        }
        return encoder.encodeToString(data);
    }

    public static void base64ToImage(String imagePath, String formatName, String base64String){
        try {
            byte[] bytes = decoder.decode(base64String);
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            BufferedImage bi = ImageIO.read(bais);
            File image = new File(imagePath);
            ImageIO.write(bi, formatName, image);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
