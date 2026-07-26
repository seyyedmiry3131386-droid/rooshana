package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class PackageListMetaDataDTO implements Serializable {
    public static final String KEY_ACTION = "action";
    public static final String KEY_BANNER_BG = "bannerBg";
    public static final String KEY_BG = "bg";
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE_URL = "imageUrl";
    public static final String KEY_SIZE_TYPE = "sizeType";
    private Map<String, String> metaData;

    public PackageListMetaDataDTO(Map<String, String> map) {
        this.metaData = map;
    }

    public String getMetaBannerAction() {
        Map<String, String> map = this.metaData;
        return map != null ? map.get(KEY_ACTION) : "";
    }

    public String getMetaBannerBg() {
        Map<String, String> map = this.metaData;
        return map != null ? map.get(KEY_BANNER_BG) : "";
    }

    public String getMetaBannerDescription() {
        Map<String, String> map = this.metaData;
        return map != null ? map.get(KEY_DESCRIPTION) : "";
    }

    public String getMetaBg() {
        Map<String, String> map = this.metaData;
        return map != null ? map.get(KEY_BG) : "#00000000";
    }

    public Map<String, String> getMetaData() {
        return this.metaData;
    }

    public String getMetaImageUrl() {
        Map<String, String> map = this.metaData;
        return map != null ? map.get(KEY_IMAGE_URL) : "";
    }

    public String getMetaSizeType() {
        Map<String, String> map = this.metaData;
        return map != null ? map.get(KEY_SIZE_TYPE) : "medium";
    }
}
