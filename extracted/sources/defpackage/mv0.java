package defpackage;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class mv0 {
    public static final u58 a = new u58(new v7(24));
    public static final u58 b = new u58(new v7(25));

    public static final long a(lv0 lv0Var, long j) {
        long j2 = lv0Var.a;
        long j3 = lv0Var.U;
        long j4 = lv0Var.Q;
        long j5 = lv0Var.M;
        long j6 = lv0Var.q;
        if (zu0.c(j, j2)) {
            return lv0Var.b;
        }
        if (zu0.c(j, lv0Var.f)) {
            return lv0Var.g;
        }
        if (zu0.c(j, lv0Var.j)) {
            return lv0Var.k;
        }
        if (zu0.c(j, lv0Var.n)) {
            return lv0Var.o;
        }
        if (zu0.c(j, lv0Var.w)) {
            return lv0Var.x;
        }
        if (zu0.c(j, lv0Var.c)) {
            return lv0Var.d;
        }
        if (zu0.c(j, lv0Var.h)) {
            return lv0Var.i;
        }
        if (zu0.c(j, lv0Var.l)) {
            return lv0Var.m;
        }
        if (zu0.c(j, lv0Var.y)) {
            return lv0Var.z;
        }
        if (zu0.c(j, lv0Var.u)) {
            return lv0Var.v;
        }
        if (zu0.c(j, lv0Var.p)) {
            return j6;
        }
        if (zu0.c(j, lv0Var.r)) {
            return lv0Var.s;
        }
        if (zu0.c(j, lv0Var.D) || zu0.c(j, lv0Var.F) || zu0.c(j, lv0Var.G) || zu0.c(j, lv0Var.H) || zu0.c(j, lv0Var.I) || zu0.c(j, lv0Var.J) || zu0.c(j, lv0Var.E)) {
            return j6;
        }
        if (zu0.c(j, lv0Var.K) || zu0.c(j, lv0Var.L)) {
            return j5;
        }
        if (zu0.c(j, lv0Var.O) || zu0.c(j, lv0Var.P)) {
            return j4;
        }
        if (zu0.c(j, lv0Var.S) || zu0.c(j, lv0Var.T)) {
            return j3;
        }
        int i = zu0.i;
        return zu0.h;
    }

    public static final long b(long j, qz0 qz0Var) {
        qz0Var.a0(89374938);
        long jA = a((lv0) qz0Var.j(a), j);
        if (jA == 16) {
            jA = ((zu0) qz0Var.j(u31.a)).a;
        }
        qz0Var.q(false);
        return jA;
    }

    public static final long c(lv0 lv0Var, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (colorSchemeKeyTokens.ordinal()) {
            case 0:
                return lv0Var.n;
            case 1:
                return lv0Var.w;
            case 2:
                return lv0Var.y;
            case 3:
                return lv0Var.v;
            case 4:
                return lv0Var.e;
            case 5:
                return lv0Var.u;
            case 6:
                return lv0Var.o;
            case 7:
                return lv0Var.x;
            case 8:
                return lv0Var.z;
            case 9:
                return lv0Var.b;
            case 10:
                return lv0Var.d;
            case 11:
                return lv0Var.M;
            case 12:
                return lv0Var.N;
            case 13:
                return lv0Var.g;
            case 14:
                return lv0Var.i;
            case 15:
                return lv0Var.Q;
            case 16:
                return lv0Var.R;
            case 17:
                return lv0Var.q;
            case 18:
                return lv0Var.s;
            case 19:
                return lv0Var.k;
            case 20:
                return lv0Var.m;
            case 21:
                return lv0Var.U;
            case 22:
                return lv0Var.V;
            case 23:
                return lv0Var.A;
            case 24:
                return lv0Var.B;
            case 25:
                return lv0Var.a;
            case 26:
                return lv0Var.c;
            case 27:
                return lv0Var.K;
            case 28:
                return lv0Var.L;
            case 29:
                return lv0Var.C;
            case 30:
                return lv0Var.f;
            case 31:
                return lv0Var.h;
            case 32:
                return lv0Var.O;
            case 33:
                return lv0Var.P;
            case 34:
                return lv0Var.p;
            case 35:
                return lv0Var.D;
            case 36:
                return lv0Var.F;
            case 37:
                return lv0Var.G;
            case 38:
                return lv0Var.H;
            case 39:
                return lv0Var.I;
            case 40:
                return lv0Var.J;
            case 41:
                return lv0Var.E;
            case 42:
                return lv0Var.t;
            case 43:
                return lv0Var.r;
            case MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER /* 44 */:
                return lv0Var.j;
            case MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER /* 45 */:
                return lv0Var.l;
            case 46:
                return lv0Var.S;
            case 47:
                return lv0Var.T;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final long d(ColorSchemeKeyTokens colorSchemeKeyTokens, qz0 qz0Var) {
        return c((lv0) qz0Var.j(a), colorSchemeKeyTokens);
    }
}
