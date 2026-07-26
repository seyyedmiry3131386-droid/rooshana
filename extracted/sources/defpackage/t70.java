package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.airbnb.lottie.b;
import com.airbnb.lottie.model.layer.Layer$MatteType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class t70 implements lw1, o70, ky3 {
    public float A;
    public BlurMaskFilter B;
    public uz3 C;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final uz3 d = new uz3(1, 0);
    public final uz3 e;
    public final uz3 f;
    public final uz3 g;
    public final uz3 h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final b o;
    public final q04 p;
    public final pa2 q;
    public final he2 r;
    public t70 s;
    public t70 t;
    public List u;
    public final ArrayList v;
    public final kq8 w;
    public boolean x;
    public boolean y;
    public uz3 z;

    public t70(b bVar, q04 q04Var) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new uz3(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new uz3(mode2);
        uz3 uz3Var = new uz3(1, 0);
        this.g = uz3Var;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        uz3 uz3Var2 = new uz3();
        uz3Var2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = uz3Var2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = 0.0f;
        this.o = bVar;
        this.p = q04Var;
        List list = q04Var.h;
        if (q04Var.u == Layer$MatteType.b) {
            uz3Var.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            uz3Var.setXfermode(new PorterDuffXfermode(mode));
        }
        hj hjVar = q04Var.i;
        hjVar.getClass();
        kq8 kq8Var = new kq8(hjVar);
        this.w = kq8Var;
        kq8Var.b(this);
        if (list != null && !list.isEmpty()) {
            pa2 pa2Var = new pa2(list);
            this.q = pa2Var;
            Iterator it = ((ArrayList) pa2Var.c).iterator();
            while (it.hasNext()) {
                ((s70) it.next()).a(this);
            }
            for (s70 s70Var : (ArrayList) this.q.b) {
                e(s70Var);
                s70Var.a(this);
            }
        }
        q04 q04Var2 = this.p;
        if (q04Var2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        he2 he2Var = new he2(q04Var2.t);
        this.r = he2Var;
        he2Var.b = true;
        he2Var.a(new jq8(3, this));
        boolean z = ((Float) this.r.e()).floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        e(this.r);
    }

    @Override // defpackage.o70
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // defpackage.ky3
    public final void c(jy3 jy3Var, int i, ArrayList arrayList, jy3 jy3Var2) {
        t70 t70Var = this.s;
        q04 q04Var = this.p;
        if (t70Var != null) {
            String str = t70Var.p.c;
            jy3 jy3Var3 = new jy3(jy3Var2);
            jy3Var3.a.add(str);
            if (jy3Var.a(i, this.s.p.c)) {
                t70 t70Var2 = this.s;
                jy3 jy3Var4 = new jy3(jy3Var3);
                jy3Var4.b = t70Var2;
                arrayList.add(jy3Var4);
            }
            if (jy3Var.c(i, this.s.p.c) && jy3Var.d(i, q04Var.c)) {
                this.s.p(jy3Var, jy3Var.b(i, this.s.p.c) + i, arrayList, jy3Var3);
            }
        }
        String str2 = q04Var.c;
        String str3 = q04Var.c;
        if (jy3Var.c(i, str2)) {
            if (!"__container".equals(str3)) {
                jy3 jy3Var5 = new jy3(jy3Var2);
                jy3Var5.a.add(str3);
                if (jy3Var.a(i, str3)) {
                    jy3 jy3Var6 = new jy3(jy3Var5);
                    jy3Var6.b = this;
                    arrayList.add(jy3Var6);
                }
                jy3Var2 = jy3Var5;
            }
            if (jy3Var.d(i, str3)) {
                p(jy3Var, jy3Var.b(i, str3) + i, arrayList, jy3Var2);
            }
        }
    }

    @Override // defpackage.lw1
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        h();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((t70) this.u.get(size)).w.e());
                }
            } else {
                t70 t70Var = this.t;
                if (t70Var != null) {
                    matrix2.preConcat(t70Var.w.e());
                }
            }
        }
        matrix2.preConcat(this.w.e());
    }

    public final void e(s70 s70Var) {
        if (s70Var == null) {
            return;
        }
        this.v.add(s70Var);
    }

    public void f(hh2 hh2Var, Object obj) {
        this.w.c(hh2Var, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    @Override // defpackage.lw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.graphics.Canvas r22, android.graphics.Matrix r23, int r24, defpackage.ex1 r25) {
        /*
            Method dump skipped, instruction units count: 1005
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t70.g(android.graphics.Canvas, android.graphics.Matrix, int, ex1):void");
    }

    public final void h() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (t70 t70Var = this.t; t70Var != null; t70Var = t70Var.t) {
            this.u.add(t70Var);
        }
    }

    public final void i(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i, ex1 ex1Var);

    public ca7 k() {
        return this.p.w;
    }

    public final boolean l() {
        pa2 pa2Var = this.q;
        return (pa2Var == null || ((ArrayList) pa2Var.c).isEmpty()) ? false : true;
    }

    public final void n() {
        x46 x46Var = this.o.a.a;
        String str = this.p.c;
        HashMap map = x46Var.c;
        if (x46Var.a) {
            xk4 xk4Var = (xk4) map.get(str);
            if (xk4Var == null) {
                xk4Var = new xk4();
                map.put(str, xk4Var);
            }
            int i = xk4Var.a + 1;
            xk4Var.a = i;
            if (i == Integer.MAX_VALUE) {
                xk4Var.a = i / 2;
            }
            if (str.equals("__container")) {
                zv zvVar = x46Var.b;
                zvVar.getClass();
                sv svVar = new sv(zvVar);
                if (svVar.hasNext()) {
                    svVar.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final void o(s70 s70Var) {
        this.v.remove(s70Var);
    }

    public void q(boolean z) {
        if (z && this.z == null) {
            this.z = new uz3();
        }
        this.y = z;
    }

    public void r(float f) {
        kq8 kq8Var = this.w;
        s70 s70Var = kq8Var.p;
        if (s70Var != null) {
            s70Var.i(f);
        }
        s70 s70Var2 = kq8Var.v;
        if (s70Var2 != null) {
            s70Var2.i(f);
        }
        s70 s70Var3 = kq8Var.w;
        if (s70Var3 != null) {
            s70Var3.i(f);
        }
        s70 s70Var4 = kq8Var.l;
        if (s70Var4 != null) {
            s70Var4.i(f);
        }
        s70 s70Var5 = kq8Var.m;
        if (s70Var5 != null) {
            s70Var5.i(f);
        }
        s70 s70Var6 = kq8Var.n;
        if (s70Var6 != null) {
            s70Var6.i(f);
        }
        s70 s70Var7 = kq8Var.o;
        if (s70Var7 != null) {
            s70Var7.i(f);
        }
        he2 he2Var = kq8Var.q;
        if (he2Var != null) {
            he2Var.i(f);
        }
        he2 he2Var2 = kq8Var.r;
        if (he2Var2 != null) {
            he2Var2.i(f);
        }
        he2 he2Var3 = kq8Var.s;
        if (he2Var3 != null) {
            he2Var3.i(f);
        }
        he2 he2Var4 = kq8Var.t;
        if (he2Var4 != null) {
            he2Var4.i(f);
        }
        he2 he2Var5 = kq8Var.u;
        if (he2Var5 != null) {
            he2Var5.i(f);
        }
        int i = 0;
        pa2 pa2Var = this.q;
        if (pa2Var != null) {
            ArrayList arrayList = (ArrayList) pa2Var.c;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((s70) arrayList.get(i2)).i(f);
            }
        }
        he2 he2Var6 = this.r;
        if (he2Var6 != null) {
            he2Var6.i(f);
        }
        t70 t70Var = this.s;
        if (t70Var != null) {
            t70Var.r(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((s70) arrayList2.get(i)).i(f);
            i++;
        }
    }

    @Override // defpackage.r31
    public final void b(List list, List list2) {
    }

    public void p(jy3 jy3Var, int i, ArrayList arrayList, jy3 jy3Var2) {
    }
}
