package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bj0 {
    public final ov a;
    public int b;

    public bj0(int i) {
        switch (i) {
            case 1:
                this.a = new ov();
                break;
            default:
                this.a = new ov();
                break;
        }
    }

    public void a(byte[] bArr) {
        js3.p(bArr, "array");
        synchronized (this) {
            int i = this.b;
            if (bArr.length + i < xv.a) {
                this.b = i + (bArr.length / 2);
                this.a.addLast(bArr);
            }
        }
    }

    public void b(char[] cArr) {
        js3.p(cArr, "array");
        synchronized (this) {
            int i = this.b;
            if (cArr.length + i < xv.a) {
                this.b = i + cArr.length;
                this.a.addLast(cArr);
            }
        }
    }

    public byte[] c(int i) {
        byte[] bArr;
        synchronized (this) {
            ov ovVar = this.a;
            bArr = null;
            byte[] bArr2 = (byte[]) (ovVar.isEmpty() ? null : ovVar.removeLast());
            if (bArr2 != null) {
                this.b -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        return bArr == null ? new byte[i] : bArr;
    }

    public char[] d(int i) {
        char[] cArr;
        synchronized (this) {
            ov ovVar = this.a;
            cArr = null;
            char[] cArr2 = (char[]) (ovVar.isEmpty() ? null : ovVar.removeLast());
            if (cArr2 != null) {
                this.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }
}
