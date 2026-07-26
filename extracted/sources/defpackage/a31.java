package defpackage;

import androidx.constraintlayout.widget.c;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import io.sentry.android.core.t0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a31 {
    public int[] a;
    public int[] b;
    public int c;
    public int[] d;
    public float[] e;
    public int f;
    public int[] g;
    public String[] h;
    public int i;
    public int[] j;
    public boolean[] k;
    public int l;

    public final void a(int i, float f) {
        int i2 = this.f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.e;
            this.e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f;
        iArr2[i3] = i;
        float[] fArr2 = this.e;
        this.f = i3 + 1;
        fArr2[i3] = f;
    }

    public final void b(int i, int i2) {
        int i3 = this.c;
        int[] iArr = this.a;
        if (i3 >= iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.b;
            this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.a;
        int i4 = this.c;
        iArr3[i4] = i;
        int[] iArr4 = this.b;
        this.c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, String str) {
        int i2 = this.i;
        int[] iArr = this.g;
        if (i2 >= iArr.length) {
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }

    public final void d(int i, boolean z) {
        int i2 = this.l;
        int[] iArr = this.j;
        if (i2 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.k;
            this.k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i3 = this.l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.k;
        this.l = i3 + 1;
        zArr2[i3] = z;
    }

    public final void e(c cVar) {
        for (int i = 0; i < this.c; i++) {
            int i2 = this.a[i];
            int i3 = this.b[i];
            if (i2 == 6) {
                cVar.e.D = i3;
            } else if (i2 == 7) {
                cVar.e.E = i3;
            } else if (i2 == 8) {
                cVar.e.K = i3;
            } else if (i2 == 27) {
                cVar.e.F = i3;
            } else if (i2 == 28) {
                cVar.e.H = i3;
            } else if (i2 == 41) {
                cVar.e.W = i3;
            } else if (i2 == 42) {
                cVar.e.X = i3;
            } else if (i2 == 61) {
                cVar.e.A = i3;
            } else if (i2 == 62) {
                cVar.e.B = i3;
            } else if (i2 == 72) {
                cVar.e.g0 = i3;
            } else if (i2 == 73) {
                cVar.e.h0 = i3;
            } else if (i2 == 2) {
                cVar.e.J = i3;
            } else if (i2 == 31) {
                cVar.e.L = i3;
            } else if (i2 == 34) {
                cVar.e.I = i3;
            } else if (i2 == 38) {
                cVar.a = i3;
            } else if (i2 == 64) {
                cVar.d.b = i3;
            } else if (i2 == 66) {
                cVar.d.f = i3;
            } else if (i2 == 76) {
                cVar.d.e = i3;
            } else if (i2 == 78) {
                cVar.c.c = i3;
            } else if (i2 == 97) {
                cVar.e.p0 = i3;
            } else if (i2 == 93) {
                cVar.e.M = i3;
            } else if (i2 != 94) {
                switch (i2) {
                    case 11:
                        cVar.e.Q = i3;
                        break;
                    case 12:
                        cVar.e.R = i3;
                        break;
                    case 13:
                        cVar.e.N = i3;
                        break;
                    case 14:
                        cVar.e.P = i3;
                        break;
                    case 15:
                        cVar.e.S = i3;
                        break;
                    case 16:
                        cVar.e.O = i3;
                        break;
                    case 17:
                        cVar.e.e = i3;
                        break;
                    case 18:
                        cVar.e.f = i3;
                        break;
                    default:
                        switch (i2) {
                            case 21:
                                cVar.e.d = i3;
                                break;
                            case 22:
                                cVar.c.b = i3;
                                break;
                            case 23:
                                cVar.e.c = i3;
                                break;
                            case 24:
                                cVar.e.G = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 54:
                                        cVar.e.Y = i3;
                                        break;
                                    case 55:
                                        cVar.e.Z = i3;
                                        break;
                                    case 56:
                                        cVar.e.a0 = i3;
                                        break;
                                    case 57:
                                        cVar.e.b0 = i3;
                                        break;
                                    case 58:
                                        cVar.e.c0 = i3;
                                        break;
                                    case 59:
                                        cVar.e.d0 = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 82:
                                                cVar.d.c = i3;
                                                break;
                                            case 83:
                                                cVar.f.i = i3;
                                                break;
                                            case 84:
                                                cVar.d.j = i3;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 87:
                                                        break;
                                                    case 88:
                                                        cVar.d.l = i3;
                                                        break;
                                                    case 89:
                                                        cVar.d.m = i3;
                                                        break;
                                                    default:
                                                        t0.m("ConstraintSet", "Unknown attribute 0x");
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                cVar.e.T = i3;
            }
        }
        for (int i4 = 0; i4 < this.f; i4++) {
            int i5 = this.d[i4];
            float f = this.e[i4];
            if (i5 == 19) {
                cVar.e.g = f;
            } else if (i5 == 20) {
                cVar.e.x = f;
            } else if (i5 == 37) {
                cVar.e.y = f;
            } else if (i5 == 60) {
                cVar.f.b = f;
            } else if (i5 == 63) {
                cVar.e.C = f;
            } else if (i5 == 79) {
                cVar.d.g = f;
            } else if (i5 == 85) {
                cVar.d.i = f;
            } else if (i5 != 87) {
                if (i5 == 39) {
                    cVar.e.V = f;
                } else if (i5 != 40) {
                    switch (i5) {
                        case 43:
                            cVar.c.d = f;
                            break;
                        case MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER /* 44 */:
                            e31 e31Var = cVar.f;
                            e31Var.n = f;
                            e31Var.m = true;
                            break;
                        case MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER /* 45 */:
                            cVar.f.c = f;
                            break;
                        case 46:
                            cVar.f.d = f;
                            break;
                        case 47:
                            cVar.f.e = f;
                            break;
                        case 48:
                            cVar.f.f = f;
                            break;
                        case 49:
                            cVar.f.g = f;
                            break;
                        case 50:
                            cVar.f.h = f;
                            break;
                        case 51:
                            cVar.f.j = f;
                            break;
                        case 52:
                            cVar.f.k = f;
                            break;
                        case 53:
                            cVar.f.l = f;
                            break;
                        default:
                            switch (i5) {
                                case 67:
                                    cVar.d.h = f;
                                    break;
                                case 68:
                                    cVar.c.e = f;
                                    break;
                                case 69:
                                    cVar.e.e0 = f;
                                    break;
                                case 70:
                                    cVar.e.f0 = f;
                                    break;
                                default:
                                    t0.m("ConstraintSet", "Unknown attribute 0x");
                                    break;
                            }
                            break;
                    }
                } else {
                    cVar.e.U = f;
                }
            }
        }
        for (int i6 = 0; i6 < this.i; i6++) {
            int i7 = this.g[i6];
            String str = this.h[i6];
            if (i7 == 5) {
                cVar.e.z = str;
            } else if (i7 == 65) {
                cVar.d.d = str;
            } else if (i7 == 74) {
                b31 b31Var = cVar.e;
                b31Var.k0 = str;
                b31Var.j0 = null;
            } else if (i7 == 77) {
                cVar.e.l0 = str;
            } else if (i7 != 87) {
                if (i7 != 90) {
                    t0.m("ConstraintSet", "Unknown attribute 0x");
                } else {
                    cVar.d.k = str;
                }
            }
        }
        for (int i8 = 0; i8 < this.l; i8++) {
            int i9 = this.j[i8];
            boolean z = this.k[i8];
            if (i9 == 44) {
                cVar.f.m = z;
            } else if (i9 == 75) {
                cVar.e.o0 = z;
            } else if (i9 != 87) {
                if (i9 == 80) {
                    cVar.e.m0 = z;
                } else if (i9 != 81) {
                    t0.m("ConstraintSet", "Unknown attribute 0x");
                } else {
                    cVar.e.n0 = z;
                }
            }
        }
    }
}
