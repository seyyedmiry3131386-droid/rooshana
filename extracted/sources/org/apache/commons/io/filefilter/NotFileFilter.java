package org.apache.commons.io.filefilter;

import defpackage.b0;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class NotFileFilter extends b0 implements Serializable {
    public final b0 a;

    public NotFileFilter(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // defpackage.b0, defpackage.ig3, java.io.FileFilter
    public final boolean accept(File file) {
        return !this.a.accept(file);
    }

    @Override // defpackage.b0
    public final String toString() {
        return super.toString() + "(" + this.a.toString() + ")";
    }

    @Override // defpackage.b0, defpackage.ig3, java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return !this.a.accept(file, str);
    }
}
