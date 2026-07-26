package org.apache.commons.io.comparator;

import defpackage.a0;
import defpackage.t61;
import defpackage.zb2;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class SizeFileComparator extends a0 implements Serializable {
    public final boolean a = false;

    static {
        new SizeFileComparator();
    }

    public SizeFileComparator() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        File file = (File) obj;
        File file2 = (File) obj2;
        boolean zIsDirectory = file.isDirectory();
        boolean z = this.a;
        long jL = (zIsDirectory ? (z && file.exists()) ? zb2.l(file) : 0L : file.length()) - (file2.isDirectory() ? (z && file2.exists()) ? zb2.l(file2) : 0L : file2.length());
        if (jL < 0) {
            return -1;
        }
        return jL > 0 ? 1 : 0;
    }

    @Override // defpackage.a0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[sumDirectoryContents=");
        return t61.l(sb, this.a, "]");
    }

    public SizeFileComparator(int i) {
    }
}
