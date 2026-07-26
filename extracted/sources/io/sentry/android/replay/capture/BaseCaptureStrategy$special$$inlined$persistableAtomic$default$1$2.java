package io.sentry.android.replay.capture;

import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2 extends Lambda implements bp2 {
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2(Object obj, Object obj2, b bVar) {
        super(0);
        this.g = obj;
        this.h = obj2;
        this.i = bVar;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        io.sentry.android.replay.h hVar = this.i.h;
        if (hVar != null) {
            hVar.k("replay.id", String.valueOf(this.h));
        }
        return tx8.a;
    }
}
