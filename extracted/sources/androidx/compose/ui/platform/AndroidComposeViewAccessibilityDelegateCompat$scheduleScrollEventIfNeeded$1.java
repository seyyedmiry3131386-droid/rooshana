package androidx.compose.ui.platform;

import defpackage.bp2;
import defpackage.gg7;
import defpackage.ln7;
import defpackage.qg7;
import defpackage.t3;
import defpackage.tx8;
import defpackage.xa5;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1 extends Lambda implements bp2 {
    public final /* synthetic */ qg7 g;
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(qg7 qg7Var, c cVar) {
        super(0);
        this.g = qg7Var;
        this.h = cVar;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        androidx.compose.ui.semantics.c cVar;
        androidx.compose.ui.node.h hVar;
        qg7 qg7Var = this.g;
        gg7 gg7Var = qg7Var.e;
        gg7 gg7Var2 = qg7Var.f;
        Float f = qg7Var.c;
        Float f2 = qg7Var.d;
        float fFloatValue = (gg7Var == null || f == null) ? 0.0f : ((Number) gg7Var.a.invoke()).floatValue() - f.floatValue();
        float fFloatValue2 = (gg7Var2 == null || f2 == null) ? 0.0f : ((Number) gg7Var2.a.invoke()).floatValue() - f2.floatValue();
        if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
            int i = qg7Var.a;
            xa5 xa5Var = c.O;
            c cVar2 = this.h;
            int iA = cVar2.A(i);
            ln7 ln7Var = (ln7) cVar2.s().b(cVar2.l);
            if (ln7Var != null) {
                try {
                    t3 t3Var = cVar2.n;
                    if (t3Var != null) {
                        t3Var.l(cVar2.k(ln7Var));
                    }
                } catch (IllegalStateException unused) {
                }
            }
            ln7 ln7Var2 = (ln7) cVar2.s().b(cVar2.m);
            if (ln7Var2 != null) {
                try {
                    t3 t3Var2 = cVar2.o;
                    if (t3Var2 != null) {
                        t3Var2.l(cVar2.k(ln7Var2));
                    }
                } catch (IllegalStateException unused2) {
                }
            }
            cVar2.d.invalidate();
            ln7 ln7Var3 = (ln7) cVar2.s().b(iA);
            if (ln7Var3 != null && (cVar = ln7Var3.a) != null && (hVar = cVar.c) != null) {
                if (gg7Var != null) {
                    cVar2.q.h(iA, gg7Var);
                }
                if (gg7Var2 != null) {
                    cVar2.r.h(iA, gg7Var2);
                }
                cVar2.w(hVar);
            }
        }
        if (gg7Var != null) {
            qg7Var.c = (Float) gg7Var.a.invoke();
        }
        if (gg7Var2 != null) {
            qg7Var.d = (Float) gg7Var2.a.invoke();
        }
        return tx8.a;
    }
}
