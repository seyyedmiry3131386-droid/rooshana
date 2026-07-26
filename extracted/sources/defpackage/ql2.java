package defpackage;

import android.os.Bundle;
import androidx.fragment.app.g;
import androidx.lifecycle.Lifecycle$Event;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ql2 implements b64 {
    public final /* synthetic */ String a;
    public final /* synthetic */ mm2 b;
    public final /* synthetic */ i64 c;
    public final /* synthetic */ g d;

    public ql2(g gVar, String str, mm2 mm2Var, i64 i64Var) {
        this.d = gVar;
        this.a = str;
        this.b = mm2Var;
        this.c = i64Var;
    }

    @Override // defpackage.b64
    public final void g(g64 g64Var, Lifecycle$Event lifecycle$Event) {
        Bundle bundle;
        g gVar = this.d;
        Map map = gVar.m;
        Lifecycle$Event lifecycle$Event2 = Lifecycle$Event.ON_START;
        String str = this.a;
        if (lifecycle$Event == lifecycle$Event2 && (bundle = (Bundle) map.get(str)) != null) {
            this.b.B(bundle, str);
            map.remove(str);
        }
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            this.c.f(this);
            gVar.n.remove(str);
        }
    }
}
