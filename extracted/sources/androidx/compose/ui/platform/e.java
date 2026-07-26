package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import defpackage.bf;
import defpackage.bn6;
import defpackage.bp2;
import defpackage.bp4;
import defpackage.cq1;
import defpackage.dp2;
import defpackage.fd7;
import defpackage.gd7;
import defpackage.hd7;
import defpackage.hs9;
import defpackage.i56;
import defpackage.j56;
import defpackage.js3;
import defpackage.jz0;
import defpackage.lc4;
import defpackage.my6;
import defpackage.ok4;
import defpackage.p3;
import defpackage.pf;
import defpackage.pi;
import defpackage.q67;
import defpackage.qd7;
import defpackage.qf;
import defpackage.ql3;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rf;
import defpackage.s01;
import defpackage.s7;
import defpackage.sc4;
import defpackage.sf;
import defpackage.te1;
import defpackage.tx8;
import defpackage.u58;
import defpackage.um;
import defpackage.ur6;
import defpackage.wu8;
import defpackage.xn5;
import defpackage.yw2;
import defpackage.yx0;
import defpackage.zi3;
import defpackage.zk8;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final s01 a = new s01(new bp2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalConfiguration$1
        @Override // defpackage.bp2
        public final Object invoke() {
            e.b("LocalConfiguration");
            throw null;
        }
    });
    public static final u58 b = new u58(new bp2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalContext$1
        @Override // defpackage.bp2
        public final Object invoke() {
            e.b("LocalContext");
            throw null;
        }
    });
    public static final s01 c = new s01(new dp2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalResources$1
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            s01 s01Var = e.a;
            i56 i56Var = (i56) ((j56) obj);
            i56Var.getClass();
            wu8.G(i56Var, s01Var);
            return ((Context) wu8.G(i56Var, e.b)).getResources();
        }
    });
    public static final u58 d = new u58(new bp2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalImageVectorCache$1
        @Override // defpackage.bp2
        public final Object invoke() {
            e.b("LocalImageVectorCache");
            throw null;
        }
    });
    public static final u58 e = new u58(new bp2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalResourceIdCache$1
        @Override // defpackage.bp2
        public final Object invoke() {
            e.b("LocalResourceIdCache");
            throw null;
        }
    });
    public static final u58 f = new u58(new bp2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalView$1
        @Override // defpackage.bp2
        public final Object invoke() {
            e.b("LocalView");
            throw null;
        }
    });

    public static final void a(final AndroidComposeView androidComposeView, final qp2 qp2Var, qz0 qz0Var, final int i) {
        char c2;
        char c3;
        LinkedHashMap linkedHashMap;
        final boolean z;
        qz0Var.c0(-520299287);
        int i2 = (qz0Var.h(androidComposeView) ? 4 : 2) | i | (qz0Var.h(qp2Var) ? 32 : 16);
        if (qz0Var.R(i2 & 1, (i2 & 19) != 18)) {
            final Context context = androidComposeView.getContext();
            Object objM = qz0Var.M();
            Object obj = jz0.a;
            if (objM == obj) {
                objM = new pi();
                qz0Var.l0(objM);
            }
            final pi piVar = (pi) objM;
            bf viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            qd7 qd7Var = viewTreeOwners.b;
            Object objM2 = qz0Var.M();
            if (objM2 == obj) {
                Object parent = androidComposeView.getParent();
                js3.n(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(ur6.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                final String str = fd7.class.getSimpleName() + ':' + strValueOf;
                final bn6 bn6VarO = qd7Var.o();
                Bundle bundleO = bn6VarO.o(str);
                c2 = 2;
                if (bundleO != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleO.keySet()) {
                        ArrayList parcelableArrayList = bundleO.getParcelableArrayList(str2);
                        js3.n(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                } else {
                    linkedHashMap = null;
                }
                c3 = 4;
                u58 u58Var = hd7.a;
                gd7 gd7Var = new gd7(linkedHashMap, new dp2() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
                    @Override // defpackage.dp2
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(ok4.m(obj2));
                    }
                });
                try {
                    bn6VarO.u(str, new yx0(1, gd7Var));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                Object cq1Var = new cq1(gd7Var, new bp2() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.bp2
                    public final Object invoke() {
                        if (z) {
                            bn6 bn6Var = bn6VarO;
                            String str3 = str;
                            bp4 bp4Var = (bp4) bn6Var.b;
                            synchronized (((ql3) bp4Var.f)) {
                            }
                        }
                        return tx8.a;
                    }
                });
                qz0Var.l0(cq1Var);
                objM2 = cq1Var;
            } else {
                c2 = 2;
                c3 = 4;
            }
            final cq1 cq1Var2 = (cq1) objM2;
            boolean zH = qz0Var.h(cq1Var2);
            Object objM3 = qz0Var.M();
            if (zH || objM3 == obj) {
                objM3 = new dp2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj2) {
                        return new pf(0, cq1Var2);
                    }
                };
                qz0Var.l0(objM3);
            }
            zk8.d(tx8.a, (dp2) objM3, qz0Var);
            Object objM4 = qz0Var.M();
            if (objM4 == obj) {
                objM4 = p3.o(context) ? new te1(0, androidComposeView.getView()) : new xn5();
                qz0Var.l0(objM4);
            }
            yw2 yw2Var = (yw2) objM4;
            Configuration configuration = androidComposeView.getConfiguration();
            Object objM5 = qz0Var.M();
            if (objM5 == obj) {
                objM5 = new zi3();
                qz0Var.l0(objM5);
            }
            zi3 zi3Var = (zi3) objM5;
            Object objM6 = qz0Var.M();
            Object obj2 = objM6;
            if (objM6 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                qz0Var.l0(configuration2);
                obj2 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj2;
            Object objM7 = qz0Var.M();
            if (objM7 == obj) {
                objM7 = new rf(configuration3, zi3Var);
                qz0Var.l0(objM7);
            }
            final rf rfVar = (rf) objM7;
            boolean zH2 = qz0Var.h(context);
            Object objM8 = qz0Var.M();
            if (zH2 || objM8 == obj) {
                objM8 = new dp2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj3) {
                        Context context2 = context;
                        Context applicationContext = context2.getApplicationContext();
                        rf rfVar2 = rfVar;
                        applicationContext.registerComponentCallbacks(rfVar2);
                        return new qf(context2, rfVar2, 0);
                    }
                };
                qz0Var.l0(objM8);
            }
            zk8.d(zi3Var, (dp2) objM8, qz0Var);
            Object objM9 = qz0Var.M();
            if (objM9 == obj) {
                objM9 = new q67();
                qz0Var.l0(objM9);
            }
            q67 q67Var = (q67) objM9;
            Object objM10 = qz0Var.M();
            if (objM10 == obj) {
                objM10 = new sf(q67Var);
                qz0Var.l0(objM10);
            }
            final sf sfVar = (sf) objM10;
            boolean zH3 = qz0Var.h(context);
            Object objM11 = qz0Var.M();
            if (zH3 || objM11 == obj) {
                objM11 = new dp2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj3) {
                        Context context2 = context;
                        Context applicationContext = context2.getApplicationContext();
                        sf sfVar2 = sfVar;
                        applicationContext.registerComponentCallbacks(sfVar2);
                        return new qf(context2, sfVar2, 1);
                    }
                };
                qz0Var.l0(objM11);
            }
            zk8.d(q67Var, (dp2) objM11, qz0Var);
            androidx.compose.runtime.i iVar = l.v;
            boolean zBooleanValue = ((Boolean) qz0Var.j(iVar)).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui();
            um umVarA = a.a(androidComposeView.getConfiguration());
            um umVarA2 = b.a(context);
            um umVarA3 = lc4.a.a(viewTreeOwners.a);
            um umVarA4 = sc4.a.a(qd7Var);
            um umVarA5 = hd7.a.a(cq1Var2);
            um umVarA6 = f.a(androidComposeView.getView());
            um umVarA7 = d.a(zi3Var);
            um umVarA8 = e.a(q67Var);
            um umVarA9 = iVar.a(Boolean.valueOf(zBooleanValue));
            um umVarA10 = l.l.a(yw2Var);
            um[] umVarArr = new um[10];
            umVarArr[0] = umVarA;
            umVarArr[1] = umVarA2;
            umVarArr[c2] = umVarA3;
            umVarArr[3] = umVarA4;
            umVarArr[c3] = umVarA5;
            umVarArr[5] = umVarA6;
            umVarArr[6] = umVarA7;
            umVarArr[7] = umVarA8;
            umVarArr[8] = umVarA9;
            umVarArr[9] = umVarA10;
            zk8.c(umVarArr, s7.X(1059770793, new qp2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj3, Object obj4) {
                    qz0 qz0Var2 = (qz0) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    if (qz0Var2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        l.a(androidComposeView, piVar, qp2Var, qz0Var2, 0);
                    } else {
                        qz0Var2.U();
                    }
                    return tx8.a;
                }
            }, qz0Var), qz0Var, 56);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(qp2Var, i) { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3
                public final /* synthetic */ qp2 h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Number) obj4).intValue();
                    int iW = hs9.W(1);
                    e.a(this.g, this.h, (qz0) obj3, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
