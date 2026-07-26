package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class uz2 extends cr0 {
    public byte[] j;
    public volatile boolean k;
    public byte[] l;

    @Override // defpackage.ra4
    public final void a() {
        try {
            this.i.b(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                byte[] bArr = this.j;
                if (bArr.length < i2 + 16384) {
                    this.j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.i.read(this.j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                this.l = Arrays.copyOf(this.j, i2);
            }
            tv8.i(this.i);
        } catch (Throwable th) {
            tv8.i(this.i);
            throw th;
        }
    }

    @Override // defpackage.ra4
    public final void b() {
        this.k = true;
    }
}
