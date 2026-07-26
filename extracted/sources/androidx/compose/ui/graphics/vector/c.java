package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.g;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.ey7;
import defpackage.fv1;
import defpackage.hv1;
import defpackage.js3;
import defpackage.s08;
import defpackage.tc0;
import defpackage.tx8;
import defpackage.u29;
import defpackage.wb5;

/* JADX INFO: loaded from: classes.dex */
public final class c extends u29 {
    public final a b;
    public String c;
    public boolean d;
    public final fv1 e;
    public bp2 f;
    public final wb5 g;
    public tc0 h;
    public final wb5 i;
    public long j;
    public float k;
    public float l;
    public final dp2 m;

    public c(a aVar) {
        this.b = aVar;
        aVar.i = new dp2() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                c cVar = this.g;
                cVar.d = true;
                cVar.f.invoke();
                return tx8.a;
            }
        };
        this.c = "";
        this.d = true;
        this.e = new fv1();
        this.f = new bp2() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            @Override // defpackage.bp2
            public final /* bridge */ /* synthetic */ Object invoke() {
                return tx8.a;
            }
        };
        this.g = g.h(null);
        this.i = g.h(new ey7(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new VectorComponent$drawVectorBlock$1(this);
    }

    @Override // defpackage.u29
    public final void a(hv1 hv1Var) {
        e(hv1Var, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.hv1 r31, float r32, defpackage.tc0 r33) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.c.e(hv1, float, tc0):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        wb5 wb5Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((ey7) ((s08) wb5Var).getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((ey7) ((s08) wb5Var).getValue()).a & 4294967295L)));
        sb.append("\n");
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }
}
