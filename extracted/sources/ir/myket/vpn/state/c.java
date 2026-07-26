package ir.myket.vpn.state;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.js3;
import ir.myket.vpn.state.Command;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        js3.p(parcel, "parcel");
        return new Command.Stop(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Command.Stop[i];
    }
}
