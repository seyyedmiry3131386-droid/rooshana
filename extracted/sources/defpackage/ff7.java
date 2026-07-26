package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ff7 implements d82 {
    public final /* synthetic */ int a;
    public final pn6 b;
    public final pn6 c;
    public final d82 d;

    public /* synthetic */ ff7(pn6 pn6Var, pn6 pn6Var2, d82 d82Var, int i) {
        this.a = i;
        this.b = pn6Var;
        this.c = pn6Var2;
        this.d = d82Var;
    }

    @Override // defpackage.pn6
    public final Object get() {
        switch (this.a) {
            case 0:
                return new pa2((Context) this.b.get(), (i42) this.c.get(), (z20) ((t42) this.d).get(), 8);
            default:
                return new es8(new vs8(), new bq8(), (df7) ((wg1) this.b).get(), (v24) ((g09) this.c).get(), (o77) ((kg9) this.d).get());
        }
    }
}
