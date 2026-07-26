package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.nearby.zzgv;

/* JADX INFO: loaded from: classes.dex */
public final class xm9 extends ei9 implements rp9 {
    public final vo4 o;

    public xm9(vo4 vo4Var) {
        super("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener", 3);
        this.o = vo4Var;
    }

    @Override // defpackage.ei9
    public final boolean n0(int i, Parcel parcel) {
        if (i != 2) {
            return false;
        }
        zzgv zzgvVar = (zzgv) lm9.a(parcel, zzgv.CREATOR);
        lm9.b(parcel);
        Status statusB = zm9.b(zzgvVar.a);
        boolean zU = statusB.u();
        vo4 vo4Var = this.o;
        if (zU) {
            ((cf8) vo4Var.b).b(null);
            return true;
        }
        vo4Var.p(statusB);
        return true;
    }
}
