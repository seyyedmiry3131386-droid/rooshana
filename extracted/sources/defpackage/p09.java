package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class p09 implements pz3 {
    public final o09 a;
    public final Object b;

    public p09(o09 o09Var) {
        js3.p(o09Var, "urlCallbackDao");
        this.a = o09Var;
        this.b = a.b(LazyThreadSafetyMode.a, new i30(this, 19));
    }

    @Override // defpackage.pz3
    public final /* bridge */ mz3 getKoin() {
        return at2.getKoin();
    }
}
