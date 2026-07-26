package defpackage;

import ir.mservices.market.securityShield.ProcessState;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class il7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProcessState.values().length];
        try {
            ProcessState processState = ProcessState.a;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            ProcessState processState2 = ProcessState.a;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            ProcessState processState3 = ProcessState.a;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            ProcessState processState4 = ProcessState.a;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
