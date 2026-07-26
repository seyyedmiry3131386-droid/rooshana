package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzt;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public abstract class mt9 {
    public static final qn9 a;
    public static final qn9 b;
    public static volatile dk9 c;
    public static final Object d;
    public static Context e;

    static {
        new qn9(xq9.q0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), 0);
        new qn9(xq9.q0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), 1);
        new qn9(xq9.q0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 2);
        new qn9(xq9.q0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 3);
        a = new qn9(xq9.q0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 4);
        b = new qn9(xq9.q0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 5);
        d = new Object();
    }

    public static synchronized void a(Context context) {
        if (e != null) {
            t0.m("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            e = context.getApplicationContext();
        }
    }

    public static void b() {
        dk9 ak9Var;
        if (c != null) {
            return;
        }
        rq4.n(e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder iBinderB = sy1.c(e, sy1.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = bk9.o;
                    if (iBinderB == null) {
                        ak9Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        ak9Var = iInterfaceQueryLocalInterface instanceof dk9 ? (dk9) iInterfaceQueryLocalInterface : new ak9(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 2);
                    }
                    c = ak9Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static xe1 c(String str, kr9 kr9Var, boolean z, boolean z2) {
        try {
            b();
            rq4.n(e);
            zzt zztVar = new zzt(str, kr9Var, z, z2);
            try {
                dk9 dk9Var = c;
                dr5 dr5Var = new dr5(e.getPackageManager());
                ak9 ak9Var = (ak9) dk9Var;
                Parcel parcelN0 = ak9Var.n0();
                int i = jm9.a;
                boolean z3 = true;
                parcelN0.writeInt(1);
                zztVar.writeToParcel(parcelN0, 0);
                jm9.b(parcelN0, dr5Var);
                Parcel parcelM0 = ak9Var.m0(5, parcelN0);
                if (parcelM0.readInt() == 0) {
                    z3 = false;
                }
                parcelM0.recycle();
                return z3 ? xe1.d : new px9(new yr9(z, str, kr9Var));
            } catch (RemoteException e2) {
                t0.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return xe1.B(e2, "module call");
            }
        } catch (DynamiteModule$LoadingException e3) {
            t0.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return xe1.B(e3, "module init: ".concat(String.valueOf(e3.getMessage())));
        }
    }
}
