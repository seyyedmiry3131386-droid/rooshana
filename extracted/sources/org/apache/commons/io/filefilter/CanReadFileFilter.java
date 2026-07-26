package org.apache.commons.io.filefilter;

import defpackage.b0;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class CanReadFileFilter extends b0 implements Serializable {
    static {
        new AndFileFilter(new CanReadFileFilter(), CanWriteFileFilter.a);
    }

    @Override // defpackage.b0, defpackage.ig3, java.io.FileFilter
    public final boolean accept(File file) {
        return file.canRead();
    }
}
