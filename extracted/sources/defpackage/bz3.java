package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bz3 {
    public final float a;
    public final int b;
    public cz3 d;
    public cz3 e;
    public final ArrayList c = new ArrayList();
    public int f = -1;
    public int g = -1;
    public float h = 0.0f;
    public int i = -1;

    public bz3(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final void a(float f, float f2, float f3, boolean z, boolean z2) {
        float fAbs;
        float f4 = f3 / 2.0f;
        float f5 = f - f4;
        float f6 = f4 + f;
        float f7 = this.b;
        if (f6 > f7) {
            fAbs = Math.abs(f6 - Math.max(f6 - f3, f7));
        } else {
            fAbs = 0.0f;
            if (f5 < 0.0f) {
                fAbs = Math.abs(f5 - Math.min(f5 + f3, 0.0f));
            }
        }
        b(f, f2, f3, z, z2, fAbs, 0.0f, 0.0f);
    }

    public final void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
        if (f3 <= 0.0f) {
            return;
        }
        ArrayList arrayList = this.c;
        if (z2) {
            if (z) {
                throw new IllegalArgumentException("Anchor keylines cannot be focal.");
            }
            int i = this.i;
            if (i != -1 && i != 0) {
                throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
            }
            this.i = arrayList.size();
        }
        cz3 cz3Var = new cz3(Float.MIN_VALUE, f, f2, f3, z2, f4, f5, f6);
        if (z) {
            if (this.d == null) {
                this.d = cz3Var;
                this.f = arrayList.size();
            }
            if (this.g != -1 && arrayList.size() - this.g > 1) {
                throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
            }
            if (f3 != this.d.d) {
                throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
            }
            this.e = cz3Var;
            this.g = arrayList.size();
        } else {
            if (this.d == null && f3 < this.h) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            }
            if (this.e != null && f3 > this.h) {
                throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
            }
        }
        this.h = f3;
        arrayList.add(cz3Var);
    }

    public final void c(float f, float f2, float f3, int i, boolean z) {
        if (i <= 0 || f3 <= 0.0f) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            a((i2 * f3) + f, f2, f3, z, false);
        }
    }

    public final dz3 d() {
        if (this.d == null) {
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i >= arrayList2.size()) {
                return new dz3(this.a, arrayList, this.f, this.g, this.b);
            }
            cz3 cz3Var = (cz3) arrayList2.get(i);
            float f = this.d.b;
            float f2 = this.f;
            float f3 = this.a;
            arrayList.add(new cz3((i * f3) + (f - (f2 * f3)), cz3Var.b, cz3Var.c, cz3Var.d, cz3Var.e, cz3Var.f, cz3Var.g, cz3Var.h));
            i++;
        }
    }
}
