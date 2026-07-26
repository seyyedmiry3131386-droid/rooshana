package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Range;
import com.google.common.collect.z0;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import io.sentry.android.core.t0;
import ir.mservices.market.app.common.recycler.AppNestedData;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vv1 implements uw1, zy1, ly0, yp2, q94, h51, w32, nt2, og5, ph3 {
    public final /* synthetic */ int a;

    public /* synthetic */ vv1(int i) {
        this.a = i;
    }

    @Override // defpackage.uw1
    public void a() {
    }

    @Override // defpackage.yp2
    public Object apply(Object obj) {
        switch (this.a) {
            case 10:
                return new hd1((td8) obj);
            case 21:
                wz3 wz3Var = (wz3) obj;
                return wz3Var.a + ": " + wz3Var.b;
            case 26:
                x03 x03Var = (x03) obj;
                x03Var.w();
                return ImmutableList.n(z0.j(new p58(9), x03Var.I.b));
            default:
                return ((Range) obj).a;
        }
    }

    @Override // defpackage.zy1
    public float b(float f) {
        return f;
    }

    @Override // defpackage.ph3
    public boolean c(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // defpackage.h51
    public Object f(bf8 bf8Var) throws IOException {
        int i;
        Object obj;
        switch (this.a) {
            case 13:
                i = 403;
                break;
            case 14:
                i = -1;
                break;
            default:
                ox9 ox9Var = (ox9) bf8Var;
                synchronized (ox9Var.a) {
                    rq4.q("Task is not yet complete", ox9Var.c);
                    if (ox9Var.d) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    if (IOException.class.isInstance(ox9Var.f)) {
                        throw ((Throwable) IOException.class.cast(ox9Var.f));
                    }
                    Exception exc = ox9Var.f;
                    if (exc != null) {
                        throw new RuntimeExecutionException(exc);
                    }
                    obj = ox9Var.e;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                t0.n("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.nt2
    public Object get() {
        return fz.a();
    }

    @Override // defpackage.ly0
    public Object h(o77 o77Var) {
        switch (this.a) {
            case 6:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 7:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 9:
                d24 d24Var = ExecutorsRegistrar.a;
                return UiExecutor.a;
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(o77Var);
        }
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        eb6 eb6Var = (eb6) obj;
        switch (this.a) {
            case 11:
                eb6Var.S(new ExoPlaybackException(2, new ExoTimeoutException("Player release timed out."), 1003));
                break;
            default:
                eb6Var.H();
                break;
        }
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        js3.p(view, "view");
        js3.p((h95) qg5Var, "viewHolder");
        js3.p((AppNestedData) obj, "recyclerData");
    }

    public /* synthetic */ vv1(int i, Object obj) {
        this.a = i;
    }
}
