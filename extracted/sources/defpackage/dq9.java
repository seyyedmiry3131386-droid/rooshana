package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class dq9 implements IInterface {
    public final IBinder n;

    public dq9(IBinder iBinder) {
        this.n = iBinder;
    }

    public final void L(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.n.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.n;
    }
}
