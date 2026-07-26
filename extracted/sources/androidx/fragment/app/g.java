package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.g;
import androidx.lifecycle.Lifecycle$State;
import defpackage.av;
import defpackage.bn6;
import defpackage.cn2;
import defpackage.dw1;
import defpackage.dy0;
import defpackage.fr6;
import defpackage.g27;
import defpackage.h40;
import defpackage.hh2;
import defpackage.i64;
import defpackage.j71;
import defpackage.js3;
import defpackage.kl2;
import defpackage.l60;
import defpackage.mm2;
import defpackage.nd4;
import defpackage.o31;
import defpackage.o40;
import defpackage.o77;
import defpackage.ol2;
import defpackage.p40;
import defpackage.pl2;
import defpackage.ps0;
import defpackage.q6;
import defpackage.qk2;
import defpackage.ql2;
import defpackage.rl2;
import defpackage.s7;
import defpackage.sl2;
import defpackage.st4;
import defpackage.t61;
import defpackage.tk2;
import defpackage.tl2;
import defpackage.u79;
import defpackage.vp7;
import defpackage.wl2;
import defpackage.ws5;
import defpackage.y40;
import defpackage.y7;
import defpackage.yl2;
import defpackage.yx0;
import defpackage.zm2;
import io.sentry.android.core.t0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public d A;
    public y7 D;
    public y7 E;
    public y7 F;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public yl2 P;
    public boolean b;
    public ArrayList e;
    public ws5 g;
    public final ol2 r;
    public final ol2 s;
    public final ol2 t;
    public final ol2 u;
    public tk2 x;
    public y40 y;
    public d z;
    public final ArrayList a = new ArrayList();
    public final vp7 c = new vp7(15);
    public ArrayList d = new ArrayList();
    public final kl2 f = new kl2(this);
    public p40 h = null;
    public boolean i = false;
    public final h40 j = new h40(1, this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = DesugarCollections.synchronizedMap(new HashMap());
    public final Map m = DesugarCollections.synchronizedMap(new HashMap());
    public final Map n = DesugarCollections.synchronizedMap(new HashMap());
    public final ArrayList o = new ArrayList();
    public final hh2 p = new hh2(this);
    public final CopyOnWriteArrayList q = new CopyOnWriteArrayList();
    public final l60 v = new l60(1, this);
    public int w = -1;
    public final pl2 B = new pl2(this);
    public final av C = new av(23);
    public ArrayDeque G = new ArrayDeque();
    public final q6 Q = new q6(14, this);

    /* JADX WARN: Type inference failed for: r0v17, types: [ol2] */
    /* JADX WARN: Type inference failed for: r0v18, types: [ol2] */
    /* JADX WARN: Type inference failed for: r0v19, types: [ol2] */
    /* JADX WARN: Type inference failed for: r0v20, types: [ol2] */
    public g() {
        final int i = 0;
        this.r = new o31(this) { // from class: ol2
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.o31
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        g gVar = this.b;
                        if (gVar.P()) {
                            gVar.j(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        g gVar2 = this.b;
                        if (gVar2.P() && num.intValue() == 80) {
                            gVar2.n(false);
                            break;
                        }
                        break;
                    case 2:
                        ca5 ca5Var = (ca5) obj;
                        g gVar3 = this.b;
                        if (gVar3.P()) {
                            boolean z = ca5Var.a;
                            gVar3.o(false);
                        }
                        break;
                    default:
                        j76 j76Var = (j76) obj;
                        g gVar4 = this.b;
                        if (gVar4.P()) {
                            boolean z2 = j76Var.a;
                            gVar4.t(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.s = new o31(this) { // from class: ol2
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.o31
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        g gVar = this.b;
                        if (gVar.P()) {
                            gVar.j(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        g gVar2 = this.b;
                        if (gVar2.P() && num.intValue() == 80) {
                            gVar2.n(false);
                            break;
                        }
                        break;
                    case 2:
                        ca5 ca5Var = (ca5) obj;
                        g gVar3 = this.b;
                        if (gVar3.P()) {
                            boolean z = ca5Var.a;
                            gVar3.o(false);
                        }
                        break;
                    default:
                        j76 j76Var = (j76) obj;
                        g gVar4 = this.b;
                        if (gVar4.P()) {
                            boolean z2 = j76Var.a;
                            gVar4.t(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.t = new o31(this) { // from class: ol2
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.o31
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        g gVar = this.b;
                        if (gVar.P()) {
                            gVar.j(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        g gVar2 = this.b;
                        if (gVar2.P() && num.intValue() == 80) {
                            gVar2.n(false);
                            break;
                        }
                        break;
                    case 2:
                        ca5 ca5Var = (ca5) obj;
                        g gVar3 = this.b;
                        if (gVar3.P()) {
                            boolean z = ca5Var.a;
                            gVar3.o(false);
                        }
                        break;
                    default:
                        j76 j76Var = (j76) obj;
                        g gVar4 = this.b;
                        if (gVar4.P()) {
                            boolean z2 = j76Var.a;
                            gVar4.t(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.u = new o31(this) { // from class: ol2
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.o31
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        g gVar = this.b;
                        if (gVar.P()) {
                            gVar.j(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        g gVar2 = this.b;
                        if (gVar2.P() && num.intValue() == 80) {
                            gVar2.n(false);
                            break;
                        }
                        break;
                    case 2:
                        ca5 ca5Var = (ca5) obj;
                        g gVar3 = this.b;
                        if (gVar3.P()) {
                            boolean z = ca5Var.a;
                            gVar3.o(false);
                        }
                        break;
                    default:
                        j76 j76Var = (j76) obj;
                        g gVar4 = this.b;
                        if (gVar4.P()) {
                            boolean z2 = j76Var.a;
                            gVar4.t(false);
                        }
                        break;
                }
            }
        };
    }

    public static HashSet I(p40 p40Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < p40Var.a.size(); i++) {
            d dVar = ((cn2) p40Var.a.get(i)).b;
            if (dVar != null && p40Var.g) {
                hashSet.add(dVar);
            }
        }
        return hashSet;
    }

    public static boolean N(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean O(d dVar) {
        dVar.getClass();
        boolean zO = false;
        for (d dVar2 : dVar.x.c.K()) {
            if (dVar2 != null) {
                zO = O(dVar2);
            }
            if (zO) {
                return true;
            }
        }
        return false;
    }

    public static boolean Q(d dVar) {
        if (dVar == null) {
            return true;
        }
        if (dVar.G) {
            return dVar.v == null || Q(dVar.y);
        }
        return false;
    }

    public static boolean R(d dVar) {
        if (dVar == null) {
            return true;
        }
        g gVar = dVar.v;
        return dVar.equals(gVar.A) && R(gVar.z);
    }

    public final void A(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.x == null) {
            if (!this.K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.x.u.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && S()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    public final boolean B(boolean z) {
        boolean zA;
        p40 p40Var;
        A(z);
        if (!this.i && (p40Var = this.h) != null) {
            p40Var.s = false;
            p40Var.d();
            if (N(3)) {
                Objects.toString(this.h);
                Objects.toString(this.a);
            }
            this.h.f(false, false);
            this.a.add(0, this.h);
            Iterator it = this.h.a.iterator();
            while (it.hasNext()) {
                d dVar = ((cn2) it.next()).b;
                if (dVar != null) {
                    dVar.n = false;
                }
            }
            this.h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.M;
            ArrayList arrayList2 = this.N;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        zA = false;
                        for (int i = 0; i < size; i++) {
                            zA |= ((tl2) this.a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                n0();
                w();
                ((HashMap) this.c.c).values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.b = true;
            try {
                a0(this.M, this.N);
            } finally {
                d();
            }
        }
    }

    public final void C(p40 p40Var, boolean z) {
        if (z && (this.x == null || this.K)) {
            return;
        }
        A(z);
        p40 p40Var2 = this.h;
        if (p40Var2 != null) {
            p40Var2.s = false;
            p40Var2.d();
            if (N(3)) {
                Objects.toString(this.h);
                Objects.toString(p40Var);
            }
            this.h.f(false, false);
            this.h.a(this.M, this.N);
            Iterator it = this.h.a.iterator();
            while (it.hasNext()) {
                d dVar = ((cn2) it.next()).b;
                if (dVar != null) {
                    dVar.n = false;
                }
            }
            this.h = null;
        }
        p40Var.a(this.M, this.N);
        this.b = true;
        try {
            a0(this.M, this.N);
            d();
            n0();
            w();
            ((HashMap) this.c.c).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0230 A[PHI: r15
      0x0230: PHI (r15v25 int) = (r15v23 int), (r15v27 int) binds: [B:105:0x021d, B:109:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(java.util.ArrayList r27, java.util.ArrayList r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 1468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.g.D(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final int E(String str, int i, boolean z) {
        if (this.d.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            p40 p40Var = (p40) this.d.get(size);
            if ((str != null && str.equals(p40Var.i)) || (i >= 0 && i == p40Var.t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            p40 p40Var2 = (p40) this.d.get(size - 1);
            if ((str == null || !str.equals(p40Var2.i)) && (i < 0 || i != p40Var2.t)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final d F(int i) {
        vp7 vp7Var = this.c;
        ArrayList arrayList = (ArrayList) vp7Var.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (dVar != null && dVar.z == i) {
                return dVar;
            }
        }
        for (h hVar : ((HashMap) vp7Var.c).values()) {
            if (hVar != null) {
                d dVar2 = hVar.c;
                if (dVar2.z == i) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    public final d G(String str) {
        vp7 vp7Var = this.c;
        ArrayList arrayList = (ArrayList) vp7Var.b;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                d dVar = (d) arrayList.get(size);
                if (dVar != null && str.equals(dVar.B)) {
                    return dVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (h hVar : ((HashMap) vp7Var.c).values()) {
            if (hVar != null) {
                d dVar2 = hVar.c;
                if (str.equals(dVar2.B)) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    public final void H() {
        for (c cVar : f()) {
            if (cVar.f) {
                cVar.f = false;
                cVar.e();
            }
        }
    }

    public final d J(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        d dVarC = this.c.C(string);
        if (dVarC != null) {
            return dVarC;
        }
        m0(new IllegalStateException(dw1.o("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public final ViewGroup K(d dVar) {
        ViewGroup viewGroup = dVar.I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (dVar.A <= 0 || !this.y.B()) {
            return null;
        }
        View viewA = this.y.A(dVar.A);
        if (viewA instanceof ViewGroup) {
            return (ViewGroup) viewA;
        }
        return null;
    }

    public final pl2 L() {
        d dVar = this.z;
        return dVar != null ? dVar.v.L() : this.B;
    }

    public final av M() {
        d dVar = this.z;
        return dVar != null ? dVar.v.M() : this.C;
    }

    public final boolean P() {
        d dVar = this.z;
        if (dVar == null) {
            return true;
        }
        return dVar.Q() && this.z.J().P();
    }

    public final boolean S() {
        return this.I || this.J;
    }

    public final void T(int i, boolean z) {
        tk2 tk2Var;
        if (this.x == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.w) {
            this.w = i;
            vp7 vp7Var = this.c;
            HashMap map = (HashMap) vp7Var.c;
            Iterator it = ((ArrayList) vp7Var.b).iterator();
            while (it.hasNext()) {
                h hVar = (h) map.get(((d) it.next()).f);
                if (hVar != null) {
                    hVar.k();
                }
            }
            for (h hVar2 : map.values()) {
                if (hVar2 != null) {
                    hVar2.k();
                    d dVar = hVar2.c;
                    if (dVar.m && !dVar.S()) {
                        if (dVar.o && !((HashMap) vp7Var.d).containsKey(dVar.f)) {
                            vp7Var.y0(hVar2.o(), dVar.f);
                        }
                        vp7Var.r0(hVar2);
                    }
                }
            }
            l0();
            if (this.H && (tk2Var = this.x) != null && this.w == 7) {
                tk2Var.w.invalidateOptionsMenu();
                this.H = false;
            }
        }
    }

    public final void U() {
        if (this.x == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.g = false;
        for (d dVar : this.c.S()) {
            if (dVar != null) {
                dVar.x.U();
            }
        }
    }

    public final boolean V() {
        return W(-1, 0);
    }

    public final boolean W(int i, int i2) {
        B(false);
        A(true);
        d dVar = this.A;
        if (dVar != null && i < 0 && dVar.G().V()) {
            return true;
        }
        boolean zX = X(this.M, this.N, null, i, i2);
        if (zX) {
            this.b = true;
            try {
                a0(this.M, this.N);
            } finally {
                d();
            }
        }
        n0();
        w();
        ((HashMap) this.c.c).values().removeAll(Collections.singleton(null));
        return zX;
    }

    public final boolean X(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int iE = E(str, i, (i2 & 1) != 0);
        if (iE < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= iE; size--) {
            arrayList.add((p40) this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Y(Bundle bundle, String str, d dVar) {
        if (dVar.v == this) {
            bundle.putString(str, dVar.f);
        } else {
            m0(new IllegalStateException(dw1.m("Fragment ", dVar, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void Z(d dVar) {
        if (N(2)) {
            Objects.toString(dVar);
        }
        boolean zS = dVar.S();
        if (dVar.D && zS) {
            return;
        }
        vp7 vp7Var = this.c;
        synchronized (((ArrayList) vp7Var.b)) {
            ((ArrayList) vp7Var.b).remove(dVar);
        }
        dVar.l = false;
        if (O(dVar)) {
            this.H = true;
        }
        dVar.m = true;
        k0(dVar);
    }

    public final h a(d dVar) {
        String str = dVar.S;
        if (str != null) {
            zm2.d(dVar, str);
        }
        if (N(2)) {
            dVar.toString();
        }
        h hVarH = h(dVar);
        dVar.v = this;
        vp7 vp7Var = this.c;
        vp7Var.q0(hVarH);
        if (!dVar.D) {
            vp7Var.o(dVar);
            dVar.m = false;
            if (dVar.J == null) {
                dVar.P = false;
            }
            if (O(dVar)) {
                this.H = true;
            }
        }
        return hVarH;
    }

    public final void a0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((p40) arrayList.get(i)).p) {
                if (i2 != i) {
                    D(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((p40) arrayList.get(i2)).p) {
                        i2++;
                    }
                }
                D(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            D(arrayList, arrayList2, i2, size);
        }
    }

    public final void b(tk2 tk2Var, y40 y40Var, d dVar) {
        if (this.x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.x = tk2Var;
        this.y = y40Var;
        this.z = dVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.q;
        if (dVar != null) {
            copyOnWriteArrayList.add(new rl2(dVar));
        } else if (tk2Var != null) {
            copyOnWriteArrayList.add(tk2Var);
        }
        if (this.z != null) {
            n0();
        }
        if (tk2Var != null) {
            ws5 ws5VarC = tk2Var.w.c();
            this.g = ws5VarC;
            ws5VarC.a(dVar != null ? dVar : tk2Var, this.j);
        }
        if (dVar != null) {
            yl2 yl2Var = dVar.v.P;
            HashMap map = yl2Var.c;
            yl2 yl2Var2 = (yl2) map.get(dVar.f);
            if (yl2Var2 == null) {
                yl2Var2 = new yl2(yl2Var.e);
                map.put(dVar.f, yl2Var2);
            }
            this.P = yl2Var2;
        } else if (tk2Var != null) {
            u79 u79VarM = tk2Var.w.m();
            j71 j71Var = j71.b;
            js3.p(j71Var, "defaultCreationExtras");
            o77 o77Var = new o77(u79VarM, yl2.h, j71Var);
            ps0 ps0VarA = g27.a(yl2.class);
            String strB = ps0VarA.b();
            if (strB == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.P = (yl2) o77Var.u(ps0VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        } else {
            this.P = new yl2(false);
        }
        this.P.g = S();
        this.c.e = this.P;
        tk2 tk2Var2 = this.x;
        if (tk2Var2 != null && dVar == null) {
            bn6 bn6VarO = tk2Var2.o();
            bn6VarO.u("android:support:fragments", new yx0(3, (wl2) this));
            Bundle bundleO = bn6VarO.o("android:support:fragments");
            if (bundleO != null) {
                b0(bundleO);
            }
        }
        tk2 tk2Var3 = this.x;
        if (tk2Var3 != null) {
            dy0 dy0Var = tk2Var3.w.i;
            String strN = dw1.n("FragmentManager:", dVar != null ? dw1.s(new StringBuilder(), dVar.f, ":") : "");
            wl2 wl2Var = (wl2) this;
            this.D = dy0Var.c(t61.i(strN, "StartActivityForResult"), new s7(2), new e(wl2Var, 1));
            this.E = dy0Var.c(t61.i(strN, "StartIntentSenderForResult"), new s7(3), new e(wl2Var, 2));
            this.F = dy0Var.c(t61.i(strN, "RequestPermissions"), new s7(0), new e(wl2Var, 0));
        }
        tk2 tk2Var4 = this.x;
        if (tk2Var4 != null) {
            tk2Var4.v(this.r);
        }
        tk2 tk2Var5 = this.x;
        if (tk2Var5 != null) {
            FragmentActivity fragmentActivity = tk2Var5.w;
            fragmentActivity.getClass();
            ol2 ol2Var = this.s;
            js3.p(ol2Var, "listener");
            fragmentActivity.k.add(ol2Var);
        }
        tk2 tk2Var6 = this.x;
        if (tk2Var6 != null) {
            FragmentActivity fragmentActivity2 = tk2Var6.w;
            fragmentActivity2.getClass();
            ol2 ol2Var2 = this.t;
            js3.p(ol2Var2, "listener");
            fragmentActivity2.m.add(ol2Var2);
        }
        tk2 tk2Var7 = this.x;
        if (tk2Var7 != null) {
            FragmentActivity fragmentActivity3 = tk2Var7.w;
            fragmentActivity3.getClass();
            ol2 ol2Var3 = this.u;
            js3.p(ol2Var3, "listener");
            fragmentActivity3.n.add(ol2Var3);
        }
        tk2 tk2Var8 = this.x;
        if (tk2Var8 == null || dVar != null) {
            return;
        }
        FragmentActivity fragmentActivity4 = tk2Var8.w;
        fragmentActivity4.getClass();
        l60 l60Var = this.v;
        js3.p(l60Var, "provider");
        st4 st4Var = fragmentActivity4.c;
        st4Var.b.add(l60Var);
        st4Var.a.run();
    }

    public final void b0(Bundle bundle) {
        hh2 hh2Var;
        h hVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.x.t.getClassLoader());
                this.m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.x.t.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        vp7 vp7Var = this.c;
        HashMap map2 = (HashMap) vp7Var.d;
        HashMap map3 = (HashMap) vp7Var.c;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        map3.clear();
        Iterator it = fragmentManagerState.a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            hh2Var = this.p;
            if (!zHasNext) {
                break;
            }
            Bundle bundleY0 = vp7Var.y0(null, (String) it.next());
            if (bundleY0 != null) {
                d dVar = (d) this.P.b.get(((FragmentState) bundleY0.getParcelable("state")).b);
                if (dVar != null) {
                    if (N(2)) {
                        dVar.toString();
                    }
                    hVar = new h(hh2Var, vp7Var, dVar, bundleY0);
                } else {
                    hVar = new h(this.p, this.c, this.x.t.getClassLoader(), L(), bundleY0);
                }
                d dVar2 = hVar.c;
                dVar2.b = bundleY0;
                dVar2.v = this;
                if (N(2)) {
                    dVar2.toString();
                }
                hVar.m(this.x.t.getClassLoader());
                vp7Var.q0(hVar);
                hVar.e = this.w;
            }
        }
        yl2 yl2Var = this.P;
        yl2Var.getClass();
        for (d dVar3 : new ArrayList(yl2Var.b.values())) {
            if (map3.get(dVar3.f) == null) {
                if (N(2)) {
                    dVar3.toString();
                    Objects.toString(fragmentManagerState.a);
                }
                this.P.g(dVar3);
                dVar3.v = this;
                h hVar2 = new h(hh2Var, vp7Var, dVar3);
                hVar2.e = 1;
                hVar2.k();
                dVar3.m = true;
                hVar2.k();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.b;
        ((ArrayList) vp7Var.b).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                d dVarC = vp7Var.C(str3);
                if (dVarC == null) {
                    throw new IllegalStateException(o40.y("No instantiated fragment for (", str3, ")"));
                }
                if (N(2)) {
                    dVarC.toString();
                }
                vp7Var.o(dVarC);
            }
        }
        if (fragmentManagerState.c != null) {
            this.d = new ArrayList(fragmentManagerState.c.length);
            int i = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.c;
                if (i >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i];
                ArrayList arrayList2 = backStackRecordState.b;
                p40 p40Var = new p40(this);
                backStackRecordState.a(p40Var);
                p40Var.t = backStackRecordState.g;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    String str4 = (String) arrayList2.get(i2);
                    if (str4 != null) {
                        ((cn2) p40Var.a.get(i2)).b = vp7Var.C(str4);
                    }
                }
                p40Var.c(1);
                if (N(2)) {
                    p40Var.toString();
                    PrintWriter printWriter = new PrintWriter(new nd4());
                    p40Var.i("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(p40Var);
                i++;
            }
        } else {
            this.d = new ArrayList();
        }
        this.k.set(fragmentManagerState.d);
        String str5 = fragmentManagerState.e;
        if (str5 != null) {
            d dVarC2 = vp7Var.C(str5);
            this.A = dVarC2;
            s(dVarC2);
        }
        ArrayList arrayList3 = fragmentManagerState.f;
        if (arrayList3 != null) {
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                this.l.put((String) arrayList3.get(i3), (BackStackState) fragmentManagerState.g.get(i3));
            }
        }
        this.G = new ArrayDeque(fragmentManagerState.h);
    }

    public final void c(d dVar) {
        if (N(2)) {
            Objects.toString(dVar);
        }
        if (dVar.D) {
            dVar.D = false;
            if (dVar.l) {
                return;
            }
            this.c.o(dVar);
            if (N(2)) {
                dVar.toString();
            }
            if (O(dVar)) {
                this.H = true;
            }
        }
    }

    public final Bundle c0() {
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle = new Bundle();
        H();
        y();
        B(true);
        this.I = true;
        this.P.g = true;
        vp7 vp7Var = this.c;
        vp7Var.getClass();
        HashMap map = (HashMap) vp7Var.c;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (h hVar : map.values()) {
            if (hVar != null) {
                d dVar = hVar.c;
                vp7Var.y0(hVar.o(), dVar.f);
                arrayList2.add(dVar.f);
                if (N(2)) {
                    dVar.toString();
                    Objects.toString(dVar.b);
                }
            }
        }
        HashMap map2 = (HashMap) this.c.d;
        if (map2.isEmpty()) {
            return bundle;
        }
        vp7 vp7Var2 = this.c;
        synchronized (((ArrayList) vp7Var2.b)) {
            try {
                if (((ArrayList) vp7Var2.b).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) vp7Var2.b).size());
                    for (d dVar2 : (ArrayList) vp7Var2.b) {
                        arrayList.add(dVar2.f);
                        if (N(2)) {
                            dVar2.toString();
                        }
                    }
                }
            } finally {
            }
        }
        int size = this.d.size();
        if (size > 0) {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (int i = 0; i < size; i++) {
                backStackRecordStateArr[i] = new BackStackRecordState((p40) this.d.get(i));
                if (N(2)) {
                    Objects.toString(this.d.get(i));
                }
            }
        } else {
            backStackRecordStateArr = null;
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.e = null;
        ArrayList arrayList3 = new ArrayList();
        fragmentManagerState.f = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        fragmentManagerState.g = arrayList4;
        fragmentManagerState.a = arrayList2;
        fragmentManagerState.b = arrayList;
        fragmentManagerState.c = backStackRecordStateArr;
        fragmentManagerState.d = this.k.get();
        d dVar3 = this.A;
        if (dVar3 != null) {
            fragmentManagerState.e = dVar3.f;
        }
        arrayList3.addAll(this.l.keySet());
        arrayList4.addAll(this.l.values());
        fragmentManagerState.h = new ArrayList(this.G);
        bundle.putParcelable("state", fragmentManagerState);
        for (String str : this.m.keySet()) {
            bundle.putBundle(dw1.n("result_", str), (Bundle) this.m.get(str));
        }
        for (String str2 : map2.keySet()) {
            bundle.putBundle(dw1.n("fragment_", str2), (Bundle) map2.get(str2));
        }
        return bundle;
    }

    public final void d() {
        this.b = false;
        this.N.clear();
        this.M.clear();
    }

    public final Fragment$SavedState d0(d dVar) {
        h hVar = (h) ((HashMap) this.c.c).get(dVar.f);
        if (hVar != null) {
            d dVar2 = hVar.c;
            if (dVar2.equals(dVar)) {
                if (dVar2.a > -1) {
                    return new Fragment$SavedState(hVar.o());
                }
                return null;
            }
        }
        m0(new IllegalStateException(dw1.m("Fragment ", dVar, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void e(String str) {
        sl2 sl2Var = (sl2) this.n.remove(str);
        if (sl2Var != null) {
            sl2Var.a.f(sl2Var.c);
        }
    }

    public final void e0() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.x.u.removeCallbacks(this.Q);
                    this.x.u.post(this.Q);
                    n0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet f() {
        c cVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.J().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((h) it.next()).c.I;
            if (viewGroup != null) {
                js3.p(M(), "factory");
                Object tag = viewGroup.getTag(fr6.special_effects_controller_view_tag);
                if (tag instanceof c) {
                    cVar = (c) tag;
                } else {
                    cVar = new c(viewGroup);
                    viewGroup.setTag(fr6.special_effects_controller_view_tag, cVar);
                }
                hashSet.add(cVar);
            }
        }
        return hashSet;
    }

    public final void f0(d dVar, boolean z) {
        ViewGroup viewGroupK = K(dVar);
        if (viewGroupK == null || !(viewGroupK instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupK).setDrawDisappearingViewsLast(!z);
    }

    public final HashSet g(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((p40) arrayList.get(i)).a.iterator();
            while (it.hasNext()) {
                d dVar = ((cn2) it.next()).b;
                if (dVar != null && (viewGroup = dVar.I) != null) {
                    hashSet.add(c.j(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g0(android.os.Bundle r4, java.lang.String r5) {
        /*
            r3 = this;
            java.util.Map r0 = r3.n
            java.lang.Object r0 = r0.get(r5)
            sl2 r0 = (defpackage.sl2) r0
            if (r0 == 0) goto L1a
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle$State.d
            i64 r2 = r0.a
            androidx.lifecycle.Lifecycle$State r2 = r2.d
            boolean r1 = r2.a(r1)
            if (r1 == 0) goto L1a
            r0.B(r4, r5)
            goto L1f
        L1a:
            java.util.Map r0 = r3.m
            r0.put(r5, r4)
        L1f:
            r5 = 2
            boolean r5 = N(r5)
            if (r5 == 0) goto L29
            j$.util.Objects.toString(r4)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.g.g0(android.os.Bundle, java.lang.String):void");
    }

    public final h h(d dVar) {
        String str = dVar.f;
        vp7 vp7Var = this.c;
        h hVar = (h) ((HashMap) vp7Var.c).get(str);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.p, vp7Var, dVar);
        hVar2.m(this.x.t.getClassLoader());
        hVar2.e = this.w;
        return hVar2;
    }

    public final void h0(String str, FragmentActivity fragmentActivity, mm2 mm2Var) {
        i64 i64Var = fragmentActivity.a;
        if (i64Var.d == Lifecycle$State.a) {
            return;
        }
        ql2 ql2Var = new ql2(this, str, mm2Var, i64Var);
        sl2 sl2Var = (sl2) this.n.put(str, new sl2(i64Var, mm2Var, ql2Var));
        if (sl2Var != null) {
            sl2Var.a.f(sl2Var.c);
        }
        if (N(2)) {
            Objects.toString(mm2Var);
        }
        i64Var.a(ql2Var);
    }

    public final void i(d dVar) {
        if (N(2)) {
            Objects.toString(dVar);
        }
        if (dVar.D) {
            return;
        }
        dVar.D = true;
        if (dVar.l) {
            if (N(2)) {
                dVar.toString();
            }
            vp7 vp7Var = this.c;
            synchronized (((ArrayList) vp7Var.b)) {
                ((ArrayList) vp7Var.b).remove(dVar);
            }
            dVar.l = false;
            if (O(dVar)) {
                this.H = true;
            }
            k0(dVar);
        }
    }

    public final void i0(d dVar, Lifecycle$State lifecycle$State) {
        if (dVar.equals(this.c.C(dVar.f)) && (dVar.w == null || dVar.v == this)) {
            dVar.T = lifecycle$State;
            return;
        }
        throw new IllegalArgumentException("Fragment " + dVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void j(boolean z, Configuration configuration) {
        if (z && this.x != null) {
            m0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (d dVar : this.c.S()) {
            if (dVar != null) {
                dVar.onConfigurationChanged(configuration);
                if (z) {
                    dVar.x.j(true, configuration);
                }
            }
        }
    }

    public final void j0(d dVar) {
        if (dVar != null) {
            if (!dVar.equals(this.c.C(dVar.f)) || (dVar.w != null && dVar.v != this)) {
                throw new IllegalArgumentException("Fragment " + dVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        d dVar2 = this.A;
        this.A = dVar;
        s(dVar2);
        s(this.A);
    }

    public final boolean k() {
        if (this.w >= 1) {
            for (d dVar : this.c.S()) {
                if (dVar != null) {
                    if (!dVar.C ? dVar.x.k() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void k0(d dVar) {
        ViewGroup viewGroupK = K(dVar);
        if (viewGroupK != null) {
            qk2 qk2Var = dVar.M;
            if ((qk2Var == null ? 0 : qk2Var.e) + (qk2Var == null ? 0 : qk2Var.d) + (qk2Var == null ? 0 : qk2Var.c) + (qk2Var == null ? 0 : qk2Var.b) > 0) {
                if (viewGroupK.getTag(fr6.visible_removing_fragment_view_tag) == null) {
                    viewGroupK.setTag(fr6.visible_removing_fragment_view_tag, dVar);
                }
                d dVar2 = (d) viewGroupK.getTag(fr6.visible_removing_fragment_view_tag);
                qk2 qk2Var2 = dVar.M;
                boolean z = qk2Var2 != null ? qk2Var2.a : false;
                if (dVar2.M == null) {
                    return;
                }
                dVar2.A().a = z;
            }
        }
    }

    public final boolean l() {
        if (this.w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (d dVar : this.c.S()) {
            if (dVar != null && Q(dVar)) {
                if (!dVar.C ? dVar.x.l() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(dVar);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                d dVar2 = (d) this.e.get(i);
                if (arrayList == null || !arrayList.contains(dVar2)) {
                    dVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void l0() {
        for (h hVar : this.c.J()) {
            d dVar = hVar.c;
            if (dVar.K) {
                if (this.b) {
                    this.L = true;
                } else {
                    dVar.K = false;
                    hVar.k();
                }
            }
        }
    }

    public final void m() {
        boolean z;
        this.K = true;
        B(true);
        y();
        tk2 tk2Var = this.x;
        vp7 vp7Var = this.c;
        if (tk2Var != null) {
            z = ((yl2) vp7Var.e).f;
        } else {
            z = o40.O(tk2Var.t) ? !r1.isChangingConfigurations() : true;
        }
        if (z) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).a.iterator();
                while (it2.hasNext()) {
                    ((yl2) vp7Var.e).f((String) it2.next(), false);
                }
            }
        }
        v(-1);
        tk2 tk2Var2 = this.x;
        if (tk2Var2 != null) {
            FragmentActivity fragmentActivity = tk2Var2.w;
            fragmentActivity.getClass();
            ol2 ol2Var = this.s;
            js3.p(ol2Var, "listener");
            fragmentActivity.k.remove(ol2Var);
        }
        tk2 tk2Var3 = this.x;
        if (tk2Var3 != null) {
            tk2Var3.w(this.r);
        }
        tk2 tk2Var4 = this.x;
        if (tk2Var4 != null) {
            FragmentActivity fragmentActivity2 = tk2Var4.w;
            fragmentActivity2.getClass();
            ol2 ol2Var2 = this.t;
            js3.p(ol2Var2, "listener");
            fragmentActivity2.m.remove(ol2Var2);
        }
        tk2 tk2Var5 = this.x;
        if (tk2Var5 != null) {
            FragmentActivity fragmentActivity3 = tk2Var5.w;
            fragmentActivity3.getClass();
            ol2 ol2Var3 = this.u;
            js3.p(ol2Var3, "listener");
            fragmentActivity3.n.remove(ol2Var3);
        }
        tk2 tk2Var6 = this.x;
        if ((tk2Var6 != null) && this.z == null) {
            FragmentActivity fragmentActivity4 = tk2Var6.w;
            fragmentActivity4.getClass();
            l60 l60Var = this.v;
            js3.p(l60Var, "provider");
            fragmentActivity4.c.a(l60Var);
        }
        this.x = null;
        this.y = null;
        this.z = null;
        if (this.g != null) {
            this.j.e();
            this.g = null;
        }
        y7 y7Var = this.D;
        if (y7Var != null) {
            y7Var.b();
            this.E.b();
            this.F.b();
        }
    }

    public final void m0(RuntimeException runtimeException) {
        t0.d("FragmentManager", runtimeException.getMessage());
        t0.d("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new nd4());
        tk2 tk2Var = this.x;
        if (tk2Var == null) {
            try {
                x("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                t0.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            tk2Var.w.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            t0.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void n(boolean z) {
        if (z && this.x != null) {
            m0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (d dVar : this.c.S()) {
            if (dVar != null) {
                dVar.H = true;
                if (z) {
                    dVar.x.n(true);
                }
            }
        }
    }

    public final void n0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.j.f(true);
                    if (N(3)) {
                        toString();
                    }
                } else {
                    boolean z = this.d.size() + (this.h != null ? 1 : 0) > 0 && R(this.z);
                    if (N(3)) {
                        toString();
                    }
                    this.j.f(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(boolean z) {
        if (z && this.x != null) {
            m0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (d dVar : this.c.S()) {
            if (dVar != null && z) {
                dVar.x.o(true);
            }
        }
    }

    public final void p() {
        for (d dVar : this.c.K()) {
            if (dVar != null) {
                dVar.R();
                dVar.x.p();
            }
        }
    }

    public final boolean q() {
        if (this.w >= 1) {
            for (d dVar : this.c.S()) {
                if (dVar != null) {
                    if (!dVar.C ? dVar.x.q() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void r() {
        if (this.w < 1) {
            return;
        }
        for (d dVar : this.c.S()) {
            if (dVar != null && !dVar.C) {
                dVar.x.r();
            }
        }
    }

    public final void s(d dVar) {
        if (dVar != null) {
            if (dVar.equals(this.c.C(dVar.f))) {
                dVar.v.getClass();
                boolean zR = R(dVar);
                Boolean bool = dVar.k;
                if (bool == null || bool.booleanValue() != zR) {
                    dVar.k = Boolean.valueOf(zR);
                    wl2 wl2Var = dVar.x;
                    wl2Var.n0();
                    wl2Var.s(wl2Var.A);
                }
            }
        }
    }

    public final void t(boolean z) {
        if (z && this.x != null) {
            m0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (d dVar : this.c.S()) {
            if (dVar != null && z) {
                dVar.x.t(true);
            }
        }
    }

    public final String toString() {
        StringBuilder sbA = o40.A(128, "FragmentManager{");
        sbA.append(Integer.toHexString(System.identityHashCode(this)));
        sbA.append(" in ");
        d dVar = this.z;
        if (dVar != null) {
            sbA.append(dVar.getClass().getSimpleName());
            sbA.append("{");
            sbA.append(Integer.toHexString(System.identityHashCode(this.z)));
            sbA.append("}");
        } else {
            tk2 tk2Var = this.x;
            if (tk2Var != null) {
                sbA.append(tk2Var.getClass().getSimpleName());
                sbA.append("{");
                sbA.append(Integer.toHexString(System.identityHashCode(this.x)));
                sbA.append("}");
            } else {
                sbA.append(Ssh2PublicKeyAlgorithmName.NULL);
            }
        }
        sbA.append("}}");
        return sbA.toString();
    }

    public final boolean u() {
        if (this.w < 1) {
            return false;
        }
        boolean z = false;
        for (d dVar : this.c.S()) {
            if (dVar != null && Q(dVar)) {
                if (!dVar.C ? dVar.x.u() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void v(int i) {
        try {
            this.b = true;
            for (h hVar : ((HashMap) this.c.c).values()) {
                if (hVar != null) {
                    hVar.e = i;
                }
            }
            T(i, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((c) it.next()).i();
            }
            this.b = false;
            B(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void w() {
        if (this.L) {
            this.L = false;
            l0();
        }
    }

    public final void x(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strI = t61.i(str, "    ");
        vp7 vp7Var = this.c;
        ArrayList arrayList = (ArrayList) vp7Var.b;
        String strI2 = t61.i(str, "    ");
        HashMap map = (HashMap) vp7Var.c;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (h hVar : map.values()) {
                printWriter.print(str);
                if (hVar != null) {
                    d dVar = hVar.c;
                    printWriter.println(dVar);
                    dVar.z(strI2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(Ssh2PublicKeyAlgorithmName.NULL);
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                d dVar2 = (d) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(dVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                d dVar3 = (d) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(dVar3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                p40 p40Var = (p40) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(p40Var.toString());
                p40Var.i(strI, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (tl2) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.y);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public final void y() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((c) it.next()).i();
        }
    }

    public final void z(tl2 tl2Var, boolean z) {
        if (!z) {
            if (this.x == null) {
                if (!this.K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (S()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            try {
                if (this.x == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(tl2Var);
                    e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
