package org.apache.commons.io.comparator;

import defpackage.a0;
import defpackage.bc2;
import java.io.File;
import java.io.Serializable;
import org.apache.commons.io.IOCase;

/* JADX INFO: loaded from: classes3.dex */
public class ExtensionFileComparator extends a0 implements Serializable {
    public final IOCase a;

    static {
        new ExtensionFileComparator();
        new ExtensionFileComparator(IOCase.d);
        new ExtensionFileComparator(IOCase.e);
    }

    public ExtensionFileComparator() {
        this.a = IOCase.c;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String strSubstring;
        File file = (File) obj2;
        String name = ((File) obj).getName();
        char c = bc2.a;
        String strSubstring2 = "";
        if (name == null) {
            strSubstring = null;
        } else {
            int iLastIndexOf = name.lastIndexOf(46);
            if (Math.max(name.lastIndexOf(47), name.lastIndexOf(92)) > iLastIndexOf) {
                iLastIndexOf = -1;
            }
            strSubstring = iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf + 1);
        }
        String name2 = file.getName();
        if (name2 == null) {
            strSubstring2 = null;
        } else {
            int iLastIndexOf2 = name2.lastIndexOf(46);
            if (Math.max(name2.lastIndexOf(47), name2.lastIndexOf(92)) > iLastIndexOf2) {
                iLastIndexOf2 = -1;
            }
            if (iLastIndexOf2 != -1) {
                strSubstring2 = name2.substring(iLastIndexOf2 + 1);
            }
        }
        return this.a.a(strSubstring, strSubstring2);
    }

    @Override // defpackage.a0
    public final String toString() {
        return super.toString() + "[caseSensitivity=" + this.a + "]";
    }

    public ExtensionFileComparator(IOCase iOCase) {
        this.a = iOCase == null ? IOCase.c : iOCase;
    }
}
