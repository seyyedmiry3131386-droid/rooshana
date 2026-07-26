package io.sentry.compose;

import defpackage.bp2;
import defpackage.s01;
import defpackage.um;
import io.sentry.f2;
import io.sentry.h4;
import io.sentry.k1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final /* synthetic */ int a = 0;

    static {
        new s01(new bp2() { // from class: io.sentry.compose.SentryComposeTracingKt$localSentryCompositionParentSpan$1
            @Override // defpackage.bp2
            public final Object invoke() {
                k1 k1VarO;
                int i = c.a;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                h4.b().s(new io.sentry.android.fragment.b(ref$ObjectRef, 2));
                k1 k1Var = (k1) ref$ObjectRef.a;
                if (k1Var != null) {
                    um umVar = new um();
                    umVar.c = true;
                    umVar.d = true;
                    umVar.e = true;
                    k1VarO = k1Var.o("ui.compose.composition", "Jetpack Compose Initial Composition", umVar);
                    k1VarO.x().i = "auto.ui.jetpack_compose";
                } else {
                    k1VarO = null;
                }
                return new f2(8, k1VarO);
            }
        });
        new s01(new bp2() { // from class: io.sentry.compose.SentryComposeTracingKt$localSentryRenderingParentSpan$1
            @Override // defpackage.bp2
            public final Object invoke() {
                k1 k1VarO;
                int i = c.a;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                h4.b().s(new io.sentry.android.fragment.b(ref$ObjectRef, 2));
                k1 k1Var = (k1) ref$ObjectRef.a;
                if (k1Var != null) {
                    um umVar = new um();
                    umVar.c = true;
                    umVar.d = true;
                    umVar.e = true;
                    k1VarO = k1Var.o("ui.compose.rendering", "Jetpack Compose Initial Render", umVar);
                    k1VarO.x().i = "auto.ui.jetpack_compose";
                } else {
                    k1VarO = null;
                }
                return new f2(8, k1VarO);
            }
        });
    }
}
