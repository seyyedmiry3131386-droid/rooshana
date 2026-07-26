package kotlinx.coroutines.flow.internal;

import defpackage.g51;
import defpackage.js3;
import defpackage.rp2;
import defpackage.rv6;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements xe2 {
    public final /* synthetic */ xe2 a;
    public final /* synthetic */ xe2 b;
    public final /* synthetic */ rp2 c;

    public g(rv6 rv6Var, xe2 xe2Var, rp2 rp2Var) {
        this.a = rv6Var;
        this.b = xe2Var;
        this.c = rp2Var;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) {
        Object objV = js3.v(new CombineKt$zipImpl$1$1(this.a, this.b, ze2Var, this.c, null), g51Var);
        return objV == CoroutineSingletons.a ? objV : tx8.a;
    }
}
