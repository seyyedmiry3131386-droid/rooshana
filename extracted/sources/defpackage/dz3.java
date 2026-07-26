package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dz3 {
    public final float a;
    public final int b;
    public final List c;
    public final int d;
    public final int e;
    public final int f;

    public dz3(float f, ArrayList arrayList, int i, int i2, int i3) {
        this.a = f;
        this.c = DesugarCollections.unmodifiableList(arrayList);
        this.d = i;
        this.e = i2;
        while (i <= i2) {
            if (((cz3) arrayList.get(i)).f == 0.0f) {
                this.b++;
            }
            i++;
        }
        this.f = i3;
    }

    public final cz3 a() {
        return (cz3) this.c.get(this.d);
    }

    public final cz3 b() {
        return (cz3) this.c.get(0);
    }

    public final cz3 c() {
        return (cz3) this.c.get(this.e);
    }

    public final cz3 d() {
        return (cz3) this.c.get(r0.size() - 1);
    }
}
