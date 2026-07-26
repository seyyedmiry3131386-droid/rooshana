package defpackage;

import androidx.room.d;
import ir.myket.player.viewmodel.b;
import ir.myket.player.viewmodel.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class f9 implements xe2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe2 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f9(xe2 xe2Var, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = xe2Var;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) {
        switch (this.a) {
            case 0:
                Object objA = ((xp) this.b).a(new e9(ze2Var, (ub) this.c, (b) this.d, 0), g51Var);
                return objA == CoroutineSingletons.a ? objA : tx8.a;
            case 1:
                Object objA2 = this.b.a(new e9(ze2Var, (d) this.c, (i25) this.d, 3), g51Var);
                return objA2 == CoroutineSingletons.a ? objA2 : tx8.a;
            case 2:
                Object objA3 = this.b.a(new e9(ze2Var, (String) this.c, (ir.mservices.market.version2.manager.d) this.d, 5), g51Var);
                return objA3 == CoroutineSingletons.a ? objA3 : tx8.a;
            case 3:
                Object objA4 = ((xp) this.b).a(new e9(ze2Var, (as2) this.c, (String) this.d, 7), g51Var);
                return objA4 == CoroutineSingletons.a ? objA4 : tx8.a;
            case 4:
                Object objA5 = this.b.a(new ir.mservices.market.version2.core.utils.b(ze2Var, (dp2) this.c, (ArrayList) this.d, 0), g51Var);
                return objA5 == CoroutineSingletons.a ? objA5 : tx8.a;
            case 5:
                Object objA6 = this.b.a(new ir.mservices.market.version2.core.utils.b(ze2Var, (vd7) this.c, (ArrayList) this.d, 1), g51Var);
                return objA6 == CoroutineSingletons.a ? objA6 : tx8.a;
            case 6:
                Object objA7 = this.b.a(new ir.mservices.market.version2.core.utils.b(ze2Var, (dp2) this.c, (qp2) this.d, 2), g51Var);
                return objA7 == CoroutineSingletons.a ? objA7 : tx8.a;
            case 7:
                Object objA8 = this.b.a(new ir.mservices.market.version2.core.utils.b(ze2Var, (dp2) this.c, (List) this.d, 3), g51Var);
                return objA8 == CoroutineSingletons.a ? objA8 : tx8.a;
            default:
                ((l) this.b).a(new e9(ze2Var, (e) this.c, (fs2) this.d, 8), g51Var);
                return CoroutineSingletons.a;
        }
    }
}
