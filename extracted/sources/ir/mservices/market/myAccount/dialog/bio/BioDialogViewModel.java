package ir.mservices.market.myAccount.dialog.bio;

import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.n4;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.r4;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ub0;
import defpackage.vy2;
import defpackage.y97;
import ir.mservices.market.myAccount.dialog.bio.BioAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class BioDialogViewModel extends ir.mservices.market.viewModel.a {
    public final ub0 v;
    public final i w;
    public final pv6 x;

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel$1", f = "BioDialogViewModel.kt", l = {55}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return BioDialogViewModel.this.new AnonymousClass1(g51Var);
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
            BioDialogViewModel bioDialogViewModel = BioDialogViewModel.this;
            pv6 pv6Var = bioDialogViewModel.u;
            r4 r4Var = new r4(13, bioDialogViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new n4(r4Var, 17), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel$onDeleteBioAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel$onDeleteBioAction$1", f = "BioDialogViewModel.kt", l = {MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER, MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
    public static final class C01991 extends SuspendLambda implements qp2 {
        public i a;
        public int b;

        public C01991(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return BioDialogViewModel.this.new C01991(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01991) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r5.b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                kotlin.b.b(r6)
                goto L42
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                kotlinx.coroutines.flow.i r1 = r5.a
                kotlin.b.b(r6)
                goto L36
            L1e:
                kotlin.b.b(r6)
                ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel r6 = ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel.this
                kotlinx.coroutines.flow.i r1 = r6.w
                ub0 r4 = r6.v
                r5.a = r1
                r5.b = r3
                wc5 r3 = r4.a
                ir.mservices.market.myAccount.MyAccountItemsType r4 = ir.mservices.market.myAccount.MyAccountItemsType.d
                java.lang.Object r6 = r3.g(r4, r6, r5)
                if (r6 != r0) goto L36
                goto L41
            L36:
                r3 = 0
                r5.a = r3
                r5.b = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L42
            L41:
                return r0
            L42:
                tx8 r6 = defpackage.tx8.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel.C01991.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel$onUploadBioAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel$onUploadBioAction$1", f = "BioDialogViewModel.kt", l = {38, 38}, m = "invokeSuspend", v = 1)
    public static final class C02001 extends SuspendLambda implements qp2 {
        public i a;
        public int b;
        public final /* synthetic */ BioAction.UpdateBioAction d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02001(BioAction.UpdateBioAction updateBioAction, g51 g51Var) {
            super(2, g51Var);
            this.d = updateBioAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return BioDialogViewModel.this.new C02001(this.d, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02001) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        
            if (r5.emit(r2, r20) == r1) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r2 = r0.b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1a
                if (r2 != r3) goto L12
                kotlin.b.b(r21)
                goto L60
            L12:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L1a:
                kotlinx.coroutines.flow.i r2 = r0.a
                kotlin.b.b(r21)
                r5 = r2
                r2 = r21
                goto L54
            L23:
                kotlin.b.b(r21)
                ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel r2 = ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel.this
                kotlinx.coroutines.flow.i r5 = r2.w
                ub0 r6 = r2.v
                ir.mservices.market.myAccount.dialog.bio.BioAction$UpdateBioAction r7 = r0.d
                java.lang.String r13 = r7.getBio()
                r0.a = r5
                r0.b = r4
                wc5 r4 = r6.a
                ir.mservices.market.myAccount.MyAccountItemsType r6 = ir.mservices.market.myAccount.MyAccountItemsType.d
                ir.mservices.market.myAccount.data.AccountPersonalDto r8 = new ir.mservices.market.myAccount.data.AccountPersonalDto
                r18 = 495(0x1ef, float:6.94E-43)
                r19 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                java.lang.Object r2 = r4.i(r6, r8, r2, r0)
                if (r2 != r1) goto L54
                goto L5f
            L54:
                r4 = 0
                r0.a = r4
                r0.b = r3
                java.lang.Object r2 = r5.emit(r2, r0)
                if (r2 != r1) goto L60
            L5f:
                return r1
            L60:
                tx8 r1 = defpackage.tx8.a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel.C02001.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public BioDialogViewModel(ub0 ub0Var) {
        super(false);
        this.v = ub0Var;
        i iVarE = vy2.e(0, 7, null);
        this.w = iVarE;
        this.x = new pv6(iVarE);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDeleteBioAction(BioAction.DeleteBioAction deleteBioAction) {
        bt2.G(y97.G(this), null, null, new C01991(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUploadBioAction(BioAction.UpdateBioAction updateBioAction) {
        bt2.G(y97.G(this), null, null, new C02001(updateBioAction, null), 3);
    }
}
