package ir.mservices.market.core.notification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import defpackage.qt4;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public class PopupExtra implements Parcelable {
    public static final Parcelable.Creator<PopupExtra> CREATOR = new qt4(28);

    @KeepName
    private String actionText;

    @KeepName
    private String imageUrl;

    public PopupExtra(Parcel parcel) {
        this.imageUrl = parcel.readString();
        this.actionText = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.actionText);
    }
}
