package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class lv4 implements d82 {
    public final /* synthetic */ int a;
    public final pn6 b;
    public final pn6 c;

    public /* synthetic */ lv4(pn6 pn6Var, pn6 pn6Var2, int i) {
        this.a = i;
        this.b = pn6Var;
        this.c = pn6Var2;
    }

    @Override // defpackage.pn6
    public final Object get() {
        switch (this.a) {
            case 0:
                return new kv4((Context) ((i71) this.b).b, (wv8) ((i71) this.c).get());
            default:
                return new qb7(new vs8(), new bq8(), m20.f, (jf7) this.b.get(), this.c);
        }
    }
}
