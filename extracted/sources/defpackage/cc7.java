package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.node.h;
import androidx.compose.ui.platform.e;
import coil3.compose.AsyncImagePainter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class cc7 {
    public static final /* synthetic */ int a = 0;

    public static long A(int i, Parcel parcel) {
        L(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long B(int i, Parcel parcel) {
        int iC = C(i, parcel);
        if (iC == 0) {
            return null;
        }
        M(parcel, iC, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int C(int i, Parcel parcel) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final void D(View view, lf9 lf9Var) {
        js3.p(lf9Var, "inset");
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || Build.VERSION.SDK_INT > 29) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                q69.c(childAt, lf9Var);
            }
        }
    }

    public static void E(int i, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + C(i, parcel));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [dp2] */
    /* JADX WARN: Type inference failed for: r1v10, types: [gx4] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [gx4] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final void F(ri1 ri1Var, Object obj, dp2 dp2Var) {
        z4 z4Var;
        gx4 gx4Var = (gx4) ri1Var;
        if (!gx4Var.a.n) {
            rn3.b("visitAncestors called on an unattached node");
        }
        gx4 gx4Var2 = gx4Var.a.e;
        h hVarH = y40.H(ri1Var);
        while (hVarH != null) {
            if ((((gx4) hVarH.H.g).d & 262144) != 0) {
                while (gx4Var2 != null) {
                    if ((gx4Var2.c & 262144) != 0) {
                        ?? J = gx4Var2;
                        ?? zb5Var = 0;
                        while (J != 0) {
                            if (J instanceof fs8) {
                                fs8 fs8Var = (fs8) J;
                                if (!(obj.equals(fs8Var.l()) ? ((Boolean) dp2Var.invoke(fs8Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((J.c & 262144) != 0) && (J instanceof ti1)) {
                                    gx4 gx4Var3 = ((ti1) J).p;
                                    int i = 0;
                                    J = J;
                                    zb5Var = zb5Var;
                                    while (gx4Var3 != null) {
                                        if ((gx4Var3.c & 262144) != 0) {
                                            i++;
                                            zb5Var = zb5Var;
                                            if (i == 1) {
                                                J = gx4Var3;
                                            } else {
                                                if (zb5Var == 0) {
                                                    zb5Var = new zb5(0, new gx4[16]);
                                                }
                                                if (J != 0) {
                                                    zb5Var.b(J);
                                                    J = 0;
                                                }
                                                zb5Var.b(gx4Var3);
                                            }
                                        }
                                        gx4Var3 = gx4Var3.f;
                                        J = J;
                                        zb5Var = zb5Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            J = y40.j(zb5Var);
                        }
                    }
                    gx4Var2 = gx4Var2.e;
                }
            }
            hVarH = hVarH.F();
            gx4Var2 = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [fs8, java.lang.Object, ri1] */
    /* JADX WARN: Type inference failed for: r12v0, types: [dp2] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [gx4] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [gx4] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void G(fs8 fs8Var, dp2 dp2Var) {
        z4 z4Var;
        gx4 gx4Var = (gx4) fs8Var;
        if (!gx4Var.a.n) {
            rn3.b("visitAncestors called on an unattached node");
        }
        gx4 gx4Var2 = gx4Var.a.e;
        h hVarH = y40.H(fs8Var);
        while (hVarH != null) {
            if ((((gx4) hVarH.H.g).d & 262144) != 0) {
                while (gx4Var2 != null) {
                    if ((gx4Var2.c & 262144) != 0) {
                        ?? J = gx4Var2;
                        ?? zb5Var = 0;
                        while (J != 0) {
                            boolean zBooleanValue = true;
                            if (J instanceof fs8) {
                                fs8 fs8Var2 = (fs8) J;
                                if (js3.i(fs8Var.l(), fs8Var2.l()) && fs8Var.getClass() == fs8Var2.getClass()) {
                                    zBooleanValue = ((Boolean) dp2Var.invoke(fs8Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((J.c & 262144) != 0) && (J instanceof ti1)) {
                                    gx4 gx4Var3 = ((ti1) J).p;
                                    int i = 0;
                                    J = J;
                                    zb5Var = zb5Var;
                                    while (gx4Var3 != null) {
                                        if ((gx4Var3.c & 262144) != 0) {
                                            i++;
                                            zb5Var = zb5Var;
                                            if (i == 1) {
                                                J = gx4Var3;
                                            } else {
                                                if (zb5Var == 0) {
                                                    zb5Var = new zb5(0, new gx4[16]);
                                                }
                                                if (J != 0) {
                                                    zb5Var.b(J);
                                                    J = 0;
                                                }
                                                zb5Var.b(gx4Var3);
                                            }
                                        }
                                        gx4Var3 = gx4Var3.f;
                                        J = J;
                                        zb5Var = zb5Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            J = y40.j(zb5Var);
                        }
                    }
                    gx4Var2 = gx4Var2.e;
                }
            }
            hVarH = hVarH.F();
            gx4Var2 = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [dp2] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [gx4] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [gx4] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final void H(ri1 ri1Var, String str, dp2 dp2Var) {
        gx4 gx4Var = (gx4) ri1Var;
        if (!gx4Var.a.n) {
            rn3.b("visitSubtreeIf called on an unattached node");
        }
        zb5 zb5Var = new zb5(0, new gx4[16]);
        gx4 gx4Var2 = gx4Var.a;
        gx4 gx4Var3 = gx4Var2.f;
        if (gx4Var3 == null) {
            y40.g(zb5Var, gx4Var2);
        } else {
            zb5Var.b(gx4Var3);
        }
        while (true) {
            int i = zb5Var.c;
            if (i == 0) {
                return;
            }
            gx4 gx4Var4 = (gx4) zb5Var.l(i - 1);
            if ((gx4Var4.d & 262144) != 0) {
                for (gx4 gx4Var5 = gx4Var4; gx4Var5 != null && gx4Var5.n; gx4Var5 = gx4Var5.f) {
                    if ((gx4Var5.c & 262144) != 0) {
                        ?? J = gx4Var5;
                        ?? zb5Var2 = 0;
                        while (J != 0) {
                            if (J instanceof fs8) {
                                fs8 fs8Var = (fs8) J;
                                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = str.equals(fs8Var.l()) ? (TraversableNode$Companion$TraverseDescendantsAction) dp2Var.invoke(fs8Var) : TraversableNode$Companion$TraverseDescendantsAction.a;
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.c) {
                                    return;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.b) {
                                    break;
                                }
                            } else if ((J.c & 262144) != 0 && (J instanceof ti1)) {
                                gx4 gx4Var6 = ((ti1) J).p;
                                int i2 = 0;
                                J = J;
                                zb5Var2 = zb5Var2;
                                while (gx4Var6 != null) {
                                    if ((gx4Var6.c & 262144) != 0) {
                                        i2++;
                                        zb5Var2 = zb5Var2;
                                        if (i2 == 1) {
                                            J = gx4Var6;
                                        } else {
                                            if (zb5Var2 == 0) {
                                                zb5Var2 = new zb5(0, new gx4[16]);
                                            }
                                            if (J != 0) {
                                                zb5Var2.b(J);
                                                J = 0;
                                            }
                                            zb5Var2.b(gx4Var6);
                                        }
                                    }
                                    gx4Var6 = gx4Var6.f;
                                    J = J;
                                    zb5Var2 = zb5Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            J = y40.j(zb5Var2);
                        }
                    }
                }
            }
            y40.g(zb5Var, gx4Var4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [fs8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [dp2] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [gx4] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [gx4] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [zb5] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [zb5] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void I(fs8 fs8Var, dp2 dp2Var) {
        gx4 gx4Var = (gx4) fs8Var;
        if (!gx4Var.a.n) {
            rn3.b("visitSubtreeIf called on an unattached node");
        }
        zb5 zb5Var = new zb5(0, new gx4[16]);
        gx4 gx4Var2 = gx4Var.a;
        gx4 gx4Var3 = gx4Var2.f;
        if (gx4Var3 == null) {
            y40.g(zb5Var, gx4Var2);
        } else {
            zb5Var.b(gx4Var3);
        }
        while (true) {
            int i = zb5Var.c;
            if (i == 0) {
                return;
            }
            gx4 gx4Var4 = (gx4) zb5Var.l(i - 1);
            if ((gx4Var4.d & 262144) != 0) {
                for (gx4 gx4Var5 = gx4Var4; gx4Var5 != null && gx4Var5.n; gx4Var5 = gx4Var5.f) {
                    if ((gx4Var5.c & 262144) != 0) {
                        ?? J = gx4Var5;
                        ?? zb5Var2 = 0;
                        while (J != 0) {
                            if (J instanceof fs8) {
                                fs8 fs8Var2 = (fs8) J;
                                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = (js3.i(fs8Var.l(), fs8Var2.l()) && fs8Var.getClass() == fs8Var2.getClass()) ? (TraversableNode$Companion$TraverseDescendantsAction) dp2Var.invoke(fs8Var2) : TraversableNode$Companion$TraverseDescendantsAction.a;
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.c) {
                                    return;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.b) {
                                    break;
                                }
                            } else if ((J.c & 262144) != 0 && (J instanceof ti1)) {
                                gx4 gx4Var6 = ((ti1) J).p;
                                int i2 = 0;
                                J = J;
                                zb5Var2 = zb5Var2;
                                while (gx4Var6 != null) {
                                    if ((gx4Var6.c & 262144) != 0) {
                                        i2++;
                                        zb5Var2 = zb5Var2;
                                        if (i2 == 1) {
                                            J = gx4Var6;
                                        } else {
                                            if (zb5Var2 == 0) {
                                                zb5Var2 = new zb5(0, new gx4[16]);
                                            }
                                            if (J != 0) {
                                                zb5Var2.b(J);
                                                J = 0;
                                            }
                                            zb5Var2.b(gx4Var6);
                                        }
                                    }
                                    gx4Var6 = gx4Var6.f;
                                    J = J;
                                    zb5Var2 = zb5Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            J = y40.j(zb5Var2);
                        }
                    }
                }
            }
            y40.g(zb5Var, gx4Var4);
        }
    }

    public static int J(Parcel parcel) {
        int i = parcel.readInt();
        int iC = C(i, parcel);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iC + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new SafeParcelReader$ParseException(sb.toString(), parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object K(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            w61 r0 = r7.getContext()
            kotlinx.coroutines.a.f(r0)
            g51 r7 = defpackage.ok4.I(r7)
            boolean r1 = r7 instanceof defpackage.qp1
            if (r1 == 0) goto L12
            qp1 r7 = (defpackage.qp1) r7
            goto L13
        L12:
            r7 = 0
        L13:
            tx8 r1 = defpackage.tx8.a
            if (r7 != 0) goto L1a
        L17:
            r7 = r1
            goto L88
        L1a:
            y61 r2 = r7.d
            boolean r3 = defpackage.dy3.M(r2, r0)
            r4 = 1
            if (r3 == 0) goto L2b
            r7.f = r1
            r7.c = r4
            r2.C0(r0, r7)
            goto L86
        L2b:
            wg9 r3 = new wg9
            xs8 r5 = defpackage.wg9.c
            r3.<init>(r5)
            w61 r0 = r0.l0(r3)
            r7.f = r1
            r7.c = r4
            r2.C0(r0, r7)
            boolean r0 = r3.b
            if (r0 == 0) goto L86
            g42 r0 = defpackage.tk8.a()
            ov r2 = r0.e
            if (r2 == 0) goto L4e
            boolean r2 = r2.isEmpty()
            goto L4f
        L4e:
            r2 = r4
        L4f:
            if (r2 == 0) goto L52
            goto L17
        L52:
            long r2 = r0.c
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L5f
            r2 = r4
            goto L60
        L5f:
            r2 = 0
        L60:
            if (r2 == 0) goto L6c
            r7.f = r1
            r7.c = r4
            r0.L0(r7)
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            goto L88
        L6c:
            r0.R0(r4)
            r7.run()     // Catch: java.lang.Throwable -> L7c
        L72:
            boolean r2 = r0.Y0()     // Catch: java.lang.Throwable -> L7c
            if (r2 != 0) goto L72
        L78:
            r0.H0(r4)
            goto L17
        L7c:
            r2 = move-exception
            r7.k(r2)     // Catch: java.lang.Throwable -> L81
            goto L78
        L81:
            r7 = move-exception
            r0.H0(r4)
            throw r7
        L86:
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
        L88:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            if (r7 != r0) goto L8d
            return r7
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc7.K(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void L(Parcel parcel, int i, int i2) {
        int iC = C(i, parcel);
        if (iC == i2) {
            return;
        }
        String hexString = Integer.toHexString(iC);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iC).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iC);
        throw new SafeParcelReader$ParseException(bl4.z(sb, " (0x", hexString, ")"), parcel);
    }

    public static void M(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        throw new SafeParcelReader$ParseException(bl4.z(sb, " (0x", hexString, ")"), parcel);
    }

    public static final void a(Object obj, hx4 hx4Var, q41 q41Var, tc0 tc0Var, qz0 qz0Var, int i, int i2) {
        hi3 hi3Var;
        hi3 hi3Var2;
        cb0 cb0Var = eq.g;
        tc0 tc0Var2 = (i2 & 256) != 0 ? null : tc0Var;
        Context context = (Context) qz0Var.j(e.b);
        AtomicReference atomicReference = yx7.a;
        Object obj2 = atomicReference.get();
        hi3 hi3Var3 = obj2 instanceof hi3 ? (hi3) obj2 : null;
        if (hi3Var3 == null) {
            hi3 hi3VarA = null;
            loop0: while (true) {
                Object obj3 = atomicReference.get();
                if (obj3 instanceof hi3) {
                    hi3Var = (hi3) obj3;
                    hi3Var2 = hi3VarA;
                } else {
                    if (hi3VarA == null) {
                        xx7 xx7Var = obj3 instanceof xx7 ? (xx7) obj3 : null;
                        if (xx7Var != null) {
                            hi3VarA = xx7Var.a(context);
                        } else {
                            Object applicationContext = context.getApplicationContext();
                            xx7 xx7Var2 = applicationContext instanceof xx7 ? (xx7) applicationContext : null;
                            hi3VarA = xx7Var2 != null ? xx7Var2.a(context) : ay7.a.a(context);
                        }
                    }
                    hi3Var = hi3VarA;
                    hi3Var2 = hi3Var;
                }
                while (!atomicReference.compareAndSet(obj3, hi3Var)) {
                    if (atomicReference.get() != obj3) {
                        break;
                    }
                }
                hi3VarA = hi3Var2;
            }
            hi3Var3 = hi3Var;
        }
        int i3 = i << 3;
        int i4 = (i & 126) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192);
        int i5 = i4 >> 3;
        ml9.b(new bx(obj, (ww) qz0Var.j(nb4.a), hi3Var3), hx4Var, AsyncImagePainter.u, cb0Var, q41Var, tc0Var2, qz0Var, (57344 & i5) | (i4 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
    }

    public static void b(StringBuilder sb, Object obj, dp2 dp2Var) {
        if (dp2Var != null) {
            sb.append((CharSequence) dp2Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final void c(int i, int i2, int i3, View view) {
        if (view == null) {
            return;
        }
        wr4 wr4Var = new wr4(i3, i, i2);
        WeakHashMap weakHashMap = q69.a;
        h69.m(view, wr4Var);
    }

    public static /* synthetic */ void d(View view, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 2;
        }
        c(i, i2, i3, view);
    }

    public static void e(View view) {
        if (view == null) {
            return;
        }
        u52 u52Var = new u52(519, 10);
        WeakHashMap weakHashMap = q69.a;
        h69.m(view, u52Var);
    }

    public static BigDecimal f(int i, Parcel parcel) {
        int iC = C(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i2 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iC);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i2);
    }

    public static Bundle g(int i, Parcel parcel) {
        int iC = C(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iC);
        return bundle;
    }

    public static byte[] h(int i, Parcel parcel) {
        int iC = C(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iC);
        return bArrCreateByteArray;
    }

    public static int[] i(int i, Parcel parcel) {
        int iC = C(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iC);
        return iArrCreateIntArray;
    }

    public static Parcelable j(Parcel parcel, int i, Parcelable.Creator creator) {
        int iC = C(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iC);
        return parcelable;
    }

    public static String k(int i, Parcel parcel) {
        int iC = C(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iC);
        return string;
    }

    public static String[] l(int i, Parcel parcel) {
        int iC = C(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iC);
        return strArrCreateStringArray;
    }

    public static ArrayList m(int i, Parcel parcel) {
        int iC = C(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iC);
        return arrayListCreateStringArrayList;
    }

    public static Object[] n(Parcel parcel, int i, Parcelable.Creator creator) {
        int iC = C(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iC);
        return objArrCreateTypedArray;
    }

    public static ArrayList o(Parcel parcel, int i, Parcelable.Creator creator) {
        int iC = C(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iC);
        return arrayListCreateTypedArrayList;
    }

    public static void p(int i, Parcel parcel) {
        if (parcel.dataPosition() != i) {
            throw new SafeParcelReader$ParseException(rm7.o(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static final e51 q(View view) {
        js3.p(view, "<this>");
        xt3 xt3VarA = a.a();
        ug1 ug1Var = up1.a;
        e51 e51VarA = js3.a(bt2.L(xt3VarA, sg4.a.f));
        view.addOnAttachStateChangeListener(new g79(view, xt3VarA));
        return e51VarA;
    }

    public static final float r(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final LayerDrawable s(Context context, boolean z) {
        Drawable drawable;
        js3.p(context, "context");
        Resources resources = context.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_person;
        try {
            drawable = q39.a(resources, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.SRC_ATOP));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(context.getResources().getDimension(pq6.space_24));
        gradientDrawable.setColor(z ? sj8.b().p : sj8.b().l);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, drawableMutate});
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(pq6.space_m);
        layerDrawable.setLayerInset(1, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        return layerDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0266 A[EDGE_INSN: B:204:0x0266->B:145:0x0266 BREAK  A[LOOP:5: B:155:0x0282->B:207:0x0282], EDGE_INSN: B:205:0x0266->B:145:0x0266 BREAK  A[LOOP:5: B:155:0x0282->B:207:0x0282]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int t(defpackage.pi8 r19, android.text.Layout r20, defpackage.rb4 r21, int r22, android.graphics.RectF r23, defpackage.yl7 r24, defpackage.g8 r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc7.t(pi8, android.text.Layout, rb4, int, android.graphics.RectF, yl7, g8, boolean):int");
    }

    public static boolean u(int i, Parcel parcel) {
        L(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Double v(int i, Parcel parcel) {
        int iC = C(i, parcel);
        if (iC == 0) {
            return null;
        }
        M(parcel, iC, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float w(int i, Parcel parcel) {
        L(parcel, i, 4);
        return parcel.readFloat();
    }

    public static IBinder x(int i, Parcel parcel) {
        int iC = C(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iC);
        return strongBinder;
    }

    public static int y(int i, Parcel parcel) {
        L(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer z(int i, Parcel parcel) {
        int iC = C(i, parcel);
        if (iC == 0) {
            return null;
        }
        M(parcel, iC, 4);
        return Integer.valueOf(parcel.readInt());
    }
}
