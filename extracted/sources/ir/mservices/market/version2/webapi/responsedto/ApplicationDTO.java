package ir.mservices.market.version2.webapi.responsedto;

import ir.mservices.market.app.detail.data.AdInfoDto;
import ir.mservices.market.common.data.ForceUpdateDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ApplicationDTO implements Serializable {
    private AdInfoDto adInfoDto;
    private BadgeDTO badge;
    private String buttonText;
    private String callbackUrl;
    private String categoryName;
    private String clickCallback;
    private String contentRatingUrl;
    private String developerId;
    private String developerName;
    private long fileSize;
    private ForceUpdateDto forceUpdate;
    private boolean hasAd;
    private boolean hasIAP;
    private boolean hasMainData;
    private boolean hasPatchData;
    private String iconPath;
    private String index;
    private String installCallbackUrl;
    private boolean isFree;
    private boolean isIncompatible;
    private String packageName;
    private List<String> palette;
    private String realPrice;
    private String refId;
    private String tagline;
    private String title;
    private float totalRating;
    private String version;
    private int versionCode;

    public boolean equals(Object obj) {
        if (obj instanceof ApplicationDTO) {
            return hashCode() == obj.hashCode() || this.packageName.equals(((ApplicationDTO) obj).packageName);
        }
        return false;
    }

    public AdInfoDto getAdInfoDto() {
        return this.adInfoDto;
    }

    public BadgeDTO getBadge() {
        return this.badge;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public String getClickCallback() {
        return this.clickCallback;
    }

    public String getContentRatingUrl() {
        return this.contentRatingUrl;
    }

    public String getDeveloperId() {
        return this.developerId;
    }

    public String getDeveloperName() {
        return this.developerName;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public ForceUpdateDto getForceUpdate() {
        return this.forceUpdate;
    }

    public String getIconPath() {
        return this.iconPath;
    }

    public String getIndex() {
        return this.index;
    }

    public String getInstallCallbackUrl() {
        return this.installCallbackUrl;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public List<String> getPalette() {
        return this.palette;
    }

    public String getRealPrice() {
        return this.realPrice;
    }

    public String getRefId() {
        return this.refId;
    }

    public String getTagline() {
        return this.tagline;
    }

    public String getTitle() {
        return this.title;
    }

    public float getTotalRating() {
        return this.totalRating;
    }

    public String getVersion() {
        return this.version;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public boolean hasAd() {
        return this.hasAd;
    }

    public boolean hasIAP() {
        return this.hasIAP;
    }

    public boolean hasMainData() {
        return this.hasMainData;
    }

    public boolean hasPatchData() {
        return this.hasPatchData;
    }

    public int hashCode() {
        return this.packageName.hashCode();
    }

    public boolean isFree() {
        return this.isFree;
    }

    public boolean isIncompatible() {
        return this.isIncompatible;
    }

    public void setAdInfoDto(AdInfoDto adInfoDto) {
        this.adInfoDto = adInfoDto;
    }

    public void setBadge(BadgeDTO badgeDTO) {
        this.badge = badgeDTO;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setCallbackUrl(String str) {
        this.callbackUrl = str;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public void setContentRatingUrl(String str) {
        this.contentRatingUrl = str;
    }

    public void setDeveloperId(String str) {
        this.developerId = str;
    }

    public void setDeveloperName(String str) {
        this.developerName = str;
    }

    public void setFileSize(long j) {
        this.fileSize = j;
    }

    public void setFree(boolean z) {
        this.isFree = z;
    }

    public void setHasAd(boolean z) {
        this.hasAd = z;
    }

    public void setHasIAP(boolean z) {
        this.hasIAP = z;
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

    public void setIncompatible(boolean z) {
        this.isIncompatible = z;
    }

    public void setIndex(String str) {
        this.index = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPalette(List<String> list) {
        this.palette = list;
    }

    public void setRealPrice(String str) {
        this.realPrice = str;
    }

    public void setRefId(String str) {
        this.refId = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTotalRating(float f) {
        this.totalRating = f;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }
}
