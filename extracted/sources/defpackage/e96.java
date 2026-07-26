package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e96 implements xa1 {
    public static final e96 a = new e96();

    @Override // defpackage.xa1
    public final long b(db1 db1Var) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // defpackage.xa1
    public final Map k() {
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.xa1
    public final Uri p() {
        return null;
    }

    @Override // defpackage.ra1
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.xa1
    public final void close() {
    }

    @Override // defpackage.xa1
    public final void c(fq8 fq8Var) {
    }
}
