package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.d;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class pn2 extends kn2 {
    @Override // defpackage.kn2
    public final void a(View view, Object obj) {
        ((Transition) obj).b(view);
    }

    @Override // defpackage.kn2
    public final void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.H.size();
            while (i < size) {
                b(transitionSet.Q(i), arrayList);
                i++;
            }
            return;
        }
        if (kn2.k(transition.e) && kn2.k(transition.f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                transition.b((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.kn2
    public final void c(Object obj) {
        ((cr8) obj).h();
    }

    @Override // defpackage.kn2
    public final void d(Object obj, g7 g7Var) {
        cr8 cr8Var = (cr8) obj;
        cr8Var.g = g7Var;
        if (!cr8Var.b) {
            cr8Var.d = 2;
        } else {
            cr8Var.i();
            cr8Var.e.a(0.0f);
        }
    }

    @Override // defpackage.kn2
    public final void e(ViewGroup viewGroup, Object obj) {
        rr8.a(viewGroup, (Transition) obj);
    }

    @Override // defpackage.kn2
    public final boolean g(Object obj) {
        return obj instanceof Transition;
    }

    @Override // defpackage.kn2
    public final Object h(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // defpackage.kn2
    public final Object i(ViewGroup viewGroup, Object obj) {
        Transition transition = (Transition) obj;
        ArrayList arrayList = rr8.c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!transition.v()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        Transition transitionClone = transition.clone();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.P(transitionClone);
        rr8.c(viewGroup, transitionSet);
        viewGroup.setTag(nr6.transition_current_scene, null);
        qr8 qr8Var = new qr8();
        qr8Var.a = transitionSet;
        qr8Var.b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(qr8Var);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(qr8Var);
        viewGroup.invalidate();
        cr8 cr8Var = new cr8(transitionSet);
        transitionSet.B = cr8Var;
        transitionSet.a(cr8Var);
        return transitionSet.B;
    }

    @Override // defpackage.kn2
    public final boolean l() {
        return true;
    }

    @Override // defpackage.kn2
    public final boolean m(Object obj) {
        boolean zV = ((Transition) obj).v();
        if (!zV) {
            Objects.toString(obj);
        }
        return zV;
    }

    @Override // defpackage.kn2
    public final Object n(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.P(transition);
            transitionSet.P(transition2);
            transitionSet.T(1);
            transition = transitionSet;
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition != null) {
            transitionSet2.P(transition);
        }
        transitionSet2.P(transition3);
        return transitionSet2;
    }

    @Override // defpackage.kn2
    public final Object o(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.P((Transition) obj);
        }
        transitionSet.P((Transition) obj2);
        return transitionSet;
    }

    @Override // defpackage.kn2
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).a(new mn2(view, arrayList));
    }

    @Override // defpackage.kn2
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).a(new nn2(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.kn2
    public final void r(Object obj, float f) {
        cr8 cr8Var = (cr8) obj;
        boolean z = cr8Var.b;
        if (z) {
            TransitionSet transitionSet = cr8Var.h;
            long j = transitionSet.A;
            long j2 = (long) (f * j);
            if (j2 == 0) {
                j2 = 1;
            }
            if (j2 == j) {
                j2 = j - 1;
            }
            if (cr8Var.e != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j3 = cr8Var.a;
            if (j2 == j3 || !z) {
                return;
            }
            if (!cr8Var.c) {
                if (j2 == 0 && j3 > 0) {
                    j2 = -1;
                } else if (j2 == j && j3 < j) {
                    j2 = j + 1;
                }
                if (j2 != j3) {
                    transitionSet.G(j2, j3);
                    cr8Var.a = j2;
                }
            }
            pg pgVar = cr8Var.f;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i = (pgVar.b + 1) % 20;
            pgVar.b = i;
            ((long[]) pgVar.c)[i] = jCurrentAnimationTimeMillis;
            ((float[]) pgVar.d)[i] = j2;
        }
    }

    @Override // defpackage.kn2
    public final void s(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            kn2.j(rect, view);
            ((Transition) obj).I(new ln2(0, rect));
        }
    }

    @Override // defpackage.kn2
    public final void t(Object obj, Rect rect) {
        ((Transition) obj).I(new ln2(1, rect));
    }

    @Override // defpackage.kn2
    public final void u(d dVar, Object obj, qm0 qm0Var, Runnable runnable) {
        v(obj, qm0Var, null, runnable);
    }

    @Override // defpackage.kn2
    public final void v(Object obj, qm0 qm0Var, b7 b7Var, Runnable runnable) {
        Transition transition = (Transition) obj;
        tg1 tg1Var = new tg1(b7Var, transition, runnable, 3);
        synchronized (qm0Var) {
            while (qm0Var.b) {
                try {
                    try {
                        qm0Var.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (((tg1) qm0Var.c) != tg1Var) {
                qm0Var.c = tg1Var;
                if (qm0Var.a) {
                    Runnable runnable2 = (Runnable) tg1Var.b;
                    Transition transition2 = (Transition) tg1Var.c;
                    Runnable runnable3 = (Runnable) tg1Var.d;
                    if (runnable2 == null) {
                        transition2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        transition.a(new on2(runnable));
    }

    @Override // defpackage.kn2
    public final void w(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList arrayList2 = transitionSet.f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kn2.f(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // defpackage.kn2
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            ArrayList arrayList3 = transitionSet.f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // defpackage.kn2
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.P((Transition) obj);
        return transitionSet;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.H.size();
            while (i < size) {
                z(transitionSet.Q(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (kn2.k(transition.e)) {
            ArrayList arrayList3 = transition.f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    transition.b((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    transition.D((View) arrayList.get(size3));
                }
            }
        }
    }
}
