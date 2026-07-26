package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qi9 extends ci9 {
    public final cf0 b;
    public final cf8 c;
    public final fz1 d;

    public qi9(int i, cf0 cf0Var, cf8 cf8Var, fz1 fz1Var) {
        super(i);
        this.c = cf8Var;
        this.b = cf0Var;
        this.d = fz1Var;
        if (i == 2 && cf0Var.c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.ri9
    public final void a(Status status) {
        this.d.getClass();
        this.c.c(status.c != null ? new ResolvableApiException(status) : new ApiException(status));
    }

    @Override // defpackage.ri9
    public final void b(Exception exc) {
        this.c.c(exc);
    }

    @Override // defpackage.ri9
    public final void c(rn6 rn6Var, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) rn6Var.c;
        cf8 cf8Var = this.c;
        map.put(cf8Var, boolValueOf);
        cf8Var.a.g(new rn6(rn6Var, cf8Var));
    }

    @Override // defpackage.ri9
    public final void d(wh9 wh9Var) throws DeadObjectException {
        cf8 cf8Var = this.c;
        try {
            cf0 cf0Var = this.b;
            ((q37) ((cf0) cf0Var.e).d).accept(wh9Var.o, cf8Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(ri9.e(e2));
        } catch (RuntimeException e3) {
            cf8Var.c(e3);
        }
    }

    @Override // defpackage.ci9
    public final Feature[] f(wh9 wh9Var) {
        return (Feature[]) this.b.d;
    }

    @Override // defpackage.ci9
    public final boolean g(wh9 wh9Var) {
        return this.b.c;
    }

    @Override // defpackage.ci9
    public final int h(wh9 wh9Var) {
        return this.b.b;
    }
}
