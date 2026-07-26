package ir.myket.common.utils;

import android.content.Context;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.e71;
import defpackage.eb1;
import defpackage.g51;
import defpackage.js3;
import defpackage.m88;
import defpackage.pb5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.w0;
import defpackage.z0;
import java.util.Locale;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.common.utils.LocaleManager$setLanguage$1", f = "LocaleManager.kt", l = {MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
final class LocaleManager$setLanguage$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;

    /* JADX INFO: renamed from: ir.myket.common.utils.LocaleManager$setLanguage$1$1, reason: invalid class name */
    @tb1(c = "ir.myket.common.utils.LocaleManager$setLanguage$1$1", f = "LocaleManager.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, g51 g51Var) {
            super(2, g51Var);
            this.b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((pb5) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            pb5 pb5Var = (pb5) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            pb5Var.e(a.c, this.b);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocaleManager$setLanguage$1(String str, Context context, g51 g51Var) {
        super(2, g51Var);
        this.b = str;
        this.c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new LocaleManager$setLanguage$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocaleManager$setLanguage$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        Enum r8 = Language.a;
        z0 z0Var = (z0) Language.c;
        z0Var.getClass();
        w0 w0Var = new w0(0, z0Var);
        while (true) {
            if (!w0Var.hasNext()) {
                next = null;
                break;
            }
            next = w0Var.next();
            if (m88.T(((Enum) next).name(), this.b, true)) {
                break;
            }
        }
        Enum r1 = (Enum) next;
        if (r1 != null) {
            r8 = r1;
        }
        String lowerCase = ((Language) r8).name().toLowerCase(Locale.ROOT);
        js3.o(lowerCase, "toLowerCase(...)");
        a.a.getClass();
        eb1 eb1Var = (eb1) a.d.a(this.c, a.b[0]);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(lowerCase, null);
        this.a = 1;
        Object objA = androidx.datastore.preferences.core.b.a(eb1Var, anonymousClass1, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
