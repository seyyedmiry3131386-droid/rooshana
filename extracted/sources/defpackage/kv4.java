package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kv4 {
    public final nc2 a;
    public final wv8 b;
    public final HashMap c;

    public kv4(Context context, wv8 wv8Var) {
        nc2 nc2Var = new nc2(19, context);
        this.c = new HashMap();
        this.a = nc2Var;
        this.b = wv8Var;
    }

    public final synchronized bs8 a(String str) {
        if (this.c.containsKey(str)) {
            return (bs8) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryO = this.a.o(str);
        if (cctBackendFactoryO == null) {
            return null;
        }
        wv8 wv8Var = this.b;
        bs8 bs8VarCreate = cctBackendFactoryO.create(new j20((Context) wv8Var.b, (wt0) wv8Var.c, (wt0) wv8Var.d, str));
        this.c.put(str, bs8VarCreate);
        return bs8VarCreate;
    }
}
