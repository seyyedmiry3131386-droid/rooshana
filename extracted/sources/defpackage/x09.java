package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ir.mservices.market.data.permission.UsageStateServicePermission;

/* JADX INFO: loaded from: classes3.dex */
public final class x09 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        js3.p(parcel, "parcel");
        return new UsageStateServicePermission(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new UsageStateServicePermission[i];
    }
}
