package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class sh3 implements cb8 {
    public final h26 a;

    public sh3(int i) {
        switch (i) {
            case 1:
                this.a = new h26();
                break;
            default:
                this.a = new h26(10);
                break;
        }
    }

    @Override // defpackage.cb8
    public /* synthetic */ ta8 d(byte[] bArr, int i, int i2) {
        return rm7.e(this, bArr, i2);
    }

    @Override // defpackage.cb8
    public void m(byte[] bArr, int i, int i2, bb8 bb8Var, n31 n31Var) {
        l81 l81VarA;
        h26 h26Var = this.a;
        h26Var.H(i + i2, bArr);
        h26Var.J(i);
        ArrayList arrayList = new ArrayList();
        while (h26Var.a() > 0) {
            vy2.i("Incomplete Mp4Webvtt Top Level box header found.", h26Var.a() >= 8);
            int iJ = h26Var.j();
            if (h26Var.j() == 1987343459) {
                int i3 = iJ - 8;
                CharSequence charSequenceF = null;
                k81 k81VarA = null;
                while (i3 > 0) {
                    vy2.i("Incomplete vtt cue box header found.", i3 >= 8);
                    int iJ2 = h26Var.j();
                    int iJ3 = h26Var.j();
                    int i4 = iJ2 - 8;
                    byte[] bArr2 = h26Var.a;
                    int i5 = h26Var.b;
                    String str = j29.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    h26Var.K(i4);
                    i3 = (i3 - 8) - i4;
                    if (iJ3 == 1937011815) {
                        kd9 kd9Var = new kd9();
                        ld9.e(str2, kd9Var);
                        k81VarA = kd9Var.a();
                    } else if (iJ3 == 1885436268) {
                        charSequenceF = ld9.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (k81VarA != null) {
                    k81VarA.a = charSequenceF;
                    k81VarA.b = null;
                    l81VarA = k81VarA.a();
                } else {
                    Pattern pattern = ld9.a;
                    kd9 kd9Var2 = new kd9();
                    kd9Var2.c = charSequenceF;
                    l81VarA = kd9Var2.a().a();
                }
                arrayList.add(l81VarA);
            } else {
                h26Var.K(iJ - 8);
            }
        }
        n31Var.accept(new o81(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.cb8
    public /* synthetic */ void reset() {
    }
}
