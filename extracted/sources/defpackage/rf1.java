package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.o;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rf1 extends nw7 {
    public static TimeInterpolator s;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();

    @Override // defpackage.qz6
    public final boolean b(o oVar, List list) {
        return !list.isEmpty() || super.b(oVar, list);
    }

    @Override // defpackage.qz6
    public final void e(o oVar) {
        View view = oVar.a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((qf1) arrayList.get(size)).a == oVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(oVar);
                arrayList.remove(size);
            }
        }
        o(this.k, oVar);
        if (this.h.remove(oVar)) {
            view.setAlpha(1.0f);
            c(oVar);
        }
        if (this.i.remove(oVar)) {
            view.setAlpha(1.0f);
            c(oVar);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            o(arrayList3, oVar);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((qf1) arrayList5.get(size4)).a == oVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(oVar);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(oVar)) {
                view.setAlpha(1.0f);
                c(oVar);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(oVar);
        this.o.remove(oVar);
        this.r.remove(oVar);
        this.p.remove(oVar);
        n();
    }

    @Override // defpackage.qz6
    public final void f() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            qf1 qf1Var = (qf1) arrayList.get(size);
            View view = qf1Var.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(qf1Var.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((o) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            o oVar = (o) arrayList3.get(size3);
            oVar.a.setAlpha(1.0f);
            c(oVar);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            pf1 pf1Var = (pf1) arrayList4.get(size4);
            o oVar2 = pf1Var.a;
            if (oVar2 != null) {
                p(pf1Var, oVar2);
            }
            o oVar3 = pf1Var.b;
            if (oVar3 != null) {
                p(pf1Var, oVar3);
            }
        }
        arrayList4.clear();
        if (g()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    qf1 qf1Var2 = (qf1) arrayList6.get(size6);
                    View view2 = qf1Var2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(qf1Var2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    o oVar4 = (o) arrayList8.get(size8);
                    oVar4.a.setAlpha(1.0f);
                    c(oVar4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    pf1 pf1Var2 = (pf1) arrayList10.get(size10);
                    o oVar5 = pf1Var2.a;
                    if (oVar5 != null) {
                        p(pf1Var2, oVar5);
                    }
                    o oVar6 = pf1Var2.b;
                    if (oVar6 != null) {
                        p(pf1Var2, oVar6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
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
        ArrayList<o> arrayList = this.h;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.j;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.k;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.i;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        for (o oVar : arrayList) {
            View view = oVar.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.q.add(oVar);
            viewPropertyAnimatorAnimate.setDuration(this.d).alpha(0.0f).setListener(new mf1(this, oVar, viewPropertyAnimatorAnimate, view)).start();
        }
        arrayList.clear();
        int i = 0;
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.m.add(arrayList5);
            arrayList2.clear();
            lf1 lf1Var = new lf1(this, arrayList5, i);
            if (zIsEmpty) {
                lf1Var.run();
            } else {
                View view2 = ((qf1) arrayList5.get(0)).a.a;
                long j = this.d;
                WeakHashMap weakHashMap = q69.a;
                view2.postOnAnimationDelayed(lf1Var, j);
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.n.add(arrayList6);
            arrayList3.clear();
            lf1 lf1Var2 = new lf1(this, arrayList6, 1);
            if (zIsEmpty) {
                lf1Var2.run();
            } else {
                View view3 = ((pf1) arrayList6.get(0)).a.a;
                long j2 = this.d;
                WeakHashMap weakHashMap2 = q69.a;
                view3.postOnAnimationDelayed(lf1Var2, j2);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.l.add(arrayList7);
        arrayList4.clear();
        lf1 lf1Var3 = new lf1(this, arrayList7, 2);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            lf1Var3.run();
            return;
        }
        long jMax = Math.max(!zIsEmpty2 ? this.e : 0L, zIsEmpty3 ? 0L : this.f) + (!zIsEmpty ? this.d : 0L);
        View view4 = ((o) arrayList7.get(0)).a;
        WeakHashMap weakHashMap3 = q69.a;
        view4.postOnAnimationDelayed(lf1Var3, jMax);
    }

    @Override // defpackage.nw7
    public final void i(o oVar) {
        q(oVar);
        oVar.a.setAlpha(0.0f);
        this.i.add(oVar);
    }

    @Override // defpackage.nw7
    public final boolean j(o oVar, o oVar2, int i, int i2, int i3, int i4) {
        if (oVar == oVar2) {
            return k(oVar, i, i2, i3, i4);
        }
        View view = oVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        q(oVar);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = oVar2.a;
        q(oVar2);
        view2.setTranslationX(-((int) ((i3 - i) - translationX)));
        view2.setTranslationY(-((int) ((i4 - i2) - translationY)));
        view2.setAlpha(0.0f);
        pf1 pf1Var = new pf1();
        pf1Var.a = oVar;
        pf1Var.b = oVar2;
        pf1Var.c = i;
        pf1Var.d = i2;
        pf1Var.e = i3;
        pf1Var.f = i4;
        this.k.add(pf1Var);
        return true;
    }

    @Override // defpackage.nw7
    public final boolean k(o oVar, int i, int i2, int i3, int i4) {
        View view = oVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) oVar.a.getTranslationY());
        q(oVar);
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
        qf1 qf1Var = new qf1();
        qf1Var.a = oVar;
        qf1Var.b = translationX;
        qf1Var.c = translationY;
        qf1Var.d = i3;
        qf1Var.e = i4;
        this.j.add(qf1Var);
        return true;
    }

    @Override // defpackage.nw7
    public final void l(o oVar) {
        q(oVar);
        this.h.add(oVar);
    }

    public final void m(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((o) arrayList.get(size)).a.animate().cancel();
        }
    }

    public final void n() {
        if (g()) {
            return;
        }
        d();
    }

    public final void o(ArrayList arrayList, o oVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            pf1 pf1Var = (pf1) arrayList.get(size);
            if (p(pf1Var, oVar) && pf1Var.a == null && pf1Var.b == null) {
                arrayList.remove(pf1Var);
            }
        }
    }

    public final boolean p(pf1 pf1Var, o oVar) {
        if (pf1Var.b == oVar) {
            pf1Var.b = null;
        } else {
            if (pf1Var.a != oVar) {
                return false;
            }
            pf1Var.a = null;
        }
        View view = oVar.a;
        View view2 = oVar.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(oVar);
        return true;
    }

    public final void q(o oVar) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        oVar.a.animate().setInterpolator(s);
        e(oVar);
    }
}
