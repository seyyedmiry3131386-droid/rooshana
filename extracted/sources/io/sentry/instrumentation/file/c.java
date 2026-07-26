package io.sentry.instrumentation.file;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements a {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Closeable e;

    public /* synthetic */ c(Closeable closeable, byte[] bArr, int i, int i2, int i3) {
        this.a = i3;
        this.e = closeable;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    @Override // io.sentry.instrumentation.file.a
    public final Object call() throws IOException {
        switch (this.a) {
            case 0:
                d dVar = (d) this.e;
                return Integer.valueOf(dVar.a.read(this.b, this.c, this.d));
            default:
                FileOutputStream fileOutputStream = ((e) this.e).a;
                byte[] bArr = this.b;
                int i = this.c;
                int i2 = this.d;
                fileOutputStream.write(bArr, i, i2);
                return Integer.valueOf(i2);
        }
    }
}
