package io.sentry.android.replay.capture;

import defpackage.bp2;
import defpackage.tx8;
import io.sentry.android.replay.r;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1$2 extends Lambda implements bp2 {
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1$2(Object obj, Object obj2, b bVar) {
        super(0);
        this.g = obj;
        this.h = obj2;
        this.i = bVar;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        r rVar = (r) this.h;
        if (rVar != null) {
            b bVar = this.i;
            io.sentry.android.replay.h hVar = bVar.h;
            if (hVar != null) {
                hVar.k("config.height", String.valueOf(rVar.b));
            }
            io.sentry.android.replay.h hVar2 = bVar.h;
            if (hVar2 != null) {
                hVar2.k("config.width", String.valueOf(rVar.a));
            }
            io.sentry.android.replay.h hVar3 = bVar.h;
            if (hVar3 != null) {
                hVar3.k("config.frame-rate", String.valueOf(rVar.e));
            }
            io.sentry.android.replay.h hVar4 = bVar.h;
            if (hVar4 != null) {
                hVar4.k("config.bit-rate", String.valueOf(rVar.f));
            }
        }
        return tx8.a;
    }
}
