package ir.mservices.market.myAccount.dialog.nickname;

import defpackage.bj2;
import defpackage.bt2;
import defpackage.c5;
import defpackage.e71;
import defpackage.f5;
import defpackage.g51;
import defpackage.js3;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vy2;
import defpackage.y97;
import ir.mservices.market.myAccount.dialog.nickname.NicknameAction;
import ir.mservices.market.viewModel.a;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class NicknameDialogViewModel extends a {
    public final f5 v;
    public final c5 w;
    public final i x;
    public final pv6 y;

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.dialog.nickname.NicknameDialogViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myAccount.dialog.nickname.NicknameDialogViewModel$1", f = "NicknameDialogViewModel.kt", l = {55}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return NicknameDialogViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                return tx8Var;
            }
            b.b(obj);
            NicknameDialogViewModel nicknameDialogViewModel = NicknameDialogViewModel.this;
            pv6 pv6Var = nicknameDialogViewModel.u;
            bj2 bj2Var = new bj2(23, nicknameDialogViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(bj2Var, 26), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.dialog.nickname.NicknameDialogViewModel$onUploadNicknameAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.myAccount.dialog.nickname.NicknameDialogViewModel$onUploadNicknameAction$1", f = "NicknameDialogViewModel.kt", l = {41, 40}, m = "invokeSuspend", v = 1)
    public static final class C02021 extends SuspendLambda implements qp2 {
        public i a;
        public int b;
        public final /* synthetic */ NicknameAction.UpdateNicknameAction d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02021(NicknameAction.UpdateNicknameAction updateNicknameAction, g51 g51Var) {
            super(2, g51Var);
            this.d = updateNicknameAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return NicknameDialogViewModel.this.new C02021(this.d, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02021) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r7.b
                ir.mservices.market.myAccount.dialog.nickname.NicknameAction$UpdateNicknameAction r2 = r7.d
                r3 = 2
                r4 = 1
                ir.mservices.market.myAccount.dialog.nickname.NicknameDialogViewModel r5 = ir.mservices.market.myAccount.dialog.nickname.NicknameDialogViewModel.this
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                kotlin.b.b(r8)
                goto L5b
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                kotlinx.coroutines.flow.i r1 = r7.a
                kotlin.b.b(r8)
                goto L38
            L22:
                kotlin.b.b(r8)
                kotlinx.coroutines.flow.i r1 = r5.x
                f5 r8 = r5.v
                java.lang.String r6 = r2.getNickname()
                r7.a = r1
                r7.b = r4
                java.lang.Object r8 = r8.a(r6, r5, r7)
                if (r8 != r0) goto L38
                goto L5a
            L38:
                r4 = r8
                n99 r4 = (defpackage.n99) r4
                boolean r4 = r4 instanceof defpackage.l99
                if (r4 == 0) goto L4f
                c5 r4 = r5.w
                z4 r4 = r4.h
                java.lang.String r2 = r2.getNickname()
                r4.c = r2
                java.lang.String r5 = defpackage.lu7.i
                r6 = 0
                r4.i(r2, r5, r6)
            L4f:
                r2 = 0
                r7.a = r2
                r7.b = r3
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L5b
            L5a:
                return r0
            L5b:
                tx8 r8 = defpackage.tx8.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.myAccount.dialog.nickname.NicknameDialogViewModel.C02021.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NicknameDialogViewModel(f5 f5Var, c5 c5Var) {
        super(false);
        js3.p(c5Var, "accountManager");
        this.v = f5Var;
        this.w = c5Var;
        i iVarE = vy2.e(0, 7, null);
        this.x = iVarE;
        this.y = new pv6(iVarE);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUploadNicknameAction(NicknameAction.UpdateNicknameAction updateNicknameAction) {
        bt2.G(y97.G(this), null, null, new C02021(updateNicknameAction, null), 3);
    }
}
