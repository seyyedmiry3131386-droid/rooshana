package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a27;
import defpackage.bl4;
import defpackage.gr8;
import defpackage.ln2;
import defpackage.m07;
import defpackage.o77;
import defpackage.rm7;
import defpackage.tr8;
import defpackage.wq2;
import defpackage.wr8;
import defpackage.wu8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class TransitionSet extends Transition {
    public ArrayList H;
    public boolean I;
    public int J;
    public boolean K;
    public int L;
    public Transition[] M;

    public TransitionSet() {
        this.H = new ArrayList();
        this.I = true;
        this.K = false;
        this.L = 0;
    }

    @Override // androidx.transition.Transition
    public final void A(View view) {
        super.A(view);
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.H.get(i)).A(view);
        }
    }

    @Override // androidx.transition.Transition
    public final void B() {
        this.A = 0L;
        tr8 tr8Var = new tr8(this);
        for (int i = 0; i < this.H.size(); i++) {
            Transition transition = (Transition) this.H.get(i);
            transition.a(tr8Var);
            transition.B();
            long j = transition.A;
            if (this.I) {
                this.A = Math.max(this.A, j);
            } else {
                long j2 = this.A;
                transition.C = j2;
                this.A = j2 + j;
            }
        }
    }

    @Override // androidx.transition.Transition
    public final Transition C(gr8 gr8Var) {
        super.C(gr8Var);
        return this;
    }

    @Override // androidx.transition.Transition
    public final void D(View view) {
        for (int i = 0; i < this.H.size(); i++) {
            ((Transition) this.H.get(i)).D(view);
        }
        this.f.remove(view);
    }

    @Override // androidx.transition.Transition
    public final void E(View view) {
        super.E(view);
        Transition[] transitionArr = this.M;
        this.M = null;
        if (transitionArr == null) {
            transitionArr = new Transition[this.H.size()];
        }
        Transition[] transitionArr2 = (Transition[]) this.H.toArray(transitionArr);
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            transitionArr2[i].E(view);
        }
        Arrays.fill(transitionArr2, (Object) null);
        this.M = transitionArr2;
    }

    @Override // androidx.transition.Transition
    public final void F() {
        if (this.H.isEmpty()) {
            N();
            m();
            return;
        }
        tr8 tr8Var = new tr8();
        tr8Var.b = this;
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).a(tr8Var);
        }
        this.J = this.H.size();
        if (this.I) {
            Iterator it2 = this.H.iterator();
            while (it2.hasNext()) {
                ((Transition) it2.next()).F();
            }
            return;
        }
        for (int i = 1; i < this.H.size(); i++) {
            ((Transition) this.H.get(i - 1)).a(new m07(1, (Transition) this.H.get(i)));
        }
        Transition transition = (Transition) this.H.get(0);
        if (transition != null) {
            transition.F();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(long r20, long r22) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.TransitionSet.G(long, long):void");
    }

    @Override // androidx.transition.Transition
    public final void I(ln2 ln2Var) {
        this.y = ln2Var;
        this.L |= 8;
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.H.get(i)).I(ln2Var);
        }
    }

    @Override // androidx.transition.Transition
    public final void K(PathMotion pathMotion) {
        super.K(pathMotion);
        this.L |= 4;
        if (this.H != null) {
            for (int i = 0; i < this.H.size(); i++) {
                ((Transition) this.H.get(i)).K(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void L(wu8 wu8Var) {
        this.x = wu8Var;
        this.L |= 2;
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.H.get(i)).L(wu8Var);
        }
    }

    @Override // androidx.transition.Transition
    public final void M(long j) {
        this.b = j;
    }

    @Override // androidx.transition.Transition
    public final String O(String str) {
        String strO = super.O(str);
        for (int i = 0; i < this.H.size(); i++) {
            StringBuilder sbE = bl4.E(strO, "\n");
            sbE.append(((Transition) this.H.get(i)).O(str + "  "));
            strO = sbE.toString();
        }
        return strO;
    }

    public final void P(Transition transition) {
        this.H.add(transition);
        transition.k = this;
        long j = this.c;
        if (j >= 0) {
            transition.H(j);
        }
        if ((this.L & 1) != 0) {
            transition.J(this.d);
        }
        if ((this.L & 2) != 0) {
            transition.L(this.x);
        }
        if ((this.L & 4) != 0) {
            transition.K(this.z);
        }
        if ((this.L & 8) != 0) {
            transition.I(this.y);
        }
    }

    public final Transition Q(int i) {
        if (i < 0 || i >= this.H.size()) {
            return null;
        }
        return (Transition) this.H.get(i);
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void H(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.H) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.H.get(i)).H(j);
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J(TimeInterpolator timeInterpolator) {
        this.L |= 1;
        ArrayList arrayList = this.H;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.H.get(i)).J(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    public final void T(int i) {
        if (i == 0) {
            this.I = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(rm7.n(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.I = false;
        }
    }

    @Override // androidx.transition.Transition
    public final void b(View view) {
        for (int i = 0; i < this.H.size(); i++) {
            ((Transition) this.H.get(i)).b(view);
        }
        this.f.add(view);
    }

    @Override // androidx.transition.Transition
    public final void cancel() {
        super.cancel();
        Transition[] transitionArr = this.M;
        this.M = null;
        if (transitionArr == null) {
            transitionArr = new Transition[this.H.size()];
        }
        Transition[] transitionArr2 = (Transition[]) this.H.toArray(transitionArr);
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            transitionArr2[i].cancel();
        }
        Arrays.fill(transitionArr2, (Object) null);
        this.M = transitionArr2;
    }

    @Override // androidx.transition.Transition
    public final void d(wr8 wr8Var) {
        View view = wr8Var.b;
        if (x(view)) {
            for (Transition transition : this.H) {
                if (transition.x(view)) {
                    transition.d(wr8Var);
                    wr8Var.c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void f(wr8 wr8Var) {
        super.f(wr8Var);
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.H.get(i)).f(wr8Var);
        }
    }

    @Override // androidx.transition.Transition
    public final void g(wr8 wr8Var) {
        View view = wr8Var.b;
        if (x(view)) {
            for (Transition transition : this.H) {
                if (transition.x(view)) {
                    transition.g(wr8Var);
                    wr8Var.c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.H = new ArrayList();
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            Transition transitionClone = ((Transition) this.H.get(i)).clone();
            transitionSet.H.add(transitionClone);
            transitionClone.k = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public final void l(ViewGroup viewGroup, o77 o77Var, o77 o77Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            Transition transition = (Transition) this.H.get(i);
            if (j > 0 && (this.I || i == 0)) {
                long j2 = transition.b;
                if (j2 > 0) {
                    transition.M(j2 + j);
                } else {
                    transition.M(j);
                }
            }
            transition.l(viewGroup, o77Var, o77Var2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    public final Transition n(View view) {
        throw null;
    }

    @Override // androidx.transition.Transition
    public final void o() {
        for (int i = 0; i < this.H.size(); i++) {
            ((Transition) this.H.get(i)).o();
        }
        super.o();
    }

    @Override // androidx.transition.Transition
    public final boolean u() {
        for (int i = 0; i < this.H.size(); i++) {
            if (((Transition) this.H.get(i)).u()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            if (!((Transition) this.H.get(i)).v()) {
                return false;
            }
        }
        return true;
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = new ArrayList();
        this.I = true;
        this.K = false;
        this.L = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wq2.m);
        T(a27.f(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
