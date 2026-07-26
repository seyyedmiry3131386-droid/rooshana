package com.google.common.collect;

import defpackage.ai4;
import defpackage.ph4;
import defpackage.zh4;

/* JADX INFO: loaded from: classes.dex */
public class g1 extends ph4 implements zh4 {
    public volatile ai4 c;

    public g1(int i, Object obj) {
        super(i, obj);
        this.c = MapMakerInternalMap.j;
    }

    @Override // defpackage.zh4
    public final ai4 b() {
        return this.c;
    }

    @Override // defpackage.sh4
    public final Object getValue() {
        return this.c.get();
    }
}
