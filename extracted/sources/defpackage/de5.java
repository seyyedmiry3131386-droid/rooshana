package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ir.mservices.market.version2.services.c;

/* JADX INFO: loaded from: classes3.dex */
public final class de5 extends Binder implements IInterface {
    public c5 n;
    public dp3 o;
    public c p;
    public Context q;

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        of3 of3Var;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.android.vending.licensing.ILicensingService");
        }
        if (i == 1598968902) {
            parcel2.writeString("com.android.vending.licensing.ILicensingService");
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        long j = parcel.readLong();
        String string = parcel.readString();
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            of3Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof of3)) {
                of3Var = new of3();
                of3Var.n = strongBinder;
            } else {
                of3Var = (of3) iInterfaceQueryLocalInterface;
            }
        }
        Void[] voidArr = new Void[0];
        while (true) {
            try {
                ce5 ce5Var = (ce5) new be5(this, string, Binder.getCallingUid(), j).q(voidArr);
                int i3 = ce5Var.a;
                String str = ce5Var.b;
                String str2 = ce5Var.c;
                of3Var.getClass();
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicenseResultListener");
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    of3Var.n.transact(1, parcelObtain, null, 1);
                    return true;
                } finally {
                    parcelObtain.recycle();
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
