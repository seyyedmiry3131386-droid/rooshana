package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class LinkDTO implements Serializable {
    public static final String LINK_TYPE_APP = "app";
    public static final String LINK_TYPE_EXTERNAL_LINK = "externalLink";
    public static final String LINK_TYPE_INTERNAL_LINK = "internalLink";
    public static final String LINK_TYPE_MYKET_INTENT = "myket";
    public static final String LINK_TYPE_PACKAGE = "package";
    public String key;
    public String type;
}
