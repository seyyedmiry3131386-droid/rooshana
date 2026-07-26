package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class j extends i61 {
    @Override // defpackage.i61
    public final i61 b(s61 s61Var, s61 s61Var2, s61 s61Var3, s61 s61Var4) {
        return new j(s61Var, s61Var2, s61Var3, s61Var4);
    }

    @Override // defpackage.i61
    public final rq4 d(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new ww5(ry7.c(0L, j));
        }
        sy6 sy6VarC = ry7.c(0L, j);
        return new xw5(new fa7(sy6VarC.a, sy6VarC.b, sy6VarC.c, sy6VarC.d, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return js3.i(this.a, jVar.a) && js3.i(this.b, jVar.b) && js3.i(this.c, jVar.c) && js3.i(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + this.a + ", topRight = " + this.b + ", bottomRight = " + this.c + ", bottomLeft = " + this.d + ')';
    }
}
