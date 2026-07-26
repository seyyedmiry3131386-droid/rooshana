package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class en5 {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ fn5 c;

    public en5(fn5 fn5Var, sd1 sd1Var, Executor executor) {
        this.c = fn5Var;
        this.a = new WeakReference(sd1Var);
        this.b = executor;
    }
}
