package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ag3 implements bg3 {
    public IBinder n;

    @Override // defpackage.bg3
    public final void V(qf3 qf3Var, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSessionService");
            parcelObtain.writeStrongInterface(qf3Var);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            this.n.transact(3001, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.n;
    }
}
