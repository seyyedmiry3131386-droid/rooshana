package defpackage;

import ir.mservices.market.version2.manager.install.InstallQueue$InstallState;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ix6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InstallQueue$InstallState.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            InstallQueue$InstallState installQueue$InstallState = InstallQueue$InstallState.a;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            InstallQueue$InstallState installQueue$InstallState2 = InstallQueue$InstallState.a;
            iArr[0] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[AppDownloadFlowStatus.values().length];
        try {
            iArr2[3] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[4] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[5] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
