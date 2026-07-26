package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends io.sentry.android.core.internal.gestures.i {
    public final d1 b;

    public i(Window.Callback callback, d1 d1Var) {
        super(callback);
        this.b = d1Var;
    }

    @Override // io.sentry.android.core.internal.gestures.i, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        this.b.run();
    }
}
