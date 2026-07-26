package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cs7 implements v26, o70, ly3 {
    public final String b;
    public final boolean c;
    public final b d;
    public final ls7 e;
    public boolean f;
    public final Path a = new Path();
    public final r01 g = new r01();

    public cs7(b bVar, t70 t70Var, vs7 vs7Var) {
        this.b = vs7Var.a;
        this.c = vs7Var.d;
        this.d = bVar;
        ls7 ls7Var = new ls7((List) vs7Var.c.b);
        this.e = ls7Var;
        t70Var.e(ls7Var);
        ls7Var.a(this);
    }

    @Override // defpackage.o70
    public final void a() {
        this.f = false;
        this.d.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    @Override // defpackage.r31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            r1 = r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r0 >= r2) goto L41
            java.lang.Object r1 = r1.get(r0)
            r31 r1 = (defpackage.r31) r1
            boolean r2 = r1 instanceof defpackage.ws8
            if (r2 == 0) goto L29
            r2 = r1
            ws8 r2 = (defpackage.ws8) r2
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r3 = r2.c
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r4 = com.airbnb.lottie.model.content.ShapeTrimPath$Type.a
            if (r3 != r4) goto L29
            r01 r1 = r5.g
            java.util.ArrayList r1 = r1.a
            r1.add(r2)
            r2.c(r5)
            goto L3e
        L29:
            boolean r2 = r1 instanceof defpackage.pa7
            if (r2 == 0) goto L3e
            if (r7 != 0) goto L34
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L34:
            pa7 r1 = (defpackage.pa7) r1
            s70 r2 = r1.b
            r2.a(r5)
            r7.add(r1)
        L3e:
            int r0 = r0 + 1
            goto L2
        L41:
            ls7 r6 = r5.e
            r6.m = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs7.b(java.util.List, java.util.List):void");
    }

    @Override // defpackage.ky3
    public final void c(jy3 jy3Var, int i, ArrayList arrayList, jy3 jy3Var2) {
        aw4.g(jy3Var, i, arrayList, jy3Var2, this);
    }

    @Override // defpackage.ky3
    public final void f(hh2 hh2Var, Object obj) {
        if (obj == ag4.N) {
            this.e.j(hh2Var);
        }
    }

    @Override // defpackage.r31
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.v26
    public final Path m() {
        boolean z = this.f;
        ls7 ls7Var = this.e;
        Path path = this.a;
        if (z && ls7Var.e == null) {
            return path;
        }
        path.reset();
        if (this.c) {
            this.f = true;
            return path;
        }
        Path path2 = (Path) ls7Var.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.g.c(path);
        this.f = true;
        return path;
    }
}
