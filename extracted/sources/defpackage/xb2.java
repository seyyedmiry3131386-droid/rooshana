package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class xb2 extends ub2 {
    public boolean b;
    public File[] c;
    public int d;

    @Override // defpackage.yb2
    public final File a() {
        boolean z = this.b;
        File file = this.a;
        if (!z) {
            this.b = true;
            return file;
        }
        File[] fileArr = this.c;
        if (fileArr != null && this.d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.c;
        js3.m(fileArr2);
        int i = this.d;
        this.d = i + 1;
        return fileArr2[i];
    }
}
