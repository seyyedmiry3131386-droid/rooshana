package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class cg3 implements dg3 {
    public IBinder n;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.n;
    }

    @Override // defpackage.dg3
    public final void o(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(dg3.e);
            parcelObtain.writeStringArray(strArr);
            this.n.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
