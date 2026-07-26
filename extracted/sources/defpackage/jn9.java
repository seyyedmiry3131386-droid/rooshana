package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class jn9 extends yl9 implements rn9 {
    public jn9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // defpackage.rn9
    public final int a() throws RemoteException {
        Parcel parcelZzP = zzP(2, zza());
        int i = parcelZzP.readInt();
        parcelZzP.recycle();
        return i;
    }

    @Override // defpackage.rn9
    public final void m(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        am9.b(parcelZza, bundle);
        parcelZza.writeLong(j);
        zzc(1, parcelZza);
    }
}
