package defpackage;

import ir.mservices.market.common.comment.CommentActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class dw0 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CommentActivity b;

    public /* synthetic */ dw0(CommentActivity commentActivity, int i) {
        this.a = i;
        this.b = commentActivity;
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
