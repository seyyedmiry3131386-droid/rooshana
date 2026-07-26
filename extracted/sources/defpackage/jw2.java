package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class jw2 {
    public final cp8 a;
    public final boolean b;
    public final boolean c;
    public final ao0 f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public long l;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public iw2 m = new iw2();
    public iw2 n = new iw2();
    public boolean k = false;
    public boolean o = false;

    public jw2(cp8 cp8Var, boolean z, boolean z2) {
        this.a = cp8Var;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[128];
        this.g = bArr;
        this.f = new ao0(bArr, 0, 0);
        iw2 iw2Var = this.n;
        iw2Var.b = false;
        iw2Var.a = false;
    }
}
