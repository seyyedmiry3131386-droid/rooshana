package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzj;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class nn9 extends ei9 {
    public d70 o;
    public final int p;

    public nn9(d70 d70Var, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 2);
        this.o = d70Var;
        this.p = i;
    }

    @Override // defpackage.ei9
    public final boolean o0(int i, Parcel parcel, Parcel parcel2) {
        int i2 = this.p;
        if (i == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) jm9.a(parcel, Bundle.CREATOR);
            jm9.c(parcel);
            rq4.o(this.o, "onPostInitComplete can be called only once per call to getRemoteService");
            this.o.onPostInitHandler(i3, strongBinder, bundle, i2);
            this.o = null;
        } else if (i == 2) {
            parcel.readInt();
            jm9.c(parcel);
            t0.o("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) jm9.a(parcel, zzj.CREATOR);
            jm9.c(parcel);
            d70 d70Var = this.o;
            rq4.o(d70Var, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            rq4.n(zzjVar);
            d70Var.zzc(zzjVar);
            Bundle bundle2 = zzjVar.a;
            rq4.o(this.o, "onPostInitComplete can be called only once per call to getRemoteService");
            this.o.onPostInitHandler(i4, strongBinder2, bundle2, i2);
            this.o = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
