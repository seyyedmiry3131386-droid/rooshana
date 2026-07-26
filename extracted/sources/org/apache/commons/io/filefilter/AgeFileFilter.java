package org.apache.commons.io.filefilter;

import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.b0;
import defpackage.dw1;
import defpackage.zb2;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class AgeFileFilter extends b0 implements Serializable {
    @Override // defpackage.b0, defpackage.ig3, java.io.FileFilter
    public final boolean accept(File file) {
        int i = zb2.a;
        if (file != null) {
            return file.exists() && file.lastModified() > 0;
        }
        throw new IllegalArgumentException("No specified file");
    }

    @Override // defpackage.b0
    public final String toString() {
        return dw1.p(super.toString(), "(", SimpleComparison.GREATER_THAN_OPERATION, "0)", new StringBuilder());
    }
}
