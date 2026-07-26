package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class j42 implements d82 {
    public final /* synthetic */ int a;
    public final pn6 b;

    public /* synthetic */ j42(pn6 pn6Var, int i) {
        this.a = i;
        this.b = pn6Var;
    }

    @Override // defpackage.pn6
    public final Object get() {
        switch (this.a) {
            case 0:
                String packageName = ((Context) this.b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new jf7(Integer.valueOf(jf7.d).intValue(), (Context) this.b.get(), "com.google.android.datatransport.events");
        }
    }
}
