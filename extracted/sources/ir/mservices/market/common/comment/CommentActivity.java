package ir.mservices.market.common.comment;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle$State;
import defpackage.am2;
import defpackage.dw0;
import defpackage.e71;
import defpackage.g27;
import defpackage.g51;
import defpackage.hf2;
import defpackage.js3;
import defpackage.mm2;
import defpackage.o79;
import defpackage.pt1;
import defpackage.qp2;
import defpackage.r4;
import defpackage.rs6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.yi5;
import ir.mservices.market.common.model.SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
public final class CommentActivity extends Hilt_CommentActivity implements am2, mm2 {
    public final ir.mservices.market.version2.fragments.a O = new ir.mservices.market.version2.fragments.a(null);
    public final o79 P = new o79(g27.a(CommentViewModel.class), new dw0(this, 1), new dw0(this, 0), new dw0(this, 2));

    /* JADX INFO: renamed from: ir.mservices.market.common.comment.CommentActivity$onCreate$3, reason: invalid class name */
    @tb1(c = "ir.mservices.market.common.comment.CommentActivity$onCreate$3", f = "CommentActivity.kt", l = {71}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ Ref$ObjectRef c;

        /* JADX INFO: renamed from: ir.mservices.market.common.comment.CommentActivity$onCreate$3$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.common.comment.CommentActivity$onCreate$3$1", f = "CommentActivity.kt", l = {74, 74}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public CommentActivity a;
            public vb7 b;
            public int c;
            public int d;
            public final /* synthetic */ CommentActivity e;
            public final /* synthetic */ Ref$ObjectRef f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CommentActivity commentActivity, Ref$ObjectRef ref$ObjectRef, g51 g51Var) {
                super(2, g51Var);
                this.e = commentActivity;
                this.f = ref$ObjectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass1(this.e, this.f, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CommentActivity commentActivity;
                vb7 vb7Var;
                int i;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                int i2 = this.d;
                tx8 tx8Var = tx8.a;
                if (i2 == 0) {
                    b.b(obj);
                    commentActivity = this.e;
                    CommentViewModel commentViewModel = (CommentViewModel) commentActivity.P.getValue();
                    String str = (String) this.f.a;
                    ir.mservices.market.common.model.a aVar = commentViewModel.c.g;
                    vb7Var = new vb7(new SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1(aVar.h, null, str, aVar));
                    this.a = commentActivity;
                    this.b = vb7Var;
                    this.c = 0;
                    this.d = 1;
                    obj = d.r(vb7Var, this);
                    if (obj != coroutineSingletons) {
                        i = 0;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.b(obj);
                    return tx8Var;
                }
                i = this.c;
                vb7Var = this.b;
                commentActivity = this.a;
                b.b(obj);
                hf2 hf2VarL = d.l(vb7Var, obj == null ? 1 : 0);
                r4 r4Var = new r4(18, commentActivity);
                this.a = null;
                this.b = null;
                this.c = i;
                this.d = 2;
                Object objA = hf2VarL.a(new pt1(r4Var, 3), this);
                if (objA != coroutineSingletons) {
                    objA = tx8Var;
                }
                return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Ref$ObjectRef ref$ObjectRef, g51 g51Var) {
            super(2, g51Var);
            this.c = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return CommentActivity.this.new AnonymousClass3(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                Lifecycle$State lifecycle$State = Lifecycle$State.d;
                Ref$ObjectRef ref$ObjectRef = this.c;
                CommentActivity commentActivity = CommentActivity.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(commentActivity, ref$ObjectRef, null);
                this.a = 1;
                if (androidx.lifecycle.b.b(commentActivity, lifecycle$State, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return tx8.a;
        }
    }

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
    }

    @Override // defpackage.z80
    public final String C() {
        String string = getString(rs6.page_name_comment);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // defpackage.am2
    public final void E() {
    }

    @Override // defpackage.am2
    public final void clearAll() {
        this.O.a(null);
    }

    @Override // defpackage.am2
    public final void d(String str, mm2 mm2Var) {
        js3.p(str, "requestKey");
        js3.p(mm2Var, "listener");
        L().h0(str, this, mm2Var);
    }

    @Override // defpackage.am2
    public final androidx.fragment.app.d g() {
        return this.O.c();
    }

    @Override // defpackage.am2
    public final void k(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "bundle");
        if (bundle.getBoolean("BUNDLE_KEY_DISMISS", false) && this.O.c() != null) {
            q();
        }
        L().g0(bundle, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    @Override // ir.mservices.market.core.BaseDialogActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.common.comment.CommentActivity.onCreate(android.os.Bundle):void");
    }

    @Override // ir.mservices.market.core.BaseDialogActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        x("CommentActivity_" + this.K);
        super.onDestroy();
    }

    @Override // defpackage.am2
    public final void p() {
        this.O.f();
    }

    @Override // defpackage.am2
    public final void q() {
        this.O.d();
    }

    @Override // defpackage.am2
    public final void r(Integer num) {
        this.O.a(num);
    }

    @Override // defpackage.am2
    public final androidx.fragment.app.d s() {
        return this.O.b();
    }

    @Override // defpackage.am2
    public final void x(String str) {
        js3.p(str, "requestKey");
        L().e(str);
    }

    @Override // defpackage.am2
    public final void y(yi5 yi5Var, Integer num) {
        js3.p(yi5Var, "navDirections");
        this.O.g(yi5Var);
    }
}
