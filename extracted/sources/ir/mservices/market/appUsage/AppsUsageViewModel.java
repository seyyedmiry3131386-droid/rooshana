package ir.mservices.market.appUsage;

import android.content.Intent;
import androidx.paging.e;
import androidx.paging.m;
import defpackage.bt2;
import defpackage.dp3;
import defpackage.e71;
import defpackage.f68;
import defpackage.g51;
import defpackage.gu9;
import defpackage.ja1;
import defpackage.js3;
import defpackage.ly5;
import defpackage.n;
import defpackage.nm5;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.t32;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v7;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.appUsage.data.SortMode;
import ir.mservices.market.viewModel.c;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AppsUsageViewModel extends c {
    public final h A;
    public final nm5 t;
    public final dp3 u;
    public final l v;
    public final rv6 w;
    public final l x;
    public final rv6 y;
    public final l z;

    /* JADX INFO: renamed from: ir.mservices.market.appUsage.AppsUsageViewModel$onEvent$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.appUsage.AppsUsageViewModel$onEvent$1", f = "AppsUsageViewModel.kt", l = {104}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public l a;
        public AppsUsageViewModel b;
        public Object c;
        public f68 d;
        public int e;
        public int f;
        public final /* synthetic */ ly5 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ly5 ly5Var, g51 g51Var) {
            super(2, g51Var);
            this.h = ly5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppsUsageViewModel.this.new AnonymousClass1(this.h, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
        
            if (r7.n(r5, r9) == false) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0059 -> B:14:0x005c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r8.f
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 != r3) goto L18
                int r1 = r8.e
                f68 r4 = r8.d
                java.lang.Object r5 = r8.c
                ir.mservices.market.appUsage.AppsUsageViewModel r6 = r8.b
                kotlinx.coroutines.flow.l r7 = r8.a
                kotlin.b.b(r9)
                goto L5c
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                kotlin.b.b(r9)
                ir.mservices.market.appUsage.AppsUsageViewModel r9 = ir.mservices.market.appUsage.AppsUsageViewModel.this
                kotlinx.coroutines.flow.l r1 = r9.z
                java.lang.Object r1 = r1.getValue()
                java.util.List r1 = (java.util.List) r1
                ly5 r4 = r8.h
                java.lang.String r4 = r4.a
                boolean r1 = r1.contains(r4)
                if (r1 != 0) goto L71
                kotlinx.coroutines.flow.l r1 = r9.v
                r6 = r9
                r7 = r1
                r1 = r2
            L3c:
                java.lang.Object r5 = r7.getValue()
                r4 = r5
                f68 r4 = (defpackage.f68) r4
                nm5 r9 = r6.t
                r8.a = r7
                r8.b = r6
                r8.c = r5
                r8.d = r4
                r8.e = r1
                r8.f = r3
                java.lang.Object r9 = r9.b
                ir.mservices.market.version2.manager.b r9 = (ir.mservices.market.version2.manager.b) r9
                java.lang.Object r9 = r9.c(r8)
                if (r9 != r0) goto L5c
                return r0
            L5c:
                f68 r9 = (defpackage.f68) r9
                if (r9 == 0) goto L6a
                if (r4 == 0) goto L66
                int r4 = r4.c
                int r4 = r4 - r3
                goto L67
            L66:
                r4 = r2
            L67:
                r9.c = r4
                goto L6b
            L6a:
                r9 = 0
            L6b:
                boolean r9 = r7.n(r5, r9)
                if (r9 == 0) goto L3c
            L71:
                tx8 r9 = defpackage.tx8.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.appUsage.AppsUsageViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppsUsageViewModel(nm5 nm5Var, dp3 dp3Var) {
        super(true);
        js3.p(dp3Var, "installManager");
        this.t = nm5Var;
        this.u = dp3Var;
        l lVarB = ja1.b(null);
        this.v = lVarB;
        this.w = new rv6(lVarB);
        l lVarB2 = ja1.b(SortMode.b);
        this.x = lVarB2;
        this.y = new rv6(lVarB2);
        ja1.b(0);
        pv6 pv6VarB = e.b(gu9.x((xe2) new m(gu9.B(), new v7(13)).a, new n(11, this)), y97.G(this));
        l lVarB3 = ja1.b(EmptyList.a);
        this.z = lVarB3;
        this.A = new h(pv6VarB, d.i(lVarB3), new AppsUsageViewModel$items$1(3, null));
        t32.b().l(this, false);
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        t32.b().o(this);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new AppsUsageViewModel$doRequest$1(this, null));
    }

    public final void onEvent(ly5 ly5Var) {
        l lVar;
        Object value;
        js3.p(ly5Var, "event");
        Intent intent = ly5Var.b;
        boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        if (!js3.i(intent.getAction(), "android.intent.action.PACKAGE_REMOVED") || booleanExtra) {
            return;
        }
        bt2.G(y97.G(this), null, null, new AnonymousClass1(ly5Var, null), 3);
        String str = ly5Var.a;
        do {
            lVar = this.z;
            value = lVar.getValue();
        } while (!lVar.n(value, a.A0(str, (List) value)));
    }
}
