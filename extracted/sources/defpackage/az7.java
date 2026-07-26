package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class az7 {
    public static final mh g = new mh(18);
    public static final mh h = new mh(19);
    public int d;
    public int e;
    public int f;
    public final zy7[] b = new zy7[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public final void a(int i, float f) {
        zy7 zy7Var;
        int i2 = this.c;
        ArrayList arrayList = this.a;
        if (i2 != 1) {
            Collections.sort(arrayList, g);
            this.c = 1;
        }
        int i3 = this.f;
        zy7[] zy7VarArr = this.b;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f = i4;
            zy7Var = zy7VarArr[i4];
        } else {
            zy7Var = new zy7();
        }
        int i5 = this.d;
        this.d = i5 + 1;
        zy7Var.a = i5;
        zy7Var.b = i;
        zy7Var.c = f;
        arrayList.add(zy7Var);
        this.e += i;
        while (true) {
            int i6 = this.e;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            zy7 zy7Var2 = (zy7) arrayList.get(0);
            int i8 = zy7Var2.b;
            if (i8 <= i7) {
                this.e -= i8;
                arrayList.remove(0);
                int i9 = this.f;
                if (i9 < 5) {
                    this.f = i9 + 1;
                    zy7VarArr[i9] = zy7Var2;
                }
            } else {
                zy7Var2.b = i8 - i7;
                this.e -= i7;
            }
        }
    }

    public final float b() {
        int i = this.c;
        ArrayList arrayList = this.a;
        if (i != 0) {
            Collections.sort(arrayList, h);
            this.c = 0;
        }
        float f = 0.5f * this.e;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            zy7 zy7Var = (zy7) arrayList.get(i3);
            i2 += zy7Var.b;
            if (i2 >= f) {
                return zy7Var.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((zy7) o40.u(1, arrayList)).c;
    }
}
