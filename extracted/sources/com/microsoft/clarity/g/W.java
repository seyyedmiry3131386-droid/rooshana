package com.microsoft.clarity.g;

import com.microsoft.clarity.models.PayloadMetadata;
import defpackage.bt2;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class W implements Comparator {
    public final /* synthetic */ V a;

    public W(V v) {
        this.a = v;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.a.compare(obj, obj2);
        return iCompare != 0 ? iCompare : bt2.t(Integer.valueOf(((PayloadMetadata) obj).getSequence()), Integer.valueOf(((PayloadMetadata) obj2).getSequence()));
    }
}
