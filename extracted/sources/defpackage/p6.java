package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class p6 implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ p6(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(new o6(runnable, 0), "glide-active-resources");
            case 1:
                return new nx(runnable);
            default:
                return new i57(runnable);
        }
    }
}
