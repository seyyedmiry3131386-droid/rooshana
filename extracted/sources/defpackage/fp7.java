package defpackage;

import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import io.sentry.android.core.t0;
import ir.mservices.market.app.update.common.manager.UpdateSyncReceiver;
import ir.mservices.market.app.update.common.modal.a;
import j$.util.Objects;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class fp7 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fp7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        af8 af8VarB;
        long jNanoTime;
        af8 af8VarB2;
        gf8 gf8Var = (gf8) this.b;
        synchronized (gf8Var) {
            gf8Var.g++;
            af8VarB = gf8Var.b();
        }
        if (af8VarB == null) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        while (true) {
            try {
                threadCurrentThread.setName(af8VarB.a);
                Logger logger = ((gf8) this.b).b;
                ff8 ff8Var = af8VarB.c;
                js3.m(ff8Var);
                boolean zIsLoggable = logger.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = System.nanoTime();
                    c67.a(logger, af8VarB, ff8Var, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    long jA = af8VarB.a();
                    if (zIsLoggable) {
                        c67.a(logger, af8VarB, ff8Var, "finished run in " + c67.d(System.nanoTime() - jNanoTime));
                    }
                    gf8 gf8Var2 = (gf8) this.b;
                    synchronized (gf8Var2) {
                        gf8.a(gf8Var2, af8VarB, jA, true);
                        af8VarB2 = gf8Var2.b();
                    }
                    if (af8VarB2 == null) {
                        return;
                    } else {
                        af8VarB = af8VarB2;
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        c67.a(logger, af8VarB, ff8Var, "failed a run in " + c67.d(System.nanoTime() - jNanoTime));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    gf8 gf8Var3 = (gf8) this.b;
                    synchronized (gf8Var3) {
                        gf8.a(gf8Var3, af8VarB, -1L, false);
                        if (!(th2 instanceof InterruptedException)) {
                            throw th2;
                        }
                        Thread.currentThread().interrupt();
                        return;
                    }
                } finally {
                    threadCurrentThread.setName(name);
                }
            }
        }
    }

    private final void b() {
        synchronized (this) {
            ((a79) this.b).k = false;
        }
        while (a79.t.poll() != null) {
        }
        if (((a79) this.b).l.isAttachedToWindow()) {
            ((a79) this.b).d0();
            return;
        }
        View view = ((a79) this.b).l;
        y69 y69Var = a79.u;
        view.removeOnAttachStateChangeListener(y69Var);
        ((a79) this.b).l.addOnAttachStateChangeListener(y69Var);
    }

    private final void c() {
        ic9 ic9Var = (ic9) this.b;
        synchronized (ic9Var.a) {
            try {
                if (ic9Var.b()) {
                    t0.d("WakeLock", String.valueOf(ic9Var.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    ic9Var.d();
                    if (ic9Var.b()) {
                        ic9Var.c = 1;
                        ic9Var.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gp7 gp7Var = (gp7) this.b;
                gp7Var.g.a(false);
                gp7Var.c.a(false);
                gp7Var.a.a(false);
                gp7Var.f.a(false);
                gp7Var.b.a(false);
                gp7Var.e.a(false);
                gp7Var.h.a(false);
                gp7Var.i = false;
                return;
            case 1:
                ((mr7) this.b).c();
                return;
            case 2:
                ((StaggeredGridLayoutManager) this.b).G0();
                return;
            case 3:
                a();
                return;
            case 4:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.b).c.g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 5:
                ((Toolbar) this.b).z();
                return;
            case 6:
                qn8 qn8Var = (qn8) this.b;
                Window.Callback callback = qn8Var.r;
                Menu menuR0 = qn8Var.r0();
                ot4 ot4Var = menuR0 instanceof ot4 ? (ot4) menuR0 : null;
                if (ot4Var != null) {
                    ot4Var.y();
                }
                try {
                    menuR0.clear();
                    if (!callback.onCreatePanelMenu(0, menuR0) || !callback.onPreparePanel(0, null, menuR0)) {
                        menuR0.clear();
                        break;
                    }
                    if (ot4Var != null) {
                        ot4Var.x();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (ot4Var != null) {
                        ot4Var.x();
                    }
                    throw th;
                }
            case 7:
                a aVar = ((UpdateSyncReceiver) this.b).c;
                if (aVar != null) {
                    aVar.a(this, "background", "bg_success", ff5.b(), null, null);
                    return;
                } else {
                    js3.V("updateRefreshRepository");
                    throw null;
                }
            case 8:
                b();
                return;
            case 9:
                ((b79) this.b).r(0);
                return;
            case 10:
                ViewPager viewPager = (ViewPager) this.b;
                viewPager.setScrollState(0);
                viewPager.r();
                return;
            case 11:
                ((wh9) this.b).a();
                return;
            case 12:
                wh9 wh9Var = (wh9) ((ut4) this.b).b;
                ((d70) wh9Var.o).disconnect(wh9Var.o.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 13:
                ((hi9) this.b).u.B(new ConnectionResult(4, null, null));
                return;
            case 14:
                throw null;
            case 15:
                c();
                return;
            case 16:
                if (((cf8) this.b).c(new IOException("TIMEOUT"))) {
                    t0.m("Rpc", "No response");
                    return;
                }
                return;
            default:
                aq9 aq9Var = (aq9) this.b;
                synchronized (aq9Var.c) {
                    try {
                        zs5 zs5Var = (zs5) aq9Var.d;
                        if (zs5Var != null) {
                            zs5Var.g();
                        }
                    } finally {
                    }
                    break;
                }
                return;
        }
    }

    public fp7(ut4 ut4Var) {
        this.a = 12;
        Objects.requireNonNull(ut4Var);
        this.b = ut4Var;
    }

    public fp7(rh9 rh9Var, wi9 wi9Var) {
        this.a = 14;
        Objects.requireNonNull(rh9Var);
        this.b = wi9Var;
    }

    public fp7(hi9 hi9Var) {
        this.a = 13;
        Objects.requireNonNull(hi9Var);
        this.b = hi9Var;
    }
}
