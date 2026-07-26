package defpackage;

import android.adservices.adselection.GetAdSelectionDataOutcome;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pr2 {
    public final long a;
    public final byte[] b;

    public pr2(GetAdSelectionDataOutcome getAdSelectionDataOutcome) {
        js3.p(getAdSelectionDataOutcome, "response");
        long adSelectionId = getAdSelectionDataOutcome.getAdSelectionId();
        byte[] adSelectionData = getAdSelectionDataOutcome.getAdSelectionData();
        this.a = adSelectionId;
        this.b = adSelectionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr2)) {
            return false;
        }
        pr2 pr2Var = (pr2) obj;
        return this.a == pr2Var.a && Arrays.equals(this.b, pr2Var.b);
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        byte[] bArr = this.b;
        return i + (bArr != null ? bArr.hashCode() : 0);
    }

    public final String toString() {
        return "GetAdSelectionDataOutcome: adSelectionId=" + this.a + ", adSelectionData=" + this.b;
    }
}
