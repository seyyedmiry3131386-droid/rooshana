package defpackage;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class py {
    public final my a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public py(my myVar) {
        this.a = myVar;
    }

    public static py a(AudioAttributes audioAttributes) {
        return Build.VERSION.SDK_INT >= 26 ? new py(new oy(audioAttributes, 0)) : new py(new my(audioAttributes, 0));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof py) {
            return this.a.equals(((py) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
