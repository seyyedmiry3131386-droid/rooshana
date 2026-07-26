package defpackage;

import android.graphics.Bitmap;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class vj0 implements g67 {
    public final /* synthetic */ int a = 2;
    public final Object b;

    public vj0(byte[] bArr) {
        ok4.p(bArr, "Argument must not be null");
        this.b = bArr;
    }

    @Override // defpackage.g67
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.g67
    public final int c() {
        switch (this.a) {
            case 0:
                return ((byte[]) this.b).length;
            case 1:
                return 1;
            default:
                return i29.c((Bitmap) this.b);
        }
    }

    @Override // defpackage.g67
    public final Class d() {
        switch (this.a) {
            case 0:
                return byte[].class;
            case 1:
                return ((File) this.b).getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // defpackage.g67
    public final Object get() {
        switch (this.a) {
            case 0:
                return (byte[]) this.b;
            case 1:
                return (File) this.b;
            default:
                return (Bitmap) this.b;
        }
    }

    public vj0(File file) {
        ok4.p(file, "Argument must not be null");
        this.b = file;
    }

    public vj0(Bitmap bitmap) {
        this.b = bitmap;
    }

    private final void b() {
    }

    private final void e() {
    }

    private final void f() {
    }
}
