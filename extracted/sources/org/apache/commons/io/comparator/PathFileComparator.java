package org.apache.commons.io.comparator;

import defpackage.a0;
import java.io.File;
import java.io.Serializable;
import org.apache.commons.io.IOCase;

/* JADX INFO: loaded from: classes3.dex */
public class PathFileComparator extends a0 implements Serializable {
    public final IOCase a;

    static {
        new PathFileComparator();
        new PathFileComparator(IOCase.d);
        new PathFileComparator(IOCase.e);
    }

    public PathFileComparator() {
        this.a = IOCase.c;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.a(((File) obj).getPath(), ((File) obj2).getPath());
    }

    @Override // defpackage.a0
    public final String toString() {
        return super.toString() + "[caseSensitivity=" + this.a + "]";
    }

    public PathFileComparator(IOCase iOCase) {
        this.a = iOCase == null ? IOCase.c : iOCase;
    }
}
