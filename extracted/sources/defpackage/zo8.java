package defpackage;

import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public final class zo8 {
    public static final zo8 d = new zo8(new yo8[0]);
    public static final String e;
    public final int a;
    public final ImmutableList b;
    public int c;

    static {
        String str = j29.a;
        e = Integer.toString(0, 36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zo8(yo8... yo8VarArr) {
        ImmutableList immutableListO = ImmutableList.o(yo8VarArr);
        this.b = immutableListO;
        this.a = yo8VarArr.length;
        int i = 0;
        while (i < immutableListO.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < immutableListO.size(); i3++) {
                if (((yo8) immutableListO.get(i)).equals(immutableListO.get(i3))) {
                    wn5.H("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yo8 a(int i) {
        return (yo8) this.b.get(i);
    }

    public final int b(yo8 yo8Var) {
        int iIndexOf = this.b.indexOf(yo8Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zo8.class == obj.getClass()) {
            zo8 zo8Var = (zo8) obj;
            if (this.a == zo8Var.a && this.b.equals(zo8Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}
