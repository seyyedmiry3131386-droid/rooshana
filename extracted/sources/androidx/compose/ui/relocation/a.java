package androidx.compose.ui.relocation;

import androidx.compose.ui.node.h;
import androidx.compose.ui.node.m;
import defpackage.bp2;
import defpackage.gx4;
import defpackage.rg0;
import defpackage.ri1;
import defpackage.rn3;
import defpackage.ry7;
import defpackage.sy6;
import defpackage.ti1;
import defpackage.tt3;
import defpackage.tx8;
import defpackage.ue8;
import defpackage.y40;
import defpackage.z4;
import defpackage.zb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object a(ri1 ri1Var, final bp2 bp2Var, ContinuationImpl continuationImpl) {
        Object obj;
        final m mVarG;
        Object objW;
        z4 z4Var;
        gx4 gx4Var = (gx4) ri1Var;
        boolean z = gx4Var.a.n;
        if (z) {
            if (!z) {
                rn3.b("visitAncestors called on an unattached node");
            }
            gx4 gx4Var2 = gx4Var.a.e;
            h hVarH = y40.H(ri1Var);
            loop0: while (true) {
                obj = null;
                if (hVarH == null) {
                    break;
                }
                if ((((gx4) hVarH.H.g).d & 524288) != 0) {
                    while (gx4Var2 != null) {
                        if ((gx4Var2.c & 524288) != 0) {
                            gx4 gx4VarJ = gx4Var2;
                            zb5 zb5Var = null;
                            while (gx4VarJ != null) {
                                if (gx4VarJ instanceof rg0) {
                                    obj = gx4VarJ;
                                    break loop0;
                                }
                                if ((gx4VarJ.c & 524288) != 0 && (gx4VarJ instanceof ti1)) {
                                    int i = 0;
                                    for (gx4 gx4Var3 = ((ti1) gx4VarJ).p; gx4Var3 != null; gx4Var3 = gx4Var3.f) {
                                        if ((gx4Var3.c & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                gx4VarJ = gx4Var3;
                                            } else {
                                                if (zb5Var == null) {
                                                    zb5Var = new zb5(0, new gx4[16]);
                                                }
                                                if (gx4VarJ != null) {
                                                    zb5Var.b(gx4VarJ);
                                                    gx4VarJ = null;
                                                }
                                                zb5Var.b(gx4Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                gx4VarJ = y40.j(zb5Var);
                            }
                        }
                        gx4Var2 = gx4Var2.e;
                    }
                }
                hVarH = hVarH.F();
                gx4Var2 = (hVarH == null || (z4Var = hVarH.H) == null) ? null : (ue8) z4Var.f;
            }
            rg0 rg0Var = (rg0) obj;
            if (rg0Var != null && (objW = rg0Var.W((mVarG = y40.G(ri1Var)), new bp2() { // from class: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt$bringIntoView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.bp2
                public final Object invoke() {
                    sy6 sy6Var;
                    bp2 bp2Var2 = bp2Var;
                    if (bp2Var2 != null && (sy6Var = (sy6) bp2Var2.invoke()) != null) {
                        return sy6Var;
                    }
                    m mVar = mVarG;
                    if (!mVar.J0().n) {
                        mVar = null;
                    }
                    if (mVar != null) {
                        return ry7.c(0L, tt3.M(mVar.c));
                    }
                    return null;
                }
            }, continuationImpl)) == CoroutineSingletons.a) {
                return objW;
            }
        }
        return tx8.a;
    }
}
