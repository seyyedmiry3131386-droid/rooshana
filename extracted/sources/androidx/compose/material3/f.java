package androidx.compose.material3;

import defpackage.bt2;
import defpackage.e71;
import defpackage.f40;
import defpackage.hk3;
import defpackage.rs5;

/* JADX INFO: loaded from: classes.dex */
public final class f extends rs5 {
    public final e71 d;
    public final androidx.compose.animation.core.a e;
    public final hk3 f;

    public f(boolean z, e71 e71Var, androidx.compose.animation.core.a aVar, hk3 hk3Var) {
        super(z);
        this.d = e71Var;
        this.e = aVar;
        this.f = hk3Var;
    }

    @Override // defpackage.rs5
    public final void a() {
        bt2.G(this.d, null, null, new ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackCancelled$1(this, null), 3);
    }

    @Override // defpackage.rs5
    public final void b() throws Throwable {
        this.f.invoke();
    }

    @Override // defpackage.rs5
    public final void c(f40 f40Var) {
        bt2.G(this.d, null, null, new ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackProgressed$1(this, f40Var, null), 3);
    }

    @Override // defpackage.rs5
    public final void d(f40 f40Var) {
        bt2.G(this.d, null, null, new ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1(this, f40Var, null), 3);
    }
}
