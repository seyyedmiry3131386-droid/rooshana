package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class ka7 extends i61 {
    @Override // defpackage.i61
    public final i61 b(s61 s61Var, s61 s61Var2, s61 s61Var3, s61 s61Var4) {
        return new ka7(s61Var, s61Var2, s61Var3, s61Var4);
    }

    @Override // defpackage.i61
    public final rq4 d(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new ww5(ry7.c(0L, j));
        }
        sy6 sy6VarC = ry7.c(0L, j);
        LayoutDirection layoutDirection2 = LayoutDirection.a;
        float f5 = layoutDirection == layoutDirection2 ? f : f2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        float f6 = layoutDirection == layoutDirection2 ? f2 : f;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        float f7 = layoutDirection == layoutDirection2 ? f3 : f4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
        float f8 = layoutDirection == layoutDirection2 ? f4 : f3;
        return new xw5(new fa7(sy6VarC.a, sy6VarC.b, sy6VarC.c, sy6VarC.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka7)) {
            return false;
        }
        ka7 ka7Var = (ka7) obj;
        return js3.i(this.a, ka7Var.a) && js3.i(this.b, ka7Var.b) && js3.i(this.c, ka7Var.c) && js3.i(this.d, ka7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
