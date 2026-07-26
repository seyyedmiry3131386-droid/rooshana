package com.google.common.collect;

import defpackage.ai4;
import defpackage.qh4;
import defpackage.zh4;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes.dex */
public class j1 extends qh4 implements zh4 {
    public volatile ai4 b;

    public j1(ReferenceQueue referenceQueue, Object obj, int i) {
        super(referenceQueue, obj, i);
        this.b = MapMakerInternalMap.j;
    }

    @Override // defpackage.zh4
    public final ai4 b() {
        return this.b;
    }

    @Override // defpackage.sh4
    public final Object getValue() {
        return this.b.get();
    }
}
