package defpackage;

import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class tj {
    public final dk a;
    public final dk b;
    public final dk c;
    public final dk d;
    public final dk e;
    public final dk f;
    public final int g;
    public final boolean h;
    public final int i;
    public final long j;
    public final dk k;

    public tj(dk dkVar, dk dkVar2) {
        int i = sj8.b().c;
        int i2 = sj8.b().O.c;
        this.a = dkVar;
        dk dkVar3 = dk.c;
        this.b = dkVar3;
        this.c = dkVar3;
        this.d = dkVar3;
        this.e = dkVar3;
        this.f = dkVar2;
        this.g = i;
        this.h = true;
        this.i = i2;
        this.j = 200L;
        float[] fArr = new float[8];
        float[] fArr2 = new float[8];
        this.k = new dk(fArr, fArr2);
        if (!dkVar2.equals(dkVar3)) {
            this.b = dkVar2;
            this.c = dkVar2;
            this.d = dkVar2;
            this.e = dkVar2;
        }
        for (Pair pair : br9.C(new Pair(0, this.b), new Pair(2, this.c), new Pair(4, this.e), new Pair(6, this.d))) {
            int iIntValue = ((Number) pair.a).intValue();
            dk dkVar4 = (dk) pair.b;
            Object obj = dkVar4.a;
            Object obj2 = dkVar4.b;
            fArr[iIntValue] = ((Number) obj).floatValue();
            int i3 = iIntValue + 1;
            fArr[i3] = ((Number) dkVar4.a).floatValue();
            Number number = (Number) obj2;
            fArr2[iIntValue] = number.floatValue();
            fArr2[i3] = number.floatValue();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj)) {
            return false;
        }
        tj tjVar = (tj) obj;
        return js3.i(this.a, tjVar.a) && js3.i(this.b, tjVar.b) && js3.i(this.c, tjVar.c) && js3.i(this.d, tjVar.d) && js3.i(this.e, tjVar.e) && js3.i(this.f, tjVar.f) && this.g == tjVar.g && this.h == tjVar.h && this.i == tjVar.i && this.j == tjVar.j;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.g) * 961) + (this.h ? 1231 : 1237)) * 31) + this.i) * 31;
        long j = this.j;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "AnimatedDrawableData(background=" + this.a + ", radiusTopLeft=" + this.b + ", radiusTopRight=" + this.c + ", radiusBottomLeft=" + this.d + ", radiusBottomRight=" + this.e + ", radius=" + this.f + ", borderColor=" + this.g + ", borderWidth=0, fill=" + this.h + ", pressedColor=" + this.i + ", duration=" + this.j + ")";
    }
}
