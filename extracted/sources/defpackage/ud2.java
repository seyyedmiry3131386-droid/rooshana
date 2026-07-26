package defpackage;

import androidx.media3.common.b;
import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class ud2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final qq4 k;
    public final jv4 l;

    public ud2(byte[] bArr, int i) {
        ao0 ao0Var = new ao0(bArr, bArr.length);
        ao0Var.q(i * 8);
        this.a = ao0Var.i(16);
        this.b = ao0Var.i(16);
        this.c = ao0Var.i(24);
        this.d = ao0Var.i(24);
        int i2 = ao0Var.i(20);
        this.e = i2;
        this.f = d(i2);
        this.g = ao0Var.i(3) + 1;
        int i3 = ao0Var.i(5) + 1;
        this.h = i3;
        this.i = a(i3);
        this.j = ao0Var.k(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final b c(byte[] bArr, jv4 jv4Var) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        jv4 jv4Var2 = this.l;
        if (jv4Var2 != null) {
            jv4Var = jv4Var2.b(jv4Var);
        }
        rj2 rj2Var = new rj2();
        rj2Var.m = tv4.m("audio/flac");
        rj2Var.n = i;
        rj2Var.E = this.g;
        rj2Var.F = this.e;
        String str = j29.a;
        rj2Var.G = j29.E(this.h, ByteOrder.LITTLE_ENDIAN);
        rj2Var.p = Collections.singletonList(bArr);
        rj2Var.k = jv4Var;
        return new b(rj2Var);
    }

    public ud2(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, qq4 qq4Var, jv4 jv4Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = qq4Var;
        this.l = jv4Var;
    }
}
