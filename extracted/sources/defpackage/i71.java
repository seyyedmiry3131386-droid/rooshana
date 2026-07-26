package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class i71 implements d82 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ i71(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pn6
    public final Object get() {
        switch (this.a) {
            case 0:
                return new wv8((Context) ((i71) this.b).b, new vs8(), new bq8(), 16);
            default:
                return this.b;
        }
    }
}
