package org.apache.commons.io.comparator;

import defpackage.a0;
import java.io.File;
import java.io.Serializable;
import org.apache.commons.io.IOCase;

/* JADX INFO: loaded from: classes3.dex */
public class NameFileComparator extends a0 implements Serializable {
    public final IOCase a;

    static {
        new NameFileComparator();
        new NameFileComparator(IOCase.d);
        new NameFileComparator(IOCase.e);
    }

    public NameFileComparator() {
        this.a = IOCase.c;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.a(((File) obj).getName(), ((File) obj2).getName());
    }

    @Override // defpackage.a0
    public final String toString() {
        return super.toString() + "[caseSensitivity=" + this.a + "]";
    }

    public NameFileComparator(IOCase iOCase) {
        this.a = iOCase == null ? IOCase.c : iOCase;
    }
}
