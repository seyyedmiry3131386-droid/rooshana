package j$.util;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class Spliterators {
    public static final p1 a = new p1();
    public static final n1 b = new n1();
    public static final o1 c = new o1();
    public static final m1 d = new m1();

    public static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        return new r1((java.util.Collection) Objects.requireNonNull(collection), i);
    }

    public static <T> Spliterator<T> spliteratorUnknownSize(Iterator<? extends T> it, int i) {
        return new r1((Iterator) Objects.requireNonNull(it), i);
    }
}
