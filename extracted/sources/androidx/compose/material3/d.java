package androidx.compose.material3;

import defpackage.iv0;
import defpackage.q97;
import defpackage.r97;
import defpackage.u31;
import defpackage.y97;
import defpackage.zu0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements iv0 {
    public final /* synthetic */ DelegatingThemeAwareRippleNode a;

    public d(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        this.a = delegatingThemeAwareRippleNode;
    }

    @Override // defpackage.iv0
    public final long a() {
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.a;
        long jA = delegatingThemeAwareRippleNode.color.a();
        if (jA != 16) {
            return jA;
        }
        q97 q97Var = (q97) y97.t(delegatingThemeAwareRippleNode, r97.a);
        if (q97Var != null) {
            long j = q97Var.a;
            if (j != 16) {
                return j;
            }
        }
        return ((zu0) y97.t(delegatingThemeAwareRippleNode, u31.a)).a;
    }
}
