package defpackage;

import androidx.paging.LoadType;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ja9 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ja9(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a(LoadType loadType) {
        js3.p(loadType, "loadType");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            return this.a;
        }
        if (iOrdinal == 2) {
            return this.b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja9)) {
            return false;
        }
        ja9 ja9Var = (ja9) obj;
        return this.a == ja9Var.a && this.b == ja9Var.b && this.c == ja9Var.c && this.d == ja9Var.d;
    }

    public int hashCode() {
        return this.a + this.b + this.c + this.d;
    }
}
