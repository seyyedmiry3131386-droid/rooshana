package org.apache.commons.io.filefilter;

import defpackage.ig3;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class FalseFileFilter implements ig3, Serializable {
    static {
        new FalseFileFilter();
    }

    @Override // defpackage.ig3, java.io.FileFilter
    public final boolean accept(File file) {
        return false;
    }

    @Override // defpackage.ig3, java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return false;
    }
}
