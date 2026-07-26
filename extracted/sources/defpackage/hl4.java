package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class hl4 extends z0 {
    public final yi a;
    public final ArrayList b;
    public final List c;

    public hl4(yi yiVar, ListBuilder listBuilder, ArrayList arrayList, va5 va5Var) {
        if (va5Var.b != arrayList.size() + 1) {
            throw new IllegalArgumentException("Outline progress size is expected to be the cubics size + 1");
        }
        int i = va5Var.b;
        if (i == 0) {
            lb7.l("FloatList is empty.");
            throw null;
        }
        float[] fArr = va5Var.a;
        int i2 = 0;
        float fB = 0.0f;
        if (fArr[0] != 0.0f) {
            throw new IllegalArgumentException("First outline progress value is expected to be zero");
        }
        if (i == 0) {
            lb7.l("FloatList is empty.");
            throw null;
        }
        if (fArr[i - 1] != 1.0f) {
            throw new IllegalArgumentException("Last outline progress value is expected to be one");
        }
        this.a = yiVar;
        this.c = listBuilder;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i2 < size) {
            int i3 = i2 + 1;
            if (va5Var.b(i3) - va5Var.b(i2) > 1.0E-4f) {
                arrayList2.add(new gl4(this, (h81) arrayList.get(i2), fB, va5Var.b(i3)));
                fB = va5Var.b(i3);
            }
            i2 = i3;
        }
        gl4 gl4Var = (gl4) arrayList2.get(br9.y(arrayList2));
        float f = gl4Var.c;
        if (1.0f < f) {
            throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }
        gl4Var.c = f;
        gl4Var.d = 1.0f;
        this.b = arrayList2;
    }

    @Override // defpackage.o
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof gl4) {
            return super.contains((gl4) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (gl4) this.b.get(i);
    }

    @Override // defpackage.z0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof gl4) {
            return super.indexOf((gl4) obj);
        }
        return -1;
    }

    @Override // defpackage.z0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof gl4) {
            return super.lastIndexOf((gl4) obj);
        }
        return -1;
    }
}
