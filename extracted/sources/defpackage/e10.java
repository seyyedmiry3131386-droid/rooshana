package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class e10 {
    public final df3 a;
    public final PendingIntent b;

    public e10(df3 df3Var, PendingIntent pendingIntent) {
        if (df3Var == null && pendingIntent == null) {
            throw new IllegalStateException("AuthTabSessionToken must have either a session id or a callback (or both).");
        }
        this.a = df3Var;
        this.b = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e10) {
            e10 e10Var = (e10) obj;
            PendingIntent pendingIntent = e10Var.b;
            PendingIntent pendingIntent2 = this.b;
            if ((pendingIntent2 == null) == (pendingIntent == null)) {
                if (pendingIntent2 != null) {
                    return pendingIntent2.equals(pendingIntent);
                }
                df3 df3Var = this.a;
                if (df3Var == null) {
                    throw new IllegalStateException("AuthTabSessionToken must have valid binder or pending session");
                }
                IBinder iBinder = ((cf3) df3Var).n;
                df3 df3Var2 = e10Var.a;
                if (df3Var2 != null) {
                    return iBinder.equals(((cf3) df3Var2).n);
                }
                throw new IllegalStateException("AuthTabSessionToken must have valid binder or pending session");
            }
        }
        return false;
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        df3 df3Var = this.a;
        if (df3Var != null) {
            return ((cf3) df3Var).n.hashCode();
        }
        throw new IllegalStateException("AuthTabSessionToken must have valid binder or pending session");
    }
}
