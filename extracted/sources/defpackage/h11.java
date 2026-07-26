package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public final class h11 implements xe2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ h11(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) throws Throwable {
        switch (this.a) {
            case 0:
                this.b.a(new n4(ze2Var, 23), g51Var);
                break;
            case 1:
                this.b.a(new og6(ze2Var, 24), g51Var);
                break;
            default:
                this.b.a(new vc8(ze2Var, 3), g51Var);
                break;
        }
        return CoroutineSingletons.a;
    }
}
