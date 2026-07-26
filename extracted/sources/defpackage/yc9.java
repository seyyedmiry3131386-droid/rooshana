package defpackage;

import android.os.Bundle;
import ir.mservices.market.common.base.BaseContentFragment;
import ir.mservices.market.social.welcome.WelcomeFragment;
import ir.mservices.market.webview.WebViewFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class yc9 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseContentFragment b;

    public /* synthetic */ yc9(BaseContentFragment baseContentFragment, int i) {
        this.a = i;
        this.b = baseContentFragment;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                WebViewFragment webViewFragment = (WebViewFragment) this.b;
                Bundle bundle = webViewFragment.g;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Fragment " + webViewFragment + " has null arguments");
            default:
                WelcomeFragment welcomeFragment = (WelcomeFragment) this.b;
                Bundle bundle2 = welcomeFragment.g;
                if (bundle2 != null) {
                    return bundle2;
                }
                throw new IllegalStateException("Fragment " + welcomeFragment + " has null arguments");
        }
    }
}
