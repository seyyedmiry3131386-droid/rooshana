package androidx.compose.ui.platform;

import android.view.inputmethod.InputConnection;
import defpackage.ba6;
import defpackage.dp2;
import defpackage.eo3;
import defpackage.g51;
import defpackage.ii8;
import defpackage.ji8;
import defpackage.ok4;
import defpackage.om0;
import defpackage.qc9;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.up5;
import defpackage.zb5;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {184}, m = "invokeSuspend", v = 1)
final class AndroidPlatformTextInputSession$startInputMethod$3 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3(f fVar, g51 g51Var) {
        super(2, g51Var);
        this.c = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this.c, g51Var);
        androidPlatformTextInputSession$startInputMethod$3.b = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((AndroidPlatformTextInputSession$startInputMethod$3) create((eo3) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            final eo3 eo3Var = (eo3) this.b;
            this.b = eo3Var;
            this.a = 1;
            om0 om0Var = new om0(1, ok4.I(this));
            om0Var.v();
            final f fVar = this.c;
            ii8 ii8Var = fVar.b;
            ba6 ba6Var = ii8Var.a;
            ba6Var.a();
            ii8Var.b.set(new ji8(ii8Var, ba6Var));
            om0Var.x(new dp2() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.dp2
                public final Object invoke(Object obj2) {
                    InputConnection inputConnection;
                    eo3 eo3Var2 = eo3Var;
                    synchronized (eo3Var2.c) {
                        try {
                            eo3Var2.e = true;
                            zb5 zb5Var = eo3Var2.d;
                            Object[] objArr = zb5Var.a;
                            int i2 = zb5Var.c;
                            for (int i3 = 0; i3 < i2; i3++) {
                                up5 up5Var = (up5) ((qc9) objArr[i3]).get();
                                if (up5Var != null && (inputConnection = up5Var.b) != null) {
                                    up5Var.a(inputConnection);
                                    up5Var.b = null;
                                }
                            }
                            eo3Var2.d.h();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ii8 ii8Var2 = fVar.b;
                    ii8Var2.b.set(null);
                    ii8Var2.a.c();
                    return tx8.a;
                }
            });
            if (om0Var.u() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
