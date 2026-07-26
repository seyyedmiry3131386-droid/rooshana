package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.fd7;
import defpackage.g64;
import defpackage.hd7;
import defpackage.hx4;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.j56;
import defpackage.js3;
import defpackage.jz0;
import defpackage.ok4;
import defpackage.qd7;
import defpackage.qj1;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.t61;
import defpackage.tx8;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final dp2 a = new dp2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1
        @Override // defpackage.dp2
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return tx8.a;
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.dp2 r17, final defpackage.hx4 r18, defpackage.dp2 r19, defpackage.dp2 r20, final defpackage.dp2 r21, defpackage.qz0 r22, final int r23, final int r24) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.b.a(dp2, hx4, dp2, dp2, dp2, qz0, int, int):void");
    }

    public static final ViewFactoryHolder b(androidx.compose.ui.node.h hVar) {
        AndroidViewHolder androidViewHolder = hVar.q;
        if (androidViewHolder != null) {
            return (ViewFactoryHolder) androidViewHolder;
        }
        throw t61.r("Required value was null.");
    }

    public static final bp2 c(final dp2 dp2Var, qz0 qz0Var, int i) {
        long j = qz0Var.T;
        final int i2 = (int) (j ^ (j >>> 32));
        final Context context = (Context) qz0Var.j(androidx.compose.ui.platform.e.b);
        final androidx.compose.runtime.a aVarS = ok4.S(qz0Var);
        final fd7 fd7Var = (fd7) qz0Var.j(hd7.a);
        final View view = (View) qz0Var.j(androidx.compose.ui.platform.e.f);
        boolean zH = ((((i & 14) ^ 6) > 4 && qz0Var.f(dp2Var)) || (i & 6) == 4) | qz0Var.h(context) | qz0Var.h(aVarS) | qz0Var.h(fd7Var) | qz0Var.d(i2) | qz0Var.h(view);
        Object objM = qz0Var.M();
        if (zH || objM == jz0.a) {
            Object obj = new bp2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.bp2
                public final Object invoke() {
                    KeyEvent.Callback callback = view;
                    js3.n(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
                    return new ViewFactoryHolder(context, dp2Var, aVarS, fd7Var, i2, (Owner) callback).getLayoutNode();
                }
            };
            qz0Var.l0(obj);
            objM = obj;
        }
        return (bp2) objM;
    }

    public static final void d(qz0 qz0Var, hx4 hx4Var, int i, qj1 qj1Var, g64 g64Var, qd7 qd7Var, LayoutDirection layoutDirection, j56 j56Var) {
        hz0.d0.getClass();
        ia7.o(qz0Var, androidx.compose.ui.node.d.e, j56Var);
        ia7.o(qz0Var, new qp2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$1
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                b.b((androidx.compose.ui.node.h) obj).setModifier((hx4) obj2);
                return tx8.a;
            }
        }, hx4Var);
        ia7.o(qz0Var, new qp2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$2
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                b.b((androidx.compose.ui.node.h) obj).setDensity((qj1) obj2);
                return tx8.a;
            }
        }, qj1Var);
        ia7.o(qz0Var, new qp2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$3
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                b.b((androidx.compose.ui.node.h) obj).setLifecycleOwner((g64) obj2);
                return tx8.a;
            }
        }, g64Var);
        ia7.o(qz0Var, new qp2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$4
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                b.b((androidx.compose.ui.node.h) obj).setSavedStateRegistryOwner((qd7) obj2);
                return tx8.a;
            }
        }, qd7Var);
        ia7.o(qz0Var, new qp2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$5
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                int i2;
                ViewFactoryHolder viewFactoryHolderB = b.b((androidx.compose.ui.node.h) obj);
                int iOrdinal = ((LayoutDirection) obj2).ordinal();
                if (iOrdinal != 0) {
                    i2 = 1;
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i2 = 0;
                }
                viewFactoryHolderB.setLayoutDirection(i2);
                return tx8.a;
            }
        }, layoutDirection);
        ia7.g(qz0Var, Integer.valueOf(i), androidx.compose.ui.node.d.g);
    }
}
