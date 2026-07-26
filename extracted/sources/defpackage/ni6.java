package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ni6 extends Binder implements mg3 {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcel parcelObtain;
        Parcel parcelObtain2;
        String str = mg3.h;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 2) {
            gf3 gf3VarL = ff3.L(parcel.readStrongBinder());
            Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
            ef3 ef3Var = (ef3) gf3VarL;
            ef3Var.getClass();
            parcelObtain = Parcel.obtain();
            parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(gf3.b);
                if (bundle != null) {
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                ef3Var.n.transact(4, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                parcel2.writeNoException();
                return true;
            } finally {
            }
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        gf3 gf3VarL2 = ff3.L(parcel.readStrongBinder());
        String string = parcel.readString();
        Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
        ef3 ef3Var2 = (ef3) gf3VarL2;
        ef3Var2.getClass();
        parcelObtain = Parcel.obtain();
        parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(gf3.b);
            parcelObtain.writeString(string);
            if (bundle2 != null) {
                parcelObtain.writeInt(1);
                bundle2.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            ef3Var2.n.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            parcel2.writeNoException();
            return true;
        } finally {
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
