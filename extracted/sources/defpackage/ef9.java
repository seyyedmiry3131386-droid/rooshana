package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class ef9 extends df9 {
    public no3 o;
    public no3 p;
    public no3 q;

    public ef9(lf9 lf9Var, WindowInsets windowInsets) {
        super(lf9Var, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.if9
    public no3 i() {
        if (this.p == null) {
            this.p = no3.d(this.c.getMandatorySystemGestureInsets());
        }
        return this.p;
    }

    @Override // defpackage.if9
    public no3 k() {
        if (this.o == null) {
            this.o = no3.d(this.c.getSystemGestureInsets());
        }
        return this.o;
    }

    @Override // defpackage.if9
    public no3 m() {
        if (this.q == null) {
            this.q = no3.d(this.c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // defpackage.bf9, defpackage.if9
    public lf9 n(int i, int i2, int i3, int i4) {
        return lf9.h(null, this.c.inset(i, i2, i3, i4));
    }

    public ef9(lf9 lf9Var, ef9 ef9Var) {
        super(lf9Var, ef9Var);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.cf9, defpackage.if9
    public void u(no3 no3Var) {
    }
}
