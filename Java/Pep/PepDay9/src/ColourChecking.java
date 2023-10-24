// Guvvala Krishna Vamsi,   Reg no:12008526
public class ColourChecking {
    public static void main(String[] args) {
        int red = 193/255;
        int green = 255/255;
        int blue = 183/255;
        int max = Math.max(red,green);
        max = Math.max(max,blue);
        int min = Math.min(red,green);
        min = Math.min(min,blue);
        float hue;
        if(max==red) {hue = 60*Math.floorMod((green-blue),6)/(max-min);
        } else if (green==max) {hue =  ( 60*(2.0f+(blue-red))/(max-min));
        } else {hue =  ( 60*(4.0f+(red-green))/(max-min));
        }
        System.out.println("Hue = "+hue);
        saturation(max,min);
        float brightness = red+green+blue/3;
        System.out.println("Brightness = "+brightness);
    }
    public static void saturation(int max, int min) {
        int saturation;
        if(max-min<0.5) {
            saturation = (max-min)/(max+min);
        } else {
            saturation = (max - min)/(2-max-min);
        }
        System.out.println("Saturation = "+saturation);
    }
}
