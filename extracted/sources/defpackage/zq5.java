package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zq5 {
    public static final Object[] a = new Object[0];
    public static final mb5 b = new mb5(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            lb7.k("Index " + i + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            lb7.j("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
            throw null;
        }
        if (i < 0) {
            lb7.k("fromIndex (" + i + ") is less than 0.");
            throw null;
        }
        if (i2 <= size) {
            return;
        }
        lb7.k("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
