package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.ao6;
import defpackage.g87;
import defpackage.og3;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new ao6(10);
    public og3 a;

    public void a(int i, Bundle bundle) {
    }

    public final void b(int i, Bundle bundle) {
        og3 og3Var = this.a;
        if (og3Var != null) {
            try {
                og3Var.l0(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new g87(this);
                }
                parcel.writeStrongBinder(this.a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
