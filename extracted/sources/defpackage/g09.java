package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class g09 implements d82 {
    public final pn6 a;
    public final pn6 b;
    public final pn6 c;
    public final ff7 d;
    public final pn6 e;
    public final pn6 f;
    public final pn6 g;

    public g09(pn6 pn6Var, pn6 pn6Var2, pn6 pn6Var3, ff7 ff7Var, pn6 pn6Var4, pn6 pn6Var5, pn6 pn6Var6) {
        this.a = pn6Var;
        this.b = pn6Var2;
        this.c = pn6Var3;
        this.d = ff7Var;
        this.e = pn6Var4;
        this.f = pn6Var5;
        this.g = pn6Var6;
    }

    @Override // defpackage.pn6
    public final Object get() {
        Context context = (Context) this.a.get();
        kv4 kv4Var = (kv4) this.b.get();
        i42 i42Var = (i42) this.c.get();
        pa2 pa2Var = (pa2) this.d.get();
        Executor executor = (Executor) this.e.get();
        od8 od8Var = (od8) this.f.get();
        vs8 vs8Var = new vs8();
        bq8 bq8Var = new bq8();
        jt0 jt0Var = (jt0) this.g.get();
        v24 v24Var = new v24();
        v24Var.a = context;
        v24Var.b = kv4Var;
        v24Var.c = i42Var;
        v24Var.d = pa2Var;
        v24Var.e = executor;
        v24Var.f = od8Var;
        v24Var.g = vs8Var;
        v24Var.h = bq8Var;
        v24Var.i = jt0Var;
        return v24Var;
    }
}
