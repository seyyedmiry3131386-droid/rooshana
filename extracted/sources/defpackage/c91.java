package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class c91 {
    public final gf3 a;
    public final PendingIntent b;

    public c91(gf3 gf3Var, PendingIntent pendingIntent) {
        if (gf3Var == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.a = gf3Var;
        this.b = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c91) {
            c91 c91Var = (c91) obj;
            PendingIntent pendingIntent = c91Var.b;
            PendingIntent pendingIntent2 = this.b;
            if ((pendingIntent2 == null) == (pendingIntent == null)) {
                if (pendingIntent2 != null) {
                    return pendingIntent2.equals(pendingIntent);
                }
                gf3 gf3Var = this.a;
                if (gf3Var == null) {
                    throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
                }
                IBinder iBinder = ((ef3) gf3Var).n;
                gf3 gf3Var2 = c91Var.a;
                if (gf3Var2 != null) {
                    return iBinder.equals(((ef3) gf3Var2).n);
                }
                throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
            }
        }
        return false;
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        gf3 gf3Var = this.a;
        if (gf3Var != null) {
            return ((ef3) gf3Var).n.hashCode();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }
}
