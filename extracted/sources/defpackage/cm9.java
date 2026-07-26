package defpackage;

import android.os.Parcel;
import com.google.android.gms.internal.nearby.zzgl;
import com.google.android.gms.internal.nearby.zzgn;
import com.google.android.gms.internal.nearby.zzgp;

/* JADX INFO: loaded from: classes.dex */
public final class cm9 extends ei9 implements jp9 {
    public final x41 o;
    public final zv p;

    public cm9(x41 x41Var) {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryListener", 3);
        this.p = new zv(0);
        this.o = x41Var;
    }

    @Override // defpackage.ei9
    public final boolean n0(int i, Parcel parcel) {
        if (i == 2) {
            zzgn zzgnVar = (zzgn) lm9.a(parcel, zzgn.CREATOR);
            lm9.b(parcel);
            p0(zzgnVar);
            return true;
        }
        if (i == 3) {
            zzgp zzgpVar = (zzgp) lm9.a(parcel, zzgp.CREATOR);
            lm9.b(parcel);
            q0(zzgpVar);
            return true;
        }
        if (i == 4) {
            lm9.b(parcel);
            return true;
        }
        if (i != 5) {
            return false;
        }
        zzgl zzglVar = (zzgl) lm9.a(parcel, zzgl.CREATOR);
        lm9.b(parcel);
        synchronized (this) {
            this.o.c(new hl9(zzglVar, 3));
        }
        return true;
    }

    public final synchronized void p0(zzgn zzgnVar) {
        String str;
        try {
            boolean z = false;
            if (zzgnVar.d != null && ((str = zzgnVar.a) == null || "__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(str))) {
                z = true;
            }
            if (!z) {
                this.p.add(zzgnVar.a);
            }
            this.o.c(new hl9(zzgnVar, 4));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void q0(zzgp zzgpVar) {
        this.p.remove(zzgpVar.a);
        this.o.c(new hl9(zzgpVar, 5));
    }
}
