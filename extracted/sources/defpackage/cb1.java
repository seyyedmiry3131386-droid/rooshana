package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cb1 {
    public Uri a;
    public long b;
    public int c;
    public byte[] d;
    public Map e;
    public long f;
    public long g;
    public String h;
    public int i;

    public final db1 a() {
        vy2.u(this.a, "The uri must be set.");
        return new db1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
