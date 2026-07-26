package defpackage;

import ir.mservices.market.version2.ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode;

/* JADX INFO: loaded from: classes3.dex */
public final class ju {
    public final int a;
    public final ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode b;

    public ju(int i, ApplicationLauncher$OnMyketFirstRunEvent$VersionChangeMode applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode) {
        this.a = i;
        this.b = applicationLauncher$OnMyketFirstRunEvent$VersionChangeMode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMyketFirstRunEvent{versionChangeMode=");
        sb.append(this.b);
        sb.append(", myketPreviousVersion=");
        return dw1.q(sb, this.a, '}');
    }
}
