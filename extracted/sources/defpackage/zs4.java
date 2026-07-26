package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zs4 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public Object k;
    public Object l;

    public zs4() {
        this.b = new us7[4];
        this.c = new Matrix[4];
        this.d = new Matrix[4];
        this.e = new PointF();
        this.f = new Path();
        this.g = new Path();
        this.h = new us7();
        this.i = new float[2];
        this.j = new float[2];
        this.k = new Path();
        this.l = new Path();
        this.a = true;
        for (int i = 0; i < 4; i++) {
            ((us7[]) this.b)[i] = new us7();
            ((Matrix[]) this.c)[i] = new Matrix();
            ((Matrix[]) this.d)[i] = new Matrix();
        }
    }

    public bm8 a(int i, ArrayList arrayList, nv7 nv7Var) {
        ArrayList arrayList2 = (ArrayList) this.c;
        if (!arrayList.isEmpty()) {
            this.k = nv7Var;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                ys4 ys4Var = (ys4) arrayList.get(i2 - i);
                if (i2 > 0) {
                    ys4 ys4Var2 = (ys4) arrayList2.get(i2 - 1);
                    ys4Var.d = ys4Var2.a.o.e.o() + ys4Var2.d;
                    ys4Var.e = false;
                    ys4Var.c.clear();
                } else {
                    ys4Var.d = 0;
                    ys4Var.e = false;
                    ys4Var.c.clear();
                }
                int iO = ys4Var.a.o.e.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((ys4) arrayList2.get(i3)).d += iO;
                }
                arrayList2.add(i2, ys4Var);
                ((HashMap) this.e).put(ys4Var.b, ys4Var);
                if (this.a) {
                    g(ys4Var);
                    if (((IdentityHashMap) this.d).isEmpty()) {
                        ((HashSet) this.h).add(ys4Var);
                    } else {
                        xs4 xs4Var = (xs4) ((HashMap) this.f).get(ys4Var);
                        if (xs4Var != null) {
                            xs4Var.a.c(xs4Var.b);
                        }
                    }
                }
            }
        }
        return c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(as7 as7Var, float[] fArr, float f, RectF rectF, ql4 ql4Var, Path path) {
        char c;
        int i;
        Path path2;
        ql4 ql4Var2;
        char c2;
        r61 ms0Var;
        int i2;
        ql4 ql4Var3 = ql4Var;
        Path path3 = path;
        Matrix[] matrixArr = (Matrix[]) this.d;
        float[] fArr2 = (float[]) this.i;
        us7[] us7VarArr = (us7[]) this.b;
        Matrix[] matrixArr2 = (Matrix[]) this.c;
        path3.rewind();
        Path path4 = (Path) this.f;
        path4.rewind();
        Path path5 = (Path) this.g;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            c = 0;
            int i4 = 1;
            if (i3 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.e;
            if (fArr == null) {
                ms0Var = i3 != 1 ? i3 != 2 ? i3 != 3 ? as7Var.f : as7Var.e : as7Var.h : as7Var.g;
            } else {
                ms0Var = new ms0(fArr[i3]);
                i4 = 1;
            }
            at2 at2Var = i3 != i4 ? i3 != 2 ? i3 != 3 ? as7Var.b : as7Var.a : as7Var.d : as7Var.c;
            Matrix[] matrixArr3 = matrixArr;
            us7 us7Var = us7VarArr[i3];
            at2Var.getClass();
            at2Var.b0(us7Var, f, ms0Var.a(rectF));
            int i5 = i3 + 1;
            float f2 = (i5 % 4) * 90;
            matrixArr2[i3].reset();
            if (i3 == 1) {
                i2 = i5;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i5;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i5;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i5;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f2);
            us7 us7Var2 = us7VarArr[i3];
            fArr2[0] = us7Var2.c;
            fArr2[1] = us7Var2.d;
            matrixArr2[i3].mapPoints(fArr2);
            matrixArr3[i3].reset();
            matrixArr3[i3].setTranslate(fArr2[0], fArr2[1]);
            matrixArr3[i3].preRotate(f2);
            i3 = i2;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        char c3 = 1;
        int i6 = 0;
        for (i = 4; i6 < i; i = 4) {
            us7 us7Var3 = us7VarArr[i6];
            fArr2[c] = us7Var3.a;
            fArr2[c3] = us7Var3.b;
            matrixArr2[i6].mapPoints(fArr2);
            if (i6 == 0) {
                path3.moveTo(fArr2[c], fArr2[c3]);
            } else {
                path3.lineTo(fArr2[c], fArr2[c3]);
            }
            us7VarArr[i6].c(matrixArr2[i6], path3);
            if (ql4Var3 != null) {
                us7 us7Var4 = us7VarArr[i6];
                Matrix matrix = matrixArr2[i6];
                fk4 fk4Var = (fk4) ql4Var3.b;
                BitSet bitSet = fk4Var.e;
                us7Var4.getClass();
                bitSet.set(i6, (boolean) c);
                ts7[] ts7VarArr = fk4Var.c;
                us7Var4.b(us7Var4.f);
                ts7VarArr[i6] = new ns7(new ArrayList(us7Var4.h), new Matrix(matrix));
            }
            Path path6 = (Path) this.k;
            us7 us7Var5 = (us7) this.h;
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            us7 us7Var6 = us7VarArr[i6];
            us7[] us7VarArr2 = us7VarArr;
            fArr2[0] = us7Var6.c;
            fArr2[1] = us7Var6.d;
            matrixArr2[i6].mapPoints(fArr2);
            float[] fArr3 = (float[]) this.j;
            us7 us7Var7 = us7VarArr2[i8];
            Matrix[] matrixArr5 = matrixArr2;
            fArr3[0] = us7Var7.a;
            fArr3[1] = us7Var7.b;
            matrixArr5[i8].mapPoints(fArr3);
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, 0.0f);
            us7 us7Var8 = us7VarArr2[i6];
            fArr2[0] = us7Var8.c;
            fArr2[1] = us7Var8.d;
            matrixArr5[i6].mapPoints(fArr2);
            float fAbs = (i6 == 1 || i6 == 3) ? Math.abs(rectF.centerX() - fArr2[0]) : Math.abs(rectF.centerY() - fArr2[1]);
            us7Var5.e(0.0f, 0.0f, 270.0f, 0.0f);
            fz1 fz1Var = i6 != 1 ? i6 != 2 ? i6 != 3 ? as7Var.j : as7Var.i : as7Var.l : as7Var.k;
            fz1Var.o(fMax, fAbs, f, us7Var5);
            path6.reset();
            us7Var5.c(matrixArr4[i6], path6);
            if (this.a && (fz1Var.m() || f(path6, i6) || f(path6, i8))) {
                path6.op(path6, path5, Path.Op.DIFFERENCE);
                fArr2[0] = us7Var5.a;
                c3 = 1;
                fArr2[1] = us7Var5.b;
                matrixArr4[i6].mapPoints(fArr2);
                path4.moveTo(fArr2[0], fArr2[1]);
                us7Var5.c(matrixArr4[i6], path4);
                path2 = path;
            } else {
                c3 = 1;
                path2 = path;
                us7Var5.c(matrixArr4[i6], path2);
            }
            if (ql4Var != null) {
                Matrix matrix2 = matrixArr4[i6];
                ql4Var2 = ql4Var;
                fk4 fk4Var2 = (fk4) ql4Var2.b;
                c2 = 0;
                fk4Var2.e.set(i6 + 4, false);
                ts7[] ts7VarArr2 = fk4Var2.d;
                us7Var5.b(us7Var5.f);
                ts7VarArr2[i6] = new ns7(new ArrayList(us7Var5.h), new Matrix(matrix2));
            } else {
                ql4Var2 = ql4Var;
                c2 = 0;
            }
            path3 = path2;
            ql4Var3 = ql4Var2;
            i6 = i7;
            c = c2;
            us7VarArr = us7VarArr2;
            matrixArr2 = matrixArr5;
        }
        Path path7 = path3;
        path7.close();
        path4.close();
        if (path4.isEmpty()) {
            return;
        }
        path7.op(path4, Path.Op.UNION);
    }

    public bm8 c() {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            return bm8.a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            ys4 ys4Var = (ys4) arrayList.get(i);
            ys4Var.d = iO;
            iO += ys4Var.a.o.e.o();
        }
        return new sg6(arrayList, (nv7) this.k);
    }

    public void d() {
        Iterator it = ((HashSet) this.h).iterator();
        while (it.hasNext()) {
            ys4 ys4Var = (ys4) it.next();
            if (ys4Var.c.isEmpty()) {
                xs4 xs4Var = (xs4) ((HashMap) this.f).get(ys4Var);
                if (xs4Var != null) {
                    xs4Var.a.c(xs4Var.b);
                }
                it.remove();
            }
        }
    }

    public void e(ys4 ys4Var) {
        if (ys4Var.e && ys4Var.c.isEmpty()) {
            xs4 xs4Var = (xs4) ((HashMap) this.f).remove(ys4Var);
            xs4Var.getClass();
            ws4 ws4Var = xs4Var.c;
            x70 x70Var = xs4Var.a;
            x70Var.o(xs4Var.b);
            x70Var.r(ws4Var);
            x70Var.q(ws4Var);
            ((HashSet) this.h).remove(ys4Var);
        }
    }

    public boolean f(Path path, int i) {
        Path path2 = (Path) this.l;
        path2.reset();
        ((us7[]) this.b)[i].c(((Matrix[]) this.c)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ls4, rs4] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void g(ys4 ys4Var) {
        ej4 ej4Var = ys4Var.a;
        ?? r1 = new ls4() { // from class: rs4
            @Override // defpackage.ls4
            public final void a(x70 x70Var, bm8 bm8Var) {
                wd8 wd8Var = ((n62) this.a.g).h;
                wd8Var.d(2);
                wd8Var.e(22);
            }
        };
        ws4 ws4Var = new ws4(this, ys4Var);
        ((HashMap) this.f).put(ys4Var, new xs4(ej4Var, r1, ws4Var));
        Handler handler = new Handler(j29.x(), null);
        ej4Var.getClass();
        pg pgVar = ej4Var.c;
        pgVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) pgVar.d;
        os4 os4Var = new os4();
        os4Var.a = handler;
        os4Var.b = ws4Var;
        copyOnWriteArrayList.add(os4Var);
        Handler handler2 = new Handler(j29.x(), null);
        sw1 sw1Var = ej4Var.d;
        sw1Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = sw1Var.c;
        rw1 rw1Var = new rw1();
        rw1Var.a = handler2;
        rw1Var.b = ws4Var;
        copyOnWriteArrayList2.add(rw1Var);
        ej4Var.k(r1, (fq8) this.l, (ee6) this.b);
    }

    public void h(zp4 zp4Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.d;
        ys4 ys4Var = (ys4) identityHashMap.remove(zp4Var);
        ys4Var.getClass();
        ys4Var.a.n(zp4Var);
        ys4Var.c.remove(((bj4) zp4Var).a);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(ys4Var);
    }

    public void i(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.c;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ys4 ys4Var = (ys4) arrayList.remove(i3);
            ((HashMap) this.e).remove(ys4Var.b);
            int i4 = -ys4Var.a.o.e.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((ys4) arrayList.get(i5)).d += i4;
            }
            ys4Var.e = true;
            if (this.a) {
                e(ys4Var);
            }
        }
    }

    public zs4(n62 n62Var, hd1 hd1Var, wd8 wd8Var, ee6 ee6Var) {
        this.b = ee6Var;
        this.g = n62Var;
        this.k = new nv7();
        this.d = new IdentityHashMap();
        this.e = new HashMap();
        this.c = new ArrayList();
        this.i = hd1Var;
        this.j = wd8Var;
        this.f = new HashMap();
        this.h = new HashSet();
    }
}
