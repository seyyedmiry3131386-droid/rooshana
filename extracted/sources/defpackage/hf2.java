package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.g;

/* JADX INFO: loaded from: classes3.dex */
public final class hf2 implements xe2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ xe2 c;

    public /* synthetic */ hf2(xe2 xe2Var, int i, int i2) {
        this.a = i2;
        this.c = xe2Var;
        this.b = i;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) {
        switch (this.a) {
            case 0:
                Object objA = this.c.a(new g(new Ref$IntRef(), this.b, ze2Var), g51Var);
                if (objA != CoroutineSingletons.a) {
                    break;
                }
                break;
            default:
                Object objA2 = ((hf2) this.c).a(new ez5(ze2Var, this.b), g51Var);
                if (objA2 != CoroutineSingletons.a) {
                    break;
                }
                break;
        }
        return tx8.a;
    }
}
