package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 implements ig3 {
    @Override // defpackage.ig3, java.io.FileFilter
    public boolean accept(File file) {
        return accept(file.getParentFile(), file.getName());
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.ig3, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return accept(new File(file, str));
    }
}
