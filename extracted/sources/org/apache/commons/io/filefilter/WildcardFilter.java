package org.apache.commons.io.filefilter;

import defpackage.b0;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class WildcardFilter extends b0 implements Serializable {
    @Override // defpackage.b0, defpackage.ig3, java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        if (file == null || !new File(file, str).isDirectory()) {
            throw null;
        }
        return false;
    }

    @Override // defpackage.b0, defpackage.ig3, java.io.FileFilter
    public final boolean accept(File file) {
        if (file.isDirectory()) {
            return false;
        }
        throw null;
    }
}
