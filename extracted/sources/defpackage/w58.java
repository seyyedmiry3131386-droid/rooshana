package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w58 implements xa1 {
    public final xa1 a;
    public long b;
    public Uri c;

    public w58(xa1 xa1Var) {
        xa1Var.getClass();
        this.a = xa1Var;
        this.c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // defpackage.xa1
    public final long b(db1 db1Var) {
        xa1 xa1Var = this.a;
        this.c = db1Var.a;
        Map map = Collections.EMPTY_MAP;
        try {
            return xa1Var.b(db1Var);
        } finally {
            Uri uriP = xa1Var.p();
            if (uriP != null) {
                this.c = uriP;
            }
            xa1Var.k();
        }
    }

    @Override // defpackage.xa1
    public final void c(fq8 fq8Var) {
        fq8Var.getClass();
        this.a.c(fq8Var);
    }

    @Override // defpackage.xa1
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.xa1
    public final Map k() {
        return this.a.k();
    }

    @Override // defpackage.xa1
    public final Uri p() {
        return this.a.p();
    }

    @Override // defpackage.ra1
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += (long) i3;
        }
        return i3;
    }
}
