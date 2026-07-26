package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jo9 implements Callable {
    public static final /* synthetic */ jo9 a = new jo9();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ws9 ws9Var = new ws9("internal.platform", 4);
        ws9Var.b.put("getVersion", new ws9("getVersion", 3));
        return ws9Var;
    }
}
