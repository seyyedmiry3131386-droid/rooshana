package com.microsoft.clarity.g;

import com.microsoft.clarity.models.PayloadMetadata;
import defpackage.bt2;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class V implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return bt2.t(Integer.valueOf(((PayloadMetadata) obj).getPageNum()), Integer.valueOf(((PayloadMetadata) obj2).getPageNum()));
    }
}
