package ir.mservices.market.data;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class Item implements Serializable {
    public static final int TYPE_DOWNLOAD_DOWNLOADING = 1;
    public static final int TYPE_DOWNLOAD_HISTORY = 2;
    public static final int TYPE_DOWNLOAD_SCHEDULED = 3;
    public static final int TYPE_LINE = 2;
    public static final int TYPE_SECTION = 0;
    public static final int TYPE_SETTING = 1;
    public static final int TYPE_UPDATE_ACTIVE = 2;
    public static final int TYPE_UPDATE_DOWNLOADING = 1;
    public static final int TYPE_UPDATE_INACTIVE = 3;
    public Object data;
    public Object detail;
    public int type;

    public Item(int i, Object obj, Object obj2) {
        this.type = i;
        this.detail = obj2;
        this.data = obj;
    }
}
