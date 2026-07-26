package defpackage;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.g;

/* JADX INFO: loaded from: classes.dex */
public final class cm5 {
    public final o77 a;
    public final ql3 b;
    public final g c;
    public final bl0 d;
    public int e;
    public final kr0 f;

    public cm5(g gVar, bl0 bl0Var, j58 j58Var, ql3 ql3Var) {
        kr0 kr0Var = new kr0(2, this);
        this.f = kr0Var;
        this.c = gVar;
        this.d = bl0Var;
        j58Var.getClass();
        o77 o77Var = new o77();
        o77Var.d = j58Var;
        o77Var.a = new SparseIntArray(1);
        o77Var.b = new SparseIntArray(1);
        o77Var.c = this;
        this.a = o77Var;
        this.b = ql3Var;
        this.e = gVar.c();
        gVar.t(kr0Var);
    }
}
