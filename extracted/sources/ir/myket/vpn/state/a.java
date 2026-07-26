package ir.myket.vpn.state;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.js3;
import ir.myket.vpn.state.Command;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        js3.p(parcel, "parcel");
        return new Command.StartApps((Notification) parcel.readParcelable(Command.StartApps.class.getClassLoader()), (PendingIntent) parcel.readParcelable(Command.StartApps.class.getClassLoader()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Command.StartApps[i];
    }
}
