package org.apache.commons.io.comparator;

import defpackage.a0;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class LastModifiedFileComparator extends a0 implements Serializable {
    static {
        new LastModifiedFileComparator();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long jLastModified = ((File) obj).lastModified() - ((File) obj2).lastModified();
        if (jLastModified < 0) {
            return -1;
        }
        return jLastModified > 0 ? 1 : 0;
    }
}
