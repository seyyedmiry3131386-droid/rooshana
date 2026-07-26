package defpackage;

import com.android.volley.VolleyError;

/* JADX INFO: loaded from: classes.dex */
public class rg1 {
    public int a;
    public int b;
    public final int c;
    public final float d;

    public rg1(float f, int i, int i2) {
        this.a = i;
        this.c = i2;
        this.d = f;
    }

    public void a(VolleyError volleyError) throws VolleyError {
        int i = this.b + 1;
        this.b = i;
        int i2 = this.a;
        this.a = i2 + ((int) (i2 * this.d));
        if (i > this.c) {
            throw volleyError;
        }
    }
}
