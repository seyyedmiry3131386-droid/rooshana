package ir.mservices.market.version2.webapi.requestdto;

/* JADX INFO: loaded from: classes3.dex */
public class HarmFulAppData {
    private final int apkCategory;
    private final String packageName;
    private final String sha1;
    private final int versionCode;

    public HarmFulAppData(String str, int i, int i2, String str2) {
        this.packageName = str;
        this.versionCode = i;
        this.apkCategory = i2;
        this.sha1 = str2;
    }
}
