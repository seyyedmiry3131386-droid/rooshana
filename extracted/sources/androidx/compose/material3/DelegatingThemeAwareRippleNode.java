package androidx.compose.material3;

import defpackage.ab5;
import defpackage.br9;
import defpackage.iv0;
import defpackage.jr5;
import defpackage.m01;
import defpackage.ph;
import defpackage.ti1;

/* JADX INFO: loaded from: classes.dex */
final class DelegatingThemeAwareRippleNode extends ti1 implements m01, jr5 {
    private final iv0 color;
    public final ab5 q;
    public final boolean r;
    public final float s;
    public ph t;

    public DelegatingThemeAwareRippleNode(ab5 ab5Var, boolean z, float f, iv0 iv0Var) {
        this.q = ab5Var;
        this.r = z;
        this.s = f;
        this.color = iv0Var;
    }

    @Override // defpackage.jr5
    public final void Y() {
        br9.G(this, new c(this, 0));
    }

    @Override // defpackage.gx4
    public final void s0() {
        br9.G(this, new c(this, 0));
    }
}
