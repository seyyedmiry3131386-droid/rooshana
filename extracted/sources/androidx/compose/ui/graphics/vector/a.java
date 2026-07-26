package androidx.compose.ui.graphics.vector;

import defpackage.ch0;
import defpackage.dp2;
import defpackage.eh;
import defpackage.gh;
import defpackage.hv1;
import defpackage.k18;
import defpackage.nm5;
import defpackage.o40;
import defpackage.pk4;
import defpackage.t39;
import defpackage.tx8;
import defpackage.u29;
import defpackage.wv8;
import defpackage.xq2;
import defpackage.zu0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class a extends u29 {
    public float[] b;
    public eh h;
    public dp2 i;
    public float l;
    public float m;
    public float n;
    public float q;
    public float r;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = zu0.h;
    public List f = t39.a;
    public boolean g = true;
    public final dp2 j = new dp2() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
        {
            super(1);
        }

        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            u29 u29Var = (u29) obj;
            a aVar = this.g;
            aVar.g(u29Var);
            dp2 dp2Var = aVar.i;
            if (dp2Var != null) {
                dp2Var.invoke(u29Var);
            }
            return tx8.a;
        }
    };
    public String k = "";
    public float o = 1.0f;
    public float p = 1.0f;
    public boolean s = true;

    @Override // defpackage.u29
    public final void a(hv1 hv1Var) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = pk4.a();
                this.b = fArrA;
            } else {
                pk4.d(fArrA);
            }
            pk4.f(fArrA, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrA.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrA[0];
                float f3 = fArrA[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrA[1];
                float f8 = fArrA[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrA[2];
                float f12 = fArrA[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrA[3];
                float f16 = fArrA[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrA[0] = f4;
                fArrA[1] = f9;
                fArrA[2] = f13;
                fArrA[3] = f17;
                fArrA[4] = f6;
                fArrA[5] = f10;
                fArrA[6] = f14;
                fArrA[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.o;
            float f19 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f18;
                fArrA[1] = fArrA[1] * f18;
                fArrA[2] = fArrA[2] * f18;
                fArrA[3] = fArrA[3] * f18;
                fArrA[4] = fArrA[4] * f19;
                fArrA[5] = fArrA[5] * f19;
                fArrA[6] = fArrA[6] * f19;
                fArrA[7] = fArrA[7] * f19;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            pk4.f(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                eh ehVarA = this.h;
                if (ehVarA == null) {
                    ehVarA = gh.a();
                    this.h = ehVarA;
                }
                xq2.K(this.f, ehVarA);
            }
            this.g = false;
        }
        wv8 wv8VarX = hv1Var.X();
        long jA = wv8VarX.A();
        wv8VarX.v().e();
        try {
            wv8 wv8Var = (wv8) ((nm5) wv8VarX.b).b;
            float[] fArr = this.b;
            if (fArr != null) {
                wv8Var.v().j(fArr);
            }
            eh ehVar = this.h;
            if (!this.f.isEmpty() && ehVar != null) {
                wv8Var.v().i(ehVar);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((u29) arrayList.get(i)).a(hv1Var);
            }
        } finally {
            o40.F(wv8VarX, jA);
        }
    }

    @Override // defpackage.u29
    public final dp2 b() {
        return this.i;
    }

    @Override // defpackage.u29
    public final void d(dp2 dp2Var) {
        this.i = dp2Var;
    }

    public final void e(int i, u29 u29Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, u29Var);
        } else {
            arrayList.add(u29Var);
        }
        g(u29Var);
        u29Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            EmptyList emptyList = t39.a;
            if (zu0.h(j2) == zu0.h(j) && zu0.g(j2) == zu0.g(j) && zu0.e(j2) == zu0.e(j)) {
                return;
            }
            this.d = false;
            this.e = zu0.h;
        }
    }

    public final void g(u29 u29Var) {
        if (!(u29Var instanceof b)) {
            if (u29Var instanceof a) {
                a aVar = (a) u29Var;
                if (aVar.d && this.d) {
                    f(aVar.e);
                    return;
                } else {
                    this.d = false;
                    this.e = zu0.h;
                    return;
                }
            }
            return;
        }
        b bVar = (b) u29Var;
        ch0 ch0Var = bVar.b;
        if (this.d && ch0Var != null) {
            if (ch0Var instanceof k18) {
                f(((k18) ch0Var).a);
            } else {
                this.d = false;
                this.e = zu0.h;
            }
        }
        ch0 ch0Var2 = bVar.g;
        if (this.d && ch0Var2 != null) {
            if (ch0Var2 instanceof k18) {
                f(((k18) ch0Var2).a);
            } else {
                this.d = false;
                this.e = zu0.h;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            u29 u29Var = (u29) arrayList.get(i);
            sb.append("\t");
            sb.append(u29Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
