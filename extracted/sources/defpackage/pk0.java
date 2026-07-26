package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class pk0 implements pz3 {
    public final Object a = a.b(LazyThreadSafetyMode.a, new de(this, new a88("WEB_OK_HTTP")));
    public final Regex b = new Regex(".*\\.(js|css|woff2?|ttf|otf|png|jpe?g|webp|gif|ico)$");

    @Override // defpackage.pz3
    public final /* bridge */ mz3 getKoin() {
        return at2.getKoin();
    }
}
