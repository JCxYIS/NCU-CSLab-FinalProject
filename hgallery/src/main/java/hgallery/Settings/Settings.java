package hgallery.Settings;

import java.io.Serializable;
import java.util.Arrays;

public class Settings implements Serializable
{
    private static final long serialVersionUID = 3L;

    public String galleryPath = "";
    public String hentaiPath = "";   
    public String pswEncrypted = "";
    public int blur = 60;
    public Integer[] readLaterIDs = {};

    /**
     * Default Values
     */
    public Settings()
    {
        galleryPath = SettingManager.saveDir + "\\Gallery";
        hentaiPath = SettingManager.saveDir + "\\Hentai";
    }
    
    @Override
    public String toString()
    {
        if(blur < 0 || blur > 100)
            blur = 60;

        return "galleryPath="+galleryPath+"\n"+
               "hentaiPath="+hentaiPath +"\n"+
               "pswEncrypted="+pswEncrypted+"\n"+
               "blur="+blur+"\n"+
               "readLaterIDs="+Arrays.toString(readLaterIDs)+"\n";
    }
}