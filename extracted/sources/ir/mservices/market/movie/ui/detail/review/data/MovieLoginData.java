package ir.mservices.market.movie.ui.detail.review.data;

import defpackage.bl4;
import defpackage.dw1;
import defpackage.js3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieLoginData implements Serializable {
    public final int a;
    public final int b;
    public final String c;

    public MovieLoginData(String str, int i, int i2) {
        js3.p(str, "dialogKey");
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieLoginData)) {
            return false;
        }
        MovieLoginData movieLoginData = (MovieLoginData) obj;
        return this.a == movieLoginData.a && this.b == movieLoginData.b && js3.i(this.c, movieLoginData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return dw1.s(bl4.B(this.a, this.b, "MovieLoginData(message=", ", label=", ", dialogKey="), this.c, ")");
    }
}
