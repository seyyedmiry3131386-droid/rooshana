package ir.mservices.market.data.install;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c88;
import defpackage.dw1;

/* JADX INFO: loaded from: classes3.dex */
public class PendingInstall implements Parcelable {
    public static final Parcelable.Creator<PendingInstall> CREATOR = new Parcelable.Creator<PendingInstall>() { // from class: ir.mservices.market.data.install.PendingInstall.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PendingInstall createFromParcel(Parcel parcel) {
            return new PendingInstall(0, parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PendingInstall[] newArray(int i) {
            return new PendingInstall[i];
        }
    };
    private final String filePath;
    private final String iconPath;
    private int installRetryCount;
    private final String packageName;
    private final PostInstall postInstall;
    private final String postInstallIntent;
    private final String postInstallPackageName;
    private final PreInstall preInstall;
    private final String title;
    private final int versionCode;

    public /* synthetic */ PendingInstall(int i, Parcel parcel) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.packageName.equals(((PendingInstall) obj).packageName);
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getIconPath() {
        return this.iconPath;
    }

    public int getInstallRetryCount() {
        return this.installRetryCount;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public PostInstall getPostInstall() {
        return this.postInstall;
    }

    public String getPostInstallIntent() {
        return this.postInstallIntent;
    }

    public String getPostInstallPackageName() {
        return this.postInstallPackageName;
    }

    public PreInstall getPreInstall() {
        return this.preInstall;
    }

    public String getTitle() {
        return this.title;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public void setInstallRetryCount(int i) {
        this.installRetryCount = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PendingInstall{filePath='");
        sb.append(this.filePath);
        sb.append("', packageName='");
        sb.append(this.packageName);
        sb.append("', iconPath='");
        sb.append(this.iconPath);
        sb.append("', title='");
        sb.append(this.title);
        sb.append("', postInstall=");
        sb.append(this.postInstall);
        sb.append(", preInstall=");
        sb.append(this.preInstall);
        sb.append(", versionCode=");
        sb.append(this.versionCode);
        sb.append(", postInstallIntent=");
        sb.append(this.postInstallIntent);
        sb.append(", postInstallPackageName=");
        sb.append(this.postInstallPackageName);
        sb.append(", retryCount=");
        return dw1.q(sb, this.installRetryCount, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.filePath);
        parcel.writeString(this.packageName);
        parcel.writeString(this.iconPath);
        parcel.writeString(this.title);
        parcel.writeString(this.preInstall.getText());
        parcel.writeString(this.postInstall.getText());
        parcel.writeInt(this.versionCode);
        parcel.writeLong(0L);
        parcel.writeString(this.postInstallIntent);
        parcel.writeString(this.postInstallPackageName);
        parcel.writeInt(this.installRetryCount);
    }

    public PendingInstall(String str, String str2, PostInstall postInstall, String str3, String str4, PreInstall preInstall, int i, String str5, String str6) {
        this.installRetryCount = 0;
        int i2 = c88.a;
        this.filePath = str == null ? "" : str;
        this.packageName = str2 == null ? "" : str2;
        this.postInstall = postInstall;
        this.iconPath = str3 == null ? "" : str3;
        this.title = str4 == null ? "" : str4;
        this.preInstall = preInstall;
        this.versionCode = i;
        this.postInstallIntent = c88.a(str5);
        this.postInstallPackageName = c88.a(str6);
    }

    private PendingInstall(Parcel parcel) {
        this.installRetryCount = 0;
        this.filePath = parcel.readString();
        this.packageName = parcel.readString();
        this.iconPath = parcel.readString();
        this.title = parcel.readString();
        this.preInstall = PreInstall.fromString(parcel.readString());
        this.postInstall = PostInstall.fromString(parcel.readString());
        this.versionCode = parcel.readInt();
        parcel.readLong();
        this.postInstallIntent = parcel.readString();
        this.postInstallPackageName = parcel.readString();
        this.installRetryCount = parcel.readInt();
    }
}
