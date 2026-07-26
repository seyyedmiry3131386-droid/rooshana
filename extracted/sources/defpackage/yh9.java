package defpackage;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes.dex */
public final class yh9 extends GoogleApiClient {
    public final fu2 b;

    public yh9(fu2 fu2Var) {
        this.b = fu2Var;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper b() {
        return this.b.g;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }
}
