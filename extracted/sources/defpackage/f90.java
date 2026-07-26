package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class f90 implements o70, ly3, lw1 {
    public final b e;
    public final t70 f;
    public final float[] h;
    public final uz3 i;
    public final he2 j;
    public final dv0 k;
    public final ArrayList l;
    public final he2 m;
    public x29 n;
    public s70 o;
    public float p;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public f90(b bVar, t70 t70Var, Paint.Cap cap, Paint.Join join, float f, bj bjVar, cj cjVar, ArrayList arrayList, cj cjVar2) {
        uz3 uz3Var = new uz3(1, 0);
        this.i = uz3Var;
        this.p = 0.0f;
        this.e = bVar;
        this.f = t70Var;
        uz3Var.setStyle(Paint.Style.STROKE);
        uz3Var.setStrokeCap(cap);
        uz3Var.setStrokeJoin(join);
        uz3Var.setStrokeMiter(f);
        this.k = (dv0) bjVar.a();
        this.j = cjVar.a();
        if (cjVar2 == null) {
            this.m = null;
        } else {
            this.m = cjVar2.a();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((cj) arrayList.get(i)).a());
        }
        t70Var.e(this.k);
        t70Var.e(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            t70Var.e((s70) this.l.get(i2));
        }
        he2 he2Var = this.m;
        if (he2Var != null) {
            t70Var.e(he2Var);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((s70) this.l.get(i3)).a(this);
        }
        he2 he2Var2 = this.m;
        if (he2Var2 != null) {
            he2Var2.a(this);
        }
        if (t70Var.k() != null) {
            he2 he2VarA = ((cj) t70Var.k().b).a();
            this.o = he2VarA;
            he2VarA.a(this);
            t70Var.e(this.o);
        }
    }

    @Override // defpackage.o70
    public final void a() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    @Override // defpackage.r31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List r8, java.util.List r9) {
        /*
            r7 = this;
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        La:
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r3 = com.airbnb.lottie.model.content.ShapeTrimPath$Type.b
            if (r0 < 0) goto L22
            java.lang.Object r4 = r8.get(r0)
            r31 r4 = (defpackage.r31) r4
            boolean r5 = r4 instanceof defpackage.ws8
            if (r5 == 0) goto L1f
            ws8 r4 = (defpackage.ws8) r4
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r5 = r4.c
            if (r5 != r3) goto L1f
            r2 = r4
        L1f:
            int r0 = r0 + (-1)
            goto La
        L22:
            if (r2 == 0) goto L27
            r2.c(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2d:
            java.util.ArrayList r0 = r7.g
            if (r8 < 0) goto L66
            java.lang.Object r4 = r9.get(r8)
            r31 r4 = (defpackage.r31) r4
            boolean r5 = r4 instanceof defpackage.ws8
            if (r5 == 0) goto L51
            r5 = r4
            ws8 r5 = (defpackage.ws8) r5
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r6 = r5.c
            if (r6 != r3) goto L51
            if (r1 == 0) goto L47
            r0.add(r1)
        L47:
            e90 r0 = new e90
            r0.<init>(r5)
            r5.c(r7)
            r1 = r0
            goto L63
        L51:
            boolean r0 = r4 instanceof defpackage.v26
            if (r0 == 0) goto L63
            if (r1 != 0) goto L5c
            e90 r1 = new e90
            r1.<init>(r2)
        L5c:
            java.util.ArrayList r0 = r1.a
            v26 r4 = (defpackage.v26) r4
            r0.add(r4)
        L63:
            int r8 = r8 + (-1)
            goto L2d
        L66:
            if (r1 == 0) goto L6b
            r0.add(r1)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f90.b(java.util.List, java.util.List):void");
    }

    @Override // defpackage.ky3
    public final void c(jy3 jy3Var, int i, ArrayList arrayList, jy3 jy3Var2) {
        aw4.g(jy3Var, i, arrayList, jy3Var2, this);
    }

    @Override // defpackage.lw1
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fL = this.j.l() / 2.0f;
                rectF2.set(rectF2.left - fL, rectF2.top - fL, rectF2.right + fL, rectF2.bottom + fL);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            e90 e90Var = (e90) arrayList.get(i);
            for (int i2 = 0; i2 < e90Var.a.size(); i2++) {
                path.addPath(((v26) e90Var.a.get(i2)).m(), matrix);
            }
            i++;
        }
    }

    @Override // defpackage.ky3
    public void f(hh2 hh2Var, Object obj) {
        PointF pointF = ag4.a;
        if (obj == 4) {
            this.k.j(hh2Var);
            return;
        }
        if (obj == ag4.q) {
            this.j.j(hh2Var);
            return;
        }
        ColorFilter colorFilter = ag4.I;
        t70 t70Var = this.f;
        if (obj == colorFilter) {
            x29 x29Var = this.n;
            if (x29Var != null) {
                t70Var.o(x29Var);
            }
            x29 x29Var2 = new x29(hh2Var, null);
            this.n = x29Var2;
            x29Var2.a(this);
            t70Var.e(this.n);
            return;
        }
        if (obj == ag4.e) {
            s70 s70Var = this.o;
            if (s70Var != null) {
                s70Var.j(hh2Var);
                return;
            }
            x29 x29Var3 = new x29(hh2Var, null);
            this.o = x29Var3;
            x29Var3.a(this);
            t70Var.e(this.o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01f0  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.lw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23, defpackage.ex1 r24) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f90.g(android.graphics.Canvas, android.graphics.Matrix, int, ex1):void");
    }
}
