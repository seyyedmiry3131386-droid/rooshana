package androidx.tv.material3;

import defpackage.dp2;
import defpackage.h31;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.sp2;
import defpackage.tx8;
import defpackage.wb5;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class TabRowKt$TabRow$3$1$1 extends Lambda implements qp2 {

    /* JADX INFO: renamed from: androidx.tv.material3.TabRowKt$TabRow$3$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements dp2 {

        /* JADX INFO: renamed from: androidx.tv.material3.TabRowKt$TabRow$3$1$1$1$2, reason: invalid class name */
        final class AnonymousClass2 extends Lambda implements qp2 {
            public final /* synthetic */ sp2 g;
            public final /* synthetic */ ArrayList h;
            public final /* synthetic */ wb5 i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(sp2 sp2Var, ArrayList arrayList, wb5 wb5Var) {
                super(2);
                this.g = sp2Var;
                this.h = arrayList;
                this.i = wb5Var;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                qz0 qz0Var = (qz0) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && qz0Var.B()) {
                    qz0Var.U();
                } else {
                    Boolean bool = (Boolean) this.i.getValue();
                    bool.booleanValue();
                    this.g.g(this.h, bool, qz0Var, 0);
                }
                return tx8.a;
            }
        }

        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            new ArrayList();
            throw null;
        }
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((h31) obj2).a;
        throw null;
    }
}
