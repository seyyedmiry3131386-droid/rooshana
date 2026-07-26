package io.sentry.android.replay.capture;

import defpackage.bp2;
import defpackage.tx8;
import java.util.Date;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2$2 extends Lambda implements bp2 {
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2$2(Object obj, Object obj2, b bVar) {
        super(0);
        this.g = obj;
        this.h = obj2;
        this.i = bVar;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        Date date = (Date) this.h;
        io.sentry.android.replay.h hVar = this.i.h;
        if (hVar != null) {
            hVar.k("segment.timestamp", date == null ? null : io.sentry.config.a.H(date));
        }
        return tx8.a;
    }
}
