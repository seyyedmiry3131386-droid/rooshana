package ir.mservices.market.version2.webapi.responsedto;

import ir.mservices.market.common.data.ForceUpdateDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class AppUpdateDTO implements Serializable {
    private String callbackUrl;
    private String categoryName;
    private String description;
    private boolean descriptionRtl;
    private String developerId;
    private String developerName;
    private ForceUpdateDto forceUpdate;
    private boolean hasAd;
    private boolean hasIap;
    private boolean hasMainData;
    private boolean hasPatchData;
    private String iconPath;
    private boolean isFree;
    private long lastUpdateTime;
    private String packageName;
    private String price;
    private String realPrice;
    private long size;
    private String sizeStr;
    private String title;
    private String version;
    private int versionCode;

    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDeveloperId() {
        return this.developerId;
    }

    public String getDeveloperName() {
        return this.developerName;
    }

    public ForceUpdateDto getForceUpdate() {
        return this.forceUpdate;
    }

    public String getIconPath() {
        return this.iconPath;
    }

    public long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPrice() {
        return this.price;
    }

    public String getRealPrice() {
        return this.realPrice;
    }

    public long getSize() {
        return this.size;
    }

    public String getSizeStr() {
        return this.sizeStr;
    }

    public String getTitle() {
        return this.title;
    }

    public String getVersion() {
        return this.version;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public boolean hasMainData() {
        return this.hasMainData;
    }

    public boolean hasPatchData() {
        return this.hasPatchData;
    }

    public boolean isDescriptionRtl() {
        return this.descriptionRtl;
    }

    public boolean isFree() {
        return this.isFree;
    }

    public boolean isHasAd() {
        return this.hasAd;
    }

    public boolean isHasIap() {
        return this.hasIap;
    }

    public void setCallbackUrl(String str) {
        this.callbackUrl = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDescriptionRtl(boolean z) {
        this.descriptionRtl = z;
    }

    public void setDeveloperId(String str) {
        this.developerId = str;
    }

    public void setDeveloperName(String str) {
        this.developerName = str;
    }

    public void setFree(boolean z) {
        this.isFree = z;
    }

    public void setHasAd(boolean z) {
        this.hasAd = z;
    }

    public void setHasIap(boolean z) {
        this.hasIap = z;
    }

    public void setHasMainData(boolean z) {
        this.hasMainData = z;
    }

    public void setHasPatchData(boolean z) {
        this.hasPatchData = z;
    }

    public void setIconPath(String str) {
        this.iconPath = str;
    }

    public void setLastUpdateTime(long j) {
        this.lastUpdateTime = j;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setRealPrice(String str) {
        this.realPrice = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setSizeStr(String str) {
        this.sizeStr = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }
}
