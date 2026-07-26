package defpackage;

import androidx.constraintlayout.core.SolverVariable$Type;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class v21 {
    public int b;
    public boolean c;
    public final f31 d;
    public final ConstraintAnchor$Type e;
    public v21 f;
    public m18 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public v21(f31 f31Var, ConstraintAnchor$Type constraintAnchor$Type) {
        this.d = f31Var;
        this.e = constraintAnchor$Type;
    }

    public final void a(v21 v21Var, int i) {
        b(v21Var, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(v21 v21Var, int i, int i2, boolean z) {
        if (v21Var == null) {
            j();
            return true;
        }
        if (!z && !i(v21Var)) {
            return false;
        }
        this.f = v21Var;
        if (v21Var.a == null) {
            v21Var.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, zd9 zd9Var, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                dy3.t(((v21) it.next()).d, i, arrayList, zd9Var);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        v21 v21Var;
        if (this.d.i0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (v21Var = this.f) == null || v21Var.d.i0 != 8) ? this.g : i;
    }

    public final v21 f() {
        ConstraintAnchor$Type constraintAnchor$Type = this.e;
        int iOrdinal = constraintAnchor$Type.ordinal();
        f31 f31Var = this.d;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return f31Var.L;
            case 2:
                return f31Var.M;
            case 3:
                return f31Var.J;
            case 4:
                return f31Var.K;
            default:
                throw new AssertionError(constraintAnchor$Type.name());
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((v21) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    public final boolean i(v21 v21Var) {
        if (v21Var == null) {
            return false;
        }
        f31 f31Var = v21Var.d;
        ConstraintAnchor$Type constraintAnchor$Type = v21Var.e;
        ConstraintAnchor$Type constraintAnchor$Type2 = ConstraintAnchor$Type.e;
        ConstraintAnchor$Type constraintAnchor$Type3 = this.e;
        if (constraintAnchor$Type == constraintAnchor$Type3) {
            return constraintAnchor$Type3 != constraintAnchor$Type2 || (f31Var.E && this.d.E);
        }
        int iOrdinal = constraintAnchor$Type3.ordinal();
        ConstraintAnchor$Type constraintAnchor$Type4 = ConstraintAnchor$Type.c;
        ConstraintAnchor$Type constraintAnchor$Type5 = ConstraintAnchor$Type.a;
        ConstraintAnchor$Type constraintAnchor$Type6 = ConstraintAnchor$Type.h;
        ConstraintAnchor$Type constraintAnchor$Type7 = ConstraintAnchor$Type.g;
        switch (iOrdinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z = constraintAnchor$Type == constraintAnchor$Type5 || constraintAnchor$Type == constraintAnchor$Type4;
                return f31Var instanceof aw2 ? z || constraintAnchor$Type == constraintAnchor$Type7 : z;
            case 2:
            case 4:
                boolean z2 = constraintAnchor$Type == ConstraintAnchor$Type.b || constraintAnchor$Type == ConstraintAnchor$Type.d;
                return f31Var instanceof aw2 ? z2 || constraintAnchor$Type == constraintAnchor$Type6 : z2;
            case 5:
                return (constraintAnchor$Type == constraintAnchor$Type5 || constraintAnchor$Type == constraintAnchor$Type4) ? false : true;
            case 6:
                return (constraintAnchor$Type == constraintAnchor$Type2 || constraintAnchor$Type == constraintAnchor$Type7 || constraintAnchor$Type == constraintAnchor$Type6) ? false : true;
            default:
                throw new AssertionError(constraintAnchor$Type3.name());
        }
    }

    public final void j() {
        HashSet hashSet;
        v21 v21Var = this.f;
        if (v21Var != null && (hashSet = v21Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        m18 m18Var = this.i;
        if (m18Var == null) {
            this.i = new m18(SolverVariable$Type.a);
        } else {
            m18Var.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.k0 + ":" + this.e.toString();
    }
}
