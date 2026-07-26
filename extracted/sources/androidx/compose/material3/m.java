package androidx.compose.material3;

import defpackage.ab5;
import defpackage.au1;
import defpackage.dw1;
import defpackage.ri1;
import defpackage.t97;
import defpackage.tw8;
import defpackage.um3;
import defpackage.zu0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements um3 {
    public final boolean a;
    public final float b;
    public final long c;

    public m(boolean z, float f, long j) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.um3
    public final ri1 a(ab5 ab5Var) {
        return new DelegatingThemeAwareRippleNode(ab5Var, this.a, this.b, new t97(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a == mVar.a && au1.b(this.b, mVar.b)) {
            return zu0.c(this.c, mVar.c);
        }
        return false;
    }

    @Override // defpackage.um3
    public final int hashCode() {
        int iG = dw1.g(this.b, (this.a ? 1231 : 1237) * 31, 961);
        int i = zu0.i;
        return tw8.a(this.c) + iG;
    }
}
