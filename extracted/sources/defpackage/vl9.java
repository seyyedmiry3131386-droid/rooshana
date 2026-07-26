package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.nearby.zzfz;
import com.google.android.gms.internal.nearby.zzgb;
import com.google.android.gms.internal.nearby.zzgh;
import com.google.android.gms.internal.nearby.zzgj;

/* JADX INFO: loaded from: classes.dex */
public final class vl9 extends ei9 implements fm9, bp9 {
    public final x41 o;
    public final zv p;
    public final zv q;

    public vl9(x41 x41Var) {
        super("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener", 3);
        this.p = new zv(0);
        this.q = new zv(0);
        this.o = x41Var;
    }

    @Override // defpackage.fm9
    public final synchronized void a() {
        try {
            zv zvVar = this.p;
            zvVar.getClass();
            sv svVar = new sv(zvVar);
            while (svVar.hasNext()) {
                this.o.c(new rl9((String) svVar.next(), 0));
            }
            this.p.clear();
            zv zvVar2 = this.q;
            zvVar2.getClass();
            sv svVar2 = new sv(zvVar2);
            while (svVar2.hasNext()) {
                this.o.c(new rl9((String) svVar2.next(), 1));
            }
            this.q.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ei9
    public final boolean n0(int i, Parcel parcel) {
        if (i == 2) {
            zzgb zzgbVar = (zzgb) lm9.a(parcel, zzgb.CREATOR);
            lm9.b(parcel);
            p0(zzgbVar);
            return true;
        }
        if (i == 3) {
            zzgh zzghVar = (zzgh) lm9.a(parcel, zzgh.CREATOR);
            lm9.b(parcel);
            q0(zzghVar);
            return true;
        }
        if (i != 4) {
            if (i != 5) {
                return false;
            }
            zzfz zzfzVar = (zzfz) lm9.a(parcel, zzfz.CREATOR);
            lm9.b(parcel);
            this.o.c(new hl9(zzfzVar, 2));
            return true;
        }
        zzgj zzgjVar = (zzgj) lm9.a(parcel, zzgj.CREATOR);
        lm9.b(parcel);
        synchronized (this) {
            this.q.remove(zzgjVar.a);
            this.o.c(new hl9(zzgjVar, 1));
        }
        return true;
    }

    public final synchronized void p0(zzgb zzgbVar) {
        this.p.add(zzgbVar.a);
        this.o.c(new hl9(zzgbVar, 0));
    }

    public final synchronized void q0(zzgh zzghVar) {
        try {
            this.p.remove(zzghVar.a);
            Status statusB = zm9.b(zzghVar.b);
            if (statusB.u()) {
                this.q.add(zzghVar.a);
            }
            this.o.c(new nl9(zzghVar, statusB, 0));
        } catch (Throwable th) {
            throw th;
        }
    }
}
