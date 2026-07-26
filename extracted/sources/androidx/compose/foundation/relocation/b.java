package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.m;
import defpackage.bp2;
import defpackage.f8;
import defpackage.gx4;
import defpackage.js3;
import defpackage.rg0;
import defpackage.sy6;
import defpackage.t04;
import defpackage.tx8;
import defpackage.v04;
import defpackage.y40;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class b extends gx4 implements rg0, t04 {
    public androidx.compose.foundation.gestures.b o;
    public boolean p;

    public static final sy6 C0(b bVar, m mVar, bp2 bp2Var) {
        sy6 sy6Var;
        if (bVar.n && bVar.p) {
            m mVarG = y40.G(bVar);
            if (!mVar.J0().n) {
                mVar = null;
            }
            if (mVar != null && (sy6Var = (sy6) bp2Var.invoke()) != null) {
                return sy6Var.i(mVarG.I(mVar, false).d());
            }
        }
        return null;
    }

    @Override // defpackage.rg0
    public final Object W(m mVar, bp2 bp2Var, ContinuationImpl continuationImpl) {
        Object objV = js3.v(new BringIntoViewResponderNode$bringIntoView$2(this, mVar, bp2Var, new f8(this, mVar, bp2Var, 7), null), continuationImpl);
        return objV == CoroutineSingletons.a ? objV : tx8.a;
    }

    @Override // defpackage.t04
    public final void k(v04 v04Var) {
        this.p = true;
    }

    @Override // defpackage.t04
    public final /* synthetic */ void n(long j) {
    }

    @Override // defpackage.gx4
    public final boolean p0() {
        return false;
    }
}
