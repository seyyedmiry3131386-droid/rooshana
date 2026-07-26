package org.apache.commons.io.filefilter;

import defpackage.ig3;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class TrueFileFilter implements ig3, Serializable {
    static {
        new TrueFileFilter();
    }

    @Override // defpackage.ig3, java.io.FileFilter
    public final boolean accept(File file) {
        return true;
    }

    @Override // defpackage.ig3, java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return true;
    }
}
