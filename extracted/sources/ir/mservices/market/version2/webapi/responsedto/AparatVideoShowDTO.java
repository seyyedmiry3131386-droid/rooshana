package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AparatVideoShowDTO implements Serializable {
    private String big_poster;
    private int duration;
    private String file_link;
    private List<AparatUrlInfoDTO> file_link_all;
    private String uid;

    public String getBigPoster() {
        return this.big_poster;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getFile_link() {
        return this.file_link;
    }

    public List<AparatUrlInfoDTO> getFile_link_all() {
        return this.file_link_all;
    }

    public String getUid() {
        return this.uid;
    }
}
