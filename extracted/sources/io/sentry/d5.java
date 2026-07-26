package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class d5 implements o4 {
    public final /* synthetic */ int a;

    public /* synthetic */ d5(int i) {
        this.a = i;
    }

    @Override // io.sentry.o4
    public final n4 a() {
        switch (this.a) {
            case 0:
                return new c5();
            default:
                return new l5();
        }
    }
}
