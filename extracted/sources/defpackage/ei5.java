package defpackage;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle$State;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.a;

/* JADX INFO: loaded from: classes.dex */
public final class ei5 implements g64, x79, jx2, qd7 {
    public final jc0 a;
    public wi5 b;
    public final Bundle c;
    public Lifecycle$State d;
    public final oi5 e;
    public final String f;
    public final Bundle g;
    public final gi5 h = new gi5(this);

    public ei5(jc0 jc0Var, wi5 wi5Var, Bundle bundle, Lifecycle$State lifecycle$State, oi5 oi5Var, String str, Bundle bundle2) {
        this.a = jc0Var;
        this.b = wi5Var;
        this.c = bundle;
        this.d = lifecycle$State;
        this.e = oi5Var;
        this.f = str;
        this.g = bundle2;
        a.a(new hk3(21, this));
    }

    @Override // defpackage.g64
    public final i64 D() {
        return this.h.j;
    }

    public final void a(Lifecycle$State lifecycle$State) {
        gi5 gi5Var = this.h;
        gi5Var.getClass();
        gi5Var.k = lifecycle$State;
        gi5Var.b();
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof ei5)) {
            ei5 ei5Var = (ei5) obj;
            Bundle bundle = ei5Var.c;
            if (js3.i(this.f, ei5Var.f) && js3.i(this.b, ei5Var.b) && js3.i(this.h.j, ei5Var.h.j) && js3.i(o(), ei5Var.o())) {
                Bundle bundle2 = this.c;
                if (js3.i(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!js3.i(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jx2
    public final q79 h() {
        return this.h.l;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.b.hashCode() + (this.f.hashCode() * 31);
        Bundle bundle = this.c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return o().hashCode() + ((this.h.j.hashCode() + (iHashCode * 31)) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    @Override // defpackage.jx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ta5 i() {
        /*
            r5 = this;
            gi5 r0 = r5.h
            r0.getClass()
            ta5 r1 = new ta5
            r2 = 0
            r1.<init>(r2)
            sl3 r2 = defpackage.rq4.b
            ei5 r3 = r0.a
            java.util.LinkedHashMap r4 = r1.a
            r4.put(r2, r3)
            ol3 r2 = defpackage.rq4.c
            r4.put(r2, r3)
            android.os.Bundle r0 = r0.a()
            if (r0 == 0) goto L24
            ql3 r2 = defpackage.rq4.d
            r4.put(r2, r0)
        L24:
            r0 = 0
            jc0 r2 = r5.a
            if (r2 == 0) goto L36
            android.content.Context r2 = r2.a
            android.content.Context r2 = r2.getApplicationContext()
            boolean r3 = r2 instanceof android.app.Application
            if (r3 == 0) goto L36
            android.app.Application r2 = (android.app.Application) r2
            goto L37
        L36:
            r2 = r0
        L37:
            if (r2 == 0) goto L3a
            r0 = r2
        L3a:
            if (r0 == 0) goto L41
            js8 r2 = defpackage.p79.e
            r4.put(r2, r0)
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei5.i():ta5");
    }

    @Override // defpackage.x79
    public final u79 m() {
        gi5 gi5Var = this.h;
        if (!gi5Var.i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (gi5Var.j.d == Lifecycle$State.a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        oi5 oi5Var = gi5Var.e;
        if (oi5Var == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = gi5Var.f;
        js3.p(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = oi5Var.b;
        u79 u79Var = (u79) linkedHashMap.get(str);
        if (u79Var != null) {
            return u79Var;
        }
        u79 u79Var2 = new u79();
        linkedHashMap.put(str, u79Var2);
        return u79Var2;
    }

    @Override // defpackage.qd7
    public final bn6 o() {
        return (bn6) this.h.h.c;
    }

    public final String toString() {
        return this.h.toString();
    }
}
