package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.l;
import defpackage.ah0;
import defpackage.ba6;
import defpackage.bt2;
import defpackage.cj1;
import defpackage.cj3;
import defpackage.do3;
import defpackage.gu9;
import defpackage.h18;
import defpackage.js3;
import defpackage.l98;
import defpackage.li1;
import defpackage.ok4;
import defpackage.q44;
import defpackage.qy6;
import defpackage.rg;
import defpackage.ri8;
import defpackage.rr5;
import defpackage.sy6;
import defpackage.ub5;
import defpackage.un3;
import defpackage.vt;
import defpackage.vy2;
import defpackage.x51;
import defpackage.y44;
import defpackage.y97;
import defpackage.zh8;
import defpackage.zi8;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ba6 {
    public q44 a;
    public li1 b;
    public y44 c;
    public i d;

    @Override // defpackage.ba6
    public final void a() {
        j(null);
    }

    @Override // defpackage.ba6
    public final void b() {
        h18 h18Var;
        q44 q44Var = this.a;
        if (q44Var == null || (h18Var = (h18) y97.t(q44Var, l.p)) == null) {
            return;
        }
        ((cj1) h18Var).b();
    }

    @Override // defpackage.ba6
    public final void c() throws Throwable {
        li1 li1Var = this.b;
        if (li1Var != null) {
            li1Var.g(null);
        }
        this.b = null;
        ub5 ub5VarI = i();
        if (ub5VarI != null) {
            ((i) ub5VarI).b();
        }
    }

    @Override // defpackage.ba6
    public final void d(zh8 zh8Var, cj3 cj3Var, vt vtVar, x51 x51Var) {
        j(new rg(zh8Var, this, cj3Var, vtVar, x51Var, 0));
    }

    @Override // defpackage.ba6
    public final void e(zh8 zh8Var, rr5 rr5Var, ri8 ri8Var, ah0 ah0Var, sy6 sy6Var, sy6 sy6Var2) {
        y44 y44Var = this.c;
        if (y44Var != null) {
            d dVar = y44Var.m;
            synchronized (dVar.c) {
                try {
                    dVar.j = zh8Var;
                    dVar.l = rr5Var;
                    dVar.k = ri8Var;
                    dVar.m = sy6Var;
                    dVar.n = sy6Var2;
                    if (dVar.e || dVar.d) {
                        dVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.ba6
    public final void f(zh8 zh8Var, zh8 zh8Var2) {
        y44 y44Var = this.c;
        if (y44Var != null) {
            boolean z = (zi8.c(y44Var.h.b, zh8Var2.b) && js3.i(y44Var.h.c, zh8Var2.c)) ? false : true;
            y44Var.h = zh8Var2;
            int size = y44Var.j.size();
            for (int i = 0; i < size; i++) {
                qy6 qy6Var = (qy6) ((WeakReference) y44Var.j.get(i)).get();
                if (qy6Var != null) {
                    qy6Var.g = zh8Var2;
                }
            }
            d dVar = y44Var.m;
            synchronized (dVar.c) {
                dVar.j = null;
                dVar.l = null;
                dVar.k = null;
                dVar.m = null;
                dVar.n = null;
            }
            if (js3.i(zh8Var, zh8Var2)) {
                if (z) {
                    do3 do3Var = y44Var.b;
                    int iG = zi8.g(zh8Var2.b);
                    int iF = zi8.f(zh8Var2.b);
                    zi8 zi8Var = y44Var.h.c;
                    int iG2 = zi8Var != null ? zi8.g(zi8Var.a) : -1;
                    zi8 zi8Var2 = y44Var.h.c;
                    do3Var.q().updateSelection((View) do3Var.a, iG, iF, iG2, zi8Var2 != null ? zi8.f(zi8Var2.a) : -1);
                    return;
                }
                return;
            }
            if (zh8Var != null && (!js3.i(zh8Var.a.b, zh8Var2.a.b) || (zi8.c(zh8Var.b, zh8Var2.b) && !js3.i(zh8Var.c, zh8Var2.c)))) {
                do3 do3Var2 = y44Var.b;
                do3Var2.q().restartInput((View) do3Var2.a);
                return;
            }
            int size2 = y44Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                qy6 qy6Var2 = (qy6) ((WeakReference) y44Var.j.get(i2)).get();
                if (qy6Var2 != null) {
                    zh8 zh8Var3 = y44Var.h;
                    do3 do3Var3 = y44Var.b;
                    if (qy6Var2.k) {
                        qy6Var2.g = zh8Var3;
                        if (qy6Var2.i) {
                            do3Var3.q().updateExtractedText((View) do3Var3.a, qy6Var2.h, gu9.j(zh8Var3));
                        }
                        zi8 zi8Var3 = zh8Var3.c;
                        long j = zh8Var3.b;
                        int iG3 = zi8Var3 != null ? zi8.g(zi8Var3.a) : -1;
                        zi8 zi8Var4 = zh8Var3.c;
                        do3Var3.q().updateSelection((View) do3Var3.a, zi8.g(j), zi8.f(j), iG3, zi8Var4 != null ? zi8.f(zi8Var4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.ba6
    public final void g() {
        h18 h18Var;
        q44 q44Var = this.a;
        if (q44Var == null || (h18Var = (h18) y97.t(q44Var, l.p)) == null) {
            return;
        }
        ((cj1) h18Var).a();
    }

    @Override // defpackage.ba6
    public final void h(sy6 sy6Var) {
        Rect rect;
        y44 y44Var = this.c;
        if (y44Var != null) {
            y44Var.l = new Rect(ok4.V(sy6Var.a), ok4.V(sy6Var.b), ok4.V(sy6Var.c), ok4.V(sy6Var.d));
            if (!y44Var.j.isEmpty() || (rect = y44Var.l) == null) {
                return;
            }
            y44Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final ub5 i() {
        i iVar = this.d;
        if (iVar != null) {
            return iVar;
        }
        if (!l98.a) {
            return null;
        }
        i iVarE = vy2.e(1, 2, BufferOverflow.c);
        this.d = iVarE;
        return iVarE;
    }

    public final void j(rg rgVar) {
        q44 q44Var = this.a;
        if (q44Var == null) {
            return;
        }
        this.b = q44Var.n ? bt2.G(q44Var.o0(), null, CoroutineStart.d, new LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(q44Var, new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(rgVar, this, q44Var, null), null), 1) : null;
    }

    public final void k(q44 q44Var) {
        if (this.a != q44Var) {
            un3.c("Expected textInputModifierNode to be " + q44Var + " but was " + this.a);
        }
        this.a = null;
    }
}
