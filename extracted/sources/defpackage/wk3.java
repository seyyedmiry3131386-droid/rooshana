package defpackage;

import ir.mservices.market.app.detail.update.InAppUpdateActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class wk3 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InAppUpdateActivity b;

    public /* synthetic */ wk3(InAppUpdateActivity inAppUpdateActivity, int i) {
        this.a = i;
        this.b = inAppUpdateActivity;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.h();
            case 1:
                return this.b.m();
            default:
                return this.b.i();
        }
    }
}
