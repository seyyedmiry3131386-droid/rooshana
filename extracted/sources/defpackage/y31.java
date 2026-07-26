package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y31 implements lw1, v26, o70, ky3 {
    public final dc0 a;
    public final RectF b;
    public final mr5 c;
    public final Matrix d;
    public final Path e;
    public final RectF f;
    public final String g;
    public final boolean h;
    public final ArrayList i;
    public final b j;
    public ArrayList k;
    public final kq8 l;

    public y31(b bVar, t70 t70Var, js7 js7Var, gf4 gf4Var) {
        hj hjVar;
        String str = js7Var.a;
        boolean z = js7Var.c;
        List list = js7Var.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            r31 r31VarA = ((l41) list.get(i2)).a(bVar, gf4Var, t70Var);
            if (r31VarA != null) {
                arrayList.add(r31VarA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                hjVar = null;
                break;
            }
            l41 l41Var = (l41) list.get(i);
            if (l41Var instanceof hj) {
                hjVar = (hj) l41Var;
                break;
            }
            i++;
        }
        this(bVar, t70Var, str, z, arrayList, hjVar);
    }

    @Override // defpackage.o70
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.r31
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            r31 r31Var = (r31) arrayList.get(size2);
            r31Var.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(r31Var);
        }
    }

    @Override // defpackage.ky3
    public final void c(jy3 jy3Var, int i, ArrayList arrayList, jy3 jy3Var2) {
        String str = this.g;
        if (!jy3Var.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            jy3 jy3Var3 = new jy3(jy3Var2);
            jy3Var3.a.add(str);
            if (jy3Var.a(i, str)) {
                jy3 jy3Var4 = new jy3(jy3Var3);
                jy3Var4.b = this;
                arrayList.add(jy3Var4);
            }
            jy3Var2 = jy3Var3;
        }
        if (!jy3Var.d(i, str)) {
            return;
        }
        int iB = jy3Var.b(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i2 >= arrayList2.size()) {
                return;
            }
            r31 r31Var = (r31) arrayList2.get(i2);
            if (r31Var instanceof ky3) {
                ((ky3) r31Var).c(jy3Var, iB, arrayList, jy3Var2);
            }
            i2++;
        }
    }

    @Override // defpackage.lw1
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        kq8 kq8Var = this.l;
        if (kq8Var != null) {
            matrix2.preConcat(kq8Var.e());
        }
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r31 r31Var = (r31) arrayList.get(size);
            if (r31Var instanceof lw1) {
                ((lw1) r31Var).d(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List e() {
        if (this.k == null) {
            this.k = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.i;
                if (i >= arrayList.size()) {
                    break;
                }
                r31 r31Var = (r31) arrayList.get(i);
                if (r31Var instanceof v26) {
                    this.k.add((v26) r31Var);
                }
                i++;
            }
        }
        return this.k;
    }

    @Override // defpackage.ky3
    public final void f(hh2 hh2Var, Object obj) {
        kq8 kq8Var = this.l;
        if (kq8Var != null) {
            kq8Var.c(hh2Var, obj);
        }
    }

    @Override // defpackage.lw1
    public final void g(Canvas canvas, Matrix matrix, int i, ex1 ex1Var) {
        if (this.h) {
            return;
        }
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        kq8 kq8Var = this.l;
        if (kq8Var != null) {
            matrix2.preConcat(kq8Var.e());
            i = (int) (((((kq8Var.p == null ? 100 : ((Integer) r1.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        b bVar = this.j;
        boolean z = (bVar.t && h() && i != 255) || (ex1Var != null && bVar.u && h());
        int i2 = z ? 255 : i;
        mr5 mr5Var = this.c;
        if (z) {
            RectF rectF = this.b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(rectF, matrix, true);
            dc0 dc0Var = this.a;
            dc0Var.b = i;
            if (ex1Var != null) {
                if (Color.alpha(ex1Var.d) > 0) {
                    dc0Var.c = ex1Var;
                } else {
                    dc0Var.c = null;
                }
                ex1Var = null;
            } else {
                dc0Var.c = null;
            }
            canvas = mr5Var.e(canvas, rectF, dc0Var);
        } else if (ex1Var != null) {
            ex1 ex1Var2 = new ex1(ex1Var);
            ex1Var2.b(i2);
            ex1Var = ex1Var2;
        }
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof lw1) {
                ((lw1) obj).g(canvas, matrix2, i2, ex1Var);
            }
        }
        if (z) {
            mr5Var.c();
        }
    }

    @Override // defpackage.r31
    public final String getName() {
        throw null;
    }

    public final boolean h() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof lw1) && (i2 = i2 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.v26
    public final Path m() {
        Matrix matrix = this.d;
        matrix.reset();
        kq8 kq8Var = this.l;
        if (kq8Var != null) {
            matrix.set(kq8Var.e());
        }
        Path path = this.e;
        path.reset();
        if (!this.h) {
            ArrayList arrayList = this.i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                r31 r31Var = (r31) arrayList.get(size);
                if (r31Var instanceof v26) {
                    path.addPath(((v26) r31Var).m(), matrix);
                }
            }
        }
        return path;
    }

    public y31(b bVar, t70 t70Var, String str, boolean z, ArrayList arrayList, hj hjVar) {
        this.a = new dc0(8, (byte) 0);
        this.b = new RectF();
        this.c = new mr5();
        this.d = new Matrix();
        this.e = new Path();
        this.f = new RectF();
        this.g = str;
        this.j = bVar;
        this.h = z;
        this.i = arrayList;
        if (hjVar != null) {
            kq8 kq8Var = new kq8(hjVar);
            this.l = kq8Var;
            kq8Var.a(t70Var);
            kq8Var.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r31 r31Var = (r31) arrayList.get(size);
            if (r31Var instanceof lv2) {
                arrayList2.add((lv2) r31Var);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((lv2) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
        }
    }
}
