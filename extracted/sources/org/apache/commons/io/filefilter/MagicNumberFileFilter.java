package org.apache.commons.io.filefilter;

import defpackage.b0;
import defpackage.jg3;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MagicNumberFileFilter extends b0 implements Serializable {
    private static final long serialVersionUID = -547733176983104172L;

    @Override // defpackage.b0, defpackage.ig3, java.io.FileFilter
    public final boolean accept(File file) {
        if (file == null || !file.isFile() || !file.canRead()) {
            return false;
        }
        try {
            throw null;
        } catch (Throwable th) {
            jg3.a(null);
            throw th;
        }
    }

    @Override // defpackage.b0
    public final String toString() {
        return super.toString() + "(" + new String((byte[]) null) + ",0)";
    }
}
