package defpackage;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class md9 implements v72 {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final hm8 b;
    public final ab8 d;
    public final boolean e;
    public x72 f;
    public int h;
    public final h26 c = new h26();
    public byte[] g = new byte[1024];

    public md9(String str, hm8 hm8Var, ab8 ab8Var, boolean z) {
        this.a = str;
        this.b = hm8Var;
        this.d = ab8Var;
        this.e = z;
    }

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    public final cp8 c(long j2) {
        cp8 cp8VarO = this.f.o(0, 3);
        rj2 rj2Var = new rj2();
        rj2Var.m = tv4.m("text/vtt");
        rj2Var.d = this.a;
        rj2Var.r = j2;
        rm7.w(rj2Var, cp8VarO);
        this.f.l();
        return cp8VarO;
    }

    @Override // defpackage.v72
    public final int d(w72 w72Var, sd2 sd2Var) throws ParserException {
        String strK;
        this.f.getClass();
        int i2 = (int) w72Var.i();
        int i3 = this.h;
        byte[] bArr = this.g;
        if (i3 == bArr.length) {
            this.g = Arrays.copyOf(bArr, ((i2 != -1 ? i2 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i4 = this.h;
        int i5 = w72Var.read(bArr2, i4, bArr2.length - i4);
        if (i5 != -1) {
            int i6 = this.h + i5;
            this.h = i6;
            if (i2 == -1 || i6 != i2) {
                return 0;
            }
        }
        h26 h26Var = new h26(this.g);
        nd9.d(h26Var);
        String strK2 = h26Var.k(StandardCharsets.UTF_8);
        long jD0 = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strK2)) {
                while (true) {
                    String strK3 = h26Var.k(StandardCharsets.UTF_8);
                    if (strK3 == null) {
                        break;
                    }
                    if (nd9.a.matcher(strK3).matches()) {
                        do {
                            strK = h26Var.k(StandardCharsets.UTF_8);
                            if (strK != null) {
                            }
                        } while (!strK.isEmpty());
                    } else {
                        Matcher matcher2 = ld9.a.matcher(strK3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    c(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = nd9.c(strGroup);
                String str = j29.a;
                long jB = this.b.b(j29.d0((jD0 + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                cp8 cp8VarC = c(jB - jC2);
                byte[] bArr3 = this.g;
                int i7 = this.h;
                h26 h26Var2 = this.c;
                h26Var2.H(i7, bArr3);
                cp8VarC.d(this.h, h26Var2);
                cp8VarC.a(jB, 1, this.h, 0, null);
                return -1;
            }
            if (strK2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(strK2);
                if (!matcher3.find()) {
                    throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strK2));
                }
                Matcher matcher4 = j.matcher(strK2);
                if (!matcher4.find()) {
                    throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strK2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = nd9.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j2 = Long.parseLong(strGroup3);
                String str2 = j29.a;
                jD0 = j29.d0(j2, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strK2 = h26Var.k(StandardCharsets.UTF_8);
        }
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) {
        oe1 oe1Var = (oe1) w72Var;
        oe1Var.e(this.g, 0, 6, false);
        byte[] bArr = this.g;
        h26 h26Var = this.c;
        h26Var.H(6, bArr);
        if (nd9.a(h26Var)) {
            return true;
        }
        oe1Var.e(this.g, 6, 3, false);
        h26Var.H(9, this.g);
        return nd9.a(h26Var);
    }

    @Override // defpackage.v72
    public final void h(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // defpackage.v72
    public final List i() {
        return ImmutableList.q();
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        if (this.e) {
            x72Var = new ry(x72Var, this.d);
        }
        this.f = x72Var;
        x72Var.t(new x30(-9223372036854775807L));
    }

    @Override // defpackage.v72
    public final void a() {
    }
}
