package androidx.paging;

import defpackage.bt2;
import defpackage.fu0;
import defpackage.js3;
import defpackage.li1;
import defpackage.vb7;
import defpackage.vy2;
import defpackage.xe2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final f a;
    public final kotlinx.coroutines.flow.i b;
    public final kotlinx.coroutines.flow.n c;
    public final li1 d;
    public final vb7 e;

    public d(xe2 xe2Var, fu0 fu0Var) {
        js3.p(xe2Var, "src");
        this.a = new f();
        kotlinx.coroutines.flow.i iVarD = vy2.d(1, Integer.MAX_VALUE, BufferOverflow.a);
        this.b = iVarD;
        this.c = new kotlinx.coroutines.flow.n(iVarD, new CachedPageEventFlow$sharedForDownstream$1(this, null));
        li1 li1VarG = bt2.G(fu0Var, null, CoroutineStart.b, new CachedPageEventFlow$job$1(xe2Var, this, null), 1);
        li1VarG.s0(new defpackage.n(21, this));
        this.d = li1VarG;
        this.e = new vb7(new CachedPageEventFlow$downstreamFlow$1(this, null));
    }
}
