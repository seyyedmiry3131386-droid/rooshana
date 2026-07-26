package ir.mservices.market.togo.data;

import defpackage.js3;
import defpackage.rm7;
import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
public final class AttachImageCallbackData {
    private final String errorCallback;
    private final boolean hasCrop;
    private final String startCallback;
    private final String successCallback;

    public AttachImageCallbackData(String str, String str2, String str3, boolean z) {
        this.successCallback = str;
        this.startCallback = str2;
        this.errorCallback = str3;
        this.hasCrop = z;
    }

    public static /* synthetic */ AttachImageCallbackData copy$default(AttachImageCallbackData attachImageCallbackData, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attachImageCallbackData.successCallback;
        }
        if ((i & 2) != 0) {
            str2 = attachImageCallbackData.startCallback;
        }
        if ((i & 4) != 0) {
            str3 = attachImageCallbackData.errorCallback;
        }
        if ((i & 8) != 0) {
            z = attachImageCallbackData.hasCrop;
        }
        return attachImageCallbackData.copy(str, str2, str3, z);
    }

    public final String component1() {
        return this.successCallback;
    }

    public final String component2() {
        return this.startCallback;
    }

    public final String component3() {
        return this.errorCallback;
    }

    public final boolean component4() {
        return this.hasCrop;
    }

    public final AttachImageCallbackData copy(String str, String str2, String str3, boolean z) {
        return new AttachImageCallbackData(str, str2, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachImageCallbackData)) {
            return false;
        }
        AttachImageCallbackData attachImageCallbackData = (AttachImageCallbackData) obj;
        return js3.i(this.successCallback, attachImageCallbackData.successCallback) && js3.i(this.startCallback, attachImageCallbackData.startCallback) && js3.i(this.errorCallback, attachImageCallbackData.errorCallback) && this.hasCrop == attachImageCallbackData.hasCrop;
    }

    public final String getErrorCallback() {
        return this.errorCallback;
    }

    public final boolean getHasCrop() {
        return this.hasCrop;
    }

    public final String getStartCallback() {
        return this.startCallback;
    }

    public final String getSuccessCallback() {
        return this.successCallback;
    }

    public int hashCode() {
        String str = this.successCallback;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.startCallback;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorCallback;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.hasCrop ? 1231 : 1237);
    }

    public String toString() {
        String str = this.successCallback;
        String str2 = this.startCallback;
        String str3 = this.errorCallback;
        boolean z = this.hasCrop;
        StringBuilder sbT = rm7.t("AttachImageCallbackData(successCallback=", str, ", startCallback=", str2, ", errorCallback=");
        sbT.append(str3);
        sbT.append(", hasCrop=");
        sbT.append(z);
        sbT.append(")");
        return sbT.toString();
    }

    public /* synthetic */ AttachImageCallbackData(String str, String str2, String str3, boolean z, int i, yd1 yd1Var) {
        this(str, str2, str3, (i & 8) != 0 ? false : z);
    }
}
