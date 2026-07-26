package coil3.network.okhttp;

import coil3.PlatformContext;
import coil3.network.ConnectivityChecker;
import defpackage.dp2;
import defpackage.h21;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9 extends FunctionReferenceImpl implements dp2 {
    static {
        new OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9();
    }

    public OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9() {
        super(1, h21.class, "ConnectivityChecker", "ConnectivityChecker(Lcoil3/PlatformContext;)Lcoil3/network/ConnectivityChecker;", 1);
    }

    public static ConnectivityChecker b(PlatformContext platformContext) {
        return h21.ConnectivityChecker(platformContext);
    }

    @Override // defpackage.dp2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b((PlatformContext) obj);
    }
}
