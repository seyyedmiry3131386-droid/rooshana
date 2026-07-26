package androidx.constraintlayout.core.widgets.analyzer;

import defpackage.wj1;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    public int m;

    public b(f fVar) {
        super(fVar);
        if (fVar instanceof d) {
            this.e = DependencyNode$Type.b;
        } else {
            this.e = DependencyNode$Type.c;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.a
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (wj1 wj1Var : this.k) {
            wj1Var.a(wj1Var);
        }
    }
}
