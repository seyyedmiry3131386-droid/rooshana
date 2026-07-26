package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ec2 implements lw1, o70, ly3 {
    public final Path a;
    public final uz3 b;
    public final t70 c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final dv0 g;
    public final dv0 h;
    public x29 i;
    public final b j;
    public s70 k;
    public float l;

    public ec2(b bVar, t70 t70Var, hs7 hs7Var) {
        Path path = new Path();
        this.a = path;
        this.b = new uz3(1, 0);
        this.f = new ArrayList();
        this.c = t70Var;
        String str = hs7Var.c;
        bj bjVar = hs7Var.e;
        bj bjVar2 = hs7Var.d;
        this.d = str;
        this.e = hs7Var.f;
        this.j = bVar;
        if (t70Var.k() != null) {
            he2 he2VarA = ((cj) t70Var.k().b).a();
            this.k = he2VarA;
            he2VarA.a(this);
            t70Var.e(this.k);
        }
        if (bjVar2 == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(hs7Var.b);
        s70 s70VarA = bjVar2.a();
        this.g = (dv0) s70VarA;
        s70VarA.a(this);
        t70Var.e(s70VarA);
        s70 s70VarA2 = bjVar.a();
        this.h = (dv0) s70VarA2;
        s70VarA2.a(this);
        t70Var.e(s70VarA2);
    }

    @Override // defpackage.o70
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.r31
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            r31 r31Var = (r31) list2.get(i);
            if (r31Var instanceof v26) {
                this.f.add((v26) r31Var);
            }
        }
    }

    @Override // defpackage.ky3
    public final void c(jy3 jy3Var, int i, ArrayList arrayList, jy3 jy3Var2) {
        aw4.g(jy3Var, i, arrayList, jy3Var2, this);
    }

    @Override // defpackage.lw1
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((v26) arrayList.get(i)).m(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.ky3
    public final void f(hh2 hh2Var, Object obj) {
        PointF pointF = ag4.a;
        if (obj == 1) {
            this.g.j(hh2Var);
            return;
        }
        if (obj == 4) {
            this.h.j(hh2Var);
            return;
        }
        ColorFilter colorFilter = ag4.I;
        t70 t70Var = this.c;
        if (obj == colorFilter) {
            x29 x29Var = this.i;
            if (x29Var != null) {
                t70Var.o(x29Var);
            }
            x29 x29Var2 = new x29(hh2Var, null);
            this.i = x29Var2;
            x29Var2.a(this);
            t70Var.e(this.i);
            return;
        }
        if (obj == ag4.e) {
            s70 s70Var = this.k;
            if (s70Var != null) {
                s70Var.j(hh2Var);
                return;
            }
            x29 x29Var3 = new x29(hh2Var, null);
            this.k = x29Var3;
            x29Var3.a(this);
            t70Var.e(this.k);
        }
    }

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
    public final void g(Canvas canvas, Matrix matrix, int i, ex1 ex1Var) {
        MaskFilter maskFilter;
        if (this.e) {
            return;
        }
        dv0 dv0Var = this.g;
        float fIntValue = ((Integer) this.h.e()).intValue() / 100.0f;
        int iC = (aw4.c((int) (i * fIntValue)) << 24) | (dv0Var.l(dv0Var.c.c(), dv0Var.c()) & 16777215);
        uz3 uz3Var = this.b;
        uz3Var.setColor(iC);
        x29 x29Var = this.i;
        if (x29Var != null) {
            uz3Var.setColorFilter((ColorFilter) x29Var.e());
        }
        s70 s70Var = this.k;
        if (s70Var != null) {
            float fFloatValue = ((Float) s70Var.e()).floatValue();
            if (fFloatValue == 0.0f) {
                uz3Var.setMaskFilter(null);
            } else if (fFloatValue != this.l) {
                t70 t70Var = this.c;
                if (t70Var.A == fFloatValue) {
                    maskFilter = t70Var.B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    t70Var.B = blurMaskFilter;
                    t70Var.A = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                uz3Var.setMaskFilter(maskFilter);
            }
            this.l = fFloatValue;
        }
        if (ex1Var != null) {
            ex1Var.a((int) (fIntValue * 255.0f), uz3Var);
        } else {
            uz3Var.clearShadowLayer();
        }
        Path path = this.a;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, uz3Var);
                return;
            } else {
                path.addPath(((v26) arrayList.get(i2)).m(), matrix);
                i2++;
            }
        }
    }

    @Override // defpackage.r31
    public final String getName() {
        return this.d;
    }
}
