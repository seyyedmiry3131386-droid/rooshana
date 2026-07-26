package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import androidx.fragment.app.h;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class p28 {
    public SpecialEffectsController$Operation$State a;
    public SpecialEffectsController$Operation$LifecycleImpact b;
    public final d c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public final h l;

    public p28(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact, h hVar) {
        d dVar = hVar.c;
        js3.o(dVar, "fragmentStateManager.fragment");
        js3.p(dVar, "fragment");
        this.a = specialEffectsController$Operation$State;
        this.b = specialEffectsController$Operation$LifecycleImpact;
        this.c = dVar;
        this.d = new ArrayList();
        this.i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.l = hVar;
    }

    public final void a(ViewGroup viewGroup) {
        js3.p(viewGroup, "container");
        this.h = false;
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (o28 o28Var : a.P0(this.k)) {
            o28Var.getClass();
            if (!o28Var.b) {
                o28Var.b(viewGroup);
            }
            o28Var.b = true;
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f) {
            if (g.N(2)) {
                toString();
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.c.n = false;
        this.l.k();
    }

    public final void c(o28 o28Var) {
        js3.p(o28Var, "effect");
        ArrayList arrayList = this.j;
        if (arrayList.remove(o28Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact) {
        int iOrdinal = specialEffectsController$Operation$LifecycleImpact.ordinal();
        d dVar = this.c;
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = SpecialEffectsController$Operation$State.a;
        if (iOrdinal == 0) {
            if (this.a != specialEffectsController$Operation$State2) {
                if (g.N(2)) {
                    Objects.toString(dVar);
                    Objects.toString(this.a);
                    specialEffectsController$Operation$State.toString();
                }
                this.a = specialEffectsController$Operation$State;
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (this.a == specialEffectsController$Operation$State2) {
                if (g.N(2)) {
                    Objects.toString(dVar);
                    Objects.toString(this.b);
                }
                this.a = SpecialEffectsController$Operation$State.b;
                this.b = SpecialEffectsController$Operation$LifecycleImpact.b;
                this.i = true;
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        if (g.N(2)) {
            Objects.toString(dVar);
            Objects.toString(this.a);
            Objects.toString(this.b);
        }
        this.a = specialEffectsController$Operation$State2;
        this.b = SpecialEffectsController$Operation$LifecycleImpact.c;
        this.i = true;
    }

    public final String toString() {
        StringBuilder sbN = t61.n("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbN.append(this.a);
        sbN.append(" lifecycleImpact = ");
        sbN.append(this.b);
        sbN.append(" fragment = ");
        sbN.append(this.c);
        sbN.append('}');
        return sbN.toString();
    }
}
