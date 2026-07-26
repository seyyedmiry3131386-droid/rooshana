package ir.mservices.market.version2.webapi.responsedto;

import android.os.Parcel;
import android.os.Parcelable;
import ir.mservices.market.app.detail.data.DownloadSummaryDto;
import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class InCompleteReviewDto implements Parcelable, Serializable {
    public static final Parcelable.Creator<InCompleteReviewDto> CREATOR = new Parcelable.Creator<InCompleteReviewDto>() { // from class: ir.mservices.market.version2.webapi.responsedto.InCompleteReviewDto.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InCompleteReviewDto createFromParcel(Parcel parcel) {
            return new InCompleteReviewDto(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InCompleteReviewDto[] newArray(int i) {
            return new InCompleteReviewDto[i];
        }
    };
    private String categoryName;
    private DownloadSummaryDto downloadSummary;
    private String iconPath;
    private String packageName;
    private String title;
    private float totalRating;

    public InCompleteReviewDto() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            InCompleteReviewDto inCompleteReviewDto = (InCompleteReviewDto) obj;
            if (Float.compare(inCompleteReviewDto.totalRating, this.totalRating) == 0 && Objects.equals(this.packageName, inCompleteReviewDto.packageName)) {
                return true;
            }
        }
        return false;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public DownloadSummaryDto getDownloadSummaryDTO() {
        return this.downloadSummary;
    }

    public String getIconPath() {
        return this.iconPath;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getTitle() {
        return this.title;
    }

    public float getTotalRating() {
        return this.totalRating;
    }

    public int hashCode() {
        return Objects.hash(this.packageName, Float.valueOf(this.totalRating));
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public void setDownloadSummary(DownloadSummaryDto downloadSummaryDto) {
        this.downloadSummary = downloadSummaryDto;
    }

    public void setIconPath(String str) {
        this.iconPath = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTotalRating(float f) {
        this.totalRating = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.packageName);
        parcel.writeString(this.title);
        parcel.writeString(this.categoryName);
        parcel.writeFloat(this.totalRating);
        parcel.writeString(this.iconPath);
    }

    public InCompleteReviewDto(Parcel parcel) {
        this.packageName = parcel.readString();
        this.title = parcel.readString();
        this.categoryName = parcel.readString();
        this.totalRating = parcel.readFloat();
        this.iconPath = parcel.readString();
    }
}
