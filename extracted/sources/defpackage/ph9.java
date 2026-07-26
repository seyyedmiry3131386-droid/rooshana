package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class ph9 implements IInterface {
    public final /* synthetic */ int n;
    public final IBinder o;
    public final String p;

    public /* synthetic */ ph9(IBinder iBinder, String str, int i) {
        this.n = i;
        this.o = iBinder;
        this.p = str;
    }

    public void L(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.o.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.n) {
        }
        return this.o;
    }

    public Parcel m0(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.o.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel n0() {
        switch (this.n) {
            case 2:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.p);
                return parcelObtain;
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.p);
                return parcelObtain2;
        }
    }

    public void o0(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.o.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
