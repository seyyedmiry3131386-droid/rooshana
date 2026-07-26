package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;

/* JADX INFO: loaded from: classes.dex */
public final class wj9 implements nf3 {
    public final IBinder n;

    public wj9(IBinder iBinder) {
        this.n = iBinder;
    }

    public final void L(nn9 nn9Var, GetServiceRequest getServiceRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(nn9Var);
            parcelObtain.writeInt(1);
            ds9.a(getServiceRequest, parcelObtain, 0);
            this.n.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.n;
    }
}
