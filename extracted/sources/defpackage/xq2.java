package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.graphics.Path;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.text.selection.f;
import androidx.compose.ui.platform.e;
import ir.mservices.market.version2.webapi.responsedto.BindInfoDTO;
import ir.mservices.market.version2.webapi.responsedto.PaymentRequiredBindingDto;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.time.DurationUnit;
import kotlin.time.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xq2 {
    public static final ob a = new ob();
    public static final mh b = new mh(3);
    public static final int[] c = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] d = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] e = {3, 6};
    public static final int[] f = {1, 2, 4, 5, 7, 8};
    public static final StackTraceElement[] g = new StackTraceElement[0];
    public static final StackTraceElement[] h = new StackTraceElement[0];
    public static final /* synthetic */ int i = 0;
    public static Boolean j;
    public static Boolean k;
    public static Boolean l;
    public static Boolean m;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;

    public static final a A(String str, String str2) {
        StringBuilder sbE = bl4.E(str2, " when parsing an Instant from \"");
        sbE.append(N(64, str));
        sbE.append('\"');
        return new a(sbE.toString(), str);
    }

    public static final int B(int i2, String str) {
        return (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList C(defpackage.h26 r30) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq2.C(h26):java.util.ArrayList");
    }

    public static sj5 D(Class cls, boolean z) {
        if (Parcelable.class.isAssignableFrom(cls)) {
            return z ? new oj5(cls) : new pj5(cls);
        }
        if (Enum.class.isAssignableFrom(cls) && !z) {
            return new nj5(cls);
        }
        if (Serializable.class.isAssignableFrom(cls)) {
            return z ? new qj5(cls) : new rj5(cls);
        }
        return null;
    }

    public static final void F(fz7 fz7Var, int i2, Object obj) {
        int iH = fz7Var.h(i2);
        Object[] objArr = fz7Var.c;
        Object obj2 = objArr[iH];
        objArr[iH] = jz0.a;
        if (obj == obj2) {
            return;
        }
        sz0.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void G(mv5 mv5Var, int i2, Object obj) {
        mv5Var.k[(mv5Var.l - mv5Var.g[mv5Var.h - 1].c) + i2] = obj;
    }

    public static final void H(mv5 mv5Var, int i2, Object obj, int i3, Object obj2) {
        int i4 = mv5Var.l - mv5Var.g[mv5Var.h - 1].c;
        Object[] objArr = mv5Var.k;
        objArr[i2 + i4] = obj;
        objArr[i4 + i3] = obj2;
    }

    public static final void I(mv5 mv5Var, Object obj, Object obj2, Object obj3) {
        int i2 = mv5Var.l - mv5Var.g[mv5Var.h - 1].c;
        Object[] objArr = mv5Var.k;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        objArr[i2 + 2] = obj3;
    }

    public static final ExtractedText J(zh8 zh8Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = zh8Var.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = zh8Var.b;
        extractedText.selectionStart = zi8.g(j2);
        extractedText.selectionEnd = zi8.f(j2);
        extractedText.flags = !f88.d0(zh8Var.a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void K(List list, u26 u26Var) {
        Path path;
        int i2;
        float f2;
        int i3;
        s36 s36Var;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        eh ehVar = (eh) u26Var;
        Path path2 = ehVar.a;
        Path path3 = ehVar.a;
        Path.FillType fillType = path2.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path3.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path3.setFillType(fillType2);
        s36 s36Var2 = list2.isEmpty() ? a36.c : (s36) list2.get(0);
        int size = list2.size();
        float f11 = 0.0f;
        int i4 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i4 < size) {
            s36 s36Var3 = (s36) list2.get(i4);
            if (s36Var3 instanceof a36) {
                path3.close();
                path = path3;
                i2 = size;
                f2 = f11;
                i3 = i4;
                s36Var = s36Var3;
                f12 = f16;
                f14 = f12;
                f13 = f17;
                f15 = f13;
            } else {
                if (s36Var3 instanceof m36) {
                    m36 m36Var = (m36) s36Var3;
                    float f18 = m36Var.c;
                    f14 += f18;
                    float f19 = m36Var.d;
                    f15 += f19;
                    path3.rMoveTo(f18, f19);
                    path = path3;
                    i2 = size;
                    f2 = f11;
                    i3 = i4;
                    f16 = f14;
                    f17 = f15;
                } else {
                    if (s36Var3 instanceof e36) {
                        e36 e36Var = (e36) s36Var3;
                        float f20 = e36Var.c;
                        float f21 = e36Var.d;
                        path3.moveTo(f20, f21);
                        f15 = f21;
                        f17 = f15;
                        path = path3;
                        f14 = f20;
                        f16 = f14;
                    } else {
                        if (s36Var3 instanceof l36) {
                            l36 l36Var = (l36) s36Var3;
                            float f22 = l36Var.d;
                            float f23 = l36Var.c;
                            path3.rLineTo(f23, f22);
                            f14 += f23;
                            f15 += f22;
                        } else if (s36Var3 instanceof d36) {
                            d36 d36Var = (d36) s36Var3;
                            float f24 = d36Var.d;
                            float f25 = d36Var.c;
                            path3.lineTo(f25, f24);
                            f14 = f25;
                            path = path3;
                            f15 = f24;
                        } else if (s36Var3 instanceof k36) {
                            float f26 = ((k36) s36Var3).c;
                            path3.rLineTo(f26, f11);
                            f14 += f26;
                        } else if (s36Var3 instanceof c36) {
                            float f27 = ((c36) s36Var3).c;
                            path3.lineTo(f27, f15);
                            f14 = f27;
                        } else {
                            if (s36Var3 instanceof q36) {
                                f10 = ((q36) s36Var3).c;
                                path3.rLineTo(f11, f10);
                            } else if (s36Var3 instanceof r36) {
                                float f28 = ((r36) s36Var3).c;
                                path3.lineTo(f14, f28);
                                f15 = f28;
                            } else if (s36Var3 instanceof j36) {
                                j36 j36Var = (j36) s36Var3;
                                path3.rCubicTo(j36Var.c, j36Var.d, j36Var.e, j36Var.f, j36Var.g, j36Var.h);
                                f12 = j36Var.e + f14;
                                f13 = j36Var.f + f15;
                                f14 += j36Var.g;
                                f10 = j36Var.h;
                            } else {
                                if (s36Var3 instanceof b36) {
                                    b36 b36Var = (b36) s36Var3;
                                    path3.cubicTo(b36Var.c, b36Var.d, b36Var.e, b36Var.f, b36Var.g, b36Var.h);
                                    f12 = b36Var.e;
                                    f13 = b36Var.f;
                                    f6 = b36Var.g;
                                    f7 = b36Var.h;
                                } else if (s36Var3 instanceof o36) {
                                    if (s36Var2.a) {
                                        f9 = f15 - f13;
                                        f8 = f14 - f12;
                                    } else {
                                        f8 = f11;
                                        f9 = f8;
                                    }
                                    o36 o36Var = (o36) s36Var3;
                                    path3.rCubicTo(f8, f9, o36Var.c, o36Var.d, o36Var.e, o36Var.f);
                                    f12 = o36Var.c + f14;
                                    f13 = o36Var.d + f15;
                                    f14 += o36Var.e;
                                    f10 = o36Var.f;
                                } else if (s36Var3 instanceof g36) {
                                    if (s36Var2.a) {
                                        float f29 = 2;
                                        f14 = (f14 * f29) - f12;
                                        f15 = (f29 * f15) - f13;
                                    }
                                    g36 g36Var = (g36) s36Var3;
                                    path3.cubicTo(f14, f15, g36Var.c, g36Var.d, g36Var.e, g36Var.f);
                                    f12 = g36Var.c;
                                    f13 = g36Var.d;
                                    f6 = g36Var.e;
                                    f7 = g36Var.f;
                                } else if (s36Var3 instanceof n36) {
                                    n36 n36Var = (n36) s36Var3;
                                    float f30 = n36Var.f;
                                    float f31 = n36Var.e;
                                    float f32 = n36Var.d;
                                    float f33 = n36Var.c;
                                    path3.rQuadTo(f33, f32, f31, f30);
                                    float f34 = f33 + f14;
                                    float f35 = f32 + f15;
                                    f14 += f31;
                                    f15 += f30;
                                    f12 = f34;
                                    path = path3;
                                    f13 = f35;
                                } else {
                                    if (s36Var3 instanceof f36) {
                                        f36 f36Var = (f36) s36Var3;
                                        float f36 = f36Var.f;
                                        float f37 = f36Var.e;
                                        float f38 = f36Var.d;
                                        f5 = f36Var.c;
                                        path3.quadTo(f5, f38, f37, f36);
                                        path = path3;
                                        f15 = f36;
                                        f14 = f37;
                                        f13 = f38;
                                    } else if (s36Var3 instanceof p36) {
                                        if (s36Var2.b) {
                                            f3 = f14 - f12;
                                            f4 = f15 - f13;
                                        } else {
                                            f3 = f11;
                                            f4 = f3;
                                        }
                                        p36 p36Var = (p36) s36Var3;
                                        float f39 = p36Var.d;
                                        float f40 = p36Var.c;
                                        path3.rQuadTo(f3, f4, f40, f39);
                                        f5 = f3 + f14;
                                        float f41 = f4 + f15;
                                        f14 += f40;
                                        f15 += f39;
                                        path = path3;
                                        f13 = f41;
                                    } else if (s36Var3 instanceof h36) {
                                        if (s36Var2.b) {
                                            float f42 = 2;
                                            f14 = (f14 * f42) - f12;
                                            f15 = (f42 * f15) - f13;
                                        }
                                        h36 h36Var = (h36) s36Var3;
                                        float f43 = h36Var.d;
                                        float f44 = h36Var.c;
                                        path3.quadTo(f14, f15, f44, f43);
                                        path = path3;
                                        i2 = size;
                                        f2 = f11;
                                        i3 = i4;
                                        f13 = f15;
                                        s36Var = s36Var3;
                                        f15 = f43;
                                        f12 = f14;
                                        f14 = f44;
                                    } else if (s36Var3 instanceof i36) {
                                        i36 i36Var = (i36) s36Var3;
                                        float f45 = i36Var.h + f14;
                                        float f46 = i36Var.i + f15;
                                        path = path3;
                                        i3 = i4;
                                        f2 = 0.0f;
                                        i2 = size;
                                        ehVar = ehVar;
                                        r(ehVar, f14, f15, f45, f46, i36Var.c, i36Var.d, i36Var.e, i36Var.f, i36Var.g);
                                        f12 = f45;
                                        f14 = f12;
                                        f13 = f46;
                                        f15 = f13;
                                        s36Var = s36Var3;
                                    } else {
                                        path = path3;
                                        i2 = size;
                                        f2 = f11;
                                        i3 = i4;
                                        if (!(s36Var3 instanceof z26)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        z26 z26Var = (z26) s36Var3;
                                        float f47 = z26Var.i;
                                        float f48 = z26Var.h;
                                        s36Var = s36Var3;
                                        ehVar = ehVar;
                                        r(ehVar, f14, f15, f48, f47, z26Var.c, z26Var.d, z26Var.e, z26Var.f, z26Var.g);
                                        f13 = f47;
                                        f15 = f13;
                                        f12 = f48;
                                        f14 = f12;
                                    }
                                    i2 = size;
                                    f2 = f11;
                                    i3 = i4;
                                    s36Var = s36Var3;
                                    f12 = f5;
                                }
                                f15 = f7;
                                path = path3;
                                f14 = f6;
                            }
                            f15 += f10;
                        }
                        path = path3;
                    }
                    i2 = size;
                    f2 = f11;
                    i3 = i4;
                }
                s36Var = s36Var3;
            }
            i4 = i3 + 1;
            list2 = list;
            path3 = path;
            size = i2;
            s36Var2 = s36Var;
            f11 = f2;
        }
    }

    public static String L(int i2) {
        return i2 == 0 ? "Unspecified" : i2 == 1 ? "Text" : i2 == 2 ? "Ascii" : i2 == 3 ? "Number" : i2 == 4 ? BindInfoDTO.BIND_TYPE_PHONE : i2 == 5 ? "Uri" : i2 == 6 ? BindInfoDTO.BIND_TYPE_EMAIL : i2 == 7 ? "Password" : i2 == 8 ? "NumberPassword" : i2 == 9 ? "Decimal" : "Invalid";
    }

    public static final String M(no7 no7Var) {
        return kotlin.collections.a.t0(ok4.Z(0, no7Var.e()), ", ", no7Var.a() + '(', ")", new z45(19, no7Var), 24);
    }

    public static final String N(int i2, String str) {
        if (str.length() <= i2) {
            return str.toString();
        }
        return str.subSequence(0, i2).toString() + "...";
    }

    public static j a(float f2, float f3, int i2) {
        float f4 = 0;
        float f5 = 0;
        if ((i2 & 8) != 0) {
            f3 = 0;
        }
        return new j(new bu1(f2), new bu1(f4), new bu1(f5), new bu1(f3));
    }

    public static final void b(boolean z, final bp2 bp2Var, qz0 qz0Var, final int i2, final int i3) {
        final boolean z2;
        int i4;
        qz0Var.c0(-361453782);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            z2 = z;
        } else {
            z2 = z;
            i4 = (qz0Var.g(z2) ? 4 : 2) | i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= qz0Var.h(bp2Var) ? 32 : 16;
        }
        if (qz0Var.R(i4 & 1, (i4 & 19) != 18)) {
            final boolean z3 = i5 != 0 ? true : z2;
            dk5 dk5VarA = pc4.a(qz0Var);
            xs5 xs5Var = (xs5) qz0Var.j(qc4.a);
            if (xs5Var == null) {
                qz0Var.a0(1208426157);
                View view = (View) qz0Var.j(e.f);
                js3.p(view, "<this>");
                while (true) {
                    if (view == null) {
                        xs5Var = null;
                        break;
                    }
                    Object tag = view.getTag(bs6.view_tree_on_back_pressed_dispatcher_owner);
                    xs5 xs5Var2 = tag instanceof xs5 ? (xs5) tag : null;
                    if (xs5Var2 != null) {
                        xs5Var = xs5Var2;
                        break;
                    } else {
                        Object objJ = h27.j(view);
                        view = objJ instanceof View ? (View) objJ : null;
                    }
                }
                qz0Var.q(false);
            } else {
                qz0Var.a0(1208423708);
                qz0Var.q(false);
            }
            if (xs5Var == null) {
                qz0Var.a0(1208428160);
                Object baseContext = (Context) qz0Var.j(e.b);
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        baseContext = null;
                        break;
                    } else if (baseContext instanceof xs5) {
                        break;
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                }
                xs5Var = (xs5) baseContext;
                qz0Var.q(false);
            } else {
                qz0Var.a0(1208423789);
                qz0Var.q(false);
            }
            Object obj = dk5VarA == null ? xs5Var : dk5VarA;
            if (obj == null) {
                throw new IllegalArgumentException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            Object objM = qz0Var.M();
            Object obj2 = jz0.a;
            if (objM == obj2) {
                objM = new i40(dk5VarA != null ? dk5VarA.a() : null, xs5Var != null ? xs5Var.c() : null);
                qz0Var.l0(objM);
            }
            Object obj3 = (i40) objM;
            long j2 = qz0Var.T;
            boolean zF = qz0Var.f(obj3) | qz0Var.e(j2);
            Object objM2 = qz0Var.M();
            Object obj4 = objM2;
            if (zF || objM2 == obj2) {
                xy0 xy0Var = new xy0(new j40(j2, obj));
                xy0Var.c = new v7(27);
                qz0Var.l0(xy0Var);
                obj4 = xy0Var;
            }
            final xy0 xy0Var2 = (xy0) obj4;
            qz0Var.a0(-585289004);
            boolean zH = qz0Var.h(xy0Var2) | ((i4 & 112) == 32);
            Object objM3 = qz0Var.M();
            if (zH || objM3 == obj2) {
                objM3 = new d(xy0Var2, bp2Var, 11);
                qz0Var.l0(objM3);
            }
            zk8.k((bp2) objM3, qz0Var);
            Boolean boolValueOf = Boolean.valueOf(z3);
            int i6 = i4 & 14;
            boolean zH2 = qz0Var.h(xy0Var2) | (i6 == 4);
            Object objM4 = qz0Var.M();
            if (zH2 || objM4 == obj2) {
                objM4 = new dp2() { // from class: k40
                    @Override // defpackage.dp2
                    public final Object invoke(Object obj5) {
                        xy0 xy0Var3 = xy0Var2;
                        h40 h40Var = xy0Var3.a;
                        boolean z4 = z3;
                        h40Var.f(z4);
                        xy0Var3.b.i(z4);
                        return new a9((p64) obj5, xy0Var3, 1);
                    }
                };
                qz0Var.l0(objM4);
            }
            at2.J(boolValueOf, xy0Var2, null, (dp2) objM4, qz0Var, i6);
            boolean zH3 = qz0Var.h(obj3) | qz0Var.h(xy0Var2);
            Object objM5 = qz0Var.M();
            if (zH3 || objM5 == obj2) {
                objM5 = new m(obj3, xy0Var2, 6);
                qz0Var.l0(objM5);
            }
            zk8.e(obj3, xy0Var2, (dp2) objM5, qz0Var);
            qz0Var.q(false);
            z2 = z3;
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: l40
                @Override // defpackage.qp2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int iW = hs9.W(i2 | 1);
                    xq2.b(z2, bp2Var, (qz0) obj5, iW, i3);
                    return tx8.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.hx4 r24, final defpackage.bp2 r25, final androidx.compose.material3.n r26, boolean r27, defpackage.rp2 r28, final androidx.compose.runtime.internal.a r29, defpackage.rp2 r30, defpackage.qz0 r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq2.c(hx4, bp2, androidx.compose.material3.n, boolean, rp2, androidx.compose.runtime.internal.a, rp2, qz0, int, int):void");
    }

    public static final void d(f fVar, androidx.compose.runtime.internal.a aVar, qz0 qz0Var, int i2) {
        int i3;
        qz0Var.c0(1533506138);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var.h(fVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var.h(aVar) ? 32 : 16;
        }
        if (qz0Var.R(i3 & 1, (i3 & 19) != 18)) {
            qz0Var.a0(-885604480);
            ok4.j(fVar.k(), aVar, qz0Var, i3 & 112);
            qz0Var.q(false);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new yw0(fVar, aVar, i2, 0);
        }
    }

    public static long e(float f2) {
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final uj1 f(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        ki2 ki2VarA = li2.a(f2);
        if (ki2VarA == null) {
            ki2VarA = new f74(f2);
        }
        return new uj1(f3, f2, ki2VarA);
    }

    public static final void g(hx4 hx4Var, float f2, float f3, xr7 xr7Var, long j2, qz0 qz0Var, final int i2) {
        final hx4 hx4Var2;
        final float f4;
        final float f5;
        final xr7 xr7Var2;
        final long j3;
        long j4;
        final float f6;
        final float f7;
        xr7 xr7Var3;
        hx4 hx4Var3;
        qz0Var.c0(-937132705);
        int i3 = i2 | 9366;
        if (qz0Var.R(i3 & 1, (i3 & 9363) != 9362)) {
            qz0Var.W();
            if ((i2 & 1) == 0 || qz0Var.z()) {
                float fQ = ml9.q(hq6.size_24, qz0Var);
                float fQ2 = ml9.q(hq6.size_4, qz0Var);
                ka7 ka7VarA = la7.a(ml9.q(hq6.radius_8, qz0Var));
                Object objJ = qz0Var.j(uj8.a);
                js3.m(objJ);
                j4 = ((tj8) objJ).I.c;
                f6 = fQ;
                f7 = fQ2;
                xr7Var3 = ka7VarA;
                hx4Var3 = ex4.b;
            } else {
                qz0Var.U();
                hx4Var3 = hx4Var;
                f6 = f2;
                f7 = f3;
                xr7Var3 = xr7Var;
                j4 = j2;
            }
            qz0Var.r();
            long j5 = j4;
            pc8.a(yh0.B(hx4Var3, 0.0f, ml9.q(hq6.space_8, qz0Var), 1), xr7Var3, j5, 0L, 0.0f, 0.0f, s7.X(57998308, new qp2() { // from class: of0
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    qz0 qz0Var2 = (qz0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (qz0Var2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        bg0.a(b.j(ex4.b, f6, f7), qz0Var2, 0);
                    } else {
                        qz0Var2.U();
                    }
                    return tx8.a;
                }
            }, qz0Var), qz0Var, 12582912, 120);
            xr7Var2 = xr7Var3;
            j3 = j5;
            hx4Var2 = hx4Var3;
            f4 = f6;
            f5 = f7;
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
            f4 = f2;
            f5 = f3;
            xr7Var2 = xr7Var;
            j3 = j2;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(f4, f5, xr7Var2, j3, i2) { // from class: pf0
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ xr7 d;
                public final /* synthetic */ long e;

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iW = hs9.W(1);
                    xq2.g(this.a, this.b, this.c, this.d, this.e, (qz0) obj, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static Object h(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void i(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final void j(int i2, int i3, List list) {
        int iS = s(i2, list);
        if (iS < 0) {
            iS = -(iS + 1);
        }
        while (iS < list.size() && ((vs3) list.get(iS)).b < i3) {
        }
    }

    public static void k(long j2, String str) {
        if (j2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j2 + ") must be >= 0");
    }

    public static final void l(bz7 bz7Var, ArrayList arrayList, int i2) {
        boolean zL = bz7Var.l(i2);
        int[] iArr = bz7Var.b;
        if (zL) {
            arrayList.add(bz7Var.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            l(bz7Var, arrayList, i4);
        }
    }

    public static final double m(double d2, DurationUnit durationUnit, DurationUnit durationUnit2) {
        js3.p(durationUnit2, "targetUnit");
        long jConvert = durationUnit2.a.convert(1L, durationUnit.a);
        return jConvert > 0 ? d2 * jConvert : d2 / r8.convert(1L, r9);
    }

    public static final long n(long j2, DurationUnit durationUnit, DurationUnit durationUnit2) {
        js3.p(durationUnit, "sourceUnit");
        js3.p(durationUnit2, "targetUnit");
        return durationUnit2.a.convert(j2, durationUnit.a);
    }

    public static final long o(long j2, DurationUnit durationUnit, DurationUnit durationUnit2) {
        js3.p(durationUnit, "sourceUnit");
        js3.p(durationUnit2, "targetUnit");
        return durationUnit2.a.convert(j2, durationUnit.a);
    }

    public static void p(tb2 tb2Var, s26 s26Var) {
        if (tb2Var.D(s26Var)) {
            return;
        }
        try {
            tb2Var.U(s26Var, false).close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void q(tb2 tb2Var, s26 s26Var) throws IOException {
        try {
            IOException iOException = null;
            for (s26 s26Var2 : tb2Var.I(s26Var)) {
                try {
                    if (tb2Var.K(s26Var2).c) {
                        q(tb2Var, s26Var2);
                    }
                    tb2Var.u(s26Var2);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void r(u26 u26Var, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        double d11 = d6;
        double d12 = (d8 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double d13 = ((d3 * dSin) + (d2 * dCos)) / d11;
        double d14 = ((d3 * dCos) + ((-d2) * dSin)) / d7;
        double d15 = ((d5 * dSin) + (d4 * dCos)) / d11;
        double d16 = ((d5 * dCos) + ((-d4) * dSin)) / d7;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = 2;
        double d20 = (d13 + d15) / d19;
        double d21 = (d14 + d16) / d19;
        double d22 = (d18 * d18) + (d17 * d17);
        if (d22 == 0.0d) {
            return;
        }
        double d23 = (1.0d / d22) - 0.25d;
        if (d23 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d22) / 1.99999d);
            r(u26Var, d2, d3, d4, d5, d11 * dSqrt, d7 * dSqrt, d8, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d23);
        double d24 = d17 * dSqrt2;
        double d25 = dSqrt2 * d18;
        if (z == z2) {
            d9 = d20 - d25;
            d10 = d21 + d24;
        } else {
            d9 = d20 + d25;
            d10 = d21 - d24;
        }
        double dAtan2 = Math.atan2(d14 - d10, d13 - d9);
        double dAtan22 = Math.atan2(d16 - d10, d15 - d9) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d26 = d9 * d11;
        double d27 = d10 * d7;
        double d28 = (d26 * dCos) - (d27 * dSin);
        double d29 = (d27 * dCos) + (d26 * dSin);
        double d30 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * d30) / 3.141592653589793d));
        double dCos2 = Math.cos(d12);
        double dSin2 = Math.sin(d12);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d31 = dAtan22;
        double d32 = -d11;
        double d33 = d32 * dCos2;
        double d34 = d7 * dSin2;
        double d35 = (d33 * dSin3) - (d34 * dCos3);
        double d36 = d32 * dSin2;
        double d37 = d7 * dCos2;
        double d38 = (dCos3 * d37) + (dSin3 * d36);
        double d39 = d31 / ((double) iCeil);
        double d40 = dAtan2;
        double d41 = d35;
        int i2 = 0;
        double d42 = d2;
        double d43 = d38;
        double d44 = d3;
        while (i2 < iCeil) {
            double d45 = d40 + d39;
            double dSin4 = Math.sin(d45);
            double dCos4 = Math.cos(d45);
            int i3 = i2;
            double d46 = (((d11 * dCos2) * dCos4) + d28) - (d34 * dSin4);
            int i4 = iCeil;
            double d47 = (d37 * dSin4) + (d11 * dSin2 * dCos4) + d29;
            double d48 = (d33 * dSin4) - (d34 * dCos4);
            double d49 = (dCos4 * d37) + (dSin4 * d36);
            double d50 = d45 - d40;
            double dTan = Math.tan(d50 / d19);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d30) - ((double) 1)) * Math.sin(d50)) / ((double) 3);
            ((eh) u26Var).a.cubicTo((float) ((d41 * dSqrt3) + d42), (float) ((d43 * dSqrt3) + d44), (float) (d46 - (dSqrt3 * d48)), (float) (d47 - (dSqrt3 * d49)), (float) d46, (float) d47);
            dSin2 = dSin2;
            d42 = d46;
            i2 = i3 + 1;
            d28 = d28;
            d30 = d30;
            d40 = d45;
            d43 = d49;
            d41 = d48;
            d44 = d47;
            iCeil = i4;
            d11 = d6;
        }
    }

    public static final int s(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iR = js3.r(((vs3) list.get(i4)).b, i2);
            if (iR < 0) {
                i3 = i4 + 1;
            } else {
                if (iR <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void t(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    public static sj5 u(String str, String str2) {
        boolean zEquals = "integer".equals(str);
        yd0 yd0Var = sj5.o;
        sj5 sj5Var = zEquals ? sj5.b : "integer[]".equals(str) ? sj5.d : "List<Int>".equals(str) ? sj5.e : "long".equals(str) ? sj5.f : "long[]".equals(str) ? sj5.g : "List<Long>".equals(str) ? sj5.h : "boolean".equals(str) ? sj5.l : "boolean[]".equals(str) ? sj5.m : "List<Boolean>".equals(str) ? sj5.n : "string".equals(str) ? yd0Var : "string[]".equals(str) ? sj5.p : "List<String>".equals(str) ? sj5.q : "float".equals(str) ? sj5.i : "float[]".equals(str) ? sj5.j : "List<Float>".equals(str) ? sj5.k : null;
        if (sj5Var != null) {
            return sj5Var;
        }
        if ("reference".equals(str)) {
            return sj5.c;
        }
        if (str == null || str.length() == 0) {
            return yd0Var;
        }
        try {
            String strConcat = (!m88.Z(str, ".", false) || str2 == null) ? str : str2.concat(str);
            boolean zS = m88.S(str, "[]", false);
            if (zS) {
                strConcat = strConcat.substring(0, strConcat.length() - 2);
                js3.o(strConcat, "substring(...)");
            }
            sj5 sj5VarD = D(Class.forName(strConcat), zS);
            if (sj5VarD != null) {
                return sj5VarD;
            }
            throw new IllegalArgumentException((strConcat + " is not Serializable or Parcelable.").toString());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static final String v(Context context) {
        Object objA;
        try {
            Object systemService = context.getSystemService(PaymentRequiredBindingDto.BINDING_PHONE);
            js3.n(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            js3.m(networkOperatorName);
            boolean zN0 = f88.n0(networkOperatorName);
            objA = networkOperatorName;
            if (zN0) {
                objA = null;
            }
        } catch (Throwable th) {
            objA = kotlin.b.a(th);
        }
        return (String) (objA instanceof Result.Failure ? null : objA);
    }

    public static final int w(no7 no7Var, no7[] no7VarArr) {
        js3.p(no7VarArr, "typeParams");
        int iHashCode = (no7Var.a().hashCode() * 31) + Arrays.hashCode(no7VarArr);
        int iE = no7Var.e();
        int i2 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iE > 0)) {
                break;
            }
            int i3 = iE - 1;
            int i4 = i2 * 31;
            String strA = no7Var.h(no7Var.e() - iE).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i2 = i4 + iHashCode2;
            iE = i3;
        }
        int iE2 = no7Var.e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iE2 > 0)) {
                return (((iHashCode * 31) + i2) * 31) + iHashCode3;
            }
            int i5 = iE2 - 1;
            int i6 = iHashCode3 * 31;
            o37 kind = no7Var.h(no7Var.e() - iE2).getKind();
            iHashCode3 = i6 + (kind != null ? kind.hashCode() : 0);
            iE2 = i5;
        }
    }

    public static boolean x(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (j == null) {
            j = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return j.booleanValue();
    }

    public static boolean y(Context context) {
        if (x(context) && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (k == null) {
            k = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (k.booleanValue()) {
            return !wn5.R() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static final a z(int i2, dp2 dp2Var, String str, String str2) {
        char cCharAt = str.charAt(i2);
        if (((Boolean) dp2Var.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return A(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i2);
    }

    public void E(Context context, com.bumptech.glide.a aVar, y27 y27Var) {
    }
}
