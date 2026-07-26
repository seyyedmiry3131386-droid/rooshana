package androidx.compose.ui.graphics.vector;

import android.graphics.Path;
import android.graphics.PathMeasure;
import defpackage.bl4;
import defpackage.bp2;
import defpackage.ch0;
import defpackage.eh;
import defpackage.fh;
import defpackage.gh;
import defpackage.hv1;
import defpackage.js3;
import defpackage.o40;
import defpackage.p88;
import defpackage.t39;
import defpackage.u29;
import defpackage.xq2;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes.dex */
public final class b extends u29 {
    public ch0 b;
    public float f;
    public ch0 g;
    public float k;
    public float m;
    public boolean p;
    public p88 q;
    public final eh r;
    public eh s;
    public eh t;
    public final Object u;
    public float c = 1.0f;
    public List d = t39.a;
    public float e = 1.0f;
    public int h = 0;
    public int i = 0;
    public float j = 4.0f;
    public float l = 1.0f;
    public boolean n = true;
    public boolean o = true;

    public b() {
        eh ehVarA = gh.a();
        this.r = ehVarA;
        this.s = ehVarA;
        this.u = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: androidx.compose.ui.graphics.vector.PathComponent$pathMeasure$2
            @Override // defpackage.bp2
            public final Object invoke() {
                return new fh(new PathMeasure());
            }
        });
    }

    @Override // defpackage.u29
    public final void a(hv1 hv1Var) {
        hv1 hv1Var2;
        p88 p88Var;
        if (this.n) {
            xq2.K(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        ch0 ch0Var = this.b;
        if (ch0Var != null) {
            hv1Var2 = hv1Var;
            o40.j(hv1Var2, this.s, ch0Var, this.c, null, 56);
        } else {
            hv1Var2 = hv1Var;
        }
        ch0 ch0Var2 = this.g;
        if (ch0Var2 != null) {
            p88 p88Var2 = this.q;
            if (this.o || p88Var2 == null) {
                p88 p88Var3 = new p88(this.f, this.j, this.h, this.i, 16);
                this.q = p88Var3;
                this.o = false;
                p88Var = p88Var3;
            } else {
                p88Var = p88Var2;
            }
            o40.j(hv1Var2, this.s, ch0Var2, this.e, p88Var, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [c24, java.lang.Object] */
    public final void e() {
        float f = this.k;
        eh ehVar = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = ehVar;
            return;
        }
        if (js3.i(this.s, ehVar)) {
            this.s = gh.a();
        } else {
            Path.FillType fillType = this.s.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.s.a.rewind();
            Path path = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r0 = this.u;
        ((fh) r0.getValue()).a.setPath(ehVar != null ? ehVar.a : null, false);
        float length = ((fh) r0.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((fh) r0.getValue()).a(f4, f5, this.s);
            return;
        }
        eh ehVarA = this.t;
        if (ehVarA == null) {
            ehVarA = gh.a();
            this.t = ehVarA;
        }
        ehVarA.c();
        ((fh) r0.getValue()).a(f4, length, ehVarA);
        bl4.h(this.s, ehVarA);
        ehVarA.c();
        ((fh) r0.getValue()).a(0.0f, f5, ehVarA);
        bl4.h(this.s, ehVarA);
    }

    public final String toString() {
        return this.r.toString();
    }
}
