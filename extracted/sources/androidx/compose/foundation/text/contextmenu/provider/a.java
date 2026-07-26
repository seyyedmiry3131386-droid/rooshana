package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.l;
import androidx.compose.foundation.text.contextmenu.provider.a;
import androidx.compose.runtime.g;
import defpackage.ag8;
import defpackage.bp2;
import defpackage.ha0;
import defpackage.jg8;
import defpackage.my6;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.s08;
import defpackage.tx8;
import defpackage.wb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class a implements jg8 {
    public final androidx.compose.runtime.internal.a a;
    public final l b = new l();
    public final wb5 c = g.h(null);

    public a(androidx.compose.runtime.internal.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.jg8
    public final Object a(ag8 ag8Var, SuspendLambda suspendLambda) {
        Object objB = this.b.b(MutatePriority.a, new BasicTextContextMenuProvider$showTextContextMenu$2(this, new ha0(ag8Var), null), suspendLambda);
        return objB == CoroutineSingletons.a ? objB : tx8.a;
    }

    public final void b(final bp2 bp2Var, qz0 qz0Var, final int i) {
        final bp2 bp2Var2;
        qz0 qz0Var2;
        qz0Var.c0(723898654);
        int i2 = (qz0Var.f(this) ? 32 : 16) | i;
        if (qz0Var.R(i2 & 1, (i2 & 19) != 18)) {
            ha0 ha0Var = (ha0) ((s08) this.c).getValue();
            if (ha0Var == null) {
                my6 my6VarS = qz0Var.s();
                if (my6VarS != null) {
                    final int i3 = 0;
                    my6VarS.d = new qp2(this, bp2Var, i, i3) { // from class: ga0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ a b;
                        public final /* synthetic */ bp2 c;

                        {
                            this.a = i3;
                            this.b = this;
                        }

                        @Override // defpackage.qp2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            qz0 qz0Var3 = (qz0) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    this.b.b(this.c, qz0Var3, hs9.W(7));
                                    break;
                                default:
                                    this.b.b(this.c, qz0Var3, hs9.W(7));
                                    break;
                            }
                            return tx8.a;
                        }
                    };
                    return;
                }
                return;
            }
            bp2Var2 = bp2Var;
            qz0Var2 = qz0Var;
            this.a.invoke(ha0Var, ha0Var.a, bp2Var2, qz0Var2, 384);
        } else {
            bp2Var2 = bp2Var;
            qz0Var2 = qz0Var;
            qz0Var2.U();
        }
        my6 my6VarS2 = qz0Var2.s();
        if (my6VarS2 != null) {
            final int i4 = 1;
            my6VarS2.d = new qp2(this, bp2Var2, i, i4) { // from class: ga0
                public final /* synthetic */ int a;
                public final /* synthetic */ a b;
                public final /* synthetic */ bp2 c;

                {
                    this.a = i4;
                    this.b = this;
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.a;
                    qz0 qz0Var3 = (qz0) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            this.b.b(this.c, qz0Var3, hs9.W(7));
                            break;
                        default:
                            this.b.b(this.c, qz0Var3, hs9.W(7));
                            break;
                    }
                    return tx8.a;
                }
            };
        }
    }
}
