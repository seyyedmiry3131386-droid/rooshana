package defpackage;

import android.os.Trace;
import android.view.View;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.common.util.concurrent.e;
import io.sentry.SentryLevel;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.protocol.h0;
import io.sentry.protocol.i0;
import io.sentry.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ma0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ma0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vb5 vb5VarD;
        switch (this.a) {
            case 0:
                gj8 gj8Var = (gj8) this.b;
                LayoutDirection layoutDirection = (LayoutDirection) this.c;
                String str = (String) this.d;
                qj1 qj1Var = (qj1) this.e;
                oh2 oh2Var = (oh2) this.f;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    c08 c08VarJ = g08.j();
                    vb5 vb5Var = c08VarJ instanceof vb5 ? (vb5) c08VarJ : null;
                    if (vb5Var == null || (vb5VarD = vb5Var.D(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        c08 c08VarJ2 = vb5VarD.j();
                        try {
                            gj8 gj8VarL = sy7.l(gj8Var, layoutDirection);
                            EmptyList emptyList = EmptyList.a;
                            new ch(str, gj8VarL, emptyList, emptyList, oh2Var, qj1Var).d();
                            vb5VarD.w().a();
                            return;
                        } finally {
                            c08.q(c08VarJ2);
                        }
                    } finally {
                    }
                } finally {
                    Trace.endSection();
                }
            case 1:
                ((n11) this.c).run().e(new m11((vp7) this.b, (AtomicBoolean) this.d, (o11) this.e, (AtomicBoolean) this.f), e.a());
                return;
            default:
                AtomicReference atomicReference = (AtomicReference) this.b;
                View view = (View) this.c;
                List list = (List) this.d;
                CountDownLatch countDownLatch = (CountDownLatch) this.e;
                u0 u0Var = (u0) this.f;
                try {
                    ArrayList arrayList = new ArrayList(1);
                    h0 h0Var = new h0("android_view_system", arrayList);
                    i0 i0VarC = ViewHierarchyEventProcessor.c(view);
                    arrayList.add(i0VarC);
                    ViewHierarchyEventProcessor.a(view, i0VarC, list);
                    atomicReference.set(h0Var);
                    countDownLatch.countDown();
                    return;
                } catch (Throwable th) {
                    u0Var.f(SentryLevel.ERROR, "Failed to process view hierarchy.", th);
                    return;
                }
        }
    }
}
