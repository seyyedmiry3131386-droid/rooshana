package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class vb2 extends ub2 {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;

    @Override // defpackage.yb2
    public final File a() {
        boolean z = this.e;
        File file = this.a;
        if (!z && this.c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.e = true;
            }
        }
        File[] fileArr = this.c;
        if (fileArr == null || this.d >= fileArr.length) {
            if (this.b) {
                return null;
            }
            this.b = true;
            return file;
        }
        js3.m(fileArr);
        int i = this.d;
        this.d = i + 1;
        return fileArr[i];
    }
}
