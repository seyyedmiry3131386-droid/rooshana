package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ io.sentry.internal.debugmeta.c b;

    public /* synthetic */ q4(io.sentry.internal.debugmeta.c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return Integer.valueOf(this.b.p().length);
            case 1:
                return this.b.p();
            case 2:
                return Integer.valueOf(this.b.p().length);
            case 3:
                return this.b.p();
            case 4:
                return Integer.valueOf(this.b.p().length);
            case 5:
                return this.b.p();
            case 6:
                return Integer.valueOf(this.b.p().length);
            case 7:
                return Integer.valueOf(this.b.p().length);
            case 8:
                return this.b.p();
            case 9:
                return Integer.valueOf(this.b.p().length);
            case 10:
                return this.b.p();
            case 11:
                return Integer.valueOf(this.b.p().length);
            case 12:
                return this.b.p();
            case 13:
                return this.b.p();
            case 14:
                return Integer.valueOf(this.b.p().length);
            case 15:
                return this.b.p();
            case 16:
                return Integer.valueOf(this.b.p().length);
            default:
                return this.b.p();
        }
    }
}
