package ir.mservices.market.core.notification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import defpackage.ao6;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public class PushMessageAction implements Parcelable {
    public static final Parcelable.Creator<PushMessageAction> CREATOR = new ao6(0);

    @KeepName
    private String action;

    @KeepName
    private String id;

    @KeepName
    private String text;

    public PushMessageAction(String str, String str2, String str3) {
        this.id = str;
        this.text = str2;
        this.action = str3;
    }

    public final String a() {
        return this.action;
    }

    public final String b() {
        return this.id;
    }

    public final String c() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.text);
        parcel.writeString(this.action);
    }

    public PushMessageAction(Parcel parcel) {
        this.id = parcel.readString();
        this.text = parcel.readString();
        this.action = parcel.readString();
    }
}
