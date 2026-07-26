package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.o;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class lf1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ rf1 c;

    public /* synthetic */ lf1(rf1 rf1Var, ArrayList arrayList, int i) {
        this.a = i;
        this.c = rf1Var;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    rf1 rf1Var = this.c;
                    if (!zHasNext) {
                        arrayList.clear();
                        rf1Var.m.remove(arrayList);
                    } else {
                        qf1 qf1Var = (qf1) it.next();
                        o oVar = qf1Var.a;
                        int i = qf1Var.b;
                        int i2 = qf1Var.c;
                        int i3 = qf1Var.d;
                        int i4 = qf1Var.e;
                        View view = oVar.a;
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        if (i5 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        rf1Var.p.add(oVar);
                        viewPropertyAnimatorAnimate.setDuration(rf1Var.e).setListener(new nf1(rf1Var, oVar, i5, view, i6, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    rf1 rf1Var2 = this.c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        rf1Var2.n.remove(arrayList2);
                        break;
                    } else {
                        pf1 pf1Var = (pf1) it2.next();
                        ArrayList arrayList3 = rf1Var2.r;
                        o oVar2 = pf1Var.a;
                        View view2 = oVar2 == null ? null : oVar2.a;
                        o oVar3 = pf1Var.b;
                        View view3 = oVar3 != null ? oVar3.a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(rf1Var2.f);
                            arrayList3.add(pf1Var.a);
                            duration.translationX(pf1Var.e - pf1Var.c);
                            duration.translationY(pf1Var.f - pf1Var.d);
                            duration.alpha(0.0f).setListener(new of1(rf1Var2, pf1Var, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(pf1Var.b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(rf1Var2.f).alpha(1.0f).setListener(new of1(rf1Var2, pf1Var, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.b;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    rf1 rf1Var3 = this.c;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        rf1Var3.l.remove(arrayList4);
                    } else {
                        o oVar4 = (o) it3.next();
                        View view4 = oVar4.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        rf1Var3.o.add(oVar4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(rf1Var3.c).setListener(new mf1(rf1Var3, oVar4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
