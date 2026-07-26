package org.apache.commons.io.comparator;

import defpackage.a0;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class DirectoryFileComparator extends a0 implements Serializable {
    static {
        new DirectoryFileComparator();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (((File) obj).isDirectory() ? 1 : 2) - (((File) obj2).isDirectory() ? 1 : 2);
    }
}
