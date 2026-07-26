package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.tasks.RuntimeExecutionException;
import io.sentry.android.core.t0;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zh9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zh9(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    private final void a() {
        au9 au9Var = (au9) this.b;
        IBinder iBinder = (IBinder) this.c;
        synchronized (au9Var) {
            if (iBinder == null) {
                au9Var.a("Null service connection");
                return;
            }
            try {
                au9Var.c = new rn6(iBinder);
                au9Var.a = 2;
                ((ScheduledExecutorService) au9Var.f.c).execute(new yq9(au9Var, 0));
            } catch (RemoteException e) {
                au9Var.a(e.getMessage());
            }
        }
    }

    private final void b() {
        aq9 aq9Var = (aq9) this.c;
        synchronized (aq9Var.c) {
            try {
                dt5 dt5Var = (dt5) aq9Var.d;
                if (dt5Var != null) {
                    Exception excC = ((bf8) this.b).c();
                    rq4.n(excC);
                    dt5Var.onFailure(excC);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        aq9 aq9Var = (aq9) this.c;
        synchronized (aq9Var.c) {
            try {
                tt5 tt5Var = (tt5) aq9Var.d;
                if (tt5Var != null) {
                    tt5Var.onSuccess(((bf8) this.b).d());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        au9 au9Var = (au9) this.b;
        int i = ((kw9) this.c).a;
        synchronized (au9Var) {
            kw9 kw9Var = (kw9) au9Var.e.get(i);
            if (kw9Var != null) {
                t0.m("MessengerIpcClient", "Timing out request: " + i);
                au9Var.e.remove(i);
                kw9Var.b(new zzt("Timed out waiting for response", null));
                au9Var.c();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        bf3 gx9Var;
        switch (this.a) {
            case 0:
                x41 x41Var = (x41) this.b;
                z27 z27Var = (z27) this.c;
                o94 o94Var = (o94) x41Var.b;
                if (o94Var == null) {
                    return;
                }
                z27Var.j(o94Var.a);
                return;
            case 1:
                hi9 hi9Var = (hi9) this.c;
                zak zakVar = (zak) this.b;
                hi9Var.getClass();
                ConnectionResult connectionResult = zakVar.b;
                if (connectionResult.b == 0) {
                    zay zayVar = zakVar.c;
                    rq4.n(zayVar);
                    ConnectionResult connectionResult2 = zayVar.c;
                    if (connectionResult2.b != 0) {
                        t0.o("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                        hi9Var.u.B(connectionResult2);
                        hi9Var.t.disconnect();
                        return;
                    }
                    gg1 gg1Var = hi9Var.u;
                    IBinder iBinder = zayVar.b;
                    if (iBinder == null) {
                        gx9Var = null;
                    } else {
                        int i = f4.o;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        gx9Var = iInterfaceQueryLocalInterface instanceof bf3 ? (bf3) iInterfaceQueryLocalInterface : new gx9(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                    }
                    Set<Scope> set = hi9Var.r;
                    gg1Var.getClass();
                    if (gx9Var == null || set == null) {
                        t0.o("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        gg1Var.B(new ConnectionResult(4, null, null));
                    } else {
                        gg1Var.d = gx9Var;
                        gg1Var.e = set;
                        if (gg1Var.a) {
                            ((d70) ((sl) gg1Var.b)).getRemoteService(gx9Var, set);
                        }
                    }
                } else {
                    hi9Var.u.B(connectionResult);
                }
                hi9Var.t.disconnect();
                return;
            case 2:
                bf8 bf8Var = (bf8) this.b;
                if (((ox9) bf8Var).d) {
                    ((ln9) this.c).d.o();
                    return;
                }
                try {
                    ((ln9) this.c).d.m(((ln9) this.c).c.f(bf8Var));
                    return;
                } catch (RuntimeExecutionException e) {
                    if (!(e.getCause() instanceof Exception)) {
                        ((ln9) this.c).d.n(e);
                        return;
                    } else {
                        ((ln9) this.c).d.n((Exception) e.getCause());
                        return;
                    }
                } catch (Exception e2) {
                    ((ln9) this.c).d.n(e2);
                    return;
                }
            case 3:
                ln9 ln9Var = (ln9) this.c;
                try {
                    bf8 bf8Var2 = (bf8) ln9Var.c.f((bf8) this.b);
                    if (bf8Var2 == null) {
                        ln9Var.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ko9 ko9Var = df8.b;
                    bf8Var2.b(ko9Var, ln9Var);
                    bf8Var2.a(ko9Var, ln9Var);
                    ox9 ox9Var = (ox9) bf8Var2;
                    ox9Var.b.h(new aq9((Executor) ko9Var, (zs5) ln9Var));
                    ox9Var.q();
                    return;
                } catch (RuntimeExecutionException e3) {
                    if (e3.getCause() instanceof Exception) {
                        ln9Var.d.n((Exception) e3.getCause());
                        return;
                    } else {
                        ln9Var.d.n(e3);
                        return;
                    }
                } catch (Exception e4) {
                    ln9Var.d.n(e4);
                    return;
                }
            case 4:
                aq9 aq9Var = (aq9) this.c;
                synchronized (aq9Var.c) {
                    ((at5) aq9Var.d).l((bf8) this.b);
                    break;
                }
                return;
            case 5:
                a();
                return;
            case 6:
                b();
                return;
            case 7:
                c();
                return;
            case 8:
                d();
                return;
            case 9:
                aq9 aq9Var2 = (aq9) this.c;
                try {
                    ox9 ox9VarJ = ((hb8) aq9Var2.c).j(((bf8) this.b).d());
                    ko9 ko9Var2 = df8.b;
                    ox9VarJ.b(ko9Var2, aq9Var2);
                    ox9VarJ.a(ko9Var2, aq9Var2);
                    ox9VarJ.b.h(new aq9((Executor) ko9Var2, (zs5) aq9Var2));
                    ox9VarJ.q();
                    return;
                } catch (RuntimeExecutionException e5) {
                    if (e5.getCause() instanceof Exception) {
                        aq9Var2.onFailure((Exception) e5.getCause());
                        return;
                    } else {
                        aq9Var2.onFailure(e5);
                        return;
                    }
                } catch (CancellationException unused) {
                    aq9Var2.g();
                    return;
                } catch (Exception e6) {
                    aq9Var2.onFailure(e6);
                    return;
                }
            default:
                ox9 ox9Var2 = (ox9) this.b;
                try {
                    ox9Var2.m(((Callable) this.c).call());
                    return;
                } catch (Exception e7) {
                    ox9Var2.n(e7);
                    return;
                } catch (Throwable th) {
                    ox9Var2.n(new RuntimeException(th));
                    return;
                }
        }
    }

    public /* synthetic */ zh9(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
