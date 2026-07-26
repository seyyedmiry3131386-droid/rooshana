package org.apache.commons.io.filefilter;

import defpackage.b0;
import defpackage.bl4;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class WildcardFileFilter extends b0 implements Serializable {
    @Override // defpackage.b0, defpackage.ig3, java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        throw null;
    }

    @Override // defpackage.b0
    public final String toString() {
        return bl4.z(new StringBuilder(), super.toString(), "(", ")");
    }

    @Override // defpackage.b0, defpackage.ig3, java.io.FileFilter
    public final boolean accept(File file) {
        file.getName();
        throw null;
    }
}
