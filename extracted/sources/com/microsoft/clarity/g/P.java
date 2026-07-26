package com.microsoft.clarity.g;

import defpackage.bp2;
import defpackage.tx8;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class P extends Lambda implements bp2 {
    public final /* synthetic */ Ref$ObjectRef a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Ref$ObjectRef ref$ObjectRef) {
        super(0);
        this.a = ref$ObjectRef;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        CountDownLatch countDownLatch;
        N n = (N) this.a.a;
        if (n != null && (countDownLatch = n.d) != null) {
            countDownLatch.countDown();
        }
        return tx8.a;
    }
}
