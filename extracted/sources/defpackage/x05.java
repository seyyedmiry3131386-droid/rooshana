package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class x05 implements xe2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ x05(l lVar, String str, int i) {
        this.a = i;
        this.b = lVar;
        this.c = str;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) {
        switch (this.a) {
            case 0:
                Object objA = this.b.a(new w05(ze2Var, this.c, 0), g51Var);
                if (objA != CoroutineSingletons.a) {
                    break;
                }
                break;
            default:
                Object objA2 = this.b.a(new w05(ze2Var, this.c, 6), g51Var);
                if (objA2 != CoroutineSingletons.a) {
                    break;
                }
                break;
        }
        return tx8.a;
    }
}
