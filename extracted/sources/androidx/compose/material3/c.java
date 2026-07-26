package androidx.compose.material3;

import defpackage.ab5;
import defpackage.bp2;
import defpackage.lt8;
import defpackage.ok4;
import defpackage.ph;
import defpackage.q97;
import defpackage.r97;
import defpackage.s97;
import defpackage.tx8;
import defpackage.y97;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DelegatingThemeAwareRippleNode b;

    public /* synthetic */ c(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, int i) {
        this.a = i;
        this.b = delegatingThemeAwareRippleNode;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        int i = this.a;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.b;
        switch (i) {
            case 0:
                if (((q97) y97.t(delegatingThemeAwareRippleNode, r97.a)) == null) {
                    ph phVar = delegatingThemeAwareRippleNode.t;
                    if (phVar != null) {
                        delegatingThemeAwareRippleNode.D0(phVar);
                    }
                    delegatingThemeAwareRippleNode.t = null;
                } else if (delegatingThemeAwareRippleNode.t == null) {
                    d dVar = new d(delegatingThemeAwareRippleNode);
                    c cVar = new c(delegatingThemeAwareRippleNode, 1);
                    ab5 ab5Var = delegatingThemeAwareRippleNode.q;
                    boolean z = delegatingThemeAwareRippleNode.r;
                    float f = delegatingThemeAwareRippleNode.s;
                    lt8 lt8Var = s97.a;
                    ph phVar2 = new ph(ab5Var, z, f, dVar, cVar);
                    delegatingThemeAwareRippleNode.C0(phVar2);
                    delegatingThemeAwareRippleNode.t = phVar2;
                }
                return tx8.a;
            default:
                return ok4.c;
        }
    }
}
