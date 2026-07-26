package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gf4 {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public m28 h;
    public ue4 i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public final x46 a = new x46();
    public final HashSet b = new HashSet();
    public int p = 0;

    public final void a(String str) {
        qd4.b(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.l) / this.n) * 1000.0f);
    }

    public final Map c() {
        float fC = n29.c();
        if (fC != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                HashMap map = this.d;
                String str = (String) entry.getKey();
                yf4 yf4Var = (yf4) entry.getValue();
                float f = this.e / fC;
                int i = (int) (yf4Var.a * f);
                int i2 = (int) (yf4Var.b * f);
                yf4 yf4Var2 = new yf4(i, i2, yf4Var.c, yf4Var.d, yf4Var.e);
                Bitmap bitmap = yf4Var.f;
                if (bitmap != null) {
                    yf4Var2.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(str, yf4Var2);
            }
        }
        this.e = fC;
        return this.d;
    }

    public final ni4 d(String str) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            ni4 ni4Var = (ni4) this.g.get(i);
            String str2 = ni4Var.a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return ni4Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(((q04) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
