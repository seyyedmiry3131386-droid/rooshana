package ir.mservices.market.myAccount.dialog.birthday;

import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.bt2;
import defpackage.e4;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.lu7;
import defpackage.n4;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.r4;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vy2;
import defpackage.y97;
import ir.mservices.market.myAccount.dialog.birthday.BirthDayAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class BirthdayDialogViewModel extends ir.mservices.market.viewModel.a {
    public final pv6 A;
    public final e4 v;
    public final lu7 w;
    public final i x;
    public final pv6 y;
    public final i z;

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.dialog.birthday.BirthdayDialogViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myAccount.dialog.birthday.BirthdayDialogViewModel$1", f = "BirthdayDialogViewModel.kt", l = {67}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return BirthdayDialogViewModel.this.new AnonymousClass1(g51Var);
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
            BirthdayDialogViewModel birthdayDialogViewModel = BirthdayDialogViewModel.this;
            pv6 pv6Var = birthdayDialogViewModel.u;
            r4 r4Var = new r4(14, birthdayDialogViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new n4(r4Var, 18), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.dialog.birthday.BirthdayDialogViewModel$onUploadBirthdayAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.myAccount.dialog.birthday.BirthdayDialogViewModel$onUploadBirthdayAction$1", f = "BirthdayDialogViewModel.kt", l = {MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER, 48, 47, 51}, m = "invokeSuspend", v = 1)
    public static final class C02011 extends SuspendLambda implements qp2 {
        public i a;
        public int b;
        public final /* synthetic */ BirthDayAction.UpdateBirthdayAction d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02011(BirthDayAction.UpdateBirthdayAction updateBirthdayAction, g51 g51Var) {
            super(2, g51Var);
            this.d = updateBirthdayAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return BirthdayDialogViewModel.this.new C02011(this.d, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02011) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
        
            if (r0.emit(r3, r10) != r2) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
        
            if (r0.emit(r11, r10) == r2) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                ir.mservices.market.myAccount.dialog.birthday.BirthdayDialogViewModel r0 = ir.mservices.market.myAccount.dialog.birthday.BirthdayDialogViewModel.this
                e4 r1 = r0.v
                kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r3 = r10.b
                ir.mservices.market.myAccount.dialog.birthday.BirthDayAction$UpdateBirthdayAction r4 = r10.d
                r5 = 4
                r6 = 3
                r7 = 2
                r8 = 1
                if (r3 == 0) goto L2f
                if (r3 == r8) goto L2b
                if (r3 == r7) goto L25
                if (r3 == r6) goto L21
                if (r3 != r5) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L21:
                kotlin.b.b(r11)
                goto L77
            L25:
                kotlinx.coroutines.flow.i r0 = r10.a
                kotlin.b.b(r11)
                goto L57
            L2b:
                kotlin.b.b(r11)
                goto L3f
            L2f:
                kotlin.b.b(r11)
                java.lang.String r11 = r4.getBirthday()
                r10.b = r8
                java.lang.Object r11 = r1.a(r11, r0, r10)
                if (r11 != r2) goto L3f
                goto L76
            L3f:
                n99 r11 = (defpackage.n99) r11
                boolean r3 = r11 instanceof defpackage.l99
                if (r3 == 0) goto L6c
                kotlinx.coroutines.flow.i r11 = r0.z
                r10.a = r11
                r10.b = r7
                wc5 r1 = r1.a
                java.lang.Object r0 = r1.h(r0, r10)
                if (r0 != r2) goto L54
                goto L76
            L54:
                r9 = r0
                r0 = r11
                r11 = r9
            L57:
                java.lang.String r1 = r4.getBirthday()
                kotlin.Pair r3 = new kotlin.Pair
                r3.<init>(r11, r1)
                r11 = 0
                r10.a = r11
                r10.b = r6
                java.lang.Object r11 = r0.emit(r3, r10)
                if (r11 != r2) goto L77
                goto L76
            L6c:
                kotlinx.coroutines.flow.i r0 = r0.x
                r10.b = r5
                java.lang.Object r11 = r0.emit(r11, r10)
                if (r11 != r2) goto L77
            L76:
                return r2
            L77:
                tx8 r11 = defpackage.tx8.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.myAccount.dialog.birthday.BirthdayDialogViewModel.C02011.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayDialogViewModel(e4 e4Var, lu7 lu7Var) {
        super(false);
        js3.p(lu7Var, "sharedPreferencesProxy");
        this.v = e4Var;
        this.w = lu7Var;
        i iVarE = vy2.e(0, 7, null);
        this.x = iVarE;
        this.y = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.z = iVarE2;
        this.A = new pv6(iVarE2);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSaveMiladiBirthDateAction(BirthDayAction.SaveMiladiBirthDateAction saveMiladiBirthDateAction) {
        this.w.i(lu7.r0, saveMiladiBirthDateAction.getBirthday());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUploadBirthdayAction(BirthDayAction.UpdateBirthdayAction updateBirthdayAction) {
        bt2.G(y97.G(this), null, null, new C02011(updateBirthdayAction, null), 3);
    }
}
