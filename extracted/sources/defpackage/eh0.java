package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eh0 implements bi8 {
    public final sr7 a;
    public final float b;

    public eh0(sr7 sr7Var, float f) {
        this.a = sr7Var;
        this.b = f;
    }

    @Override // defpackage.bi8
    public final float a() {
        return this.b;
    }

    @Override // defpackage.bi8
    public final long b() {
        int i = zu0.i;
        return zu0.h;
    }

    @Override // defpackage.bi8
    public final /* synthetic */ bi8 c(bi8 bi8Var) {
        return rm7.d(this, bi8Var);
    }

    @Override // defpackage.bi8
    public final bi8 d(bp2 bp2Var) {
        return !equals(ai8.a) ? this : (bi8) bp2Var.invoke();
    }

    @Override // defpackage.bi8
    public final ch0 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh0)) {
            return false;
        }
        eh0 eh0Var = (eh0) obj;
        return js3.i(this.a, eh0Var.a) && Float.compare(this.b, eh0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return t61.k(sb, this.b, ')');
    }
}
