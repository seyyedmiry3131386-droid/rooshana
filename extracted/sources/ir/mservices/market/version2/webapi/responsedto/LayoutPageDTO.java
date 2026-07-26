package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class LayoutPageDTO implements Serializable {
    private boolean isShowFirst;
    private String layoutKey;
    private String title;
    private String type;

    public interface Type {
        public static final String CATEGORY = "category";
        public static final String FEATURED = "featured";
        public static final String PACKAGE = "package";
    }

    public String getLayoutKey() {
        return this.layoutKey;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public boolean isShowFirst() {
        return this.isShowFirst;
    }
}
