package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.t0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class li9 extends ri9 {
    public final i70 b;

    public li9(int i, i70 i70Var) {
        super(i);
        this.b = i70Var;
    }

    @Override // defpackage.ri9
    public final void a(Status status) {
        try {
            this.b.u0(status);
        } catch (IllegalStateException e) {
            t0.n("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.ri9
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.b.u0(new Status(10, bl4.z(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), null, null));
        } catch (IllegalStateException e) {
            t0.n("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.ri9
    public final void c(rn6 rn6Var, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) rn6Var.b;
        i70 i70Var = this.b;
        map.put(i70Var, boolValueOf);
        i70Var.o0(new bj9(rn6Var, i70Var));
    }

    @Override // defpackage.ri9
    public final void d(wh9 wh9Var) throws DeadObjectException {
        try {
            i70 i70Var = this.b;
            sl slVar = wh9Var.o;
            i70Var.getClass();
            try {
                i70Var.t0(slVar);
            } catch (DeadObjectException e) {
                i70Var.u0(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                i70Var.u0(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }
}
