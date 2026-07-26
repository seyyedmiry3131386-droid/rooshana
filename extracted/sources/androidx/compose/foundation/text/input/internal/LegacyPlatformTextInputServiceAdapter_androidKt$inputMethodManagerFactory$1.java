package androidx.compose.foundation.text.input.internal;

import android.view.View;
import defpackage.do3;
import defpackage.dp2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 extends FunctionReferenceImpl implements dp2 {
    public static final LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 a = new LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1();

    public LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1() {
        super(1, do3.class, "<init>", "<init>(Landroid/view/View;)V", 0);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return new do3((View) obj);
    }
}
