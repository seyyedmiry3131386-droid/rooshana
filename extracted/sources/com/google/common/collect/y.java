package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
public final class y extends v {
    public final /* synthetic */ int f;
    public final /* synthetic */ CompactHashMap g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(CompactHashMap compactHashMap, int i) {
        super(compactHashMap);
        this.f = i;
        this.g = compactHashMap;
    }

    @Override // com.google.common.collect.v
    public final Object a(int i) {
        int i2 = this.f;
        CompactHashMap compactHashMap = this.g;
        switch (i2) {
            case 0:
                Object obj = CompactHashMap.j;
                return compactHashMap.s()[i];
            case 1:
                return new a0(compactHashMap, i);
            default:
                Object obj2 = CompactHashMap.j;
                return compactHashMap.t()[i];
        }
    }
}
