package ir.mservices.market.common.ui.recycler.layoutManager;

import defpackage.bl4;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class PaddingLayoutManager$Padding implements Serializable {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public PaddingLayoutManager$Padding(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaddingLayoutManager$Padding)) {
            return false;
        }
        PaddingLayoutManager$Padding paddingLayoutManager$Padding = (PaddingLayoutManager$Padding) obj;
        return this.a == paddingLayoutManager$Padding.a && this.b == paddingLayoutManager$Padding.b && this.c == paddingLayoutManager$Padding.c && this.d == paddingLayoutManager$Padding.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbB = bl4.B(this.a, this.b, "Padding(left=", ", top=", ", right=");
        sbB.append(this.c);
        sbB.append(", bottom=");
        sbB.append(this.d);
        sbB.append(")");
        return sbB.toString();
    }
}
