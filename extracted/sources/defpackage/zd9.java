package defpackage;

import ir.mservices.market.purchaseTransaction.data.PurchaseTransactionDTO;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zd9 {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                zd9 zd9Var = (zd9) arrayList.get(i);
                if (this.e == zd9Var.b) {
                    c(this.c, zd9Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(l74 l74Var, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        g31 g31Var = (g31) ((f31) arrayList.get(0)).V;
        l74Var.t();
        g31Var.b(l74Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((f31) arrayList.get(i2)).b(l74Var, false);
        }
        if (i == 0 && g31Var.D0 > 0) {
            bt2.g(g31Var, l74Var, arrayList, 0);
        }
        if (i == 1 && g31Var.E0 > 0) {
            bt2.g(g31Var, l74Var, arrayList, 1);
        }
        try {
            l74Var.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            f31 f31Var = (f31) arrayList.get(i3);
            xs8 xs8Var = new xs8();
            new WeakReference(f31Var);
            l74.n(f31Var.J);
            l74.n(f31Var.K);
            l74.n(f31Var.L);
            l74.n(f31Var.M);
            l74.n(f31Var.N);
            this.d.add(xs8Var);
        }
        if (i == 0) {
            iN = l74.n(g31Var.J);
            iN2 = l74.n(g31Var.L);
            l74Var.t();
        } else {
            iN = l74.n(g31Var.K);
            iN2 = l74.n(g31Var.M);
            l74Var.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, zd9 zd9Var) {
        int i2 = zd9Var.b;
        for (f31 f31Var : this.a) {
            ArrayList arrayList = zd9Var.a;
            if (!arrayList.contains(f31Var)) {
                arrayList.add(f31Var);
            }
            if (i == 0) {
                f31Var.s0 = i2;
            } else {
                f31Var.t0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : PurchaseTransactionDTO.PURCHASE_STATUS_UNKNOWN);
        sb.append(" [");
        String strK = dw1.k(this.b, "] <", sb);
        for (f31 f31Var : this.a) {
            StringBuilder sbE = bl4.E(strK, " ");
            sbE.append(f31Var.k0);
            strK = sbE.toString();
        }
        return t61.i(strK, " >");
    }
}
