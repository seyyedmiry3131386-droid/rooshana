package com.microsoft.clarity.g;

import com.microsoft.clarity.models.SessionMetadata;
import defpackage.bt2;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class U implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return bt2.t(Long.valueOf(((SessionMetadata) obj2).getTimestamp()), Long.valueOf(((SessionMetadata) obj).getTimestamp()));
    }
}
