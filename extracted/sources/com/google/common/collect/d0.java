package com.google.common.collect;

import com.google.common.collect.DenseImmutableTable;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends e {
    public int c = -1;
    public final int d;
    public final /* synthetic */ DenseImmutableTable.ImmutableArrayMap e;

    public d0(DenseImmutableTable.ImmutableArrayMap immutableArrayMap) {
        this.e = immutableArrayMap;
        this.d = immutableArrayMap.r().size();
    }

    @Override // com.google.common.collect.e
    public final Object a() {
        int i = this.c;
        while (true) {
            this.c = i + 1;
            int i2 = this.c;
            if (i2 >= this.d) {
                this.a = AbstractIterator$State.c;
                return null;
            }
            DenseImmutableTable.ImmutableArrayMap immutableArrayMap = this.e;
            Object objQ = immutableArrayMap.q(i2);
            if (objQ != null) {
                return new ImmutableEntry(immutableArrayMap.r().keySet().a().get(this.c), objQ);
            }
            i = this.c;
        }
    }
}
