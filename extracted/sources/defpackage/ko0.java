package defpackage;

import androidx.constraintlayout.core.widgets.analyzer.a;
import androidx.constraintlayout.core.widgets.analyzer.f;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ko0 extends f {
    public final ArrayList k;
    public int l;

    public ko0(f31 f31Var, int i) {
        f31 f31Var2;
        super(f31Var);
        ArrayList<f> arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        f31 f31Var3 = this.b;
        f31 f31VarN = f31Var3.n(i);
        while (true) {
            f31Var2 = f31Var3;
            f31Var3 = f31VarN;
            if (f31Var3 == null) {
                break;
            } else {
                f31VarN = f31Var3.n(this.f);
            }
        }
        this.b = f31Var2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? f31Var2.d : i2 == 1 ? f31Var2.e : null);
        f31 f31VarM = f31Var2.m(this.f);
        while (f31VarM != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? f31VarM.d : i3 == 1 ? f31VarM.e : null);
            f31VarM = f31VarM.m(this.f);
        }
        for (f fVar : arrayList) {
            int i4 = this.f;
            if (i4 == 0) {
                fVar.b.b = this;
            } else if (i4 == 1) {
                fVar.b.c = this;
            }
        }
        if (this.f == 0 && ((g31) this.b.V).z0 && arrayList.size() > 1) {
            this.b = ((f) o40.u(1, arrayList)).b;
        }
        this.l = this.f == 0 ? this.b.l0 : this.b.m0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    @Override // defpackage.wj1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.wj1 r29) {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko0.a(wj1):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((f) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        f31 f31Var = ((f) arrayList.get(0)).b;
        f31 f31Var2 = ((f) arrayList.get(size - 1)).b;
        int i = this.f;
        a aVar = this.i;
        a aVar2 = this.h;
        if (i == 0) {
            v21 v21Var = f31Var.J;
            v21 v21Var2 = f31Var2.L;
            a aVarI = f.i(v21Var, 0);
            int iE = v21Var.e();
            f31 f31VarM = m();
            if (f31VarM != null) {
                iE = f31VarM.J.e();
            }
            if (aVarI != null) {
                f.b(aVar2, aVarI, iE);
            }
            a aVarI2 = f.i(v21Var2, 0);
            int iE2 = v21Var2.e();
            f31 f31VarN = n();
            if (f31VarN != null) {
                iE2 = f31VarN.L.e();
            }
            if (aVarI2 != null) {
                f.b(aVar, aVarI2, -iE2);
            }
        } else {
            v21 v21Var3 = f31Var.K;
            v21 v21Var4 = f31Var2.M;
            a aVarI3 = f.i(v21Var3, 1);
            int iE3 = v21Var3.e();
            f31 f31VarM2 = m();
            if (f31VarM2 != null) {
                iE3 = f31VarM2.K.e();
            }
            if (aVarI3 != null) {
                f.b(aVar2, aVarI3, iE3);
            }
            a aVarI4 = f.i(v21Var4, 1);
            int iE4 = v21Var4.e();
            f31 f31VarN2 = n();
            if (f31VarN2 != null) {
                iE4 = f31VarN2.M.e();
            }
            if (aVarI4 != null) {
                f.b(aVar, aVarI4, -iE4);
            }
        }
        aVar2.a = this;
        aVar.a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((f) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((f) it.next()).f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            f fVar = (f) arrayList.get(i);
            j = ((long) fVar.i.f) + fVar.j() + j + ((long) fVar.h.f);
        }
        return j;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((f) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final f31 m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            f31 f31Var = ((f) arrayList.get(i)).b;
            if (f31Var.i0 != 8) {
                return f31Var;
            }
            i++;
        }
    }

    public final f31 n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f31 f31Var = ((f) arrayList.get(size)).b;
            if (f31Var.i0 != 8) {
                return f31Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        for (f fVar : this.k) {
            sb.append(SimpleComparison.LESS_THAN_OPERATION);
            sb.append(fVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
