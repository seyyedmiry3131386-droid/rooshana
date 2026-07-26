package defpackage;

import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m6 extends k79 {
    public final i b;
    public final pv6 c;

    public m6() {
        i iVarD = vy2.d(20, 10, BufferOverflow.b);
        this.b = iVarD;
        this.c = new pv6(iVarD);
    }

    public final void e(l79 l79Var) {
        js3.p(l79Var, PackageListMetaDataDTO.KEY_ACTION);
        this.b.e(l79Var);
    }
}
