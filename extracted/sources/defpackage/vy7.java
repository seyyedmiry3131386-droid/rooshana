package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class vy7 extends nw7 {
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;
    public DecelerateInterpolator s;
    public int t;

    @Override // defpackage.qz6
    public final void e(o oVar) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = oVar.a;
        q69.b(view).b();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((m70) arrayList4.get(size)).a == oVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(oVar);
                arrayList4.remove(size);
            }
        }
        ArrayList arrayList5 = this.k;
        int size2 = arrayList5.size() - 1;
        if (size2 >= 0) {
            arrayList5.get(size2).getClass();
            throw new ClassCastException();
        }
        if (this.h.remove(oVar)) {
            w07.a(view);
            c(oVar);
        }
        if (this.i.remove(oVar)) {
            w07.a(view);
            c(oVar);
        }
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList3.get(size3);
            int size4 = arrayList6.size() - 1;
            if (size4 >= 0) {
                arrayList6.get(size4).getClass();
                throw new ClassCastException();
            }
            if (arrayList6.isEmpty()) {
                arrayList3.remove(size3);
            }
        }
        for (int size5 = arrayList2.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList2.get(size5);
            int size6 = arrayList7.size() - 1;
            while (true) {
                if (size6 < 0) {
                    break;
                }
                if (((m70) arrayList7.get(size6)).a == oVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(oVar);
                    arrayList7.remove(size6);
                    if (arrayList7.isEmpty()) {
                        arrayList2.remove(size5);
                    }
                } else {
                    size6--;
                }
            }
        }
        for (int size7 = arrayList.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList.get(size7);
            if (arrayList8.remove(oVar)) {
                w07.a(view);
                c(oVar);
                if (arrayList8.isEmpty()) {
                    arrayList.remove(size7);
                }
            }
        }
        this.q.remove(oVar);
        this.o.remove(oVar);
        this.r.remove(oVar);
        this.p.remove(oVar);
        if (g()) {
            return;
        }
        d();
    }

    @Override // defpackage.qz6
    public final void f() {
        ArrayList arrayList = this.n;
        ArrayList arrayList2 = this.l;
        ArrayList arrayList3 = this.m;
        ArrayList arrayList4 = this.k;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            m70 m70Var = (m70) arrayList7.get(size);
            View view = m70Var.a.a;
            WeakHashMap weakHashMap = q69.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(m70Var.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((o) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        for (int size3 = arrayList5.size() - 1; size3 >= 0; size3--) {
            o oVar = (o) arrayList5.get(size3);
            w07.a(oVar.a);
            c(oVar);
            arrayList5.remove(size3);
        }
        int size4 = arrayList4.size() - 1;
        if (size4 >= 0) {
            throw rm7.l(size4, arrayList4);
        }
        arrayList4.clear();
        if (g()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    m70 m70Var2 = (m70) arrayList8.get(size6);
                    View view2 = m70Var2.a.a;
                    WeakHashMap weakHashMap2 = q69.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(m70Var2.a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    o oVar2 = (o) arrayList9.get(size8);
                    View view3 = oVar2.a;
                    WeakHashMap weakHashMap3 = q69.a;
                    view3.setAlpha(1.0f);
                    c(oVar2);
                    if (size8 < arrayList9.size()) {
                        arrayList9.remove(size8);
                    }
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    throw rm7.l(size10, arrayList10);
                }
            }
            m(this.q);
            m(this.p);
            m(this.o);
            m(this.r);
            d();
        }
    }

    @Override // defpackage.qz6
    public final boolean g() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // defpackage.qz6
    public final void h() {
        int i;
        ArrayList arrayList = this.n;
        ArrayList arrayList2 = this.h;
        boolean zIsEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.j;
        boolean zIsEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.k;
        boolean zIsEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.i;
        boolean zIsEmpty4 = arrayList5.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            o oVar = (o) it.next();
            x89 x89VarB = q69.b(oVar.a);
            x89VarB.g(0.0f);
            x89VarB.a(0.0f);
            x89VarB.c(this.d);
            x89VarB.d(this.s);
            x89VarB.e(new l70(this, oVar, 1));
            x89VarB.f();
            this.q.add(oVar);
        }
        arrayList2.clear();
        int i2 = 0;
        if (!zIsEmpty2) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.m.add(arrayList6);
            arrayList3.clear();
            j70 j70Var = new j70(this, arrayList6, i2);
            if (zIsEmpty) {
                j70Var.run();
            } else {
                View view = ((m70) arrayList6.get(0)).a.a;
                long j = this.d;
                WeakHashMap weakHashMap = q69.a;
                view.postOnAnimationDelayed(j70Var, j);
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList7 = new ArrayList();
            arrayList7.addAll(arrayList4);
            arrayList.add(arrayList7);
            arrayList4.clear();
            if (!zIsEmpty) {
                throw rm7.l(0, arrayList7);
            }
            if (arrayList.remove(arrayList7)) {
                Iterator it2 = arrayList7.iterator();
                if (it2.hasNext()) {
                    throw bl4.o(it2);
                }
                arrayList7.clear();
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList8 = new ArrayList();
        arrayList8.addAll(arrayList5);
        this.l.add(arrayList8);
        arrayList5.clear();
        j70 j70Var2 = new j70(this, arrayList8, i);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            j70Var2.run();
            return;
        }
        long jMax = Math.max(!zIsEmpty2 ? this.e : 0L, zIsEmpty3 ? 0L : this.f) + (!zIsEmpty ? this.d : 0L);
        View view2 = ((o) arrayList8.get(0)).a;
        WeakHashMap weakHashMap2 = q69.a;
        view2.postOnAnimationDelayed(j70Var2, jMax);
    }

    @Override // defpackage.nw7
    public final void i(o oVar) {
        e(oVar);
        View view = oVar.a;
        w07.a(view);
        float f = this.t;
        WeakHashMap weakHashMap = q69.a;
        view.setTranslationY(f);
        view.setAlpha(0.0f);
        this.i.add(oVar);
    }

    @Override // defpackage.nw7
    public final boolean j(o oVar, o oVar2, int i, int i2, int i3, int i4) {
        return true;
    }

    @Override // defpackage.nw7
    public final boolean k(o oVar, int i, int i2, int i3, int i4) {
        View view = oVar.a;
        WeakHashMap weakHashMap = q69.a;
        int translationX = (int) (view.getTranslationX() + i);
        int translationY = (int) (oVar.a.getTranslationY() + i2);
        e(oVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(oVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        m70 m70Var = new m70();
        m70Var.a = oVar;
        m70Var.b = translationX;
        m70Var.c = translationY;
        m70Var.d = i3;
        m70Var.e = i4;
        arrayList.add(m70Var);
        return true;
    }

    @Override // defpackage.nw7
    public final void l(o oVar) {
        e(oVar);
        w07.a(oVar.a);
        this.h.add(oVar);
    }

    public final void m(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            q69.b(((o) arrayList.get(size)).a).b();
        }
    }
}
